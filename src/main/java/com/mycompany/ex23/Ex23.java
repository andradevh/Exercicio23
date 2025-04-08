package com.mycompany.ex23;

import javax.swing.JOptionPane;

public class Ex23 {

    public static void main(String[] args) {
        int numero1, numero2, soma = 0;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2: "));
        
        while( numero1 <= numero2){
            soma = soma+numero1;
            soma++;
        }
        JOptionPane.showMessageDialog(null,soma);
}

    }

