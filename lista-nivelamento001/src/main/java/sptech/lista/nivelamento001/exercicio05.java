/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.lista.nivelamento001;

import java.util.Scanner;

/**
 *
 * @author Gui
 */
public class exercicio05 {
    public static void main (String[] args) {
        
        Scanner numero = new Scanner (System.in);
        
        System.out.println("Por favor, informe um número (Número real):");
        
        Double n1 = numero.nextDouble();
        
        System.out.println("Por favor, insira outro número (Número real):");
                
        Double n2 = numero.nextDouble();
        
        
        Double soma = n1 + n2;
        
        System.out.println("Resultado da soma: " + soma);
        
        
        Double subt = n1 - n2;
        
        System.out.println("Resultado da subtração: " + subt);
        
        
        Double mult = n1 * n2;
        
        System.out.println("Resultado da multiplicação: " + mult);
        
        
        Double div = n1 / n2;
        
        System.out.println("Resultado da divisão: " + div);
    }
}
