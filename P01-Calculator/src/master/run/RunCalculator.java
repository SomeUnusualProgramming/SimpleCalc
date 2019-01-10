package master.run;

import java.awt.Color;
import javax.swing.JOptionPane;

public class RunCalculator extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

    public RunCalculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldArg1 = new javax.swing.JTextField();
        jTextFieldArg2 = new javax.swing.JTextField();
        jComboBoxOperacja = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextFieldWynik = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setForeground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Simple Calculator");

        jTextFieldArg1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldArg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldArg1ActionPerformed(evt);
            }
        });

        jTextFieldArg2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldArg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldArg2ActionPerformed(evt);
            }
        });

        jComboBoxOperacja.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jComboBoxOperacja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "/", "*" }));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 204, 0));
        jButton1.setText("Count");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldWynik.setEditable(false);
        jTextFieldWynik.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldWynik.setForeground(new java.awt.Color(0, 255, 204));
        jTextFieldWynik.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldArg1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxOperacja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldArg2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addComponent(jTextFieldWynik))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldArg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldArg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxOperacja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldWynik, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldArg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldArg1ActionPerformed
        akcja();
    }//GEN-LAST:event_jTextFieldArg1ActionPerformed

    private void jTextFieldArg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldArg2ActionPerformed
        akcja();
    }//GEN-LAST:event_jTextFieldArg2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        akcja();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RunCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RunCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RunCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RunCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RunCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxOperacja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldArg1;
    private javax.swing.JTextField jTextFieldArg2;
    private javax.swing.JTextField jTextFieldWynik;
    // End of variables declaration//GEN-END:variables

    private void akcja() {        
        try {
            double arg1 = wczytaj(jTextFieldArg1.getText());
            double arg2 = wczytaj(jTextFieldArg2.getText());
            
            String operacja = jComboBoxOperacja.getSelectedItem().toString();
            operacja = "" + jComboBoxOperacja.getSelectedItem();
            operacja = String.valueOf(jComboBoxOperacja.getSelectedItem());
            
            double wynik = LogicCalculator.oblicz(arg1, arg2, operacja);

            jTextFieldWynik.setText(Double.toString(wynik));
            
            jTextFieldWynik.setForeground(Color.BLUE);
        } catch (NumberFormatException numberFormatException) {
            jTextFieldWynik.setText("Error");
            jTextFieldWynik.setForeground(Color.RED);
            
            JOptionPane.showMessageDialog(this, "Wrong format", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private double wczytaj(String txt){
        if (txt == null || txt.isEmpty()){
            return 0.0;
        } else {
            txt = txt.replace(",", ".");
            return Double.parseDouble(txt);
        }
    }
}
