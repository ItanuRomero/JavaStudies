import java.util.Scanner;

public class Ex02_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = Integer.parseInt(sc.nextLine());
        
        if(num <= 10 || num >= 20) 
            System.out.println("O número não está entre 10 e 20");
        else
            System.out.println("O número está entre 10 e 20");
    }
    
}