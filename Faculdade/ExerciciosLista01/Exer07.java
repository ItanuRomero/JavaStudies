import java.util.Scanner;

public class Exer07Lista01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, base, perimetro, area;
        // leitura dos valores
        System.out.println("Altura do terrero em metros:");    
        altura = Double.parseDouble(sc.nextLine());

        System.out.println("Base do terrero em metros:");    
        base = Double.parseDouble(sc.nextLine());  
        // realiza operacoes
        perimetro = altura * 2 + base * 2;
        area = altura * base;
        // mostra na tela
        System.out.println("\n\nO perímetro do terreno é: " + perimetro + " metros");
        System.out.println("A área do terreno é: " + area + " metros");
    }
}
