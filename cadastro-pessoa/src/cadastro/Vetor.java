package cadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>(); // Initialize the veiculos ArrayList
        Scanner scanner = new Scanner(System.in); // Replace "into" with "scanner"
        Veiculo veiculo;

        Integer b;

        // Your code here

        scanner.close(); // Close the scanner object to prevent resource leak

        do {
            System.out.println("Digite o modelo do veículo: ");
            String modelo = scanner.nextLine();
            System.out.println("Digite o ano do veículo: ");
            int ano = scanner.nextInt();
            System.out.println("Digite o valor do veículo: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            veiculo = new Veiculo(modelo, ano, valor);
            veiculos.add(veiculo);

            System.out.println("Deseja adicionar outro veículo? (1 - Sim / 0 - Não)");
            b = scanner.nextInt();
            scanner.nextLine();
        } while (b != 0);

        for (Veiculo v : veiculos) {
            System.out.println("Modelo: " + v.getModelo());
            System.out.println("Ano: " + v.getAno());
            System.out.println("Valor: " + v.getValor());
            System.out.println("-------------------------------");
        }
    }
}