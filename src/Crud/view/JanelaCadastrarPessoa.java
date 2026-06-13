package Crud.view;

import controller.PessoaController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaCadastrarPessoa extends JFrame {

    private JTextField txtNome;
    private JButton btnCadastrar;
    private JButton btnConsultar;
    private JButton btnAtualizar;
    private JButton btnExcluir;
    private JTextArea txtResultado;
    private PessoaController controller;

    public JanelaCadastrarPessoa() {
        controller = new PessoaController();
        setTitle("Cadastro de Pessoa");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        criarComponentes();
        setVisible(true);
    }

    private void criarComponentes() {
        JPanel painelSuperior = new JPanel();
        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField(15);

        btnCadastrar = new JButton("Cadastrar");
        btnConsultar = new JButton("Consultar");
        btnAtualizar = new JButton("Atualizar");
        btnExcluir = new JButton("Excluir");

        painelSuperior.add(lblNome);
        painelSuperior.add(txtNome);
        painelSuperior.add(btnCadastrar);
        painelSuperior.add(btnConsultar);
        painelSuperior.add(btnAtualizar);
        painelSuperior.add(btnExcluir);

        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        add(painelSuperior, BorderLayout.NORTH);
        add(new JScrollPane(txtResultado), BorderLayout.CENTER);

        GerenciadorBotoes gb = new GerenciadorBotoes();
        btnCadastrar.addActionListener(gb);
        btnConsultar.addActionListener(gb);
        btnAtualizar.addActionListener(gb);
        btnExcluir.addActionListener(gb);
    }

    private class GerenciadorBotoes implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = txtNome.getText();
            if (e.getSource() == btnCadastrar) {
                txtResultado.append("Cadastrando: " + nome + "\n");

            } else if (e.getSource() == btnConsultar) {
                txtResultado.append("Consultando.\n");

            } else if (e.getSource() == btnAtualizar) {
                txtResultado.append("Atualizando: " + nome + "\n");

            } else if (e.getSource() == btnExcluir) {
                txtResultado.append("Excluindo: " + nome + "\n");
            }
        }
    }
}