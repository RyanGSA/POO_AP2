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

import br.ufc.quixada.poo.controller.GerenciaUniversidade;
import br.ufc.quixada.poo.model.Localizacao;

public class TraineeGUI implements ActionListener {

    private GerenciaUniversidade gerencia;

    private JButton button;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public TraineeGUI( GerenciaUniversidade controlador ){

        gerencia = controlador;

        JFrame frame = new JFrame(); 
        JPanel panel = new JPanel(); 

        //cria as opcoes clicaveis do menu
        button = new JButton("procurar candidatos");
        button2 = new JButton("menu de alunos");
        button3 = new JButton("menu de universidades");
        button4 = new JButton("menu de cursos");
        button5 = new JButton("sair");

        //associa o actionlistener a cada botao
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        //chama o metodo setborder e cria um objeto border com o tamanho especificado
        panel.setLayout(new GridLayout(5,1));

        //adiciona as opcoes ao painel do menu
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Programa de Trainee");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        //dado um estado, uma cidade e um curso, mostrar os alunos matriculados em cada universidade
        if(e.getSource() == button){
            String estado = JOptionPane.showInputDialog("Digite o estado:");
            String cidade = JOptionPane.showInputDialog("Digite a cidade:");
            String nom_cur = JOptionPane.showInputDialog("Digite o curso:");

            Localizacao local = new Localizacao(estado, cidade);

            JOptionPane.showMessageDialog(null, gerencia.procurarCandidatos(local, nom_cur));
        }
        //abre menu de alunos
        else if(e.getSource() == button2){
            new AlunoGUI(this.gerencia);
        }
        //abre menu de universidades
        else if(e.getSource() == button3){
            new UniversidadeGUI(this.gerencia);
        }
        //abre menu de cursos
        else if(e.getSource() == button4){
            new CursoGUI(this.gerencia);
        }
        //fecha o programa
        else if(e.getSource() == button5){
            System.exit(0);
        }
    }
}