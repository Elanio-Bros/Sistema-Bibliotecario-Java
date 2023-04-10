package TelaDeEntrada;

import Login.Main;
import Sistema.Acesso;
import Sobre.Sobre;
import TelaDeEntrada.Estudantes.TabelaDeEstudantes;
import TelaDeEntrada.Estudantes.TelaDeCadastroAluno;
import Sistema.Acesso.AcessoArq;
import static TelaDeEntrada.TelaEntrada.main;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TelaEntrada extends javax.swing.JFrame {

    public TelaEntrada() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) TabelaDeLivros.getModel();
        TabelaDeLivros.setRowSorter(new TableRowSorter(modelo));
        setLocationRelativeTo(null);
        setIcon();
        Tempo.Tempo();
    }

    void Delete(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File toDelete : files) {
                Delete(toDelete);
            }
        }
        file.delete();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopUp = new javax.swing.JPopupMenu();
        Remover = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaDeLivros = new javax.swing.JTable();
        Pesquisa = new javax.swing.JTextField();
        Pesquisar = new javax.swing.JButton();
        Relogio = new javax.swing.JLabel();
        Data = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        LsEstudantes = new javax.swing.JMenuItem();
        AddEstudante = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        AdicionarLivros = new javax.swing.JMenuItem();
        Sobre = new javax.swing.JMenu();

        Remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/book_delete.png"))); // NOI18N
        Remover.setText("Remover Livro");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });
        PopUp.add(Remover);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        TabelaDeLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDeLivros.setToolTipText("Click no botão direito para acessar mais opçãoes");
        TabelaDeLivros.setColumnSelectionAllowed(true);
        TabelaDeLivros.getTableHeader().setReorderingAllowed(false);
        TabelaDeLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaDeLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaDeLivros);
        TabelaDeLivros.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (TabelaDeLivros.getColumnModel().getColumnCount() > 0) {
            TabelaDeLivros.getColumnModel().getColumn(0).setResizable(false);
            TabelaDeLivros.getColumnModel().getColumn(1).setResizable(false);
            TabelaDeLivros.getColumnModel().getColumn(1).setPreferredWidth(1000);
        }

        Pesquisa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Pesquisa.setText("Pesquisar...");
        Pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesquisaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PesquisaMouseExited(evt);
            }
        });
        Pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PesquisaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PesquisaKeyReleased(evt);
            }
        });

        Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/magnifier.png"))); // NOI18N
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        Relogio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        Data.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Relogio, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Relogio, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/user.png"))); // NOI18N
        jMenu1.setText("Conta");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/report_user.png"))); // NOI18N
        jMenuItem7.setText("Ver perfil");
        jMenu1.add(jMenuItem7);

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/door_out.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu1.add(Sair);

        jMenuBar1.add(jMenu1);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/group.png"))); // NOI18N
        jMenu4.setText("Estudates");

        LsEstudantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/table.png"))); // NOI18N
        LsEstudantes.setText("Lista Estudantes");
        LsEstudantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LsEstudantesActionPerformed(evt);
            }
        });
        jMenu4.add(LsEstudantes);

        AddEstudante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/user_add.png"))); // NOI18N
        AddEstudante.setText("Adicionar Estudante");
        AddEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEstudanteActionPerformed(evt);
            }
        });
        jMenu4.add(AddEstudante);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/book_addresses.png"))); // NOI18N
        jMenuItem2.setText("Pegar Livro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/book_open.png"))); // NOI18N
        jMenu3.setText("Livros");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/book_addresses.png"))); // NOI18N
        jMenuItem1.setText("Livros Pegos");
        jMenu3.add(jMenuItem1);

        AdicionarLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/book_add.png"))); // NOI18N
        AdicionarLivros.setText("Adicionar Livro");
        AdicionarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarLivrosActionPerformed(evt);
            }
        });
        jMenu3.add(AdicionarLivros);

        jMenuBar1.add(jMenu3);

        Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/information.png"))); // NOI18N
        Sobre.setText("Sobre");
        Sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(Sobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void AdicionarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarLivrosActionPerformed
        AdicionarLivro add = new AdicionarLivro();
        add.setVisible(true);
        add.setLocale(null);
    }//GEN-LAST:event_AdicionarLivrosActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        TableRowSorter sorter = (TableRowSorter) TabelaDeLivros.getRowSorter();
        sorter.setRowFilter(javax.swing.RowFilter.regexFilter("(?i).*" + Pesquisa.getText() + ".*"));
    }//GEN-LAST:event_PesquisarActionPerformed

    private void TabelaDeLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaDeLivrosMouseClicked
        try {
        String SeleçãoDoLivro = TabelaDeLivros.getValueAt(TabelaDeLivros.getSelectedRow(), 1).toString();
        if (evt.getClickCount() == 2 && evt.getButton() == 1) {
            if (TabelaDeLivros.getSelectedRow() != -1) {
                LivroSelecionado select = new LivroSelecionado();
                    new File(AcessoArq.Raiz()+"tmp").mkdir();
                        FileWriter file = new FileWriter(AcessoArq.Raiz()+"tmp/tmp.ebs");
                        PrintWriter gravar = new PrintWriter(file);
                        gravar.print(SeleçãoDoLivro);
                        gravar.close();
                        file.close();
                    
                select.setTitle(SeleçãoDoLivro);
                select.setVisible(true);
                select.setResizable(false);
            }
        }

        if (evt.getButton() == 3) {
            PopUp.show(this.TabelaDeLivros, evt.getX(), evt.getY());
        }
        }catch (IOException ex) {
                    }
    }//GEN-LAST:event_TabelaDeLivrosMouseClicked
    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
         Main telaincio = new Main();
        telaincio.setVisible(true);
        telaincio.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) TabelaDeLivros.getModel();
            String SeleçãoDoLivro = TabelaDeLivros.getValueAt(TabelaDeLivros.getSelectedRow(), 1).toString();
            model.removeRow(TabelaDeLivros.getSelectedRow());
            TabelaDeLivros.clearSelection();
            File file = new File(Acesso.AcessoArq.Livros()+ SeleçãoDoLivro);
            Delete(file);
        } catch (IOException ex) {
        }

    }//GEN-LAST:event_RemoverActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
        String leitura = null, numero = null;
        File file=null;
        
            file = new File(AcessoArq.Livros());
        

        File[] ver = file.listFiles();
        if (TabelaDeLivros.getRowCount() != ver.length) {
            DefaultTableModel model = (DefaultTableModel) TabelaDeLivros.getModel();
            int cont = TabelaDeLivros.getRowCount();
            for (int i = 0; i < cont; i++) {
                model.removeRow(0);
            }

            File[] Livros = file.listFiles();
            BufferedReader ler, num;
            for (int i = 0; i < file.list().length; i++) {
                try {
                    ler = new BufferedReader(new FileReader(Livros[i] + "/Nome.ebs"));
                    leitura = ler.readLine();
                    num = new BufferedReader(new FileReader(Livros[i] + "/NumeroLivro.ebs"));
                    numero = num.readLine();
                } catch (FileNotFoundException ex) {
                } catch (IOException ex) {
                }
                String[] livro = {numero, leitura};
                model.addRow(livro);
            }
        }
        } catch (IOException ex) {
            System.out.println("Não Encotrado");
        }
    }//GEN-LAST:event_formWindowActivated

    private void PesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisaMouseClicked
        Pesquisa.setText("");
    }//GEN-LAST:event_PesquisaMouseClicked

    private void PesquisaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisaMouseExited
        if ("".equals(Pesquisa.getText())) {
            Pesquisa.setText("Pesquisar...");
        }
    }//GEN-LAST:event_PesquisaMouseExited

    private void PesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisaKeyReleased
        if ("Pesquisar...".equals(Pesquisa.getText())) {
            Pesquisa.setText("");
        }
        TableRowSorter sorter = (TableRowSorter) TabelaDeLivros.getRowSorter();
        sorter.setRowFilter(javax.swing.RowFilter.regexFilter("(?i).*" + Pesquisa.getText() + ".*"));

    }//GEN-LAST:event_PesquisaKeyReleased

    private void AddEstudanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEstudanteActionPerformed
        TelaDeCadastroAluno Estudante = new TelaDeCadastroAluno();
        Estudante.setVisible(true);
        Estudante.setResizable(false);
    }//GEN-LAST:event_AddEstudanteActionPerformed

    private void LsEstudantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LsEstudantesActionPerformed

        TabelaDeEstudantes lista = new TabelaDeEstudantes();
        lista.setVisible(true);
        lista.setResizable(false);
        this.dispose();

    }//GEN-LAST:event_LsEstudantesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        File file= new File(AcessoArq.Raiz()+"tmp");

        Delete(file);
        Main telaIncio = new Main();
        telaIncio.setVisible(true);
        telaIncio.setResizable(false);
    }//GEN-LAST:event_formWindowClosing

    private void PesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisaKeyPressed
        if ("Pesquisar...".equals(Pesquisa.getText())) {
            Pesquisa.setText("");
        }
    }//GEN-LAST:event_PesquisaKeyPressed

    private void SobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreMouseClicked
        Sobre sobre = new Sobre();
        sobre.setVisible(true);
        sobre.setResizable(false);
    }//GEN-LAST:event_SobreMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEntrada().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddEstudante;
    private javax.swing.JMenuItem AdicionarLivros;
    public static javax.swing.JLabel Data;
    private javax.swing.JMenuItem LsEstudantes;
    private javax.swing.JTextField Pesquisa;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JPopupMenu PopUp;
    public static javax.swing.JLabel Relogio;
    private javax.swing.JMenuItem Remover;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenu Sobre;
    private javax.swing.JTable TabelaDeLivros;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("book_open.png")));
    }
}
