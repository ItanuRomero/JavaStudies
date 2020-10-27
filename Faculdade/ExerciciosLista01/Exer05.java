import java.util.Scanner;

public class Exer05Lista01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoNascimento, diferencaAnos, diferencaMeses, diferencaDias, diferencaMinutos, diferencaSegundos;
        // entra dados
        System.out.println("Digite seu ano de nascimento:");
        anoNascimento = Integer.parseInt(sc.nextLine());
        // realiza as operacoes
        diferencaAnos = 2020 - anoNascimento;
        diferencaMeses = diferencaAnos * 12;
        diferencaDias = diferencaMeses * 30;
        diferencaMinutos = diferencaDias * 60 * 24;
        diferencaSegundos = diferencaMinutos * 60;
        // mostra resultado
        System.out.println("Já viveu " + diferencaAnos + " anos, ou " + diferencaMeses + " meses, ou " + diferencaDias + " dias, ou " + diferencaMinutos + " minutos, ou " + diferencaSegundos + " segundos");        
    }
    
}
