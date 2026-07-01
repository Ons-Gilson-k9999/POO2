package ProvaGilson.view;

import Prova.controller.Controller;
import ProvaGilson.controller.EquipamentoController;
import ProvaGilson.model.Equipamento;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaEquipamento extends JFrame {

    private JLabel lblid,lblcodigo,lbltipo,lbllocalizacao,lblId,lbl,valor,lblunidade,lbldataHora,lbltitulo,lblSubtitulo,lblTotal;
    private JTextField txtid,txtcodigo,txttipo,txtlocalizacao,getTxtid,txtvalor,txtunidade,txtdataHora,txtsensor;
    private JComboBox<String>Sensores;
    private JButton btnSalvar,btnConsultar;
    private JTable tabela;

  public TelaEquipamento(){
    Controller controller = new Controller();
    setTitle("Sistema de sensores");
    setSize(600,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(null);

    lbltitulo = new JLabel("Gerenciamento");
    lbltitulo.setBounds(80,20,400,25);
    lblSubtitulo= new JLabel ("Cadastro de equipamentos");
    add(lbltitulo);
    add(lblSubtitulo);

    JPanel painelDados = new JPanel();
    painelDados.setLayout(null);
    painelDados.setBounds(20,80,540,310);
    painelDados.setBorder(BorderFactory.createTitledBorder("Dados do equipamento: "));

    lblId= new JLabel("ID:");
    lbl.setBounds(20,30,80,25);
    txtid = new JTextField();
    txtid.setBounds(120,30,100,25);

      lblcodigo= new JLabel("Codigo:");
      lbl.setBounds(20,30,80,25);
      txtcodigo  = new JTextField();
      txtcodigo.setBounds(120,30,100,25);

      lbltipo= new JLabel("Tipo:");
      lbl.setBounds(20,30,80,25);
      txttipo = new JTextField();
      txttipo.setBounds(120,30,100,25);

      lbllocalizacao= new JLabel("Localizacao:");
      lbl.setBounds(20,30,80,25);
      txtlocalizacao = new JTextField();
      txtlocalizacao.setBounds(120,30,100,25);

      btnSalvar = new JButton ("CAdastrar");
      btnSalvar.setBounds(150,270,100,30);

      btnConsultar = new JButton("Consultar");
      btnConsultar.setBounds(150,270,100,30);

      painelDados.add(lblid);painelDados.add(txtid);
      painelDados.add(lblcodigo)

  }