package controller;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Marco;
import model.Proceso;
import view.ConfigSO;
import view.ControlPanel;

/**
 *
 * @author Carlos Fontes & Rafael Quintero
 */
public class Controller {
    private JLabel labelInfo;
    private HashMap<Integer, Proceso> procesos;
    private Marco[] memoriaPrincipal;
    private Marco[] memoriaSecundaria;
    public static int tamañoPagina;
    public static int tamañoMemPrincipal;
    public static int tamañoMemSecundaria;
    private ArrayList<Long> elevacionesDeDos;

    public Controller() {
        this.labelInfo = new JLabel();
        this.procesos = new HashMap<>();
        this.elevacionesDeDos = new ArrayList<>();
    }
    
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
            this.tamañoMemPrincipal = tamPrincipal;
            tamSecundaria = Integer.parseInt(frame.fieldTamSecundaria.getText());
            this.tamañoMemSecundaria = tamSecundaria;
            tamPaginas = Integer.parseInt(frame.fieldTamPaginas.getText());
            this.tamañoPagina = tamPaginas;
        } catch (Exception e) {
        }
        
        // Verificamos los campos ingresados
        if( frame.fieldTamPrincipal.getText() == "" || frame.fieldTamSecundaria.getText() == "" || frame.fieldTamPaginas.getText() == "" || tamPrincipal == 0 || tamPaginas == 0 || tamSecundaria == 0 || tamPaginas > tamPrincipal) { 
            JOptionPane.showMessageDialog(frame, "Introduzca bien los campos. No pueden haber ceros, el tamaño de la página no puede ser mayor al tamaño de la memoria principal.");
            return;
        }
        // Verificamos que el valor del tamaño de la página entre exacto en la memoria principal y en la secundaria
        if( !(this.tamañoMemPrincipal % this.tamañoPagina == 0) || !(this.tamañoMemSecundaria % this.tamañoPagina == 0) ) {
            JOptionPane.showMessageDialog(frame, "El tamaño de la página tiene que entrar n número de veces de manera exacta en las memorias");
            return;
        }
        
        // Inicialiamos las memorias
        this.memoriaPrincipal = new Marco[tamPrincipal/tamPaginas];
        this.memoriaSecundaria = new Marco[tamSecundaria/tamPaginas];
        
        // Los campos fueron introducidos de manera exitosa, se abre el Panel de Control
        ControlPanel controlP = new ControlPanel(this, tamPrincipal, tamSecundaria, tamPaginas);
        frame.dispose();
        controlP.setVisible(true);
        this.initTables(controlP);
    }
    
    private boolean buscarEnElevaciones(long num) {
        boolean esta = false;
        for (long n : this.elevacionesDeDos) {
            if (num == n) {
                esta = true;
            }
        }
        
        return esta;
    }
    
    private void initTables(ControlPanel controlP) {
        // Tamaño de cada columna
        controlP.tablePrincipal.getTableHeader().setReorderingAllowed(false);
        controlP.tablePrincipal.getTableHeader().setResizingAllowed(false);
        controlP.tablePrincipal.getColumnModel().getColumn(0).setPreferredWidth(65);
        controlP.tablePrincipal.getColumnModel().getColumn(1).setPreferredWidth(50);
        controlP.tablePrincipal.getColumnModel().getColumn(2).setPreferredWidth(70);
        controlP.tablePrincipal.getColumnModel().getColumn(3).setPreferredWidth(110);
        controlP.tablePrincipal.getColumnModel().getColumn(4).setPreferredWidth(40);
        controlP.tablePrincipal.getColumnModel().getColumn(5).setPreferredWidth(92);
        controlP.tablePrincipal.getColumnModel().getColumn(6).setPreferredWidth(96);
        // Altura de cada renglón
        controlP.tablePrincipal.setRowHeight(20);
        
        // Tamaño de cada columna
        controlP.tableSecundaria.getTableHeader().setReorderingAllowed(false);
        controlP.tableSecundaria.getTableHeader().setResizingAllowed(false);
        controlP.tableSecundaria.getColumnModel().getColumn(0).setPreferredWidth(130);
        controlP.tableSecundaria.getColumnModel().getColumn(1).setPreferredWidth(115);
        controlP.tableSecundaria.getColumnModel().getColumn(2).setPreferredWidth(150);
        controlP.tableSecundaria.getColumnModel().getColumn(3).setPreferredWidth(110);
        // Altura de cada renglón
        controlP.tableSecundaria.setRowHeight(20);
        
        // Tamaño de cada columna
        controlP.tableLista.getTableHeader().setReorderingAllowed(false);
        controlP.tableLista.getTableHeader().setResizingAllowed(false);
        controlP.tableLista.getColumnModel().getColumn(0).setPreferredWidth(100);
        controlP.tableLista.getColumnModel().getColumn(1).setPreferredWidth(150);
        controlP.tableLista.getColumnModel().getColumn(2).setPreferredWidth(115);
        controlP.tableLista.getColumnModel().getColumn(3).setPreferredWidth(110);
        controlP.tableLista.getColumnModel().getColumn(4).setPreferredWidth(130);
        controlP.tableLista.getColumnModel().getColumn(5).setPreferredWidth(60);
        controlP.tableLista.getColumnModel().getColumn(6).setPreferredWidth(60);
        // Altura de cada renglón
        controlP.tableLista.setRowHeight(20);
    }
    
    public void clearTableSelection(JTable table1, JTable table2, JTable table3) {
        table1.clearSelection();
        table2.clearSelection();
        table3.clearSelection();
    }
    
    public void initDatosDelPanelDeControl(ControlPanel controlP) {
        DefaultTableModel modeloPrincipal = (DefaultTableModel) controlP.tablePrincipal.getModel();
        DefaultTableModel modeloSecundaria = (DefaultTableModel) controlP.tableSecundaria.getModel();
        DefaultTableModel modeloProcesos = (DefaultTableModel) controlP.tableLista.getModel();
        
        // Iniciamos la tabla de memoria principal
        int numMarcosPrincipal = (this.tamañoMemPrincipal/this.tamañoPagina);
        for (int i = 0; i < numMarcosPrincipal; i++) {
            Marco marco = new Marco("0x"+Integer.toHexString(i*this.tamañoPagina), i + 1, null, true);
            // Agregamos el marco a memoria principal
            this.memoriaPrincipal[i] = marco;
            modeloPrincipal.addRow(new Object[]{
                marco.getDirFisica(), marco.getNumMarco()
            });
        }
        
        // Iniciamos la tabla de memoria secundaria
        int numEspaciosSecundaria = (this.tamañoMemSecundaria/this.tamañoPagina);
        for (int i = 0; i < numEspaciosSecundaria; i++) {
            Marco marco = new Marco(String.valueOf(i + 1), i + 1, null, false);
            // Agregamos el marco a memoria secundaria
            this.memoriaSecundaria[i] = marco;
            modeloSecundaria.addRow(new Object[]{
                i + 1
            });
        }
        
        // Iniciamos la tabla de procesos
        controlP.jPanel1.setVisible(false);
        this.labelInfo.setFont(new Font("Calibri Light", 1, 36));
        this.labelInfo.setText("No hay procesos creados todavía..");
        this.labelInfo.setBounds(550, 80, 600, 80);
        this.labelInfo.setVisible(true);
        controlP.panelContenido.add(this.labelInfo);
        
        
        DecimalFormat formatea = new DecimalFormat("###,###.##");
        
        // Iniciamos estadísticas
        controlP.labelProcesosCreados.setText("0");
        controlP.labelProcesosVivos.setText("0");
        controlP.labelMarcosPagina.setText(formatea.format(numMarcosPrincipal));
        controlP.labelTamañoPagina.setText(formatea.format(this.tamañoPagina));
        controlP.labelEspaciosSecundaria.setText(formatea.format(numEspaciosSecundaria));
        
        // Iniciamos labels de tablas
        controlP.labelTamTotalPrincipal.setText(formatea.format(this.tamañoMemPrincipal));
        controlP.labelTamUsadaPrincipal.setText("0");
        controlP.labelTamDisponiblePrincipal.setText(formatea.format(this.tamañoMemPrincipal));
        controlP.labelTamTotalSecundaria.setText(formatea.format(this.tamañoMemSecundaria));
        controlP.labelTamUsadaSecundaria.setText("0");
        controlP.labelTamDisponibleSecundaria.setText(formatea.format(this.tamañoMemSecundaria));
        controlP.progressPrincipal.setValue(0);
        controlP.progressSecundaria.setValue(0);
        
        // Iniciamos los textFields de crearProcesos
        controlP.fieldNombreProceso.setText("Proceso #1");
        controlP.fieldTamañoProceso.setText("4096");
    }
    
    private void aparecerTablaProcesos(ControlPanel controlP) {
        controlP.jPanel1.setVisible(true);
        this.labelInfo.setVisible(false);
    }
    
    public void crearProceso(ControlPanel controlP) {
        this.aparecerTablaProcesos(controlP);
        
        // Obtenemos el nombre y el tamaño de los textFields
        String nombreProceso = controlP.fieldNombreProceso.getText();
        int tamañoProceso = Integer.parseInt(controlP.fieldTamañoProceso.getText());
        // Generamos el random del tiempo que se va a ejecutar
        Random random = new Random();
        int tiempo = random.nextInt(5) + 1;
        // Agregamos el proceso al HashMap
        Proceso procesoNuevo = new Proceso(this.procesos.size(), nombreProceso, tiempo, tamañoProceso);
        this.procesos.put(this.procesos.size(), procesoNuevo);
        // Agregamos el proceso a la tabla de procesos
        DecimalFormat formatea = new DecimalFormat("###,###.##");
        DefaultTableModel modelo = (DefaultTableModel) controlP.tableLista.getModel();
        modelo.addRow(new Object[]{
            procesoNuevo.getID(), procesoNuevo.getNombre(), formatea.format(procesoNuevo.getTamaño()), procesoNuevo.getCantPaginas(), procesoNuevo.getEstado(), this.getPaginasEnPrincipal(procesoNuevo), this.getPaginasEnSecundaria(procesoNuevo)
        });
        // Aumentamos el número de procesos creados
        controlP.labelProcesosCreados.setText(String.valueOf(Integer.parseInt(controlP.labelProcesosCreados.getText()) + 1));
        // Aumentamos el número de procesos vivos
        controlP.labelProcesosVivos.setText(String.valueOf(Integer.parseInt(controlP.labelProcesosVivos.getText()) + 1));
        // Llenamos los textFields de crear procesos
        controlP.fieldNombreProceso.setText("Proceso #" + (this.procesos.size() + 1) );
        controlP.fieldTamañoProceso.setText("4096");

        
        
    }
    
    private int getPaginasEnPrincipal(Proceso proceso) {
        
        return 0;
    }
    
    private int getPaginasEnSecundaria(Proceso proceso) {
        
        return proceso.getCantPaginas() - this.getPaginasEnPrincipal(proceso);
    }
    
    public void setTimeout(Runnable runnable, int delay) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            }
            catch (Exception e){
                System.err.println(e);
            }
        }).start();
    }
    
    
}
