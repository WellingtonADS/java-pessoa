package cadastro;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Tela_Veiculo {

    Veiculo vei;
    JFrame tela = new JFrame("Cadastro de Veiculo");
    JPanel painel = new JPanel();
    JLabel lbmodelo = new JLabel("Modelo: ");
    JLabel lbano= new JLabel("Ano: ");
    JLabel lbvalor= new JLabel("Valor: ");
    JTextField txtmodelo = new JTextField();
    JTextField txtano = new JTextField();
    JTextField txtvalor = new JTextField();
    JButton btsalvar = new JButton("Salvar");
    JButton bbusca = new JButton("Buscar");
    JButton blistar = new JButton("Listar");
    JButton bexcluir = new JButton("Excluir");
    void criarTela() {
        tela.setSize(400, 400);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setLayout(null);
        lbmodelo.setBounds(10, 20, 100, 30);
        txtmodelo.setBounds(10, 50, 200, 30);
        lbano.setBounds(10, 80, 100, 30);
        txtano.setBounds(10, 110, 50, 30);
        lbvalor.setBounds(10, 140, 100, 30);
        txtvalor.setBounds(10, 170, 250, 30);
        btsalvar.setBounds(40, 220, 100, 30);
        bbusca.setBounds(150, 220, 100, 30);
        blistar.setBounds(40, 260, 100, 30);
        bexcluir.setBounds(150, 260, 100, 30);
        painel.add(lbmodelo);
        painel.add(txtmodelo);
        painel.add(lbano);
        painel.add(txtano);
        painel.add(lbvalor);
        painel.add(txtvalor);
        painel.add(btsalvar);
        painel.add(bbusca);
        painel.add(blistar);
        painel.add(bexcluir);
        tela.getContentPane().add(painel);
        tela.setVisible(true);
    }
    
    public static void main(String[] args) {
        Tela_Veiculo telaVeiculo = new Tela_Veiculo();
        telaVeiculo.criarTela();
    }
}

