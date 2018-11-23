package view;

import controller.Controller;
import java.awt.Color;
import javax.swing.ImageIcon;

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
        this.jPanel1.setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("images/MemorySlot.png")).getImage());
        this.controlador = controlador;
        this.tamPrincipal = tamPrincipal;
        this.tamSecundaria = tamSecundaria;
        this.tamPaginas = tamPaginas;
        
        this.controlador.initDatosDelPanelDeControl(this);
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
        jLabel2 = new javax.swing.JLabel();
        fieldTamañoProceso = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        fieldNombreProceso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        botonAux = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePrincipal = new javax.swing.JTable();
        progressSecundaria = new javax.swing.JProgressBar();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSecundaria = new javax.swing.JTable();
        botonAcceder6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        progressPrincipal = new javax.swing.JProgressBar();
        labelTamUsadaSecundaria = new javax.swing.JLabel();
        labelEspaciosSecundaria = new javax.swing.JLabel();
        labelTamDisponiblePrincipal1 = new javax.swing.JLabel();
        labelTamTotalSecundaria = new javax.swing.JLabel();
        labelTamUsadaPrincipal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelTamDisponibleSecundaria = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        labelTamDisponiblePrincipal4 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal5 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal6 = new javax.swing.JLabel();
        labelTamTotalPrincipal = new javax.swing.JLabel();
        labelProcesosCreados = new javax.swing.JLabel();
        labelMarcosPagina = new javax.swing.JLabel();
        labelTamañoPagina = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLista = new javax.swing.JTable();
        botonAcceder10 = new javax.swing.JButton();
        botonAcceder9 = new javax.swing.JButton();
        botonAcceder5 = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setUndecorated(true);

        panelHerramientas.setBackground(new java.awt.Color(51, 51, 51));
        panelHerramientas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        panelHerramientas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/EquisBlanca.png"))); // NOI18N
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarMouseClicked(evt);
            }
        });
        panelHerramientas.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, -1, 80));

        botonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MinimizarBlanca.png"))); // NOI18N
        botonMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizarMouseClicked(evt);
            }
        });
        panelHerramientas.add(botonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, 80));

        botonInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/info.png"))); // NOI18N
        botonInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInfoMouseClicked(evt);
            }
        });
        panelHerramientas.add(botonInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 80));

        panelContenido.setBackground(new java.awt.Color(203, 155, 66));
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
        panelContenido.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MemoriaSecundaria.png"))); // NOI18N
        panelContenido.add(jLabel2);
        jLabel2.setBounds(620, 220, 140, 21);

        fieldTamañoProceso.setBackground(new java.awt.Color(203, 155, 66));
        fieldTamañoProceso.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        fieldTamañoProceso.setForeground(new java.awt.Color(51, 51, 51));
        fieldTamañoProceso.setText("Tamaño del Proceso");
        fieldTamañoProceso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamaño del Proceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 10), new java.awt.Color(0, 0, 0))); // NOI18N
        fieldTamañoProceso.setSelectionColor(new java.awt.Color(102, 102, 102));
        fieldTamañoProceso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldTamañoProcesoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldTamañoProcesoFocusLost(evt);
            }
        });
        fieldTamañoProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTamañoProcesoActionPerformed(evt);
            }
        });
        fieldTamañoProceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTamañoProcesoKeyTyped(evt);
            }
        });
        panelContenido.add(fieldTamañoProceso);
        fieldTamañoProceso.setBounds(30, 101, 160, 50);

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

        panelContenido.add(jPanel3);
        jPanel3.setBounds(220, 27, 3, 160);

        fieldNombreProceso.setBackground(new java.awt.Color(203, 155, 66));
        fieldNombreProceso.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        fieldNombreProceso.setForeground(new java.awt.Color(51, 51, 51));
        fieldNombreProceso.setText("Nombre del Proceso");
        fieldNombreProceso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del Proceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 10), new java.awt.Color(0, 0, 0))); // NOI18N
        fieldNombreProceso.setSelectionColor(new java.awt.Color(102, 102, 102));
        fieldNombreProceso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldNombreProcesoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldNombreProcesoFocusLost(evt);
            }
        });
        fieldNombreProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreProcesoActionPerformed(evt);
            }
        });
        fieldNombreProceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldNombreProcesoKeyTyped(evt);
            }
        });
        panelContenido.add(fieldNombreProceso);
        fieldNombreProceso.setBounds(30, 47, 160, 50);

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/CrearNuevoProceso.png"))); // NOI18N
        panelContenido.add(jLabel3);
        jLabel3.setBounds(30, 20, 140, 21);

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

        panelContenido.add(jPanel4);
        jPanel4.setBounds(480, 30, 3, 165);

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ListaProcesos.png"))); // NOI18N
        panelContenido.add(jLabel4);
        jLabel4.setBounds(500, 20, 120, 21);

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/TamDisponible.png"))); // NOI18N
        panelContenido.add(jLabel5);
        jLabel5.setBounds(250, 480, 120, 18);

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

        panelContenido.add(jPanel5);
        jPanel5.setBounds(600, 228, 3, 290);
        panelContenido.add(botonAux);
        botonAux.setBounds(8, 0, 0, 1);

        tablePrincipal.setAutoCreateRowSorter(true);
        tablePrincipal.setBackground(new java.awt.Color(81, 81, 81));
        tablePrincipal.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablePrincipal.setForeground(new java.awt.Color(220, 220, 220));
        tablePrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dir. Física", "# Marco", "ID Proceso", "Nombre Proceso", "# Pág.", "Tam. Pág. [MB]", "Tam. Frag. [MB]"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablePrincipal.setFocusable(false);
        tablePrincipal.setGridColor(new java.awt.Color(120, 120, 120));
        tablePrincipal.setSelectionBackground(new java.awt.Color(203, 155, 107));
        tablePrincipal.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablePrincipalMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablePrincipal);

        panelContenido.add(jScrollPane2);
        jScrollPane2.setBounds(30, 260, 550, 200);

        progressSecundaria.setBackground(new java.awt.Color(204, 204, 204));
        progressSecundaria.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        progressSecundaria.setForeground(new java.awt.Color(81, 81, 81));
        progressSecundaria.setValue(65);
        progressSecundaria.setStringPainted(true);
        panelContenido.add(progressSecundaria);
        progressSecundaria.setBounds(980, 480, 170, 30);

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

        panelContenido.add(jPanel6);
        jPanel6.setBounds(760, 228, 424, 3);

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

        panelContenido.add(jPanel7);
        jPanel7.setBounds(170, 27, 52, 3);

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

        panelContenido.add(jPanel8);
        jPanel8.setBounds(336, 27, 147, 3);

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

        panelContenido.add(jPanel9);
        jPanel9.setBounds(157, 228, 443, 3);

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

        panelContenido.add(jPanel10);
        jPanel10.setBounds(1181, 230, 3, 290);

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Estadisticas.png"))); // NOI18N
        panelContenido.add(jLabel6);
        jLabel6.setBounds(250, 20, 80, 21);

        tableSecundaria.setBackground(new java.awt.Color(81, 81, 81));
        tableSecundaria.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tableSecundaria.setForeground(new java.awt.Color(220, 220, 220));
        tableSecundaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Espacio Disco", "ID Proceso", "Nombre Proceso", "# Página"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableSecundaria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableSecundaria.setFocusable(false);
        tableSecundaria.setGridColor(new java.awt.Color(120, 120, 120));
        tableSecundaria.setSelectionBackground(new java.awt.Color(203, 155, 107));
        tableSecundaria.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableSecundaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableSecundariaMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tableSecundaria);

        panelContenido.add(jScrollPane3);
        jScrollPane3.setBounds(620, 260, 550, 200);

        botonAcceder6.setBackground(new java.awt.Color(51, 51, 51));
        botonAcceder6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botonAcceder6.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder6.setText("Crear proceso");
        botonAcceder6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAcceder6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAcceder6.setFocusPainted(false);
        botonAcceder6.setFocusable(false);
        botonAcceder6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcceder6ActionPerformed(evt);
            }
        });
        panelContenido.add(botonAcceder6);
        botonAcceder6.setBounds(60, 158, 130, 33);

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

        panelContenido.add(jPanel11);
        jPanel11.setBounds(620, 27, 564, 3);

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

        panelContenido.add(jPanel12);
        jPanel12.setBounds(1181, 30, 3, 165);

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MemoriaPrincipal.png"))); // NOI18N
        panelContenido.add(jLabel7);
        jLabel7.setBounds(30, 220, 130, 21);

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/TamUsada.png"))); // NOI18N
        panelContenido.add(jLabel8);
        jLabel8.setBounds(140, 480, 90, 18);

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/TamTotal.png"))); // NOI18N
        panelContenido.add(jLabel9);
        jLabel9.setBounds(620, 480, 90, 18);

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/TamUsada.png"))); // NOI18N
        panelContenido.add(jLabel10);
        jLabel10.setBounds(730, 480, 90, 18);

        progressPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        progressPrincipal.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        progressPrincipal.setForeground(new java.awt.Color(81, 81, 81));
        progressPrincipal.setValue(65);
        progressPrincipal.setStringPainted(true);
        panelContenido.add(progressPrincipal);
        progressPrincipal.setBounds(390, 480, 170, 30);

        labelTamUsadaSecundaria.setBackground(new java.awt.Color(51, 51, 51));
        labelTamUsadaSecundaria.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelTamUsadaSecundaria.setForeground(new java.awt.Color(51, 51, 51));
        labelTamUsadaSecundaria.setText("jLabel11");
        panelContenido.add(labelTamUsadaSecundaria);
        labelTamUsadaSecundaria.setBounds(733, 500, 100, 27);

        labelEspaciosSecundaria.setBackground(new java.awt.Color(51, 51, 51));
        labelEspaciosSecundaria.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelEspaciosSecundaria.setForeground(new java.awt.Color(81, 81, 81));
        labelEspaciosSecundaria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEspaciosSecundaria.setText("8000");
        panelContenido.add(labelEspaciosSecundaria);
        labelEspaciosSecundaria.setBounds(400, 126, 70, 27);

        labelTamDisponiblePrincipal1.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal1.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal1.setText("# Espacios en MS");
        panelContenido.add(labelTamDisponiblePrincipal1);
        labelTamDisponiblePrincipal1.setBounds(250, 130, 140, 23);

        labelTamTotalSecundaria.setBackground(new java.awt.Color(51, 51, 51));
        labelTamTotalSecundaria.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelTamTotalSecundaria.setForeground(new java.awt.Color(51, 51, 51));
        labelTamTotalSecundaria.setText("1000000");
        panelContenido.add(labelTamTotalSecundaria);
        labelTamTotalSecundaria.setBounds(623, 500, 90, 27);

        labelTamUsadaPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        labelTamUsadaPrincipal.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelTamUsadaPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        labelTamUsadaPrincipal.setText("25");
        panelContenido.add(labelTamUsadaPrincipal);
        labelTamUsadaPrincipal.setBounds(143, 500, 90, 27);

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/TamTotal.png"))); // NOI18N
        panelContenido.add(jLabel11);
        jLabel11.setBounds(30, 480, 90, 18);

        labelTamDisponiblePrincipal.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelTamDisponiblePrincipal.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal.setText("jLabel11");
        panelContenido.add(labelTamDisponiblePrincipal);
        labelTamDisponiblePrincipal.setBounds(253, 500, 100, 27);

        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/TamDisponible.png"))); // NOI18N
        panelContenido.add(jLabel12);
        jLabel12.setBounds(840, 480, 120, 18);

        labelTamDisponibleSecundaria.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponibleSecundaria.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelTamDisponibleSecundaria.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponibleSecundaria.setText("jLabel11");
        panelContenido.add(labelTamDisponibleSecundaria);
        labelTamDisponibleSecundaria.setBounds(845, 500, 100, 27);

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

        panelContenido.add(jPanel13);
        jPanel13.setBounds(0, 0, 2, 540);

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

        panelContenido.add(jPanel14);
        jPanel14.setBounds(1198, 0, 2, 540);

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

        panelContenido.add(jPanel15);
        jPanel15.setBounds(0, 538, 1200, 2);

        labelTamDisponiblePrincipal4.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal4.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal4.setText("# Procesos Creados");
        panelContenido.add(labelTamDisponiblePrincipal4);
        labelTamDisponiblePrincipal4.setBounds(250, 50, 140, 23);

        labelTamDisponiblePrincipal5.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal5.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal5.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal5.setText("# Marcos de página");
        panelContenido.add(labelTamDisponiblePrincipal5);
        labelTamDisponiblePrincipal5.setBounds(250, 90, 140, 23);

        labelTamDisponiblePrincipal6.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal6.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal6.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal6.setText("Tamaño de Página");
        panelContenido.add(labelTamDisponiblePrincipal6);
        labelTamDisponiblePrincipal6.setBounds(250, 170, 140, 23);

        labelTamTotalPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        labelTamTotalPrincipal.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelTamTotalPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        labelTamTotalPrincipal.setText("8000");
        panelContenido.add(labelTamTotalPrincipal);
        labelTamTotalPrincipal.setBounds(33, 500, 90, 27);

        labelProcesosCreados.setBackground(new java.awt.Color(51, 51, 51));
        labelProcesosCreados.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelProcesosCreados.setForeground(new java.awt.Color(81, 81, 81));
        labelProcesosCreados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProcesosCreados.setText("8000");
        panelContenido.add(labelProcesosCreados);
        labelProcesosCreados.setBounds(400, 46, 70, 27);

        labelMarcosPagina.setBackground(new java.awt.Color(51, 51, 51));
        labelMarcosPagina.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelMarcosPagina.setForeground(new java.awt.Color(81, 81, 81));
        labelMarcosPagina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMarcosPagina.setText("8000");
        panelContenido.add(labelMarcosPagina);
        labelMarcosPagina.setBounds(400, 86, 70, 27);

        labelTamañoPagina.setBackground(new java.awt.Color(51, 51, 51));
        labelTamañoPagina.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelTamañoPagina.setForeground(new java.awt.Color(81, 81, 81));
        labelTamañoPagina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTamañoPagina.setText("8000");
        panelContenido.add(labelTamañoPagina);
        labelTamañoPagina.setBounds(400, 166, 70, 27);

        tableLista.setAutoCreateRowSorter(true);
        tableLista.setBackground(new java.awt.Color(81, 81, 81));
        tableLista.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tableLista.setForeground(new java.awt.Color(220, 220, 220));
        tableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Tamaño [MB]", "# Páginas", "Estado", "# MP", "# MS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableLista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableLista.setFocusable(false);
        tableLista.setGridColor(new java.awt.Color(120, 120, 120));
        tableLista.setSelectionBackground(new java.awt.Color(203, 155, 107));
        tableLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableListaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableLista);

        botonAcceder10.setBackground(new java.awt.Color(51, 51, 51));
        botonAcceder10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botonAcceder10.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder10.setText("Listo / Bloquear");
        botonAcceder10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAcceder10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAcceder10.setFocusPainted(false);
        botonAcceder10.setFocusable(false);
        botonAcceder10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcceder10ActionPerformed(evt);
            }
        });

        botonAcceder9.setBackground(new java.awt.Color(51, 51, 51));
        botonAcceder9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botonAcceder9.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder9.setText("Suspender");
        botonAcceder9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAcceder9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAcceder9.setFocusPainted(false);
        botonAcceder9.setFocusable(false);
        botonAcceder9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcceder9ActionPerformed(evt);
            }
        });

        botonAcceder5.setBackground(new java.awt.Color(255, 0, 52));
        botonAcceder5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botonAcceder5.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder5.setText("Eliminar");
        botonAcceder5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAcceder5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAcceder5.setFocusPainted(false);
        botonAcceder5.setFocusable(false);
        botonAcceder5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcceder5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAcceder5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAcceder9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAcceder10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonAcceder10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(botonAcceder9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(botonAcceder5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        panelContenido.add(jPanel1);
        jPanel1.setBounds(500, 50, 682, 139);

        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        panelContenido.add(jToggleButton2);
        jToggleButton2.setBounds(10, 0, 20, 0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelContenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelHerramientasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHerramientasMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_panelHerramientasMouseDragged

    private void panelHerramientasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHerramientasMousePressed
        x = evt.getX();
        y = evt.getY();
        this.controlador.clearTableSelection(this.tableLista, this.tablePrincipal, this.tableSecundaria);
        this.botonAux.requestFocus();
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
        this.controlador.clearTableSelection(this.tableLista, this.tablePrincipal, this.tableSecundaria);
        this.botonAux.requestFocus();
    }//GEN-LAST:event_panelContenidoMousePressed

    private void botonAcceder5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcceder5ActionPerformed
        this.controlador.eliminarProceso(this);
    }//GEN-LAST:event_botonAcceder5ActionPerformed

    private void fieldTamañoProcesoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamañoProcesoFocusGained
        this.fieldTamañoProceso.selectAll();
    }//GEN-LAST:event_fieldTamañoProcesoFocusGained

    private void fieldTamañoProcesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamañoProcesoFocusLost
        if(fieldTamañoProceso.getText().trim().equals("") == true){
            fieldTamañoProceso.setText("Tamaño Memoria Principal [KB]");
        }
    }//GEN-LAST:event_fieldTamañoProcesoFocusLost

    private void fieldTamañoProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTamañoProcesoActionPerformed

    }//GEN-LAST:event_fieldTamañoProcesoActionPerformed

    private void fieldTamañoProcesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTamañoProcesoKeyTyped
        char tecla = evt.getKeyChar();
