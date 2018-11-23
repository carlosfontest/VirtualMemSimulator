package controller;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Marco;
import model.Pagina;
import model.Proceso;
import view.ConfigSO;
import view.ControlPanel;

/**
 *
 * @author Carlos Fontes & Rafael Quintero
 */
public class Controller {
    private JLabel labelInfo;
    private static HashMap<Integer, Proceso> procesos;
    public static Queue<Proceso> colaMemoriaPrincipal ;
    public static Queue<Proceso> colaProcesos;
    public static Marco[] memoriaSecundaria;
    public static Marco[] memoriaPrincipal;
    public static int cantMarcosOcupados;
    public static int cantEspaciosOcupadosMS;
    public static int tamañoPagina;
    public static int tamañoMemPrincipal;
    public static int tamañoMemSecundaria;
    private static ControlPanel controlPanel;

    public Controller() {
        this.labelInfo = new JLabel();
        this.procesos = new HashMap<>();
        this.colaMemoriaPrincipal = new LinkedList<>();
        this.colaProcesos = new LinkedList<>();
        this.cantMarcosOcupados = 0;
        this.cantEspaciosOcupadosMS = 0;
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
        
        // Inicializamos las memorias
        this.memoriaPrincipal = new Marco[tamPrincipal/tamPaginas];
        this.memoriaSecundaria = new Marco[tamSecundaria/tamPaginas];
        
        // Los campos fueron introducidos de manera exitosa, se abre el Panel de Control
        ControlPanel controlP = new ControlPanel(this, tamPrincipal, tamSecundaria, tamPaginas);
        frame.dispose();
        controlP.setVisible(true);
        this.initTables(controlP);
        this.controlPanel = controlP;
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
        Proceso procesoNuevo = new Proceso(this.procesos.size(), nombreProceso, (double)tiempo, tamañoProceso);
        this.procesos.put(this.procesos.size(), procesoNuevo);
        // Agregar proceso a la cola
        Controller.colaProcesos.offer(procesoNuevo);
        procesoNuevo.startTimer();
        // Aumentamos el número de procesos creados
        controlP.labelProcesosCreados.setText(String.valueOf(Integer.parseInt(controlP.labelProcesosCreados.getText()) + 1));
        // Llenamos los textFields de crear procesos
        controlP.fieldNombreProceso.setText("Proceso #" + (this.procesos.size() + 1) );
        controlP.fieldTamañoProceso.setText("4096");
        
        // Meter en la memoria principal para que se ejecute
        // Si la mitad de las paginas del proceso entran en MP
        if (Math.ceil((double) procesoNuevo.getPaginas().length / 2) <= this.memoriaPrincipal.length - this.cantMarcosOcupados) {
            colaMemoriaPrincipal.offer(procesoNuevo);
            //System.out.println("Caben al menos la mitad de las páginas del " + procesoNuevo.getNombre());
            int marcosDispon = this.memoriaPrincipal.length - this.cantMarcosOcupados;
            
            int cantPagsMP = 0, cantPagsMS = 0;
            // Si no caben todas en MP
            if(marcosDispon - procesoNuevo.getPaginas().length < 0) {
                System.out.println("No caben todas en MP las páginas del " + procesoNuevo.getNombre());
                cantPagsMS = procesoNuevo.getPaginas().length - marcosDispon;
                cantPagsMP = procesoNuevo.getPaginas().length - cantPagsMS;
                // Aumentamos los marcos ocupados
                this.cantMarcosOcupados = this.cantMarcosOcupados + cantPagsMP;
                this.cantEspaciosOcupadosMS = this.cantEspaciosOcupadosMS + cantPagsMS;
                // Seteamos la cantidad de paginas en cada memoria
                procesoNuevo.setCantPagMP(cantPagsMP);
                procesoNuevo.setCantPagMS(cantPagsMS);
                // Agregamos al array de MP y MS
                int contPaginasPuestas = 0;
                // A la MP
                for (int i = 0; i < this.memoriaPrincipal.length; i++) {
                    if(this.memoriaPrincipal[i].getPagina() == null && contPaginasPuestas < cantPagsMP) {
                        // Si encontramos el espacio vacío de la MP y aun tengo paginas que meter
                        this.memoriaPrincipal[i].setPagina( procesoNuevo.getPaginas()[contPaginasPuestas] );
                        this.memoriaPrincipal[i].getPagina().setIDProceso(procesoNuevo.getID());
                        this.memoriaPrincipal[i].getPagina().setInMemoriaPrincipal(true);
                        contPaginasPuestas++;
                    }
                }
                // A la MS
                int contAux = contPaginasPuestas;
                for (int i = 0; i < this.memoriaSecundaria.length; i++) {
                    if(this.memoriaSecundaria[i].getPagina() == null && (procesoNuevo.getPaginas().length - contAux - cantPagsMS) < cantPagsMS) {
                        // Si encontramos el espacio vacío de la MS y aun tengo paginas que meter
                        System.out.println("----------------------------");
                        this.memoriaSecundaria[i].setPagina(procesoNuevo.getPaginas()[contPaginasPuestas]);
                        this.memoriaSecundaria[i].getPagina().setIDProceso(procesoNuevo.getID());
                        this.memoriaSecundaria[i].getPagina().setInMemoriaPrincipal(false);
                        contPaginasPuestas++;
                        contAux--;
                    }
                }
                
                this.actualizarMemorias();
                
            } else {
                // Caben todas en MP
                System.out.println("Caben todas en MP las páginas del " + procesoNuevo.getNombre());
                cantPagsMS = 0;
                cantPagsMP = procesoNuevo.getPaginas().length;
                // Seteamos la cantidad de paginas en cada memoria
                procesoNuevo.setCantPagMP(cantPagsMP);
                procesoNuevo.setCantPagMS(cantPagsMS);
                // Aumentamos los marcos ocupados
                this.cantMarcosOcupados = this.cantMarcosOcupados + cantPagsMP;
                this.cantEspaciosOcupadosMS = this.cantEspaciosOcupadosMS + cantPagsMS;
                // Agregamos a la Memoria Principal
                int contPaginasPuestas = 0;
                // A la MP
                for (int i = 0; i < this.memoriaPrincipal.length; i++) {
                    if(this.memoriaPrincipal[i].getPagina() == null && contPaginasPuestas < cantPagsMP) {
                        // Si encontramos el espacio vacío de la MP y aun tengo paginas que meter
                        this.memoriaPrincipal[i].setPagina( procesoNuevo.getPaginas()[contPaginasPuestas] );
                        this.memoriaPrincipal[i].getPagina().setIDProceso(procesoNuevo.getID());
                        this.memoriaPrincipal[i].getPagina().setInMemoriaPrincipal(true);
                        contPaginasPuestas++;
                    }
                }
                this.actualizarMemorias();
            }
            
            
            
        } else {
            // Sacar de la memoria principal y meter el nuevo proceso
            int marcosDispon = this.memoriaPrincipal.length - this.cantMarcosOcupados;
            int cantPagsNecesitoEnMP = (int) Math.ceil((double) procesoNuevo.getPaginas().length / 2);
            int cantPagsNecesitoEnMS = procesoNuevo.getPaginas().length - cantPagsNecesitoEnMP;
            // Verificamos si hay espacio en memoria virtual para meter el proceso
            if (procesoNuevo.getPaginas().length > (marcosDispon + (memoriaSecundaria.length - cantEspaciosOcupadosMS))) {
                JOptionPane.showMessageDialog(null, "No hay espacio para crear ese proceso.");
                return;
            }
            // Se agrega el proceso a la cola de MP
            colaMemoriaPrincipal.offer(procesoNuevo); // AYUDAAAAAAAAAAAAAAAAA
            // Se verifica en la cola de MP los procesos y se ve cuantas páginas de cada uno de los procesos hay
            // que quitar para que entren las que necesito en MP
            // Verificar si hay espacios vacios en MP y meter las páginas que se puedan
            int numPagg = 0;
            if (cantMarcosOcupados < this.memoriaPrincipal.length) {
                int espaciosVacios = this.memoriaPrincipal.length - cantMarcosOcupados;
                int numPag = 0;
                for (numPag = 0; numPag < espaciosVacios; numPag++) {
                    for (int j = 0; j < memoriaPrincipal.length; j++) {
                        if (memoriaPrincipal[j].getPagina() == null) {
                            memoriaPrincipal[j].setPagina(procesoNuevo.getPaginas()[numPag]);
                            procesoNuevo.getPaginas()[numPag].setInMemoriaPrincipal(true);
                            procesoNuevo.setCantPagMP(procesoNuevo.getCantPagMP() + 1);
                            cantPagsNecesitoEnMP--;
                            cantMarcosOcupados++;
                            break;
                        }
                    }
                }
                numPagg = numPag;
            }

            // Verifico que procesos voy a quitar
            boolean ready = false;
            // Recorro todos los procesos que están en la cola de MP
            for (Proceso pro : colaMemoriaPrincipal) {
                // Verifico si ya se pusieron todas las páginas en MP
                if (ready) {
                    break;
                }
                // Recorro todas las páginas de el proceso
                for (int i = 0; i < pro.getPaginas().length; i++) {
                    // Si la página está en MP la saco y meto la del proceso nuevo
                    if (pro.getPaginas()[i].isInMemoriaPrincipal()) {
                        if (cantPagsNecesitoEnMP <= 0) {
                            ready = true;
                            break;
                        }
                        cantPagsNecesitoEnMP--;
                        pro.getPaginas()[i].setInMemoriaPrincipal(false);
                        // Meto la página en MS y la saco de MP
                        for (int j = 0; j < memoriaSecundaria.length; j++) {
                            if (memoriaSecundaria[j].getPagina() == null) {
                                memoriaSecundaria[j].setPagina(pro.getPaginas()[i]);
                                cantEspaciosOcupadosMS++; 
                                // Aumentamos y disminuimos la cantidad de paginas en MP y MS
                                procesos.get(pro.getPaginas()[i].getIDProceso()).setCantPagMP(procesos.get(pro.getPaginas()[i].getIDProceso()).getCantPagMP() - 1);
                                procesos.get(pro.getPaginas()[i].getIDProceso()).setCantPagMS(procesos.get(pro.getPaginas()[i].getIDProceso()).getCantPagMS() + 1);
                                actualizarMemorias();
                                // Si no están la mitad de las paginas en MP
                                if( procesos.get(pro.getPaginas()[i].getIDProceso()).getCantPagMP() >= (int) Math.ceil((double) pro.getPaginas().length / 2) ) {
                                    procesos.get(pro.getPaginas()[i].getIDProceso()).setEstado("Suspendido/Listo");
                                    actualizarMemorias();
                                } else {
                                    procesos.get(pro.getPaginas()[i].getIDProceso()).setEstado("Listo");
                                    actualizarMemorias();
                                }
                                break;
                            }
                        }
                        for (int j = 0; j < memoriaPrincipal.length; j++) {
                            // Si son del mismo proceso y el mismo numero de pagina
                            // System.out.println("Estoy en el " + pro.getNombre() + " y voy a sacar a la pag " + pro.getPaginas()[i].getNumPagina());
                            if (memoriaPrincipal[j].getPagina().getNumPagina() == pro.getPaginas()[i].getNumPagina() && memoriaPrincipal[j].getPagina().getIDProceso() == pro.getPaginas()[i].getIDProceso()) {
                                memoriaPrincipal[j].setPagina(procesoNuevo.getPaginas()[numPagg]);
                                procesoNuevo.getPaginas()[numPagg].setInMemoriaPrincipal(true);
                                numPagg++;
                                actualizarMemorias();
                            }
                        }

                        
                    }
                }
            }

            for (int i = 0; i < memoriaSecundaria.length; i++) {
                if (memoriaSecundaria[i].getPagina() == null && cantPagsNecesitoEnMS > 0) {
                    memoriaSecundaria[i].setPagina(procesoNuevo.getPaginas()[numPagg]);
                    procesoNuevo.getPaginas()[numPagg].setInMemoriaPrincipal(false);
                    cantPagsNecesitoEnMS--;
                    numPagg++;
                    cantEspaciosOcupadosMS++;
                }
            }

            actualizarMemorias();
        }
        
        // Agregamos el proceso a la tabla de procesos
        DecimalFormat formatea = new DecimalFormat("###,###.##");
        DefaultTableModel modelo = (DefaultTableModel) controlP.tableLista.getModel();
        modelo.addRow(new Object[]{
            procesoNuevo.getID(), procesoNuevo.getNombre(), formatea.format(procesoNuevo.getTamaño()), procesoNuevo.getCantPaginas(), procesoNuevo.getEstado(), procesoNuevo.getCantPagMP(), procesoNuevo.getCantPagMS()
        });
        
        
//        System.out.println("MEMORIA PRINCIPAL");
//        for (int i = 0; i < this.memoriaPrincipal.length; i++) {
//            if(this.memoriaPrincipal[i].getPagina() != null) {
//                System.out.println(this.memoriaPrincipal[i].getPagina().getNumPagina() + " " + procesos.get(this.memoriaPrincipal[i].getPagina().getIDProceso()).getNombre());
//            } else {
//                System.out.println("nada");
//            }
//
//        }
//
//        System.out.println("MEMORIA SECUNDARIA");
//        for (int i = 0; i < this.memoriaSecundaria.length; i++) {
//            if(this.memoriaSecundaria[i].getPagina() != null) {
//                System.out.println(this.memoriaSecundaria[i].getPagina().getNumPagina() + " " + procesos.get(this.memoriaSecundaria[i].getPagina().getIDProceso()).getNombre());
//            } else {
//                System.out.println("nada");
//            }
//        }
        
        
    }
    
