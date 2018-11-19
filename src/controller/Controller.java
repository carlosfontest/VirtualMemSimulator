package controller;

import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.ConfigSO;
import view.ControlPanel;

/**
 *
 * @author Carlos Fontes & Rafael Quintero
 */
public class Controller {
    
    public void initSO() {
        ConfigSO configso = new ConfigSO(this);
        configso.setVisible(true);
    }
    
    public void closeFrame(JFrame frame) {
        try {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el sistema?", "Salir", dialogButton);
            if(result == 0){
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e);
        }
    }
    
    public void minimizeFrame(JFrame frame) {
        frame.setState(frame.ICONIFIED);
    }
    
    public void mostrarInfo(JFrame frame) {
        Icon icono = new ImageIcon(getClass().getResource("/view/images/logoCFRQ.png"));
        JOptionPane.showMessageDialog(frame, "Software elaborado por Carlos Fontes y Rafael Quintero\n "
            + "     Proyecto N° 2 - Sistemas Operativos - UNIMET\n                     ©CF&RQ - VirtualMemSimulator\n "
            + "                         21 de Noviembre de 2018", "Información", JOptionPane.INFORMATION_MESSAGE, icono);
    }
    
    public void validarSoloNumeros(KeyEvent evt, JFrame frame) {
        char validar = evt.getKeyChar();
        
        if(!Character.isDigit(validar)){
            frame.getToolkit().beep();
            evt.consume();
        }
    }
    
    public void instalarSO(ConfigSO frame) {
        int tamPrincipal = 0, tamSecundaria = 0, tamPaginas = 0;
        try {
            tamPrincipal = Integer.parseInt(frame.fieldTamPrincipal.getText());
            tamSecundaria = Integer.parseInt(frame.fieldTamSecundaria.getText());
            tamPaginas = Integer.parseInt(frame.fieldTamPaginas.getText());
        } catch (Exception e) {
        }
        
        // Verificamos los campos ingresados
        if( frame.fieldTamPrincipal.getText() == "" || frame.fieldTamSecundaria.getText() == "" || frame.fieldTamPaginas.getText() == "" || tamPrincipal == 0 || tamPaginas == 0 || tamSecundaria == 0) {
            JOptionPane.showMessageDialog(frame, "Introduzca bien los campos. No pueden haber ceros");
            return;
        }
        
        // Los campos fueron introducidos de manera exitosa, se abre el Panel de Control
        ControlPanel controlP = new ControlPanel(this, tamPrincipal, tamSecundaria, tamPaginas);
        frame.dispose();
        controlP.setVisible(true);
    }
}
