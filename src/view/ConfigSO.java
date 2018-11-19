package view;

import controller.Controller;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Carlos Fontes & Rafael Quintero
 */
public class ConfigSO extends javax.swing.JFrame {
    private Controller controlador;
    private int x,y;
    
    public ConfigSO(Controller controlador) {
        initComponents();
        this.controlador = controlador;
        setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("images/MemorySlot.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        botonInfo = new javax.swing.JLabel();
        botonInstalarSO = new javax.swing.JButton();
        separador1 = new javax.swing.JSeparator();
        fieldTamPrincipal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        fieldTamSecundaria = new javax.swing.JTextField();
        separador3 = new javax.swing.JSeparator();
        fieldTamPaginas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 300));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 300));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/FotoInicio.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 100, 130));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Copy.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Nombre.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 0));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setForeground(new java.awt.Color(51, 51, 51));

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 2, 299));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setForeground(new java.awt.Color(51, 51, 51));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2, 298));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 312, 2));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 298, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/EquisBlanca.png"))); // NOI18N
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarMouseClicked(evt);
            }
        });

        botonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MinimizarBlanca.png"))); // NOI18N
        botonMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizarMouseClicked(evt);
            }
        });

        botonInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/info.png"))); // NOI18N
        botonInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInfoMouseClicked(evt);
            }
        });

        botonInstalarSO.setBackground(new java.awt.Color(0, 204, 204));
        botonInstalarSO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonInstalarSO.setForeground(new java.awt.Color(51, 51, 51));
        botonInstalarSO.setText("Instalar SO");
        botonInstalarSO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonInstalarSO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInstalarSO.setFocusPainted(false);
        botonInstalarSO.setFocusable(false);
        botonInstalarSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInstalarSOActionPerformed(evt);
            }
        });

        separador1.setBackground(new java.awt.Color(102, 102, 102));
        separador1.setForeground(new java.awt.Color(102, 102, 102));

        fieldTamPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        fieldTamPrincipal.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        fieldTamPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        fieldTamPrincipal.setText("Tamaño Memoria Principal [KB]");
        fieldTamPrincipal.setBorder(null);
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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/HDD.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/RAM.png"))); // NOI18N

        separador2.setBackground(new java.awt.Color(102, 102, 102));
        separador2.setForeground(new java.awt.Color(102, 102, 102));

        fieldTamSecundaria.setBackground(new java.awt.Color(51, 51, 51));
        fieldTamSecundaria.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        fieldTamSecundaria.setForeground(new java.awt.Color(255, 255, 255));
        fieldTamSecundaria.setText("Tamaño Memoria Secundaria [KB]");
        fieldTamSecundaria.setBorder(null);
        fieldTamSecundaria.setSelectionColor(new java.awt.Color(102, 102, 102));
        fieldTamSecundaria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldTamSecundariaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldTamSecundariaFocusLost(evt);
            }
        });
        fieldTamSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTamSecundariaActionPerformed(evt);
            }
        });
        fieldTamSecundaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTamSecundariaKeyTyped(evt);
            }
        });

        separador3.setBackground(new java.awt.Color(102, 102, 102));
        separador3.setForeground(new java.awt.Color(102, 102, 102));

        fieldTamPaginas.setBackground(new java.awt.Color(51, 51, 51));
        fieldTamPaginas.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        fieldTamPaginas.setForeground(new java.awt.Color(255, 255, 255));
        fieldTamPaginas.setText("Tamaño Páginas [KB]");
        fieldTamPaginas.setBorder(null);
        fieldTamPaginas.setSelectionColor(new java.awt.Color(102, 102, 102));
        fieldTamPaginas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldTamPaginasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldTamPaginasFocusLost(evt);
            }
        });
        fieldTamPaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTamPaginasActionPerformed(evt);
            }
        });
        fieldTamPaginas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTamPaginasKeyTyped(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/PAGE.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonInstalarSO, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(botonInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonMinimizar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 14, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(10, 10, 10)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(7, 7, 7)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fieldTamPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(separador1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldTamPaginas, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(separador3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(separador2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldTamSecundaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCerrar)))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonInfo)
                    .addComponent(botonMinimizar)
                    .addComponent(botonCerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldTamPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fieldTamSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldTamPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonInstalarSO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void botonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseClicked
        this.controlador.closeFrame(this);
    }//GEN-LAST:event_botonCerrarMouseClicked

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
        this.controlador.minimizeFrame(this);
    }//GEN-LAST:event_botonMinimizarMouseClicked

    private void botonInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInfoMouseClicked
        this.controlador.mostrarInfo(this);
    }//GEN-LAST:event_botonInfoMouseClicked

    private void botonInstalarSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInstalarSOActionPerformed
        controlador.instalarSO(this);
    }//GEN-LAST:event_botonInstalarSOActionPerformed

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

    private void fieldTamPrincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTamPrincipalKeyTyped
        char tecla = evt.getKeyChar();
        if(tecla == KeyEvent.VK_ENTER){
            botonInstalarSO.doClick();
        }
        controlador.validarSoloNumeros(evt, this);
    }//GEN-LAST:event_fieldTamPrincipalKeyTyped

    private void fieldTamPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTamPrincipalActionPerformed
    }//GEN-LAST:event_fieldTamPrincipalActionPerformed

    private void fieldTamSecundariaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamSecundariaFocusGained
        System.out.println("asd");
        if(fieldTamSecundaria.getText().equals("Tamaño Memoria Secundaria [KB]") == true){
            fieldTamSecundaria.setText("");
        }
    }//GEN-LAST:event_fieldTamSecundariaFocusGained

    private void fieldTamSecundariaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamSecundariaFocusLost
        if(fieldTamSecundaria.getText().trim().equals("") == true){
            fieldTamSecundaria.setText("Tamaño Memoria Secundaria [KB]");
        }
    }//GEN-LAST:event_fieldTamSecundariaFocusLost

    private void fieldTamSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTamSecundariaActionPerformed
    }//GEN-LAST:event_fieldTamSecundariaActionPerformed

    private void fieldTamSecundariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTamSecundariaKeyTyped
        char tecla = evt.getKeyChar();
        if(tecla == KeyEvent.VK_ENTER){
            botonInstalarSO.doClick();
        }
        controlador.validarSoloNumeros(evt, this);
    }//GEN-LAST:event_fieldTamSecundariaKeyTyped

    private void fieldTamPaginasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamPaginasFocusGained
        if(fieldTamPaginas.getText().equals("Tamaño Páginas [KB]") == true){
            fieldTamPaginas.setText("");
        }
    }//GEN-LAST:event_fieldTamPaginasFocusGained

    private void fieldTamPaginasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamPaginasFocusLost
        if(fieldTamPaginas.getText().trim().equals("") == true){
            fieldTamPaginas.setText("Tamaño Páginas [KB]");
        }
    }//GEN-LAST:event_fieldTamPaginasFocusLost

    private void fieldTamPaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTamPaginasActionPerformed
    }//GEN-LAST:event_fieldTamPaginasActionPerformed

    private void fieldTamPaginasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTamPaginasKeyTyped
        char tecla = evt.getKeyChar();
        if(tecla == KeyEvent.VK_ENTER){
            botonInstalarSO.doClick();
        }
        controlador.validarSoloNumeros(evt, this);
    }//GEN-LAST:event_fieldTamPaginasKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonCerrar;
    private javax.swing.JLabel botonInfo;
    private javax.swing.JButton botonInstalarSO;
    private javax.swing.JLabel botonMinimizar;
    public javax.swing.JTextField fieldTamPaginas;
    public javax.swing.JTextField fieldTamPrincipal;
    public javax.swing.JTextField fieldTamSecundaria;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    // End of variables declaration//GEN-END:variables
}
