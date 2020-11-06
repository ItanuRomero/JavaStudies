import java.util.Scanner;

public class Ex07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra;
        
        do{
            //System.out.println("A");
            //System.out.println("B");
            //System.out.println("C");
            //System.out.println("S");
            System.out.println("Primeira");
            System.out.println("Segunda");
            System.out.println("Terceira");
            System.out.println("Sair");
            System.out.println("Digite algo: ");
            letra = sc.nextLine();
        }while(!"s".equals(letra.toLowerCase()) && !"sair".equals(letra.toLowerCase()));
    }
    
}