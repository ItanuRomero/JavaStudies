import java.util.Scanner;

public class Ex04_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Digite um horário: ");
        hora = Integer.parseInt(sc.nextLine());
        
        if(hora < 0 || hora > 23)
            System.out.println("Erro: Digite uma hora certa");
        else if(hora <= 5)
            System.out.println("Boa Madrugada");
        else if(hora <= 11)
            System.out.println("Bom dia");
        else if(hora <= 18)
            System.out.println("Boa tarde");
        else if(hora <= 23)
            System.out.println("Boa noite");
    }
    
}