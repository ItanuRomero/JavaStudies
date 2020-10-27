import java.util.Scanner;

public class Exer03Lista01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String produto;
        double valor, valorVista, valorParcela;
        // adiciona nome produto
        System.out.println("Nome do Produto:");    
        produto = sc.nextLine();
        // adiciona valor
        System.out.println("Valor do Produto:");    
        valor = Double.parseDouble(sc.nextLine());
        // realiza as operacoes
        valorVista = valor - (valor * 0.1);
        valorParcela = (valor + (valor * 0.05))/3;
        // mostra os dados na tela
        System.out.println("\n\nNome do Produto: " + produto);    
        System.out.println("Valor à vista: " + valorVista);    
        System.out.println("Valor de cada uma das 3 parcelas: " + valorParcela);    
    }
}
