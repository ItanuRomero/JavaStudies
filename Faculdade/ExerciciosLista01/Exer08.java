import java.util.Scanner;

public class Exer08Lista01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p1, p2, t1, t2, le, se, notaFinal;
        // entra com dados (deixo separado para melhor visualizacao)
        System.out.println("Sua nota na P1:");    
        p1 = Double.parseDouble(sc.nextLine());

        System.out.println("Sua nota na T1:");    
        t1 = Double.parseDouble(sc.nextLine());
        
        System.out.println("Sua nota na LE:");    
        le = Double.parseDouble(sc.nextLine());
        
        System.out.println("Sua nota na P2:");    
        p2 = Double.parseDouble(sc.nextLine());
        
        System.out.println("Sua nota na T2:");    
        t2 = Double.parseDouble(sc.nextLine());
        
        System.out.println("Sua nota na SE:");    
        se = Double.parseDouble(sc.nextLine());
        // realiza o calculo
        notaFinal = (p1 * 0.3 + t1 * 0.15 + le * 0.05) + (p2 * 0.25 + t2 * 0.175 + se * 0.075);
        // mostra resultado
        System.out.println("\nSua nota final é: " + notaFinal);
    }
}
