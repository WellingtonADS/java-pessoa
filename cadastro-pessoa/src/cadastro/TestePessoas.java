package cadastro; // Pacote onde a classe TestePessoas está localizada

import java.util.Scanner; // Importação da classe Scanner do pacote java.util

public class TestePessoas { // Declaração da classe TestePessoas
    public static void main(String[] args) { // Método principal da classe

        Scanner scanner = new Scanner(System.in); // Criação de um objeto Scanner para leitura de entrada do usuário

        Pessoa p1 = new Pessoa(); // Criação de um objeto da classe Pessoa

        System.out.println("Digite o nome da primeira pessoa: "); // Exibe uma mensagem para o usuário
        p1.setNome(scanner.nextLine()); // Lê o nome da primeira pessoa e atribui ao objeto p1
        System.out.println("Digite o CPF da primeira pessoa: "); // Exibe uma mensagem para o usuário
        p1.setCpf(scanner.nextLine()); // Lê o CPF da primeira pessoa e atribui ao objeto p1
        System.out.println("Digite a idade da primeira pessoa: "); // Exibe uma mensagem para o usuário
        p1.setIdade(scanner.nextInt()); // Lê a idade da primeira pessoa e atribui ao objeto p1
        System.out.println("Digite o salário da primeira pessoa: "); // Exibe uma mensagem para o usuário
        p1.setSalario(scanner.nextDouble()); // Lê o salário da primeira pessoa e atribui ao objeto p1

        System.out.println("Nome da primeira pessoa: " + p1.getNome()); // Exibe o nome da primeira pessoa
        System.out.println("CPF da primeira pessoa: " + p1.getCpf()); // Exibe o CPF da primeira pessoa
        System.out.println("Idade da primeira pessoa: " + p1.getIdade()); // Exibe a idade da primeira pessoa
        System.out.println("Salário da primeira pessoa: " + p1.getSalario()); // Exibe o salário da primeira pessoa

        scanner.close(); // Fecha o objeto Scanner
    }
}
