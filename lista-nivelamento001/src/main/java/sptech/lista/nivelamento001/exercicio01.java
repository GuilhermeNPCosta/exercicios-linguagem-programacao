/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.lista.nivelamento001;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio01 {
    public static void main (String[] args) {
        Scanner leitura = new Scanner (System.in);
        
        System.out.println("Digite seu login: ");
        
        String login = leitura.nextLine();
        
        
        System.out.println("Digite sua senha: ");
        
        String senha = leitura.nextLine();
        
        
        System.out.println("Quantas tentativas até ser bloqueado: ");
        
        Integer tent = leitura.nextInt();
        
        
        System.out.println("Seu login é " + login + " e sua senha é " + senha + ". Você tem " + tent +
" tentativas antes de ser bloqueado.");
    }
}
