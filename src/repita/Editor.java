/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repita;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import telas.TextLineNumber;

/**
 *
 * @author hugan
 */
public class Editor extends javax.swing.JPanel {

    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();

        TextLineNumber contadorLinhas = new TextLineNumber(jTextAreaScript);
        jScrollPane.setRowHeaderView(contadorLinhas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        jTextAreaScript = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(40, 41, 35));

        jScrollPane.setBackground(new java.awt.Color(40, 41, 35));

        jTextAreaScript.setBackground(new java.awt.Color(40, 41, 35));
        jTextAreaScript.setColumns(20);
        jTextAreaScript.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextAreaScript.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaScript.setRows(5);
        jScrollPane.setViewportView(jTextAreaScript);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JScrollPane getjScrollPane() {
        return jScrollPane;
    }

    public JTextArea getjTextAreaScript() {
        return jTextAreaScript;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextArea jTextAreaScript;
    // End of variables declaration//GEN-END:variables
}