package com.mycompany.exercicio11;
import javax.swing.JOptionPane;

public class Exercicio11 {

    public static void main(String[] args) {
        int numero, multiplo;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        multiplo = numero;     
   
        if  (numero % 2 == 0) { 
         
            JOptionPane.showMessageDialog(null,"É MULTIPLO" );
            
        }else {
                  
                JOptionPane.showMessageDialog(null," NÃO É MULTIPLO" );
                
        }
    }
}
