import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota1, nota2;
		float media;
		
		System.out.println("Digite um nota:");
		nota1 = Integer.parseInt(entrada.nextLine());
	    System.out.println("Digite um nota:");
		nota2 = Integer.parseInt(entrada.nextLine());
		
		media = (nota1 + nota2) / 2;
		
		
		if (media >= 4) {
		    if (media >= 7) {
		        System.out.println("Aprovado");
		    } else {
		        System.out.println("Recuperacao");
		        System.out.println("Qual a nota da Recuperacao?");
		        media = Float.parseFloat(entrada.nextLine());
		        //operador ternario
		        System.out.println(media >= 6 ? "Aprovado" : "Reprovado")
		    }
		} else {
		    System.out.println("Reprovado");
		}
	}
}
