/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repita;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.TransferHandler;
import javax.swing.event.UndoableEditEvent;
import javax.swing.plaf.basic.BasicMenuBarUI;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import telas.ButtonTabComponent;

/**
 *
 * @author Hugo Carvalho
 */
public class Repita extends javax.swing.JFrame {

    /**
     * Creates new form Repita
     */
    public Repita() {
        initComponents();
        customizeMenuBar(jMenuBar);
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
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelTelaInicial = new javax.swing.JPanel();
        jPanelImage = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemNovoProjeto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemAbrirProjeto = new javax.swing.JMenuItem();
        jMenuItemFecharProjeto = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalvar = new javax.swing.JMenuItem();
        jMenuItemSalvarComo = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuItemDesfazer = new javax.swing.JMenuItem();
        jMenuItemRefazer = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItemRecortar = new javax.swing.JMenuItem();
        jMenuItemCopiar = new javax.swing.JMenuItem();
        jMenuItemColar = new javax.swing.JMenuItem();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItemLocalizar = new javax.swing.JMenuItem();
        jMenuItemSubstituir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Repita RPA");
        setBackground(new java.awt.Color(40, 41, 35));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        jTabbedPane.setBackground(new java.awt.Color(40, 41, 35));

        jPanelTelaInicial.setBackground(new java.awt.Color(40, 41, 35));
        jPanelTelaInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanelImage.setBackground(new java.awt.Color(40, 41, 35));

        jLabelTitle.setBackground(new java.awt.Color(40, 41, 35));
        jLabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/repita/logo-mini.png"))); // NOI18N

        jLabelLogo.setBackground(new java.awt.Color(40, 41, 35));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/repita/title.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanelImageLayout = new javax.swing.GroupLayout(jPanelImage);
        jPanelImage.setLayout(jPanelImageLayout);
        jPanelImageLayout.setHorizontalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImageLayout.createSequentialGroup()
                .addGroup(jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelImageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitle)))
                .addGap(0, 0, 0))
        );
        jPanelImageLayout.setVerticalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImageLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelTelaInicialLayout = new javax.swing.GroupLayout(jPanelTelaInicial);
        jPanelTelaInicial.setLayout(jPanelTelaInicialLayout);
        jPanelTelaInicialLayout.setHorizontalGroup(
            jPanelTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaInicialLayout.createSequentialGroup()
                .addContainerGap(500, Short.MAX_VALUE)
                .addComponent(jPanelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(500, 500, 500))
        );
        jPanelTelaInicialLayout.setVerticalGroup(
            jPanelTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaInicialLayout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jPanelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(111, 111, 111))
        );

        jTabbedPane.addTab("Início", null, jPanelTelaInicial, "");

        jMenuBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenuBar.setFocusCycleRoot(true);
        jMenuBar.setFocusTraversalPolicyProvider(true);
        jMenuBar.setPreferredSize(new java.awt.Dimension(108, 30));

        jMenuArquivo.setText("Arquivo");
        jMenuArquivo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuItemNovoProjeto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNovoProjeto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItemNovoProjeto.setText("Novo Projeto");
        jMenuItemNovoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoProjetoActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemNovoProjeto);

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jMenuArquivo.add(jSeparator1);

        jMenuItemAbrirProjeto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAbrirProjeto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItemAbrirProjeto.setText("Abrir Projeto");
        jMenuArquivo.add(jMenuItemAbrirProjeto);

        jMenuItemFecharProjeto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFecharProjeto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItemFecharProjeto.setText("Fechar Projeto");
        jMenuItemFecharProjeto.setToolTipText("");
        jMenuItemFecharProjeto.setActionCommand("Fechar projeto");
        jMenuItemFecharProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFecharProjetoActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemFecharProjeto);

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jMenuArquivo.add(jSeparator2);

        jMenuItemSalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalvar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItemSalvar.setText("Salvar");
        jMenuArquivo.add(jMenuItemSalvar);

        jMenuItemSalvarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalvarComo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItemSalvarComo.setText("Slavar como...");
        jMenuArquivo.add(jMenuItemSalvarComo);

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jMenuArquivo.add(jSeparator3);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSair);

        jMenuBar.add(jMenuArquivo);

        jMenuEditar.setText("Editar");
        jMenuEditar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuItemDesfazer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemDesfazer.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItemDesfazer.setText("Desfazer");
        jMenuItemDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDesfazerActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemDesfazer);

        jMenuItemRefazer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemRefazer.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItemRefazer.setText("Refazer");
        jMenuItemRefazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRefazerActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemRefazer);

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jMenuEditar.add(jSeparator4);

        jMenuItemRecortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemRecortar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItemRecortar.setText("Recortar");
        jMenuItemRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRecortarActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemRecortar);

        jMenuItemCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCopiar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItemCopiar.setText("Copiar");
        jMenuItemCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCopiarActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemCopiar);

        jMenuItemColar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemColar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItemColar.setText("Colar");
        jMenuItemColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemColarActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemColar);

        jMenuItemExcluir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItemExcluir.setText("Excluir");
        jMenuItemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemExcluir);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem1.setText("Selecionar Tudo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItem1);

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jMenuEditar.add(jSeparator5);

        jMenuItemLocalizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemLocalizar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItemLocalizar.setText("Localizar");
        jMenuItemLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLocalizarActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemLocalizar);

        jMenuItemSubstituir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSubstituir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItemSubstituir.setText("Substituir");
        jMenuEditar.add(jMenuItemSubstituir);

        jMenuBar.add(jMenuEditar);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane))
        );

        jTabbedPane.getAccessibleContext().setAccessibleName("Início");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoProjetoActionPerformed
        editor = new Editor();
        undoManager = new UndoManager();
        editor.getjTextAreaScript().getDocument().addUndoableEditListener((UndoableEditEvent e) -> {
            undoManager.addEdit(e.getEdit());
        });
        String tituloProjeto;
        try {
            do {
                tituloProjeto = JOptionPane.showInputDialog("Nome do projeto: ");
                if (tituloProjeto.equals("")) {
                    JOptionPane.showMessageDialog(this, "O projeto precisa de um nome!");
                } else {
                    jTabbedPane.addTab(tituloProjeto, null, editor, "ToolTip Text");

                    jTabbedPane.setSelectedComponent(editor);
                    int i = jTabbedPane.getSelectedIndex();
                    jTabbedPane.setTabComponentAt(i, new ButtonTabComponent(jTabbedPane));
                }
            } while (tituloProjeto.equals(""));
        } catch (NullPointerException e) {
            System.out.println("Novo projeto cancelado");
        }
    }//GEN-LAST:event_jMenuItemNovoProjetoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemColarActionPerformed
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Editor editorSelected = (Editor) jTabbedPane.getSelectedComponent();
        TransferHandler transferHandler = editorSelected.getjTextAreaScript().getTransferHandler();
        transferHandler.importData(editorSelected.getjTextAreaScript(), clipboard.getContents(null));
    }//GEN-LAST:event_jMenuItemColarActionPerformed

    private void jMenuItemFecharProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFecharProjetoActionPerformed
        int i = jTabbedPane.getSelectedIndex();
        if (i > 0) {
            Object[] options = {"Confirmar", "Cancelar"};
            int opcao = JOptionPane.showOptionDialog(null, "Tem certeza que deseja fechar este porjeto? As ultimas alterações não serão salvas!",
                    "Encerrar projeto", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            if (opcao == 0) {
                jTabbedPane.remove(i);
            }
        }
    }//GEN-LAST:event_jMenuItemFecharProjetoActionPerformed

    private void jMenuItemCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCopiarActionPerformed
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Editor editorSelected = (Editor) jTabbedPane.getSelectedComponent();
        TransferHandler transferHandler = editorSelected.getjTextAreaScript().getTransferHandler();
        transferHandler.exportToClipboard(editorSelected.getjTextAreaScript(), clipboard, TransferHandler.COPY);
    }//GEN-LAST:event_jMenuItemCopiarActionPerformed

    private void jMenuItemRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRecortarActionPerformed
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Editor editorSelected = (Editor) jTabbedPane.getSelectedComponent();
        TransferHandler transferHandler = editorSelected.getjTextAreaScript().getTransferHandler();
        transferHandler.exportToClipboard(editorSelected.getjTextAreaScript(), clipboard, TransferHandler.COPY);
        editorSelected.getjTextAreaScript().replaceSelection("");
    }//GEN-LAST:event_jMenuItemRecortarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Editor editorSelected = (Editor) jTabbedPane.getSelectedComponent();
        editorSelected.getjTextAreaScript().selectAll();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDesfazerActionPerformed
        try {
            undoManager.undo();
        } catch (CannotUndoException cre) {
            System.out.println("undo manager limit");
        }
    }//GEN-LAST:event_jMenuItemDesfazerActionPerformed

    private void jMenuItemRefazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRefazerActionPerformed
        try {
            undoManager.redo();
        } catch (CannotRedoException cre) {
            System.out.println("redo manager limit");
        }
    }//GEN-LAST:event_jMenuItemRefazerActionPerformed

    private void jMenuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirActionPerformed
        Editor editorSelected = (Editor) jTabbedPane.getSelectedComponent();
        editorSelected.getjTextAreaScript().replaceSelection("");
    }//GEN-LAST:event_jMenuItemExcluirActionPerformed

    private void jMenuItemLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLocalizarActionPerformed
        localizar = localizar.getInstancia();
        localizar.addActionListener((ActionEvent evt1) -> {
            Editor editorSelected = (Editor) jTabbedPane.getSelectedComponent();
            String searchstr = localizar.getLocalizarStr();
            if (searchstr == null) {
                return;
            }

            String aktStr = editorSelected.getjTextAreaScript().getText();
            int Index = aktStr.indexOf(searchstr);

            if (Index == -1) {
                JOptionPane.showMessageDialog(null, "String not found", "Dialog", JOptionPane.INFORMATION_MESSAGE);
            } else {
                editorSelected.getjTextAreaScript().select(Index, Index + searchstr.length());
            }
        });
        localizar.setVisible(true);
    }//GEN-LAST:event_jMenuItemLocalizarActionPerformed

    private void customizeMenuBar(JMenuBar menuBar) {

        menuBar.setUI(new BasicMenuBarUI() {

            @Override
            public void paint(Graphics g, JComponent c) {
                g.setColor(Color.white);
                g.fillRect(0, 0, c.getWidth(), c.getHeight());
            }

        });

        MenuElement[] menus = menuBar.getSubElements();

        for (MenuElement menuElement : menus) {

            JMenu menu = (JMenu) menuElement.getComponent();
            changeComponentColors(menu);
            menu.setOpaque(true);

            MenuElement[] menuElements = menu.getSubElements();

            for (MenuElement popupMenuElement : menuElements) {

                JPopupMenu popupMenu = (JPopupMenu) popupMenuElement.getComponent();
                popupMenu.setBorder(null);

                MenuElement[] menuItens = popupMenuElement.getSubElements();

                for (MenuElement menuItemElement : menuItens) {

                    JMenuItem menuItem = (JMenuItem) menuItemElement.getComponent();
                    changeComponentColors(menuItem);
                    menuItem.setOpaque(true);

                }
            }
        }
    }

    private void changeComponentColors(Component comp) {
        comp.setBackground(Color.white);
        comp.setForeground(Color.black);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Splash splash = new Splash();

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
            java.util.logging.Logger.getLogger(Repita.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Repita.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Repita.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Repita.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            splash.setVisible(true);
        });
        Repita repita = new Repita();
        splash.dispose();
        repita.setVisible(true);
    }

    // Variables declaration
    private Editor editor;
    private Localizar localizar;
    private UndoManager undoManager;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAbrirProjeto;
    private javax.swing.JMenuItem jMenuItemColar;
    private javax.swing.JMenuItem jMenuItemCopiar;
    private javax.swing.JMenuItem jMenuItemDesfazer;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JMenuItem jMenuItemFecharProjeto;
    private javax.swing.JMenuItem jMenuItemLocalizar;
    private javax.swing.JMenuItem jMenuItemNovoProjeto;
    private javax.swing.JMenuItem jMenuItemRecortar;
    private javax.swing.JMenuItem jMenuItemRefazer;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSalvar;
    private javax.swing.JMenuItem jMenuItemSalvarComo;
    private javax.swing.JMenuItem jMenuItemSubstituir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelImage;
    private javax.swing.JPanel jPanelTelaInicial;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane;
    // End of variables declaration//GEN-END:variables
}
