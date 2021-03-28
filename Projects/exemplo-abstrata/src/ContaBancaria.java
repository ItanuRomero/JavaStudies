
public abstract class ContaBancaria implements Saque{
	double saldo;
	String cpf;
	
	ContaBancaria(double saldo, String cpf){
		this.saldo=saldo;
		this.cpf=cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void deposito(double valor) {
		this.saldo=this.saldo+valor;
	}
}





