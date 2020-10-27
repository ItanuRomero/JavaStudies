import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04Lista01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat formatar = new DecimalFormat("#0.00");      
        int quantCigarro, anos;
        double valorGasto;
        // entra com os dados
        System.out.println("Quantos cigarros você fuma em média por ano?");
        quantCigarro = Integer.parseInt(sc.nextLine());

        System.out.println("Há quantos anos você fuma?");
        anos = Integer.parseInt(sc.nextLine());
        // realiza a operacao
        valorGasto = anos * quantCigarro * 10.2;
        // mostra resultado
        System.out.println("\nVocê já gastou com cigarro, aproximandamente R$ " + formatar.format(valorGasto));    
    }
}
