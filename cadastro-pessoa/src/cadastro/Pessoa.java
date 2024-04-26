package cadastro; // Declaração do pacote

/**
 * Representa uma pessoa com nome, CPF, idade e salário.
 */
public class Pessoa {

    private String nome; // Nome da pessoa
    private String cpf; // CPF da pessoa
    private int idade; // Idade da pessoa
    private double salario; // Salário da pessoa

    /**
     * Constrói um objeto Pessoa vazio.
     */
    public Pessoa() {
    }

    /**
     * Constrói um objeto Pessoa com o nome, CPF, idade e salário especificados.
     *
     * @param nome    o nome da pessoa
     * @param cpf     o CPF da pessoa
     * @param idade   a idade da pessoa
     * @param salario o salário da pessoa
     */
    public Pessoa(String nome, String cpf, int idade, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }

    /**
     * Retorna o nome da pessoa.
     *
     * @return o nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o CPF da pessoa.
     *
     * @return o CPF da pessoa
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Retorna a idade da pessoa.
     *
     * @return a idade da pessoa
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Retorna o salário da pessoa.
     *
     * @return o salário da pessoa
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Define o nome da pessoa.
     *
     * @param nome o nome da pessoa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define o CPF da pessoa.
     *
     * @param cpf o CPF da pessoa
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Define a idade da pessoa.
     *
     * @param idade a idade da pessoa
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Define o salário da pessoa.
     *
     * @param salario o salário da pessoa
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
