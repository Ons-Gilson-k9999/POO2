package Prova.view;

import Prova.controller.SensorController;
import Prova.model.Sensor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TelaSensor extends JFrame {
    //atributos
    private JButton btnCadastrar;
    private JButton btnConsultar;

    private SensorController controller;

    private JPanel painelDados;
    private JLabel lblTitulo;
    private JLabel lblSubtitulo;
    private JLabel lblId;
    private JLabel lblCodigo;
    private JLabel lblTipo;
    private JLabel lblLocalizacao;

    private JTextField txtId;
    private JTextField txtCodigo;
    private JTextField txtTipo;
    private JTextField txtLocalizacao;

    private JTable tabelaSensor;
    private DefaultTableModel modeloTabela;
    private JLabel lblTotal;

    //Construtor
    public TelaSensor() {

        controller = new SensorController();

        setTitle("Gerenciamento de Sensores");
        setSize(700,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        lblId = new JLabel("ID:");
        lblId.setBounds(30,40,80,25);

        lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(30,80,80,25);

        lblTipo = new JLabel("Tipo:");
        lblTipo.setBounds(30,120,80,25);

        lblLocalizacao = new JLabel("Localização:");
        lblLocalizacao.setBounds(30,160,90,25);

        txtId = new JTextField();
        txtId.setBounds(120,40,250,25);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(120,80,250,25);

        txtTipo = new JTextField();
        txtTipo.setBounds(120,120,250,25);

        txtLocalizacao = new JTextField();
        txtLocalizacao.setBounds(120,160,250,25);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(130, 200, 120, 30);
        btnConsultar = new JButton("Consultar");
        btnConsultar.setBounds(270, 200, 120, 30);

        painelDados = new JPanel();
        painelDados.setLayout(null);
        painelDados.setBounds(20,90,640,230);
        painelDados.setBorder(
                BorderFactory.createTitledBorder("Dados do Sensor")
        );
        add(painelDados);

        painelDados.add(lblId);
        painelDados.add(lblCodigo);
        painelDados.add(lblTipo);
        painelDados.add(lblLocalizacao);
        painelDados.add(txtId);
        painelDados.add(txtCodigo);
        painelDados.add(txtTipo);
        painelDados.add(txtLocalizacao);
        painelDados.add(btnCadastrar);
        painelDados.add(btnConsultar);

        JPanel painelTabela = new JPanel();
        painelTabela.setLayout(new BorderLayout());
        painelTabela.setBounds(20,340,640,220);
        painelTabela.setBorder(
                BorderFactory.createTitledBorder("Sensores Cadastrados")
        );
        String[] colunas = {
                "ID",
                "Código",
                "Tipo",
                "Localização"
        };
        modeloTabela = new DefaultTableModel(colunas,0);
        tabelaSensor = new JTable(modeloTabela);
        JScrollPane scroll = new JScrollPane(tabelaSensor);
        painelTabela.add(scroll);
        add(painelTabela);

        btnCadastrar.addActionListener(e -> {
            int id= Integer.parseInt(txtId.getText());
            String codigo=txtCodigo.getText();
            String tipo= txtTipo.getText();
            String localizacao= txtLocalizacao.getText();
            Sensor sensor = new Sensor(
                    id,
                    codigo,
                    tipo,
                    localizacao,
                    ""
            );
            controller.cadastrar(sensor);
            JOptionPane.showMessageDialog(this, "Sensor cadastrado.");
            modeloTabela.addRow(new Object[]{
                    sensor.getID(),
                    sensor.getCodigo(),
                    sensor.getTipo(),
                    sensor.getLocalizacao()
            });
            txtId.setText("");
            txtCodigo.setText("");
            txtTipo.setText("");
            txtLocalizacao.setText("");
            txtId.requestFocus();
        });
        btnConsultar.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtId.getText());

                Sensor sensor = controller.consultar(id);
                if(sensor != null){

                    txtId.setText(String.valueOf(sensor.getID()));
                    txtCodigo.setText(sensor.getCodigo());
                    txtTipo.setText(sensor.getTipo());
                    txtLocalizacao.setText(sensor.getLocalizacao());
                    JOptionPane.showMessageDialog(this, "Sensor localizado");
                }else{
                    JOptionPane.showMessageDialog(
                            this, "Sensor não encontrado!");
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(
                        this, ex.getMessage());

            }

        });
        setVisible(true);
    }
}