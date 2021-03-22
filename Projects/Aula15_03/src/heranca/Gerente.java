package heranca;

public class Gerente extends Funcionario {
	String setor;

	public Gerente(String nome, double salario, String cpf, String setor) {
		super(nome, salario, cpf);
		this.setor = setor;
	}

	public void getPromocao() {
		this.salario=this.salario*1.15;
	}	
	
}


