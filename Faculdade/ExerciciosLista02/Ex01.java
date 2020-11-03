import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double nota1, nota2, media;

        System.out.println("Digite seu Nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua nota 1: ");
        nota1 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite sua nota 2: ");
        nota2 = Double.parseDouble(sc.nextLine());

        media = (nota1 + nota2)/2;
        
        if(media >= 4)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
    
}