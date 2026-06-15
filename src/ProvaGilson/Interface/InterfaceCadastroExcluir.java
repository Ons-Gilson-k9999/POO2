package ProvaGilson.Interface;

import Equipamentocontroller.EquipamentoController;

import javax.swing.*;
import java.awt.*;

public class InterfaceCadastroExcluir extends JFrame {

    public InterfaceCadastroExcluir(){
        super(" Sistema de laboratorios-equipamentos");

        Container container= getContentPane();
        container.setLayout(new FlowLayout());


        JButton b1 = new JButton( (" Salvar"));
        JButton b2 = new JButton( (" Excluir"));

        this.size(500,500);

        container.add(b1);
        container.add(b2);

        container.setLayout(new FlowLayout(FlowLayout.RIGHT));

        public InterfaceCadastroExcluir(){
            controller = new EquipamentoController();
            setTitle("Cadastro de equipamento");
            setSize(500,500)

        }
    }

}
