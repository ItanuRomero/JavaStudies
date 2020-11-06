import java.util.Scanner;

public class Ex08 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano, i, quant = 0;

        System.out.println("Digite algo: ");
        ano = Integer.parseInt(sc.nextLine());
        
        for(i = ano; i <= 2020; i++){
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                quant++;
            }
        }

        System.out.println("Quantidade de anos bissextos: " + quant);
    }
    
}