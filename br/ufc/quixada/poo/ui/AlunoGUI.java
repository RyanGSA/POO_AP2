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

import br.ufc.quixada.poo.model.Aluno;
import br.ufc.quixada.poo.controller.GerenciaUniversidade;

public class AlunoGUI implements ActionListener {

    private GerenciaUniversidade gerencia;

    private JButton button;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public AlunoGUI( GerenciaUniversidade controlador ){

        gerencia = controlador;

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
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        //opcao de adicionar um aluno
        if(e.getSource() == button){
            String nom_uni = JOptionPane.showInputDialog("Atuais universidades:\n" + gerencia.imprimirListaUniversidade() + "\nDigite o nome da universidade:");
            String nom_cur = JOptionPane.showInputDialog("Atuais cursos:\n" + gerencia.imprimirListaCurso(nom_uni) + "\nDigite o nome do curso:");
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de ingresso do aluno:"));
            int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula do aluno:"));

            Aluno m = new Aluno(nome,ano,matricula);
            
            if(gerencia.adicionarAluno(nom_uni, nom_cur, m))JOptionPane.showMessageDialog(null, "aluno adicionado com sucesso");
            else JOptionPane.showMessageDialog(null, "erro ao adicionar aluno");
        }
        //opcao de alterar um aluno
        else if(e.getSource() == button2){
            String nom_uni = JOptionPane.showInputDialog("Atuais universidades:\n" + gerencia.imprimirListaUniversidade() + "\nDigite o nome da universidade:");
            String nom_cur = JOptionPane.showInputDialog("Atuais cursos:\n" + gerencia.imprimirListaCurso(nom_uni) + "\nDigite o curso:");
            String nom_alu = JOptionPane.showInputDialog("Atuais alunos:\n" + gerencia.imprimirListaAluno(nom_uni,nom_cur) + "\nDigite o aluno a ser alterado:");
            String nom = JOptionPane.showInputDialog("Digite o nome do aluno:");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de ingresso do aluno:"));
            int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula do aluno:"));

            if(gerencia.alterarAluno(nom_uni,nom_cur,nom_alu,nom,ano,matricula))JOptionPane.showMessageDialog(null, "curso alterado com sucesso");
            else JOptionPane.showMessageDialog(null, "erro ao alterar curso");
        }
        //opcao de listar todos os alunos
        else if(e.getSource() == button3){
            String nom_uni = JOptionPane.showInputDialog("Atuais universidades:\n" + gerencia.imprimirListaUniversidade() + "\nDigite o nome da universidade:");
            String nom_cur = JOptionPane.showInputDialog("Atuais cursos:\n" + gerencia.imprimirListaCurso(nom_uni) + "\nDigite o nome do curso:");
            JOptionPane.showMessageDialog(null, gerencia.imprimirListaAluno(nom_uni, nom_cur));
        }
        //opcao de excluir aluno
        else if(e.getSource() == button4){
            String nome_uni = JOptionPane.showInputDialog("Digite o nome da universidade:");
            String nome_cur = JOptionPane.showInputDialog("Digite o nome do curso:");
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
            
            if(gerencia.removerAluno(nome_uni, nome_cur, nome))JOptionPane.showMessageDialog(null, "aluno excluido com sucesso");
            else JOptionPane.showMessageDialog(null, "erro ao excluir aluno");
        }
    }
}