package cadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * A classe Tela_Veiculo representa um programa que permite cadastrar e exibir informações de veículos.
 * 
 * O programa solicita ao usuário o modelo, ano e valor de cada veículo a ser cadastrado.
 * Os veículos cadastrados são armazenados em um ArrayList e, em seguida, são exibidos na tela.
 */

public class Tela_Veiculo implements ActionListener{

    Veiculo veiculo;
    JFrame tela = new JFrame("Cadastro de Veiculos");
    JPanel painel = new JPanel();
    
    JLabel lbmodelo = new JLabel("Modelo: ");
    JLabel lbano = new JLabel("Ano: ");
    JLabel lbvalor= new JLabel("Valor: ");
    
    JTextField txtmodelo = new JTextField();
    JTextField txtano = new JTextField();
    JTextField txtvalor = new JTextField();
    
    JButton btsalvar = new JButton("Salvar");
    JButton btalterar = new JButton("Alterar");
    JButton btlistar = new JButton("Listar");
    JButton btsexcluir = new JButton("Excluir");
    
    void criarTela() {
        
        JLabel lbmodelo = new JLabel("Modelo: "); // Declare and initialize the variable lbmodelo
        lbmodelo.setBounds(10, 20, 100, 30);

        JLabel lbvalor = new JLabel("Valor: "); // Declare and initialize the variable lbvalor
        lbvalor.setBounds(10, 100, 100, 30); // Set the bounds for lbvalor

        JLabel lbano = new JLabel("Ano: "); // Declare and initialize the variable lbano
        lbano.setBounds(10, 60, 100, 30); // Set the bounds for lbano

        JTextField txtmodelo = new JTextField(); // Declare and initialize the variable txtmodelo
        txtmodelo.setBounds(120, 20, 200, 30); // Set the bounds for txtmodelo

        JTextField txtano = new JTextField(); // Declare and initialize the variable txtano
        txtano.setBounds(120, 60, 200, 30); // Set the bounds for txtano

        JTextField txtvalor = new JTextField(); // Declare and initialize the variable txtvalor
        txtvalor.setBounds(120, 100, 200, 30); // Set the bounds for txtvalor

        JButton btsalvar = new JButton("Salvar"); // Declare and initialize the variable btsalvar
        btsalvar.setBounds(10, 140, 100, 30); // Set the bounds for btsalvar

        JButton btalterar = new JButton("Alterar"); // Declare and initialize the variable btalterar
        btalterar.setBounds(120, 140, 100, 30); // Set the bounds for btalterar

        JButton btlistar = new JButton("Listar"); // Declare and initialize the variable btlistar
        btlistar.setBounds(230, 140, 100, 30); // Set the bounds for btlistar

        JButton btexcluir = new JButton("Excluir"); // Declare and initialize the variable btexcluir
        btexcluir.setBounds(340, 140, 100, 30); // Set the bounds for btexcluir

        tela.setSize(500, 300);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);

        painel.setLayout(null);

              
        painel.add(lbmodelo);
        painel.add(txtmodelo);
        painel.add(lbano);
        painel.add(txtano);
        painel.add(lbvalor);
        painel.add(txtvalor);
        painel.add(btsalvar);
        painel.add(btalterar);
        painel.add(btlistar);
        painel.add(btexcluir);
        btsalvar.addActionListener(this);
        btalterar.addActionListener(this);
        btlistar.addActionListener(this);
        btexcluir.addActionListener(this);

        tela.getContentPane().add(painel);
        tela.setVisible(true);
    }
    
    public static void main(String[] args) {
        Tela_Veiculo tv = new Tela_Veiculo();
        tv.criarTela();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btsalvar) {
            veiculo = new Veiculo();
            veiculo.setModelo(txtmodelo.getText());
            veiculo.setAno(Integer.parseInt(txtano.getText()));
            veiculo.setValor(Double.parseDouble(txtvalor.getText()));
            
            JOptionPane.showMessageDialog(null, "Modelo: " + veiculo.getModelo() + "\nAno: " + veiculo.getAno() + "\nValor: " + veiculo.getValor());

        }
    }
}
