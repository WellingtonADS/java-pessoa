package cadastro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  A classe Vetor representa um programa que permite cadastrar e exibir informações de veículos.
 * 
 * O programa solicita ao usuário o modelo, ano e valor de cada veículo a ser cadastrado.
 * Os veículos cadastrados são armazenados em um ArrayList e, em seguida, são exibidosna tela.
 */
public class Vetor {

    public static void main(String[] args) {
        
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>(); 
        Scanner scanner = new Scanner(System.in); 
        Veiculo veiculo;

        Integer b;

        scanner.close();

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