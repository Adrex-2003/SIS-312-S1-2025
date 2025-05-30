import javax.swing.*;
import java.awt.event.*;


class Main{
    static JButton[][] botones = new JButton[9][9];
    static JFrame ventana;
    static int ancho = 50;
    static int x = 0;
    static int y = 0;
    static int cont = 0;
    static int encontrados = 0;
    public static void main(String[] args) {
        crearVentana();
        ventana.setVisible(true);
        crearBotones();
    }

    static void crearVentana(){
        ventana = new JFrame("Busca Minas");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        ventana.setSize(ancho * 9 + 30, ancho * 9 + 30);
    }

    static void crearBotones(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                botones[i][j] = new JButton();
                botones[i][j].setBounds(i * ancho, j * ancho, ancho, ancho);
                int fila = i;
                int columna = j;
                botones[i][j].addMouseListener(new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if(cont == 0)
                            crearMinas(fila, columna);
                        if(SwingUtilities.isLeftMouseButton(e)){
                            botones[fila][columna].setText(botones[fila][columna].getActionCommand());
                            if(botones[fila][columna].getActionCommand().equals("💣")){
                                JOptionPane.showMessageDialog(ventana, "¡Has perdido!");
                                System.exit(0);
                        }
                       if(SwingUtilities.isRightMouseButton(e)){
                            botones[fila][columna].setText("🚩");
                            JOptionPane.showMessageDialog(null, "click derecho");
                            if(botones[fila][columna].getActionCommand().equals("💣"))
                                encontrados ++;
                       }
                       if(encontrados == 10 && cont == 9 * 9){
                            JOptionPane.showMessageDialog(ventana, "¡Has ganado!");
                            System.exit(0);
                        }
                       }
                       botones[fila][columna].setEnabled(false);
                       cont ++;
                }});
                ventana.add(botones[i][j]);
            }
        }
    }

    static void crearMinas(int h, int k){
        for(int i = 0; i < 10; i ++){
            int fila = (int)(Math.random() * 9);
            int columna = (int)(Math.random() * 9);
            if(fila == h && columna == k || botones[fila][columna].getActionCommand().equals("💣")){
                i--;
            }else{            
                botones[fila][columna].setActionCommand("💣");
            }
        }
        rellenarBotones(h, k);
    }

    static void rellenarBotones(int fila, int columna){
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int contador = 0;
                if(!botones[i][j].getActionCommand().equals("💣")) {
                    if(i > 0 && j > 0 && botones[i-1][j-1].getActionCommand().equals("💣")) 
                        contador ++;
                    if(i < 8 && j < 8 && botones[i+1][j+1].getActionCommand().equals("💣")) 
                        contador ++;
                    if(i > 0 && botones[i - 1][j].getActionCommand().equals("💣")) 
                        contador ++;
                    if(j > 0 && botones[i][j - 1].getActionCommand().equals("💣")) 
                        contador ++;
                    if(j < 8 && botones[i][j + 1].getActionCommand().equals("💣")) 
                        contador ++;
                    if(i < 8 && botones[i + 1][j].getActionCommand().equals("💣"))
                        contador ++;
                    if(i > 0 && j < 8 && botones[i - 1][j + 1].getActionCommand().equals("💣"))
                        contador ++;
                    if(i < 8 && j > 0 && botones[i + 1][j - 1].getActionCommand().equals("💣"))
                        contador ++;
                    botones[i][j].setActionCommand(contador + "");;
                }
            }
        }
        botones[fila][columna].setText(botones[fila][columna].getActionCommand());   }
}