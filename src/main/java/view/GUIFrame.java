/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author dudue
 */
public class GUIFrame extends JFrame{
    
    private PanelCanvas panelCanvas;
    private JButton btnMove;
    
    public GUIFrame (){
        
        this.panelCanvas= new PanelCanvas();//Para inicializarlo dentro del frame (this)
        this.btnMove = new JButton ("Mover en x");
        
        
        
        this.setSize(500, 500); // Tamaño del frame
        this.setTitle("Laboratorio 4"); // Titulo del frame
        this.setVisible(true); // Hacerlo visible
        
        this.add(panelCanvas, BorderLayout.CENTER);
        this.add(this.btnMove, BorderLayout.SOUTH);
        
    } //Fin del public GUIFrame
    
    public GUIFrame (String Titulo, int ancho, int alto ){
        
        this.setSize(ancho, alto);
        this.setTitle(Titulo);
        this.setVisible(true);
        
        
    }
    
    public void listenerButton (ActionListener controller){
        this.btnMove.addActionListener(controller);
        
    }
    
    public PanelCanvas getPanelCanvas(){ //Esto retorna toda la informacion que esta en panel canvas
        return this.panelCanvas;
    }
    
    }//Fin de la clase    

