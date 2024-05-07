package cadastro;

public class Veiculo {
    private String modelo;
    private int ano;
    private double valor;
    
    Veiculo(){};
    
    // Construtor
    public Veiculo(String modelo, int ano, double valor) {
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}