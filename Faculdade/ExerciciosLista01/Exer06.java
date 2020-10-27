import java.util.Scanner;

public class Exer06Lista01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, raio, volume;
        // entra com dados
        System.out.println("Altura de um Cilindro Circular:");    
        altura = Double.parseDouble(sc.nextLine());

        System.out.println("Raio de um Cilindro Circular:");    
        raio = Double.parseDouble(sc.nextLine());
        // realiza operacao
        volume = 3.14 * raio * raio * altura;
        // mostra resultado
        System.out.println("\nO volume de um Cilindro Circular é: " + volume);
    } 
}
