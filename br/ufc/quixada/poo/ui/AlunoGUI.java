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

public class AlunoGUI implements ActionListener {

    private JButton button;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public AlunoGUI(){
        JFrame frame = new JFrame(); 
        JPanel panel = new JPanel(); 

        //cria as opcoes clicaveis do menu
        //inclusão, alteração, consulta e exclusão
        button = new JButton("adicionar aluno");
        button2 = new JButton("alterar aluno");
        button3 = new JButton("mostrar alunos");
        button4 = new JButton("excluir aluno");

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
        frame.setTitle("Menu de Alunos");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            JOptionPane.showMessageDialog(null, "aluno adicionado com sucesso");
        }
        else if(e.getSource() == button2){
            JOptionPane.showMessageDialog(null, "aluno alterado com sucesso");
        }
        else if(e.getSource() == button3){
            JOptionPane.showMessageDialog(null, "(lista de alunos aqui)");
        }
        else if(e.getSource() == button4){
            JOptionPane.showMessageDialog(null, "aluno excluido com sucesso");
        }
    }
}