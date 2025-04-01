package com.mycompany.exercicio14;
import javax.swing.JOptionPane;

// ALGORITMO QUE VERIFICA SE ANO DE NASCIMENTO ESTÁ CORRETO
public class Exercicio14 {

    public static void main(String[] args) {
        
        int anodenascimento;
        anodenascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano do seu nascimento: "));
        
        int anoatual;
        anoatual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual: "));
        
        int idade = anoatual - anodenascimento;
        
        if (anodenascimento < anoatual) {
            JOptionPane.showMessageDialog(null,idade);
        }else {
            JOptionPane.showMessageDialog(null,"Inválido");
        }  
    }
}
