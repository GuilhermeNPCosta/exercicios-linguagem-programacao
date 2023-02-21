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
public class exercicio03 {
    public static void main (String[] args) {
        
        Scanner info = new Scanner (System.in);
        
        System.out.println("Quanto tempo de aquecimento? (Em minutos)");
        
        Integer tempo_aquecimento = info.nextInt(); 
        
        System.out.println("Quanto tempo de exercícios aeróbicos realizado? (Em minutos)");
        
        Integer tempo_aerob = info.nextInt();
        
        System.out.println("Quanto tempo de exercícios de musculação? (Em minutos)");
        
        Integer tempo_musc = info.nextInt();
        
        
        Integer tempo = tempo_aquecimento + tempo_aerob + tempo_musc;
        
        Integer kcal_gasta = (tempo_aquecimento * 12) + (tempo_aerob * 20) + (tempo_musc * 25);
        
        
        System.out.println("Olá Chicó Jorge. Você fez um total de " + tempo + " minutos de exercícios e perdeu cerca de " + kcal_gasta + " calorias.");
    }
}
