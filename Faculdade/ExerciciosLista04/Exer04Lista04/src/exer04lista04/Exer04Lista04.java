/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer04lista04;

import java.util.Scanner;

/**
 *
 * @author ITANU
 */
public class Exer04Lista04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Pessoa p = new Pessoa();

        System.out.print("Nome da Pessoa: ");   
        p.setNome(sc.nextLine());
        System.out.print("Data de Nascimento da Pessoa: ");   
        p.setDataNasc(sc.nextLine());
        System.out.print("CPF da Pessoa: ");   
        p.setCpf(sc.nextLine());
        
        System.out.println("-----Pessoa-----");
        p.mostraPessoa();
    }
    
}
