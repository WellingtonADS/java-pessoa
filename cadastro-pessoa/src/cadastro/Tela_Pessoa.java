package cadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class Tela_Pessoa implements ActionListener{

    Pessoa pes;
    JFrame tela = new JFrame("Cadastro de Pessoa"); // Cria uma nova janela com o título "Cadastro de Pessoa"
    JPanel painel = new JPanel(); // Cria um novo painel para adicionar os componentes
    
    JLabel lbnome = new JLabel("Nome: "); // Cria um novo rótulo com o texto "Nome: "
    JLabel lbidade = new JLabel("Idade: "); // Cria um novo rótulo com o texto "Idade: "
    JLabel lbcpf= new JLabel("CPF: "); // Cria um novo rótulo com o texto "CPF: "
    JLabel lbsalario= new JLabel("Salario R$: "); // Cria um novo rótulo com o texto "Salario: "
  
    JTextField txtnome = new JTextField(); // Cria um novo campo de texto para o nome
    JTextField txtidade = new JTextField(); // Cria um novo campo de texto para a idade
    JTextField txtcpf = new JTextField(); // Cria um novo campo de texto para o CPF
    JTextField txtsalario = new JTextField(); // Cria um novo campo de texto para o salário
    
    JButton btsalvar = new JButton("Salvar"); // Cria um novo botão com o texto "Salvar"
    
    void criarTela() {
        tela.setSize(400, 400); // Define o tamanho da janela
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o comportamento ao fechar a janela
        painel.setLayout(null); // Define o layout do painel como nulo
        
        lbnome.setBounds(10, 20, 100, 30); // Define a posição e o tamanho do rótulo "Nome: "
        txtnome.setBounds(10, 50, 200, 30); // Define a posição e o tamanho do campo de texto para o nome
        lbidade.setBounds(10, 80, 100, 30); // Define a posição e o tamanho do rótulo "Idade: "
        txtidade.setBounds(10, 110, 50, 30); // Define a posição e o tamanho do campo de texto para a idade
        lbcpf.setBounds(10, 140, 100, 30); // Define a posição e o tamanho do rótulo "CPF: "
        txtcpf.setBounds(10, 170, 200, 30); // Define a posição e o tamanho do campo de texto para o CPF
        lbsalario.setBounds(10, 200, 100, 30); // Define a posição e o tamanho do rótulo "Salario: "
        txtsalario.setBounds(10, 230, 250, 30); // Define a posição e o tamanho do campo de texto para o salário
        
        btsalvar.setBounds(40, 280, 100, 30); // Define a posição e o tamanho do botão "Salvar"
        
        painel.add(lbnome); // Adiciona o rótulo "Nome: " ao painel
        painel.add(txtnome); // Adiciona o campo de texto para o nome ao painel
        painel.add(lbidade); // Adiciona o rótulo "Idade: " ao painel
        painel.add(txtidade); // Adiciona o campo de texto para a idade ao painel
        painel.add(lbcpf); // Adiciona o rótulo "CPF: " ao painel
        painel.add(txtcpf); // Adiciona o campo de texto para o CPF ao painel
        painel.add(lbsalario); // Adiciona o rótulo "Salario: " ao painel
        painel.add(txtsalario); // Adiciona o campo de texto para o salário ao painel
        painel.add(btsalvar); // Adiciona o botão "Salvar" ao painel
        btsalvar.addActionListener(this); // Adiciona um ouvinte de ação ao botão
        
        tela.getContentPane().add(painel); // Adiciona o painel à janela
        tela.setVisible(true); // Torna a janela visível
    }
    
    public static void main(String[] args) {
        Tela_Pessoa tp = new Tela_Pessoa();
        tp.criarTela();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btsalvar) {
            pes = new Pessoa();
            pes.setNome(txtnome.getText());
            pes.setIdade(Integer.parseInt(txtidade.getText()));
            pes.setCpf(txtcpf.getText());
            pes.setSalario(Double.parseDouble(txtsalario.getText()));
            
            JOptionPane.showMessageDialog(null, "Nome: " + pes.getNome() + "\nIdade: " + pes.getIdade() + "\nCPF: " + pes.getCpf() + "\nSalario: " + pes.getSalario());

        }
    }
}
