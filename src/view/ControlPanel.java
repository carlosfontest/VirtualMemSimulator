package view;

import controller.Controller;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Carlos Fontes & Rafael Quintero
 */
public class ControlPanel extends javax.swing.JFrame {
    private Controller controlador;
    private int tamPrincipal, tamSecundaria, tamPaginas;
    private int x, y;

    public ControlPanel(Controller controlador, int tamPrincipal, int tamSecundaria, int tamPaginas) {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("images/MemorySlot.png")).getImage());
        this.controlador = controlador;
        this.tamPrincipal = tamPrincipal;
        this.tamSecundaria = tamSecundaria;
        this.tamPaginas = tamPaginas;
        
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHerramientas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        botonInfo = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        botonAcceder5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fieldTamPrincipal = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        fieldTamPrincipal1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        botonAcceder6 = new javax.swing.JButton();
        botonAcceder7 = new javax.swing.JButton();
        botonAcceder8 = new javax.swing.JButton();
        botonAcceder9 = new javax.swing.JButton();
        botonAcceder10 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        labelTamUsadaSecundaria = new javax.swing.JLabel();
        labelTamTotalPrincipal1 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal1 = new javax.swing.JLabel();
        labelTamTotalSecundaria1 = new javax.swing.JLabel();
        labelTamUsadaPrincipal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelTamDisponibleSecundaria = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        labelTamDisponiblePrincipal2 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal4 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal5 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal6 = new javax.swing.JLabel();
        labelTamTotalPrincipal2 = new javax.swing.JLabel();
        labelTamTotalPrincipal3 = new javax.swing.JLabel();
        labelTamTotalPrincipal4 = new javax.swing.JLabel();
        labelTamTotalPrincipal5 = new javax.swing.JLabel();
        labelTamTotalPrincipal6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 600));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setUndecorated(true);

        panelHerramientas.setBackground(new java.awt.Color(51, 51, 51));
        panelHerramientas.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        panelHerramientas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelHerramientasMouseDragged(evt);
            }
        });
        panelHerramientas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelHerramientasMousePressed(evt);
            }
        });
        panelHerramientas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ControlPanel.png"))); // NOI18N
        panelHerramientas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/EquisBlanca.png"))); // NOI18N
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarMouseClicked(evt);
            }
        });
        panelHerramientas.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 14, -1, -1));

        botonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MinimizarBlanca.png"))); // NOI18N
        botonMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizarMouseClicked(evt);
            }
        });
        panelHerramientas.add(botonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 14, -1, -1));

        botonInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/info.png"))); // NOI18N
        botonInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInfoMouseClicked(evt);
            }
        });
        panelHerramientas.add(botonInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, -1));

        panelContenido.setBackground(new java.awt.Color(255, 241, 114));
        panelContenido.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelContenidoMouseDragged(evt);
            }
        });
        panelContenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelContenidoMousePressed(evt);
            }
        });
        panelContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAcceder5.setBackground(new java.awt.Color(255, 51, 51));
        botonAcceder5.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        botonAcceder5.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder5.setText("Eliminar");
        botonAcceder5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAcceder5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAcceder5.setFocusPainted(false);
        botonAcceder5.setFocusable(false);
        botonAcceder5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcceder5ActionPerformed(evt);
            }
        });
        panelContenido.add(botonAcceder5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1044, 162, 130, 27));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MemoriaSecundaria.png"))); // NOI18N
        panelContenido.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 140, -1));

        fieldTamPrincipal.setBackground(new java.awt.Color(255, 241, 114));
        fieldTamPrincipal.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        fieldTamPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        fieldTamPrincipal.setText("Tamaño del Proceso");
        fieldTamPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamaño del Proceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 10), new java.awt.Color(0, 0, 0))); // NOI18N
        fieldTamPrincipal.setSelectionColor(new java.awt.Color(102, 102, 102));
        fieldTamPrincipal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldTamPrincipalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldTamPrincipalFocusLost(evt);
            }
        });
        fieldTamPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTamPrincipalActionPerformed(evt);
            }
        });
        fieldTamPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTamPrincipalKeyTyped(evt);
            }
        });
        panelContenido.add(fieldTamPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 104, 160, 50));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 27, 3, 160));

        fieldTamPrincipal1.setBackground(new java.awt.Color(255, 241, 114));
        fieldTamPrincipal1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        fieldTamPrincipal1.setForeground(new java.awt.Color(51, 51, 51));
        fieldTamPrincipal1.setText("Nombre del Proceso");
        fieldTamPrincipal1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del Proceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 10), new java.awt.Color(0, 0, 0))); // NOI18N
        fieldTamPrincipal1.setSelectionColor(new java.awt.Color(102, 102, 102));
        fieldTamPrincipal1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldTamPrincipal1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldTamPrincipal1FocusLost(evt);
            }
        });
        fieldTamPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTamPrincipal1ActionPerformed(evt);
            }
        });
        fieldTamPrincipal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTamPrincipal1KeyTyped(evt);
            }
        });
        panelContenido.add(fieldTamPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 160, 50));

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/CrearNuevoProceso.png"))); // NOI18N
        panelContenido.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ListaProcesos.png"))); // NOI18N
        panelContenido.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 120, -1));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/TamDisponible.png"))); // NOI18N
        panelContenido.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 120, -1));

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jTable1.setForeground(new java.awt.Color(220, 220, 220));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Tamaño", "Páginas", "Estado", "# MP", "# MS"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(120, 120, 120));
        jScrollPane1.setViewportView(jTable1);

        panelContenido.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 540, 140));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 228, -1, 290));
        panelContenido.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jTable2.setBackground(new java.awt.Color(51, 51, 51));
        jTable2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jTable2.setForeground(new java.awt.Color(220, 220, 220));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Dir. Física", "# Marco", "ID Proceso", "Nombre Proceso", "# Página"
            }
        ));
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable2.setGridColor(new java.awt.Color(120, 120, 120));
        jScrollPane2.setViewportView(jTable2);

        panelContenido.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 550, 200));

        jProgressBar1.setBackground(new java.awt.Color(204, 204, 204));
        jProgressBar1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(51, 51, 51));
        jProgressBar1.setValue(65);
        jProgressBar1.setStringPainted(true);
        panelContenido.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 480, 170, 30));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 228, 424, 3));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 27, 52, 3));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 27, 147, 3));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 228, 443, 3));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1181, 230, -1, -1));

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Estadisticas.png"))); // NOI18N
        panelContenido.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 80, -1));

        jTable3.setBackground(new java.awt.Color(51, 51, 51));
        jTable3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jTable3.setForeground(new java.awt.Color(220, 220, 220));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Espacio Disco", "ID Proceso", "Nombre Proceso", "# Página"
            }
        ));
        jTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable3.setGridColor(new java.awt.Color(120, 120, 120));
        jScrollPane3.setViewportView(jTable3);

        panelContenido.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 550, 200));

        botonAcceder6.setBackground(new java.awt.Color(51, 51, 51));
        botonAcceder6.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        botonAcceder6.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder6.setText("Crear proceso");
        botonAcceder6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAcceder6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAcceder6.setFocusPainted(false);
        botonAcceder6.setFocusable(false);
        botonAcceder6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcceder6ActionPerformed(evt);
            }
        });
        panelContenido.add(botonAcceder6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 130, 30));

        botonAcceder7.setBackground(new java.awt.Color(51, 51, 51));
        botonAcceder7.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        botonAcceder7.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder7.setText("Listo");
        botonAcceder7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAcceder7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAcceder7.setFocusPainted(false);
        botonAcceder7.setFocusable(false);
        botonAcceder7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcceder7ActionPerformed(evt);
            }
        });
        panelContenido.add(botonAcceder7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1044, 50, 130, 27));

        botonAcceder8.setBackground(new java.awt.Color(51, 51, 51));
        botonAcceder8.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        botonAcceder8.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder8.setText("Susp/Listo");
        botonAcceder8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAcceder8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAcceder8.setFocusPainted(false);
        botonAcceder8.setFocusable(false);
        botonAcceder8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcceder8ActionPerformed(evt);
            }
        });
        panelContenido.add(botonAcceder8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1044, 106, 130, 27));

        botonAcceder9.setBackground(new java.awt.Color(51, 51, 51));
        botonAcceder9.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        botonAcceder9.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder9.setText("Susp/Bloqueado");
        botonAcceder9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAcceder9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAcceder9.setFocusPainted(false);
        botonAcceder9.setFocusable(false);
        botonAcceder9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcceder9ActionPerformed(evt);
            }
        });
        panelContenido.add(botonAcceder9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1044, 134, 130, 27));

        botonAcceder10.setBackground(new java.awt.Color(51, 51, 51));
        botonAcceder10.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        botonAcceder10.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder10.setText("Bloquear");
        botonAcceder10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAcceder10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAcceder10.setFocusPainted(false);
        botonAcceder10.setFocusable(false);
        botonAcceder10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcceder10ActionPerformed(evt);
            }
        });
        panelContenido.add(botonAcceder10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1044, 78, 130, 27));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 27, 564, -1));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1181, 30, -1, 165));

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MemoriaPrincipal.png"))); // NOI18N
        panelContenido.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, -1));

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/TamUsada.png"))); // NOI18N
        panelContenido.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 90, -1));

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/TamTotal.png"))); // NOI18N
        panelContenido.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 90, -1));

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/TamUsada.png"))); // NOI18N
        panelContenido.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 90, -1));

        jProgressBar2.setBackground(new java.awt.Color(204, 204, 204));
        jProgressBar2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        jProgressBar2.setForeground(new java.awt.Color(51, 51, 51));
        jProgressBar2.setValue(65);
        jProgressBar2.setStringPainted(true);
        panelContenido.add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 170, 30));

        labelTamUsadaSecundaria.setBackground(new java.awt.Color(51, 51, 51));
        labelTamUsadaSecundaria.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        labelTamUsadaSecundaria.setForeground(new java.awt.Color(51, 51, 51));
        labelTamUsadaSecundaria.setText("jLabel11");
        panelContenido.add(labelTamUsadaSecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 500, 100, -1));

        labelTamTotalPrincipal1.setBackground(new java.awt.Color(51, 51, 51));
        labelTamTotalPrincipal1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 16)); // NOI18N
        labelTamTotalPrincipal1.setForeground(new java.awt.Color(81, 81, 81));
        labelTamTotalPrincipal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTamTotalPrincipal1.setText("8000");
        panelContenido.add(labelTamTotalPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 165, 70, -1));

        labelTamDisponiblePrincipal1.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        labelTamDisponiblePrincipal1.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal1.setText("# Espacios en MS");
        panelContenido.add(labelTamDisponiblePrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 140, -1));

        labelTamTotalSecundaria1.setBackground(new java.awt.Color(51, 51, 51));
        labelTamTotalSecundaria1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        labelTamTotalSecundaria1.setForeground(new java.awt.Color(51, 51, 51));
        labelTamTotalSecundaria1.setText("1000000");
        panelContenido.add(labelTamTotalSecundaria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 500, 90, -1));

        labelTamUsadaPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        labelTamUsadaPrincipal.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        labelTamUsadaPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        labelTamUsadaPrincipal.setText("25");
        panelContenido.add(labelTamUsadaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 500, 90, -1));

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/TamTotal.png"))); // NOI18N
        panelContenido.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 90, -1));

        labelTamDisponiblePrincipal3.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        labelTamDisponiblePrincipal3.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal3.setText("jLabel11");
        panelContenido.add(labelTamDisponiblePrincipal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 500, 100, -1));

        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/TamDisponible.png"))); // NOI18N
        panelContenido.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 480, 120, -1));

        labelTamDisponibleSecundaria.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponibleSecundaria.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        labelTamDisponibleSecundaria.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponibleSecundaria.setText("jLabel11");
        panelContenido.add(labelTamDisponibleSecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 500, 100, -1));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2, 540));

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1198, 0, -1, -1));

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1200, 2));

        labelTamDisponiblePrincipal2.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        labelTamDisponiblePrincipal2.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal2.setText("# Procesos Vivos");
        panelContenido.add(labelTamDisponiblePrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 130, -1));

        labelTamDisponiblePrincipal4.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal4.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        labelTamDisponiblePrincipal4.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal4.setText("# Procesos Creados");
        panelContenido.add(labelTamDisponiblePrincipal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 140, -1));

        labelTamDisponiblePrincipal5.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal5.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        labelTamDisponiblePrincipal5.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal5.setText("# Marcos de página");
        panelContenido.add(labelTamDisponiblePrincipal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 140, -1));

        labelTamDisponiblePrincipal6.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal6.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        labelTamDisponiblePrincipal6.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal6.setText("Tamaño de Página");
        panelContenido.add(labelTamDisponiblePrincipal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 140, -1));

        labelTamTotalPrincipal2.setBackground(new java.awt.Color(51, 51, 51));
        labelTamTotalPrincipal2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        labelTamTotalPrincipal2.setForeground(new java.awt.Color(51, 51, 51));
        labelTamTotalPrincipal2.setText("8000");
        panelContenido.add(labelTamTotalPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 500, 90, -1));

        labelTamTotalPrincipal3.setBackground(new java.awt.Color(51, 51, 51));
        labelTamTotalPrincipal3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 16)); // NOI18N
        labelTamTotalPrincipal3.setForeground(new java.awt.Color(81, 81, 81));
        labelTamTotalPrincipal3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTamTotalPrincipal3.setText("8000");
        panelContenido.add(labelTamTotalPrincipal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 46, 70, -1));

        labelTamTotalPrincipal4.setBackground(new java.awt.Color(51, 51, 51));
        labelTamTotalPrincipal4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 16)); // NOI18N
        labelTamTotalPrincipal4.setForeground(new java.awt.Color(81, 81, 81));
        labelTamTotalPrincipal4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTamTotalPrincipal4.setText("8000");
        panelContenido.add(labelTamTotalPrincipal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 75, 70, -1));

        labelTamTotalPrincipal5.setBackground(new java.awt.Color(51, 51, 51));
        labelTamTotalPrincipal5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 16)); // NOI18N
        labelTamTotalPrincipal5.setForeground(new java.awt.Color(81, 81, 81));
        labelTamTotalPrincipal5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTamTotalPrincipal5.setText("8000");
        panelContenido.add(labelTamTotalPrincipal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 105, 70, -1));

        labelTamTotalPrincipal6.setBackground(new java.awt.Color(51, 51, 51));
        labelTamTotalPrincipal6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 16)); // NOI18N
        labelTamTotalPrincipal6.setForeground(new java.awt.Color(81, 81, 81));
        labelTamTotalPrincipal6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTamTotalPrincipal6.setText("8000");
        panelContenido.add(labelTamTotalPrincipal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 135, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelHerramientasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHerramientasMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_panelHerramientasMouseDragged

    private void panelHerramientasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHerramientasMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelHerramientasMousePressed

    private void botonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseClicked
        this.controlador.closeFrame(this);
    }//GEN-LAST:event_botonCerrarMouseClicked

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
        this.controlador.minimizeFrame(this);
    }//GEN-LAST:event_botonMinimizarMouseClicked

    private void botonInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInfoMouseClicked
        this.controlador.mostrarInfo(this);
    }//GEN-LAST:event_botonInfoMouseClicked

    private void panelContenidoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContenidoMouseDragged
    }//GEN-LAST:event_panelContenidoMouseDragged

    private void panelContenidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContenidoMousePressed
    }//GEN-LAST:event_panelContenidoMousePressed

    private void botonAcceder5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcceder5ActionPerformed
    }//GEN-LAST:event_botonAcceder5ActionPerformed

    private void fieldTamPrincipalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamPrincipalFocusGained
        if(fieldTamPrincipal.getText().equals("Tamaño Memoria Principal [KB]") == true){
            fieldTamPrincipal.setText("");
        }
    }//GEN-LAST:event_fieldTamPrincipalFocusGained

    private void fieldTamPrincipalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamPrincipalFocusLost
        if(fieldTamPrincipal.getText().trim().equals("") == true){
            fieldTamPrincipal.setText("Tamaño Memoria Principal [KB]");
        }
    }//GEN-LAST:event_fieldTamPrincipalFocusLost

    private void fieldTamPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTamPrincipalActionPerformed

    }//GEN-LAST:event_fieldTamPrincipalActionPerformed

    private void fieldTamPrincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTamPrincipalKeyTyped
        char tecla = evt.getKeyChar();
