package br.ufc.quixada.poo.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.ufc.quixada.poo.model.Localizacao;
import br.ufc.quixada.poo.model.Universidade;
import br.ufc.quixada.poo.controller.GerenciaUniversidade;

public class UniversidadeGUI implements ActionListener {

    private GerenciaUniversidade gerencia;

    private JButton button;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public UniversidadeGUI( GerenciaUniversidade controlador ){

        gerencia = controlador;

        JFrame frame = new JFrame(); 
        JPanel panel = new JPanel(); 

        //cria as opcoes clicaveis do menu
        button = new JButton("adicionar universidade");
        button2 = new JButton("alterar universidade");
        button3 = new JButton("mostrar universidades");
        button4 = new JButton("excluir universidade");

        //associa o actionlistener a cada botao
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        //chama o metodo setborder e cria um objeto border com o tamanho especificado
        panel.setLayout(new GridLayout(4,1));

        //adiciona as opcoes ao painel do menu
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("Menu de Universidades");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        //opcao de adicionar uma universidade
        if(e.getSource() == button){
            String nome = JOptionPane.showInputDialog("Digite o nome da universidade:");
            String estado = JOptionPane.showInputDialog("Digite o estado onde a universidade fica:");
            String cidade = JOptionPane.showInputDialog("Digite a cidade onde a universidade fica:");
            String diretor = JOptionPane.showInputDialog("Digite o nome do diretor:");
            
            Localizacao local_uni = new Localizacao(estado, cidade);

            Universidade m = new Universidade(nome, local_uni, diretor);
            
            if(gerencia.adicionarUniversidade(m))JOptionPane.showMessageDialog(null, "universidade adicionado com sucesso");
            else JOptionPane.showMessageDialog(null, "erro ao adicionar universidade");
        }
        //opcao de alterar uma universidade
        else if(e.getSource() == button2){
            String nom_uni = JOptionPane.showInputDialog("Atuais universidades:\n" + gerencia.imprimirListaUniversidade() + "\nDigite a universidade a ser alterada:");
            String nome = JOptionPane.showInputDialog("Digite o nome da universidade:");
            String estado = JOptionPane.showInputDialog("Digite o estado onde a universidade fica:");
            String cidade = JOptionPane.showInputDialog("Digite a cidade onde a universidade fica:");
            String diretor = JOptionPane.showInputDialog("Digite o nome do diretor:");

            if(gerencia.alterarUniversidade(nom_uni, nome, estado, cidade, diretor))JOptionPane.showMessageDialog(null, "universidade alterada com sucesso");
            else JOptionPane.showMessageDialog(null, "erro ao alterar universidade");
        }
        //opcao de listar todas as universidades
        else if(e.getSource() == button3){
            JOptionPane.showMessageDialog(null, gerencia.imprimirListaUniversidade());
        }
        //opcao de excluir uma universidade
        else if(e.getSource() == button4){
            String nome = JOptionPane.showInputDialog("Atuais universidades:\n" + gerencia.imprimirListaUniversidade() + "\nDigite o nome da universidade:");
            
            if(gerencia.removerUniversidade(nome))JOptionPane.showMessageDialog(null, "universidade excluida com sucesso");
            else JOptionPane.showMessageDialog(null, "erro ao excluir universidade");
        }
    }
}