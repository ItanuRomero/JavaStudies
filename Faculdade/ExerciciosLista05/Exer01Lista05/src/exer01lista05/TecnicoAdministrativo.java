/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer01lista05;

/**
 *
 * @author ITANU
 */
public class TecnicoAdministrativo extends Pessoa {
    public TecnicoAdministrativo(String Nome, int Idade){
        super(Nome, Idade);
    }
    
    public void quemSou(){
        System.out.println("Sou o Técnico Administrativo " + this.Nome + " com idade " + this.Idade);
    }
}
