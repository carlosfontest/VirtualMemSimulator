package view;

import controller.Controller;

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
        this.controlador = controlador;
        this.tamPrincipal = tamPrincipal;
        this.tamSecundaria = tamSecundaria;
        this.tamPaginas = tamPaginas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        botonInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 2147483647));
        setMinimumSize(new java.awt.Dimension(1200, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ControlPanel.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/EquisBlanca.png"))); // NOI18N
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 14, -1, -1));

        botonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MinimizarBlanca.png"))); // NOI18N
        botonMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(botonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 14, -1, -1));

        botonInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/info.png"))); // NOI18N
        botonInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInfoMouseClicked(evt);
            }
        });
        jPanel1.add(botonInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 377, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void botonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseClicked
        this.controlador.closeFrame(this);
    }//GEN-LAST:event_botonCerrarMouseClicked

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
        this.controlador.minimizeFrame(this);
    }//GEN-LAST:event_botonMinimizarMouseClicked

    private void botonInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInfoMouseClicked
        this.controlador.mostrarInfo(this);
    }//GEN-LAST:event_botonInfoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonCerrar;
    private javax.swing.JLabel botonInfo;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
