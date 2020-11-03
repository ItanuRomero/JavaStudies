import java.util.Scanner;

public class Ex06{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra, msg;

        System.out.println("Digite uma letra referente ao seu sexo: ");
        letra = sc.nextLine();

        msg = "F".equals(letra) ? "Feminino" : "M".equals(letra) ? "Masculino" : "Letra incorreta";
        
        System.out.println(msg);
    }
    
}