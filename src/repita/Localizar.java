/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repita;

import com.sun.awt.AWTUtilities;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Hugo Carvalho
 */
public class Localizar extends javax.swing.JFrame {

    /**
     * Creates new form Localizar
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    private Localizar() {
        initComponents();
        try {
            undecored(this);
        } catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(Localizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jButtonLocalizar = new javax.swing.JButton();
        jTextFieldLocalizar = new javax.swing.JTextField();
        jLabelLocalizar = new javax.swing.JLabel();
        jLabelSubstituir = new javax.swing.JLabel();
        jTextFieldSubstituir = new javax.swing.JTextField();
        jButtonSubstituir = new javax.swing.JButton();
        jButtonSubstituirTodos = new javax.swing.JButton();
        jButtonLocalizarProxima = new javax.swing.JButton();
        jCheckBoxDifMaiuscMinusc = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        jButtonLocalizar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLocalizar.setText("Localizar");
        jButtonLocalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonLocalizarMouseEntered(evt);
            }
        });

        jTextFieldLocalizar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextFieldLocalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextFieldLocalizarMouseEntered(evt);
            }
        });
        jTextFieldLocalizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLocalizarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldLocalizarKeyReleased(evt);
            }
        });

        jLabelLocalizar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLocalizar.setText("Localizar:");
        jLabelLocalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLocalizarMouseEntered(evt);
            }
        });

        jLabelSubstituir.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSubstituir.setText("Substituir por:");
        jLabelSubstituir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSubstituirMouseEntered(evt);
            }
        });

        jTextFieldSubstituir.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextFieldSubstituir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextFieldSubstituirMouseEntered(evt);
            }
        });
        jTextFieldSubstituir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSubstituirKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSubstituirKeyReleased(evt);
            }
        });

        jButtonSubstituir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSubstituir.setText("Substituir");
        jButtonSubstituir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSubstituirMouseEntered(evt);
            }
        });

        jButtonSubstituirTodos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSubstituirTodos.setText("Substituir todos");
        jButtonSubstituirTodos.setToolTipText("");
        jButtonSubstituirTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSubstituirTodosMouseEntered(evt);
            }
        });

        jButtonLocalizarProxima.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLocalizarProxima.setText("Localizar proxima");
        jButtonLocalizarProxima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonLocalizarProximaMouseEntered(evt);
            }
        });

        jCheckBoxDifMaiuscMinusc.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxDifMaiuscMinusc.setSelected(true);
        jCheckBoxDifMaiuscMinusc.setText("Diferenciar maiúsculas/minúsculas");
        jCheckBoxDifMaiuscMinusc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxDifMaiuscMinuscMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCheckBoxDifMaiuscMinuscMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSubstituirTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelSubstituir)
                                .addComponent(jLabelLocalizar))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldSubstituir)
                                .addComponent(jTextFieldLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonLocalizarProxima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addComponent(jCheckBoxDifMaiuscMinusc)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSubstituir, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLocalizar))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSubstituir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSubstituir)
                    .addComponent(jButtonLocalizarProxima, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jCheckBoxDifMaiuscMinusc))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSubstituirTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSubstituir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLocalizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLocalizarKeyPressed
        localizarStr = jTextFieldLocalizar.getText();
    }//GEN-LAST:event_jTextFieldLocalizarKeyPressed

    private void jTextFieldLocalizarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLocalizarKeyReleased
        localizarStr = jTextFieldLocalizar.getText();
    }//GEN-LAST:event_jTextFieldLocalizarKeyReleased

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        AWTUtilities.setWindowOpacity(this, 0.5f);
    }//GEN-LAST:event_formMouseExited

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        AWTUtilities.setWindowOpacity(this, 1.0f);
    }//GEN-LAST:event_formMouseEntered

    private void jTextFieldLocalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldLocalizarMouseEntered
       AWTUtilities.setWindowOpacity(this, 1.0f);
    }//GEN-LAST:event_jTextFieldLocalizarMouseEntered

    private void jTextFieldSubstituirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSubstituirMouseEntered
        AWTUtilities.setWindowOpacity(this, 1.0f);
    }//GEN-LAST:event_jTextFieldSubstituirMouseEntered

    private void jLabelLocalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLocalizarMouseEntered
        AWTUtilities.setWindowOpacity(this, 1.0f);
    }//GEN-LAST:event_jLabelLocalizarMouseEntered

    private void jLabelSubstituirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSubstituirMouseEntered
       AWTUtilities.setWindowOpacity(this, 1.0f);
    }//GEN-LAST:event_jLabelSubstituirMouseEntered

    private void jButtonLocalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLocalizarMouseEntered
        AWTUtilities.setWindowOpacity(this, 1.0f);
    }//GEN-LAST:event_jButtonLocalizarMouseEntered

    private void jButtonSubstituirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSubstituirMouseEntered
        AWTUtilities.setWindowOpacity(this, 1.0f);
    }//GEN-LAST:event_jButtonSubstituirMouseEntered

    private void jButtonSubstituirTodosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSubstituirTodosMouseEntered
        AWTUtilities.setWindowOpacity(this, 1.0f);
    }//GEN-LAST:event_jButtonSubstituirTodosMouseEntered

    private void jButtonLocalizarProximaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLocalizarProximaMouseEntered
        AWTUtilities.setWindowOpacity(this, 1.0f);
    }//GEN-LAST:event_jButtonLocalizarProximaMouseEntered

    private void jCheckBoxDifMaiuscMinuscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxDifMaiuscMinuscMouseEntered
        AWTUtilities.setWindowOpacity(this, 1.0f);
    }//GEN-LAST:event_jCheckBoxDifMaiuscMinuscMouseEntered

    private void jTextFieldSubstituirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSubstituirKeyPressed
        substituirStr = jTextFieldSubstituir.getText();
    }//GEN-LAST:event_jTextFieldSubstituirKeyPressed

    private void jTextFieldSubstituirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSubstituirKeyReleased
        substituirStr = jTextFieldSubstituir.getText();
    }//GEN-LAST:event_jTextFieldSubstituirKeyReleased

    private void jCheckBoxDifMaiuscMinuscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxDifMaiuscMinuscMouseClicked
        difMaiuscMinusc = jCheckBoxDifMaiuscMinusc.isSelected();
    }//GEN-LAST:event_jCheckBoxDifMaiuscMinuscMouseClicked

    private void undecored(JFrame jFrame) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
        Field undecoratedField = Frame.class.getDeclaredField("undecorated");
        undecoratedField.setAccessible(true);
        undecoratedField.set(jFrame, true);
    }
    
    public void addActionListenerjButtonLocalizar(ActionListener listener) {
        jButtonLocalizar.addActionListener(listener);
    }
    
    public void addActionListenerjButtonLocalizarProxima(ActionListener listener) {
        jButtonLocalizarProxima.addActionListener(listener);
    }
    
    public void addActionListenerjButtonSubstituir(ActionListener listener) {
        jButtonSubstituir.addActionListener(listener);
    }
    
    public void addActionListenerjButtonSubstituirTodos(ActionListener listener) {
        jButtonSubstituirTodos.addActionListener(listener);
    }

    public String getLocalizarStr() {
        return localizarStr;
    }

    public String getSubstituirStr() {
        return substituirStr;
    }

    public boolean isDifMaiuscMinusc() {
        return difMaiuscMinusc;
    }
    
    public static synchronized Localizar getInstancia() {
        if(instancia == null){
            instancia = new Localizar();
        } else {
            instancia.requestFocus();
        }
        return instancia;
    }
    
    
    private static Localizar instancia;
    private String localizarStr;
    private String substituirStr;
    private boolean difMaiuscMinusc;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLocalizar;
    private javax.swing.JButton jButtonLocalizarProxima;
    private javax.swing.JButton jButtonSubstituir;
    private javax.swing.JButton jButtonSubstituirTodos;
    private javax.swing.JCheckBox jCheckBoxDifMaiuscMinusc;
    private javax.swing.JLabel jLabelLocalizar;
    private javax.swing.JLabel jLabelSubstituir;
    private javax.swing.JPanel jPanel;
    private javax.swing.JTextField jTextFieldLocalizar;
    private javax.swing.JTextField jTextFieldSubstituir;
    // End of variables declaration//GEN-END:variables
}
