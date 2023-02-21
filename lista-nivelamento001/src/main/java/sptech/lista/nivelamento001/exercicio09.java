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
public class exercicio09 {
    public static void main (String[] args) {
        
        Scanner info = new Scanner (System.in);
        
        System.out.println("Pro favor, informe seu nome:");
        
        String nome = info.nextLine();
        
        System.out.println("Olá, " + nome + "! Qual o ano de seu nascimento?");
        
        Integer ano = info.nextInt();
        
        Integer idade = 2030 - ano;
        
        System.out.println("Em 2030 você terá " + idade + " anos.");
    }
}
