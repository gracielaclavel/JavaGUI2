/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
//Paso 1- Importamos las librerias
import javax.swing.*; //Importamos todo de swing
import java.awt.*;

/**
 *
 * @author LAB18
 */
//Paso 2 Heredar la clase desde JFrame
public class Windows extends JFrame
{
 //Paso 3 Declarar elemnetos de utilizar
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton;
    //Paso 4 Definir el constructor
    public Windows()
    
    {
    // Paso 5 Crea e inicializar los objetos
        panel = new JPanel(); //Creo un objeto tipo JPanel
        label=new JLabel();
        text=new JTextField(20);//20 es la cant de caracteres
        boton = new JButton();
        // Paso 6 Agregar los elementos al JFrame
        this.add(panel);//Recomendable agregar el JPanel al JFrame
        panel.add(label);// Agregamos un objeto al panel
        panel.add(text);
        panel.add(boton);
        // Paso 7  Propiedades de los objetos
        label.setText("Nombre");
        boton.setText("Enviar");
        panel.setBackground(Color.red);//Color de fondo del JPanel
        
        
        {
        
        
        
        
        }
        
    
    
    }
}
