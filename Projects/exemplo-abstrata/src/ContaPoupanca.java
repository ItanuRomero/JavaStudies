
public class ContaPoupanca extends ContaBancaria {
	double taxaJuros;
	int numSaques;
	double taxaSaque;
	
	public ContaPoupanca(double saldo, String cpf, double taxaJuros, double taxaSaque) {
		super(saldo, cpf);
		numSaques=0;
		// TODO Stub de construtor gerado automaticamente
	}
	
	@Override
	public boolean saque(double valor) {
		if(valor <= saldo) {
			if(numSaques >= 4) {
				this.saldo=this.saldo-valor-taxaSaque;
			}else {
				this.saldo=this.saldo-valor;
			}
			return true;
		}
		return false;
		
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	

}
