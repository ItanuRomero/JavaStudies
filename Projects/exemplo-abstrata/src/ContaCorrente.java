
public class ContaCorrente extends ContaBancaria {
	double taxaManutencao;
	double limite;
	double jurosLimite;
	
	public ContaCorrente(double saldo, String cpf, double taxaManutencao, double limite, double jurosLimite) {
		super(saldo, cpf);
		this.taxaManutencao=taxaManutencao;
		this.limite=limite;
		this.jurosLimite=jurosLimite;
		// TODO Stub de construtor gerado automaticamente
	}

	@Override
	public boolean saque(double valor) {		
		if(valor <= saldo + limite) {
			this.saldo=this.saldo-valor;
			return true;
		}
		return false;
	}

	public double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getJurosLimite() {
		return jurosLimite;
	}

	public void setJurosLimite(double jurosLimite) {
		this.jurosLimite = jurosLimite;
	}

	
}
