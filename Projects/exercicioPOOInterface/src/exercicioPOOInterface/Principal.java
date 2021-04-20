//1. Crie uma hierarquia de classes de domínio para uma loja que venda livros, CDs e DVDs. Sobrescreva o método toString() para que imprima: 
/*
Para livros: nome, preço e autor; 
Para CDs: nome, preço e número de faixas; 
Para DVDs: nome, preço e duração. Evite ao máximo repetição de código utilizando a palavra super no construtor e no método sobrescrito. 
Em seguida, crie uma classe Loja com o método main() que adicione 5 produtos diferentes (a sua escolha) a um vetor e, por fim, imprima o conteúdo do vetor.

2. Modifique o código do programa anterior, da seguinte forma: 

a) Adicione um atributo que represente o código de barras do produto (é um valor obrigatório e, portanto, deve ser pedido no construtor); 

b) Sobrescreva o método equals() retornando true se dois produtos possuem o mesmo código de barras; 

c) Na classe Loja, implemente um simples procedimento de busca que, dado um produto e um vetor de produtos, indique em que posição do vetor se encontra o produto especificado ou imprima que o mesmo não foi encontrado.

3. Ainda modificando o código do programa anterior, faça com que Produto implemente a interface Comparable, e implemente a comparação por nome. Ao final do método Loja.main(), ordene o vetor utilizando o método java.util.Arrays.sort() e imprima-o novamente. Depois altere a implementação da comparação para ordenar por preço e verifique o resultado.
*/
package exercicioPOOInterface;

public class Principal {

	public static void main(String[] args) {
		Produto p1 = new Produto(), p2 = new Produto();
		p1.setNome("carro");
		p2.setNome("moto");
			
		if(p1.compareTo(p2)==1){
			System.out.println("São iguais!");
		}else {
			System.out.println("São diferentes!");
		}

	}

}
