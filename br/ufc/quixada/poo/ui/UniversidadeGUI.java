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

import br.ufc.quixada.poo.model.Universidade;
import br.ufc.quixada.poo.controller.GerenciaUniversidade;

public class UniversidadeGUI implements ActionListener {

    private GerenciaUniversidade gerencia;

    private JButton button;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public UniversidadeGUI( GerenciaUniversidade controlador ){
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
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            JOptionPane.showMessageDialog(null, "universidade adicionada com sucesso");
        }
        else if(e.getSource() == button2){
            JOptionPane.showMessageDialog(null, "universidade alterada com sucesso");
        }
        else if(e.getSource() == button3){
            JOptionPane.showMessageDialog(null, "(lista de universidades aqui)");
        }
        else if(e.getSource() == button4){
            JOptionPane.showMessageDialog(null, "universidade excluida com sucesso");
        }
    }
}