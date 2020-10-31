import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int horario;
		
		System.out.println("Horario do dia:");
		horario = Integer.parseInt(entrada.nextLine());
		
		
		if (horario < 0 || horario > 23) {
		    System.out.println("Invalido");
		}else if (horario >= 6 && horario <= 12) {
		    System.out.println("Bom dia!");
		} else if (horario > 12 && horario <= 18){
		    System.out.println("Boa tarde!");
		} else if (horario > 18 && horario <= 23) {
		    System.out.println("Boa noite!");
		} else {
		    System.out.println("Boa madrugada!");
		}
	}
}
// https://www.onlinegdb.com/online_java_compiler
