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
public class Exercicio02 {
    public static void main (String[] args) {
        
        Scanner numero = new Scanner (System.in);
        
        System.out.println("Quantos filhos de 0 a 3 anos possui?: ");
        
        Integer qtd_filhos_menores = numero.nextInt();
        
        
        System.out.println("Quantos filhos de 4 a 16 anos possui?: ");
        
        Integer qtd_filhos_mid = numero.nextInt();
        
        
        System.out.println("Quantos filhos de 17 a 18 anos possui?: ");
        
        Integer qtd_filhos_mlkg = numero.nextInt();
        
        Integer calculo_filhos = qtd_filhos_menores + qtd_filhos_mid + qtd_filhos_mlkg;
        
        Double calculo_bolsa = (qtd_filhos_menores * 25.12) + (qtd_filhos_mid * 15.88) + (qtd_filhos_mlkg * 12.44);
        
        System.out.println("Você tem um total de " + calculo_filhos + " filhos e vai receber R$ " + calculo_bolsa + " de bolsa");
    }
}
