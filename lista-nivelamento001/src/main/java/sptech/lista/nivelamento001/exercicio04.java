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
public class exercicio04 {
    public static void main (String[] args) {
        
        Scanner valor = new Scanner (System.in);
        
        System.out.println("Valor do item?");
        
        Double valor_item = valor.nextDouble();
        
        System.out.println("Quantidade vendida?");
        
        Double qtd_produto = valor.nextDouble();
        
        System.out.println("Valor pago?");
        
        Double valor_pago = valor.nextDouble();
        
        
        Double calculo = (valor_pago) - (valor_item * qtd_produto);
        
        
        if (calculo > 0) {
        
        System.out.println("Seu troco será de R$ " + calculo);
        
        }
        
        else {
            System.out.println("Você está devendo!!!!! Os agiotas não terão misericórdia de ti!!!!!!!!");
        }
    }
}
