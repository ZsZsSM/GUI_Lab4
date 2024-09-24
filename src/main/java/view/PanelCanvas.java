/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author dudue
 */
public class PanelCanvas extends JPanel {
    
    private int x;
    private int y;
            
    
   public PanelCanvas(){
    
       this.x=20;
       this.y=20;
       
}        
    
    protected void paintComponent(Graphics g){ // PaintComponent es el que genera o crea un grafico,objeto o figura en el panel
        
        super.paintComponent(g);
        g.setColor(Color.blue); //Pone el color a la figura creada
        g.fillOval(this.x, this.y, 20, 20);
        //Color a la figura cuadrada
       // g.setColor(Color.DARK_GRAY);
        //g.fillRect(this.x, this.y, 10, 10);
    }
    
    public void moverFigure(){
        
        int moveDistance=10; // Mover a la figura hacia la derecha
        
        int figureSize=20; // Tamano de la figura para obtener el limite
        
        if( x+moveDistance+figureSize<=getWidth()){ //Limitador de movimiento a la bola
            x += moveDistance;
            
        } else {
          x=getWidth()-figureSize;
        }
        repaint();// Repinta a la figura despues de cada movimiento en el panel        
    }
    
}
