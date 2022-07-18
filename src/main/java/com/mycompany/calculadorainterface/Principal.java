/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorainterface;

import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class Principal {
    public static void main(String[] args){
        //declarações
        Calculo calc = new Calculo();
        double resultado=0.0;
        
        //entrada de dados
        double v1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1:"));
        double v2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2:"));
        String operacao = "";
        
        while (!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("*") && !operacao.equals("/")){
            operacao = JOptionPane.showInputDialog("Digite a operação(+,-,*,/):");
        }
        
        if (operacao.equals("+")){
            resultado = calc.somar(v1, v2);
        }else if (operacao.equals("-")){
            resultado = calc.subtrair(v1, v2);
        }else if (operacao.equals("*")){
            resultado = calc.multiplicar(v1, v2);
        }else if (operacao.equals("/")){
                resultado = calc.dividir(v1, v2);
        }
        
        JOptionPane.showMessageDialog(null, "O resultado da operação é " + String.valueOf(resultado));
    }
}
