package heranca;

public class Principal {

	public static void main(String[] args) {
				
		Funcionario funcionarios[] = new Funcionario[4];
				
		funcionarios[0] = new Programador("Ana",3000.00, "12122","Backend");
		funcionarios[1] = new Gerente("Joao",2000.00, "23322","RH");
		funcionarios[2] = new Secretaria("Maria",4000.00, "14322", "Joao");
		funcionarios[3] = new Diretor("Pedro", 10000.00, "342342", "Administrativa");
		
		for(Funcionario f: funcionarios) {
			f.getPromocao();
			System.out.println(f.getSalario());
		}
		
	}

}
