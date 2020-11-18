/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer03lista04;

/**
 *
 * @author ITANU
 */
public class Exer03Lista04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacoesMatematicas opMat = new OperacoesMatematicas();
        int[] vet = {1, 2, 3, 4};
        opMat.sopMatar(vet);
        opMat.multiplicar(vet);
        opMat.dividir(-10, 5);
    }
    
}
