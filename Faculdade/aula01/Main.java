// https://www.onlinegdb.com/online_java_compiler
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Hello World!!!");
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Digite seu nome: ");
	    String nome = input.nextLine();
	    
	    System.out.print("Digite o ano de nascimento: ");
	    int anoNascimento = Integer.parseInt( input.nextLine() );
	    
        int anoAtual = 2020;
	    
	    int idade = anoAtual - anoNascimento;
	    
	    System.out.print("Digite seu salario: ");
	    float salario = Float.parseFloat( input.nextLine() );
	    
		System.out.print("Meu nome eh " + nome + ".\ncom a idade " + idade + ".\ne com o salario " + salario + ".");
	}
}
