package exercicioPOOInterface;

public class Produto implements Comparable{
	String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Object p) {
		if (p.toString().equals(this.getNome()))
			return 1;
		return 0;
	}
	
	public String toString() {
		return nome;
	}

}
