import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        boolean num1Maior = false;

        System.out.println("Digite o primero número: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o segundo número: ");
        num2 = Integer.parseInt(sc.nextLine());

        if(num1 > num2){
            num1Maior = true;
        }
        if(num1Maior){
            while(num1 >= num2){
                System.out.print(num1 + " ");
                num1--;
            }
        }else{
            while(num1 <= num2){
                System.out.print(num1 + " ");
                num1++;
            }
        }
    }
   
}