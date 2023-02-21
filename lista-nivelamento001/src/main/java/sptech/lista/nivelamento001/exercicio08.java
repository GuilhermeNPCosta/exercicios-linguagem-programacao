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
public class exercicio08 {
    public static void main (String[] args) {
        
        Scanner alfanum = new Scanner (System.in);
        
        System.out.println("Por favor, informe seu nome:");
        
        String nome = alfanum.nextLine();
        
        System.out.println("Por favor, insira a 1ª nota:");
        
        Double nota1 = alfanum.nextDouble();
        
        System.out.println("Por favor, insira a 2ª nota:");
        
        Double nota2 = alfanum.nextDouble();
        
        
        Double calculo_med = (nota1 + nota2) / 2;
        
        System.out.println("Olá " + nome + ". Sua média foi de " + calculo_med);
        
    }
}
