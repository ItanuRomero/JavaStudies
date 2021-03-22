package heranca;

public class Secretaria extends Funcionario {
	String lider;
		
	public String getLider() {
		return lider;
	}

	public void setLider(String lider) {
		this.lider = lider;
	}

	public Secretaria(String nome, double salario, String cpf, String lider) {
		super(nome, salario, cpf);
		this.lider=lider;
	}

}