//        if(tecla == KeyEvent.VK_ENTER){
//            botonInstalarSO.doClick();
//        }
        controlador.validarSoloNumeros(evt, this);
    }//GEN-LAST:event_fieldTamañoProcesoKeyTyped

    private void fieldNombreProcesoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNombreProcesoFocusGained
        this.fieldNombreProceso.selectAll();
    }//GEN-LAST:event_fieldNombreProcesoFocusGained

    private void fieldNombreProcesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNombreProcesoFocusLost
    }//GEN-LAST:event_fieldNombreProcesoFocusLost

    private void fieldNombreProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreProcesoActionPerformed
    }//GEN-LAST:event_fieldNombreProcesoActionPerformed

    private void fieldNombreProcesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNombreProcesoKeyTyped
    }//GEN-LAST:event_fieldNombreProcesoKeyTyped

    private void botonAcceder6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcceder6ActionPerformed
        this.controlador.crearProceso(this);
    }//GEN-LAST:event_botonAcceder6ActionPerformed

    private void botonAcceder9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcceder9ActionPerformed
        this.controlador.suspenderProceso(this);
    }//GEN-LAST:event_botonAcceder9ActionPerformed

    private void botonAcceder10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcceder10ActionPerformed
        this.controlador.bloquearProceso(this);
    }//GEN-LAST:event_botonAcceder10ActionPerformed

    private void tablePrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePrincipalMousePressed
        this.tableLista.clearSelection();
        this.tableSecundaria.clearSelection();
    }//GEN-LAST:event_tablePrincipalMousePressed

    private void tableSecundariaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSecundariaMousePressed
        this.tableLista.clearSelection();
        this.tablePrincipal.clearSelection();
    }//GEN-LAST:event_tableSecundariaMousePressed

    private void tableListaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListaMousePressed
        this.tablePrincipal.clearSelection();
        this.tableSecundaria.clearSelection();
    }//GEN-LAST:event_tableListaMousePressed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcceder10;
    private javax.swing.JButton botonAcceder5;
    private javax.swing.JButton botonAcceder6;
    private javax.swing.JButton botonAcceder9;
    private javax.swing.JToggleButton botonAux;
    private javax.swing.JLabel botonCerrar;
    private javax.swing.JLabel botonInfo;
    private javax.swing.JLabel botonMinimizar;
    public javax.swing.JTextField fieldNombreProceso;
    public javax.swing.JTextField fieldTamañoProceso;
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
    public javax.swing.JPanel jPanel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton2;
    public javax.swing.JLabel labelEspaciosSecundaria;
    public javax.swing.JLabel labelMarcosPagina;
    public javax.swing.JLabel labelProcesosCreados;
    public javax.swing.JLabel labelTamDisponiblePrincipal;
    private javax.swing.JLabel labelTamDisponiblePrincipal1;
    private javax.swing.JLabel labelTamDisponiblePrincipal4;
    private javax.swing.JLabel labelTamDisponiblePrincipal5;
    private javax.swing.JLabel labelTamDisponiblePrincipal6;
    public javax.swing.JLabel labelTamDisponibleSecundaria;
    public javax.swing.JLabel labelTamTotalPrincipal;
    public javax.swing.JLabel labelTamTotalSecundaria;
    public javax.swing.JLabel labelTamUsadaPrincipal;
    public javax.swing.JLabel labelTamUsadaSecundaria;
    public javax.swing.JLabel labelTamañoPagina;
    public javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelHerramientas;
    public javax.swing.JProgressBar progressPrincipal;
    public javax.swing.JProgressBar progressSecundaria;
    public javax.swing.JTable tableLista;
    public javax.swing.JTable tablePrincipal;
    public javax.swing.JTable tableSecundaria;
    // End of variables declaration//GEN-END:variables
}
