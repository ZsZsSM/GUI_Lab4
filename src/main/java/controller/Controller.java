/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.GUIFrame;
import view.PanelCanvas;

/**
 *
 * @author dudue
 */
public class Controller implements ActionListener {
    
    private GUIFrame guiFrame;
    private PanelCanvas panelCanvas;
    
    public Controller (){
        //Jframe relacion
        this.guiFrame= new GUIFrame();
        //Por medio del JFrame me relaciono con el getPanelCanvas=PanelCanvas
        this.panelCanvas=guiFrame.getPanelCanvas();
        this.guiFrame.listenerButton(this);
        
    }
//Action event define la accion de la clase abstracta
    public void actionPerformed(ActionEvent e) {
     //m   
      this.panelCanvas.moverFigure();
    }
}
