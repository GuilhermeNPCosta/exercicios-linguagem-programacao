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
public class exercicio07 {
    public static void main (String[] args) {
        Scanner medida = new Scanner (System.in);
        
        System.out.println("Po favor, informe a quantidade de carga suportada pelo elevador:");
        
        Double peso_sup = medida.nextDouble();
        
        System.out.println("Por favor, informe o número de pessoas suportadas pelo elevador:");
        
        Double pessoas = medida.nextDouble();
        
        System.out.println("Informe o peso da 1ª pessoa a entrar no elevador:");
        
        Double peso_p1 = medida.nextDouble();
        
        System.out.println("Informe o peso da 2ª pessoa a entrar no elevador:");
        
        Double peso_p2 = medida.nextDouble();
        
        System.out.println("Informe o peso da 3ª pessoa a entrar no elevador:");
        
        Double peso_p3 = medida.nextDouble();
        
        Double peso_total = peso_p1 + peso_p2 + peso_p3;
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + pessoas + " pessoas. O peso total no elevador é de " + peso_total + ", sendo que ele suporta " + peso_sup);
    }
}
