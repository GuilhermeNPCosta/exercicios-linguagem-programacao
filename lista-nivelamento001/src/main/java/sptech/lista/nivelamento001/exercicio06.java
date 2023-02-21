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
public class exercicio06 {
    public static void main (String[] args) {
        Scanner valores = new Scanner (System.in);
        
        System.out.println("Por favor, informe o salário bruto:");
        
        Double sal_bruto = valores.nextDouble();
        
        Double desconto_Inss = sal_bruto / 10;
        
        Double desconto_Ir = sal_bruto / 5;
        
        
        System.out.println("Qual o valor da condução de ida ao trabalho? :");
        
        Double valor_cond = valores.nextDouble();
        
        Double desconto_Vt = (valor_cond * 2) * 22;
        
        Double descontos = desconto_Inss + desconto_Ir + desconto_Vt;
        
        Double sal_liq = ((sal_bruto - desconto_Inss) - desconto_Ir) - desconto_Vt;
        
        
        System.out.println("Seu salário bruto é R$ " + sal_bruto + " , tem um total de R$ " + descontos + " em descontos e receberá um líquido de " + sal_liq);
    }
}
