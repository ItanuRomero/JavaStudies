import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ContaBancaria banco[] = new ContaBancaria[5];
		Scanner entrada = new Scanner (System.in);
		int tipoConta;
		String cpf;
		double saldo, taxaManutencao, limite, jurosLimite, taxaJuros, taxaSaque;
		
	
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("1. Conta corrente \n2. Conta Poupança \n"
					+ "Qual o tipo de conta? ");
			tipoConta = entrada.nextInt();
			
			switch(tipoConta) {
				case 1:
					System.out.println("Informe o cpf do cliente: ");
					cpf=entrada.next();
					
					System.out.println("Informe o saldo inicial do cliente: ");
					saldo=entrada.nextDouble();
										
					System.out.println("Informe a taxa de manutenção do cliente: ");
					taxaManutencao=entrada.nextDouble();
					
					System.out.println("Informe o limite do cliente: ");
					limite=entrada.nextDouble();
					
					System.out.println("Informe a taxa de juros do limite do cliente: ");
					jurosLimite=entrada.nextDouble();
					
					banco[i] = new ContaCorrente(saldo, cpf, taxaManutencao, limite, jurosLimite);
					break;
				case 2:
					System.out.println("Informe o cpf do cliente: ");
					cpf=entrada.next();
					
					System.out.println("Informe o saldo inicial do cliente: ");
					saldo=entrada.nextDouble();
										
					System.out.println("Informe a taxa de juros da conta: ");
					taxaJuros=entrada.nextDouble();
					
					System.out.println("Informe a taxa de saque da conta: ");
					taxaSaque=entrada.nextDouble();
					
					banco[i] = new ContaPoupanca(saldo, cpf, taxaJuros, taxaSaque);
					break;
					
				default:
					System.out.println("Tipo de conta inválida!");
			}
			
		}
		
		double valor;
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println("Informe o valor do saque: ");
			valor = entrada.nextDouble();
	
			if(banco[i].saque(valor)) {
				System.out.println("Saque realizado com sucesso da conta do cliente: "+ banco[i].getCpf());
				System.out.println("Novo saldo: "+banco[i].getSaldo());
			}
			else {
				System.out.println("Saque não realizado na conta do cliente: "+ banco[i].getCpf());
			}
			
			
		}
		
		
		
	}

}
