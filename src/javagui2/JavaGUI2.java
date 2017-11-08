/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui2;
// Paso 8 Importar la clase con la ventana
import interfaces.Windows;// Importamos paquete y clase
import javax.swing.JFrame;

/**
 *
 * @author LAB18
 */
public class JavaGUI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        // Paso 9 LLamado a la clase JFrame
        Windows ventana = new Windows(); //creo un obejeto tipo Windows
        ventana.setVisible(true);
        ventana.setBounds(0, 0,600, 600);
        ventana.setTitle("Mi primera aplicacion con ventana");// Aqui se coloca el nombre del titulo
        //La siguente sentencia es para finelizar el proyecto al cerra la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
