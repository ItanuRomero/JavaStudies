import java.util.Scanner;

public class Ex04_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        String msg;

        System.out.println("Digite um horário: ");
        hora = Integer.parseInt(sc.nextLine());

        msg = hora > 23 ? "Erro: Digite uma hora certa" : hora < 0 ? "Erro: Digite uma hora certa" : hora <= 5 ? "Boa Madrugada" : hora <= 11 ? "Bom dia" : hora <= 18 ? "Boa tarde" : "Boa noite";
        
        System.out.println(msg);
    }
    
}