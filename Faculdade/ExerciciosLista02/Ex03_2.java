import java.util.Scanner;

public class Ex03_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite sua nota 1: ");
        nota1 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite sua nota 2: ");
        nota2 = Double.parseDouble(sc.nextLine());

        media = (nota1 + nota2)/2;
        
        if(media < 4)
            System.out.println("Reprovado");
        else 
            if(media < 6.9){
                System.out.println("Recuperação");  
                if(media >= 6){
                    System.out.println("Digite sua nota de recuperação: ");
                    media = Double.parseDouble(sc.nextLine());
                    media = (nota1 + nota2 + media)/3;
                    if(media >= 7)
                        System.out.println("Aprovado");
                    else
                        System.out.println("Reprovado");
                }
                
            }else
                System.out.println("Aprovado");    
    }
    
}