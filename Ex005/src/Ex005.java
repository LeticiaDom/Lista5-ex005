import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double custo = sc.nextDouble();
        System.out.println("Digite a porcentagem do imposto do produto: ");
        double porcentagem = sc.nextDouble();
        sc.close(); 
        double total = somaImposto(porcentagem, custo); 
        System.out.println("O valor total do produto com adição de imposto é: " + total);

    }
    public static double somaImposto(double taxaImposto, double custo) {
        double imposto = taxaImposto/100;  
        return custo + (custo * imposto); 
    }
}

