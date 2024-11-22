package Contralador;
 import Vista.*;
/** @author welvi*/
public class SistemaPublicacionesMDI extends javax.swing.JFrame {

    private final JInternalFrameAutores Autores;
    private JInternalFrameRevista Revista;
  

    public SistemaPublicacionesMDI() {
        initComponents();
        setTitle("Publicaciones2");
        Autores= new JInternalFrameAutores();
        desktopPane.add (Autores);
        
       Revista =new JInternalFrameRevista();  
        desktopPane.add (Revista);

      
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        Autor = new javax.swing.JMenu();
        verAutorMenuItem = new javax.swing.JMenuItem();
        Autor1 = new javax.swing.JMenu();
        verRevistaMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        Autor.setMnemonic('e');
        Autor.setText("Autor");

        verAutorMenuItem.setMnemonic('t');
        verAutorMenuItem.setText("Ver Autores");
        verAutorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAutorMenuItemActionPerformed(evt);
            }
        });
        Autor.add(verAutorMenuItem);

        menuBar.add(Autor);

        Autor1.setMnemonic('e');
        Autor1.setText("Revista");

        verRevistaMenuItem1.setMnemonic('t');
        verRevistaMenuItem1.setText("Ver Revista");
        verRevistaMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verRevistaMenuItem1ActionPerformed(evt);
            }
        });
        Autor1.add(verRevistaMenuItem1);

        menuBar.add(Autor1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void verAutorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAutorMenuItemActionPerformed
Autores.obtenerDatos();
Autores.setVisible(true);
    }//GEN-LAST:event_verAutorMenuItemActionPerformed

    private void verRevistaMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verRevistaMenuItem1ActionPerformed
        // TODO add your handling code here:
        Revista.obtenerDatos();
        Revista.setVisible(true);
    }//GEN-LAST:event_verRevistaMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaPublicacionesMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaPublicacionesMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaPublicacionesMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaPublicacionesMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaPublicacionesMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Autor;
    private javax.swing.JMenu Autor1;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem verAutorMenuItem;
    private javax.swing.JMenuItem verRevistaMenuItem1;
    // End of variables declaration//GEN-END:variables

}