//        if(tecla == KeyEvent.VK_ENTER){
//            botonInstalarSO.doClick();
//        }
        controlador.validarSoloNumeros(evt, this);
    }//GEN-LAST:event_fieldTamPrincipalKeyTyped

    private void fieldTamPrincipal1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamPrincipal1FocusGained
    }//GEN-LAST:event_fieldTamPrincipal1FocusGained

    private void fieldTamPrincipal1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamPrincipal1FocusLost
    }//GEN-LAST:event_fieldTamPrincipal1FocusLost

    private void fieldTamPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTamPrincipal1ActionPerformed
    }//GEN-LAST:event_fieldTamPrincipal1ActionPerformed

    private void fieldTamPrincipal1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTamPrincipal1KeyTyped
    }//GEN-LAST:event_fieldTamPrincipal1KeyTyped

    private void botonAcceder6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcceder6ActionPerformed
    }//GEN-LAST:event_botonAcceder6ActionPerformed

    private void botonAcceder7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcceder7ActionPerformed
    }//GEN-LAST:event_botonAcceder7ActionPerformed

    private void botonAcceder8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcceder8ActionPerformed
    }//GEN-LAST:event_botonAcceder8ActionPerformed

    private void botonAcceder9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcceder9ActionPerformed
    }//GEN-LAST:event_botonAcceder9ActionPerformed

    private void botonAcceder10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcceder10ActionPerformed
    }//GEN-LAST:event_botonAcceder10ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcceder;
    private javax.swing.JButton botonAcceder1;
    private javax.swing.JButton botonAcceder10;
    private javax.swing.JButton botonAcceder2;
    private javax.swing.JButton botonAcceder3;
    private javax.swing.JButton botonAcceder4;
    private javax.swing.JButton botonAcceder5;
    private javax.swing.JButton botonAcceder6;
    private javax.swing.JButton botonAcceder7;
    private javax.swing.JButton botonAcceder8;
    private javax.swing.JButton botonAcceder9;
    private javax.swing.JLabel botonCerrar;
    private javax.swing.JLabel botonInfo;
    private javax.swing.JLabel botonMinimizar;
    public javax.swing.JTextField fieldTamPrincipal;
    public javax.swing.JTextField fieldTamPrincipal1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelTamDisponiblePrincipal1;
    private javax.swing.JLabel labelTamDisponiblePrincipal2;
    private javax.swing.JLabel labelTamDisponiblePrincipal3;
    private javax.swing.JLabel labelTamDisponiblePrincipal4;
    private javax.swing.JLabel labelTamDisponiblePrincipal5;
    private javax.swing.JLabel labelTamDisponiblePrincipal6;
    private javax.swing.JLabel labelTamDisponibleSecundaria;
    private javax.swing.JLabel labelTamTotalPrincipal1;
    private javax.swing.JLabel labelTamTotalPrincipal2;
    private javax.swing.JLabel labelTamTotalPrincipal3;
    private javax.swing.JLabel labelTamTotalPrincipal4;
    private javax.swing.JLabel labelTamTotalPrincipal5;
    private javax.swing.JLabel labelTamTotalPrincipal6;
    private javax.swing.JLabel labelTamTotalSecundaria1;
    private javax.swing.JLabel labelTamUsadaPrincipal;
    private javax.swing.JLabel labelTamUsadaSecundaria;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelHerramientas;
    // End of variables declaration//GEN-END:variables
}
