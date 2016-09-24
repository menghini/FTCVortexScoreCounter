/*
 * FIRST Tech Challenge Vortex Counter
 * Created by Alexander Fera
 * Fera Group
 * Novi, MI 48377{licensePrefix}
 */
package ftc.goal.counter;

/**
 *
 * @author afera
 */
public class AudDisplay extends javax.swing.JFrame {

    /**
     * Creates new form AudDisplay
     */
    public AudDisplay() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RedCorDisplay = new javax.swing.JPanel();
        RedCorAutoDisplay = new javax.swing.JLabel();
        RedCorTeleDisplay = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RedCenDisplay = new javax.swing.JPanel();
        RedCenAutoDisplay = new javax.swing.JLabel();
        RedCenTeleDisplay = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BlueCenDisplay = new javax.swing.JPanel();
        BlueCenAutoDisplay = new javax.swing.JLabel();
        BlueCenTeleDisplay = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BlueCorDisplay = new javax.swing.JPanel();
        BlueCorAutoDisplay = new javax.swing.JLabel();
        BlueCorTeleDisplay = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        RedCorDisplay.setBackground(new java.awt.Color(237, 28, 36));
        RedCorDisplay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        RedCorAutoDisplay.setFont(new java.awt.Font("Arial", 0, 100)); // NOI18N
        RedCorAutoDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedCorAutoDisplay.setText("0");

        RedCorTeleDisplay.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        RedCorTeleDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedCorTeleDisplay.setText("0");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 100)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("/");

        javax.swing.GroupLayout RedCorDisplayLayout = new javax.swing.GroupLayout(RedCorDisplay);
        RedCorDisplay.setLayout(RedCorDisplayLayout);
        RedCorDisplayLayout.setHorizontalGroup(
            RedCorDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedCorDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RedCorAutoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RedCorTeleDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        RedCorDisplayLayout.setVerticalGroup(
            RedCorDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedCorDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(RedCorAutoDisplay)
                .addComponent(RedCorTeleDisplay)
                .addComponent(jLabel4))
        );

        RedCenDisplay.setBackground(new java.awt.Color(237, 28, 36));
        RedCenDisplay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        RedCenAutoDisplay.setFont(new java.awt.Font("Arial", 0, 100)); // NOI18N
        RedCenAutoDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedCenAutoDisplay.setText("0");

        RedCenTeleDisplay.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        RedCenTeleDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedCenTeleDisplay.setText("0");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 100)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("/");

        javax.swing.GroupLayout RedCenDisplayLayout = new javax.swing.GroupLayout(RedCenDisplay);
        RedCenDisplay.setLayout(RedCenDisplayLayout);
        RedCenDisplayLayout.setHorizontalGroup(
            RedCenDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedCenDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RedCenAutoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RedCenTeleDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        RedCenDisplayLayout.setVerticalGroup(
            RedCenDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedCenDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(RedCenAutoDisplay)
                .addComponent(RedCenTeleDisplay)
                .addComponent(jLabel9))
        );

        BlueCenDisplay.setBackground(new java.awt.Color(0, 101, 179));
        BlueCenDisplay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        BlueCenAutoDisplay.setFont(new java.awt.Font("Arial", 0, 100)); // NOI18N
        BlueCenAutoDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueCenAutoDisplay.setText("0");

        BlueCenTeleDisplay.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        BlueCenTeleDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueCenTeleDisplay.setText("0");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 100)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("/");

        javax.swing.GroupLayout BlueCenDisplayLayout = new javax.swing.GroupLayout(BlueCenDisplay);
        BlueCenDisplay.setLayout(BlueCenDisplayLayout);
        BlueCenDisplayLayout.setHorizontalGroup(
            BlueCenDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueCenDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BlueCenAutoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BlueCenTeleDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        BlueCenDisplayLayout.setVerticalGroup(
            BlueCenDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueCenDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(BlueCenAutoDisplay)
                .addComponent(BlueCenTeleDisplay)
                .addComponent(jLabel12))
        );

        BlueCorDisplay.setBackground(new java.awt.Color(0, 101, 179));
        BlueCorDisplay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        BlueCorAutoDisplay.setFont(new java.awt.Font("Arial", 0, 100)); // NOI18N
        BlueCorAutoDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueCorAutoDisplay.setText("0");

        BlueCorTeleDisplay.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        BlueCorTeleDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueCorTeleDisplay.setText("0");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 100)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("/");

        javax.swing.GroupLayout BlueCorDisplayLayout = new javax.swing.GroupLayout(BlueCorDisplay);
        BlueCorDisplay.setLayout(BlueCorDisplayLayout);
        BlueCorDisplayLayout.setHorizontalGroup(
            BlueCorDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueCorDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BlueCorAutoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BlueCorTeleDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        BlueCorDisplayLayout.setVerticalGroup(
            BlueCorDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueCorDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(BlueCorAutoDisplay)
                .addComponent(BlueCorTeleDisplay)
                .addComponent(jLabel13))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CORNER");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 100)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CENTER");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/VVSmall.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/FIRSTTech_IconVert_RGB.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 75)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Vortex Status");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(322, 322, 322))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RedCenDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RedCorDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BlueCenDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BlueCorDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BlueCenDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BlueCorDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RedCenDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RedCorDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AudDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AudDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AudDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AudDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AudDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel BlueCenAutoDisplay;
    public static javax.swing.JPanel BlueCenDisplay;
    public static javax.swing.JLabel BlueCenTeleDisplay;
    public static javax.swing.JLabel BlueCorAutoDisplay;
    public static javax.swing.JPanel BlueCorDisplay;
    public static javax.swing.JLabel BlueCorTeleDisplay;
    public static javax.swing.JLabel RedCenAutoDisplay;
    public static javax.swing.JPanel RedCenDisplay;
    public static javax.swing.JLabel RedCenTeleDisplay;
    public static javax.swing.JLabel RedCorAutoDisplay;
    public static javax.swing.JPanel RedCorDisplay;
    public static javax.swing.JLabel RedCorTeleDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
