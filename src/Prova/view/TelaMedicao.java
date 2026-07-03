package Prova.view;

import Prova.controller.MedicaoController;
import Prova.model.Medicao;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TelaMedicao extends JFrame {
    //atributos

    private JButton btnCadastrar;
    private JButton btnConsultar;
    private MedicaoController controller;
    private JPanel painelDados;
    private JLabel lblId;
    private JLabel lblValor;
    private JLabel lblUnidade;
    private JLabel lblDataHora;
    private JLabel lblSensor;
    private JTextField txtId;
    private JTextField txtValor;
    private JTextField txtUnidade;
    private JTextField txtDataHora;
    private JTextField txtSensor;
    private JTable tabelaMedicao;
    private DefaultTableModel modeloTabela;

    //construtor
    public TelaMedicao() {

        controller = new MedicaoController();

        setTitle("Gerenciamento de Medição");
        setSize(700,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        lblId = new JLabel("ID:");
        lblId.setBounds(30,40,80,25);
        lblValor = new JLabel("Valor:");
        lblValor.setBounds(30,80,80,25);
        lblUnidade = new JLabel("Unidade:");
        lblUnidade.setBounds(30,120,80,25);
        lblDataHora = new JLabel("Data/Hora:");
        lblDataHora.setBounds(30,160,80,25);
        lblSensor = new JLabel("Sensor:");
        lblSensor.setBounds(30,200,80,25);


        txtId = new JTextField();
        txtId.setBounds(120,40,250,25);
        txtValor = new JTextField();
        txtValor.setBounds(120,80,250,25);
        txtUnidade = new JTextField();
        txtUnidade.setBounds(120,120,250,25);
        txtDataHora = new JTextField();
        txtDataHora.setBounds(120,160,250,25);
        txtSensor = new JTextField();
        txtSensor.setBounds(120,200,250,25);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(130,240,120,30);
        btnConsultar = new JButton("Consultar");
        btnConsultar.setBounds(270,240,120,30);

        painelDados = new JPanel();
        painelDados.setLayout(null);
        painelDados.setBounds(20,40,640,300);
        painelDados.setBorder(
                BorderFactory.createTitledBorder("Dados da Medição")
        );

        add(painelDados);

        painelDados.add(lblId);
        painelDados.add(lblValor);
        painelDados.add(lblUnidade);
        painelDados.add(lblDataHora);
        painelDados.add(lblSensor);
        painelDados.add(txtId);
        painelDados.add(txtValor);
        painelDados.add(txtUnidade);
        painelDados.add(txtDataHora);
        painelDados.add(txtSensor);
        painelDados.add(btnCadastrar);
        painelDados.add(btnConsultar);


        JPanel painelTabela = new JPanel();
        painelTabela.setLayout(new BorderLayout());
        painelTabela.setBounds(20,360,640,220);
        painelTabela.setBorder(
                BorderFactory.createTitledBorder("Medição Cadastrada.")
        );

        String[] colunas = {
                "ID",
                "Valor",
                "Unidade",
                "Data/Hora",
                "Sensor"
        };

        modeloTabela = new DefaultTableModel(colunas,0);
        tabelaMedicao = new JTable(modeloTabela);
        JScrollPane scroll = new JScrollPane(tabelaMedicao);
        painelTabela.add(scroll);
        add(painelTabela);

        btnCadastrar.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtId.getText());
                String valor = txtValor.getText();
                String unidade = txtUnidade.getText();
                String dataHora = txtDataHora.getText();
                int sensorId = Integer.parseInt(txtSensor.getText());

                Medicao medicao = new Medicao();
                medicao.setId(id);
                medicao.setValor(valor);
                medicao.setUnidade(unidade);
                medicao.setDataHora(dataHora);
                medicao.setSensorId(sensorId);

                controller.cadastrar(medicao);
                modeloTabela.addRow(new Object[]{
                        medicao.getID(),
                        medicao.getValor(),
                        medicao.getUnidade(),
                        medicao.getDataHora(),
                        medicao.getSensorId()
                });

                JOptionPane.showMessageDialog(this,
                        "Medição cadastrada.");

                txtId.setText("");
                txtValor.setText("");
                txtUnidade.setText("");
                txtDataHora.setText("");
                txtSensor.setText("");
                txtId.requestFocus();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage());
            }
        });
        btnConsultar.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtId.getText());
                Medicao medicao = controller.consultar(id);
                if (medicao != null) {

                    txtValor.setText(medicao.getValor());
                    txtUnidade.setText(medicao.getUnidade());
                    txtDataHora.setText(medicao.getDataHora());
                    txtSensor.setText(String.valueOf(medicao.getSensorId()));
                    JOptionPane.showMessageDialog(this,
                            "Medição localizada.");
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Medição não encontrada.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage());
            }

        });
        setVisible(true);
    }
}