    public static void actualizarMemorias() {
        // Actualizamos MP
        for (int i = 0; i < controlPanel.tablePrincipal.getRowCount(); i++) {
            if(memoriaPrincipal[i].getPagina() != null) {
                int ID = memoriaPrincipal[i].getPagina().getIDProceso();
                Proceso proceso = procesos.get(ID);
                controlPanel.tablePrincipal.setValueAt(ID, i, 2);
                controlPanel.tablePrincipal.setValueAt(proceso.getNombre(), i, 3);
                controlPanel.tablePrincipal.setValueAt(memoriaPrincipal[i].getPagina().getNumPagina(), i, 4);
                controlPanel.tablePrincipal.setValueAt(memoriaPrincipal[i].getPagina().getTamaño(), i, 5);
                controlPanel.tablePrincipal.setValueAt(memoriaPrincipal[i].getPagina().getTamañoFragmentacion(), i, 6);
            } else {
                controlPanel.tablePrincipal.setValueAt("", i, 2);
                controlPanel.tablePrincipal.setValueAt("", i, 3);
                controlPanel.tablePrincipal.setValueAt("", i, 4);
                controlPanel.tablePrincipal.setValueAt("", i, 5);
                controlPanel.tablePrincipal.setValueAt("", i, 6);
            }
        }
        // Actualizamos MS
        for (int i = 0; i < controlPanel.tableSecundaria.getRowCount(); i++) {
            if(memoriaSecundaria[i].getPagina() != null) {
                int ID = memoriaSecundaria[i].getPagina().getIDProceso();
                Proceso proceso = procesos.get(ID);
                controlPanel.tableSecundaria.setValueAt(ID, i, 1);
                controlPanel.tableSecundaria.setValueAt(proceso.getNombre(), i, 2);
                controlPanel.tableSecundaria.setValueAt(memoriaSecundaria[i].getPagina().getNumPagina(), i, 3);
            } else {
                controlPanel.tableSecundaria.setValueAt("", i, 1);
                controlPanel.tableSecundaria.setValueAt("", i, 2);
                controlPanel.tableSecundaria.setValueAt("", i, 3);
            }
        }
        
        // Actualizamos los tamaños de las memorias
        DecimalFormat formatea = new DecimalFormat("###,###.##");
        controlPanel.labelTamUsadaPrincipal.setText(formatea.format(cantMarcosOcupados * tamañoPagina));
        controlPanel.labelTamDisponiblePrincipal.setText(formatea.format(tamañoMemPrincipal - (cantMarcosOcupados * tamañoPagina)));
        controlPanel.labelTamUsadaSecundaria.setText(formatea.format(cantEspaciosOcupadosMS * tamañoPagina));
        controlPanel.labelTamDisponibleSecundaria.setText(formatea.format(tamañoMemSecundaria - (cantEspaciosOcupadosMS * tamañoPagina)));

        controlPanel.progressPrincipal.setValue( ((cantMarcosOcupados * tamañoPagina) * 100) / tamañoMemPrincipal );
        controlPanel.progressSecundaria.setValue( ((cantEspaciosOcupadosMS * tamañoPagina) * 100) / tamañoMemSecundaria );
        
        // Actualizamos la tabla de procesos
        for (int i = 0; i < controlPanel.tableLista.getRowCount(); i++) {
            if (procesos.get(i).getEstado().equals("Eliminado")) {
                controlPanel.tableLista.setValueAt("<html><font color=\"blue\">" + procesos.get(i).getEstado() + "</font></html>", i, 4);
                controlPanel.tableLista.setValueAt(procesos.get(i).getCantPagMP(), i, 5);
                controlPanel.tableLista.setValueAt(procesos.get(i).getCantPagMS(), i, 6);
            } else {
                controlPanel.tableLista.setValueAt(procesos.get(i).getEstado(), i, 4);
                controlPanel.tableLista.setValueAt(procesos.get(i).getCantPagMP(), i, 5);
                controlPanel.tableLista.setValueAt(procesos.get(i).getCantPagMS(), i, 6);
            }
        }
        
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
    
    public void eliminarProceso(ControlPanel controlP) {
        // Verificamos si se seleccionó algun proceso
        if(controlP.tableLista.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(controlP, "Seleccione el proceso que desea eliminar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtenemos el ID del proceso
        int ID = Integer.parseInt(String.valueOf(controlP.tableLista.getValueAt(controlP.tableLista.getSelectedRow(), 0)));
        Proceso proceso = this.procesos.get(ID);
        if (!proceso.getEstado().equals("Eliminado")) {
            // Ponemos el tiempo máximo de ejecución
            proceso.setTiempoEjecucion(proceso.getTiempoMaxEjecucion());
        }
    }
    
    public static void eliminarProceso(Proceso proceso) {
        // Modificamos variables
        cantMarcosOcupados = cantMarcosOcupados - proceso.getCantPagMP();
        cantEspaciosOcupadosMS = cantEspaciosOcupadosMS - proceso.getCantPagMS();
        // Borramos el proceso de las memorias
        // MP
        for (int i = 0; i < memoriaPrincipal.length; i++) {
            // Encontramos el proceso en MP
            if(memoriaPrincipal[i].getPagina() != null) {
                if(memoriaPrincipal[i].getPagina().getIDProceso() == proceso.getID() ) {
                    memoriaPrincipal[i].setPagina(null);
                }
            }
        }
        // MS
        for (int i = 0; i < memoriaSecundaria.length; i++) {
            // Encontramos el proceso en MS
            if(memoriaSecundaria[i].getPagina() != null) {
                if(memoriaSecundaria[i].getPagina().getIDProceso() == proceso.getID() ) {
                    memoriaSecundaria[i].setPagina(null);
                }
            }
        }
        
        actualizarMemorias();
    }
    
    
}
