/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Lance
 */
public class ThirdBestOutcome extends javax.swing.JFrame {

    /**
     * Creates new form BadOutcome1
     */
    public ThirdBestOutcome() {
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

        colorPanel = new java.awt.Panel();
        outcomeImage = new javax.swing.JTextArea();
        outcomeText = new javax.swing.JTextArea();
        highScores = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        readMe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SURVIVING 2020");

        colorPanel.setBackground(new java.awt.Color(0, 0, 0));
        colorPanel.setPreferredSize(new java.awt.Dimension(700, 400));

        outcomeImage.setEditable(false);
        outcomeImage.setBackground(new java.awt.Color(0, 0, 0));
        outcomeImage.setColumns(20);
        outcomeImage.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        outcomeImage.setForeground(new java.awt.Color(204, 0, 51));
        outcomeImage.setRows(5);
        outcomeImage.setText(" \n████████▀▀▀████\n████████────▀██\n████████──█▄──█\n███▀▀▀██──█████\n█▀──▄▄██──█████\n█──█████──█████\n█▄──▀▀▀──▄█████\n███▄▄▄▄▄███████\n╔══╦╦╦╗╔══╦═╦╦╗\n╚╗╔╣║═╣╚╗╔╣║║═╣\n═╚╝╚╩╩╝═╚╝╚═╩╩╝\n▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\n\n\n\n");
        outcomeImage.setBorder(null);

        outcomeText.setEditable(false);
        outcomeText.setBackground(new java.awt.Color(0, 0, 0));
        outcomeText.setColumns(20);
        outcomeText.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        outcomeText.setForeground(new java.awt.Color(204, 0, 51));
        outcomeText.setRows(5);
        outcomeText.setText("Your Tik Tok is blowing up, you’ve been added to the creator fund! :)");
        outcomeText.setBorder(null);

        highScores.setBackground(new java.awt.Color(0, 0, 0));
        highScores.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        highScores.setForeground(new java.awt.Color(204, 0, 51));
        highScores.setLabel("High Scores");
        highScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highScoresActionPerformed(evt);
            }
        });

        quit.setBackground(new java.awt.Color(0, 0, 0));
        quit.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        quit.setForeground(new java.awt.Color(204, 0, 51));
        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(colorPanelLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(highScores, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(colorPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(outcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(colorPanelLayout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(outcomeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outcomeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(highScores, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        File.setText("File");

        readMe.setText("Read Me");
        File.add(readMe);

        jMenuBar1.add(File);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void highScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highScoresActionPerformed
         new TitleScreen().setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_highScoresActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        new HighScoreScreen().setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_quitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void showThirdBestOutcome() {
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
            java.util.logging.Logger.getLogger(ThirdBestOutcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThirdBestOutcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThirdBestOutcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThirdBestOutcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThirdBestOutcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu File;
    private java.awt.Panel colorPanel;
    private javax.swing.JButton highScores;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextArea outcomeImage;
    private javax.swing.JTextArea outcomeText;
    private javax.swing.JButton quit;
    private javax.swing.JMenuItem readMe;
    // End of variables declaration//GEN-END:variables
}
