
import javax.swing.JOptionPane;

public class ControlFunc {
    
    Funcionario func = new Funcionario();
    
    public  void Cadastrar(String nm, String end, int rg, int tel){
        func.setNome(nm);
        func.setEndereco(end);
        func.setRg(rg);
        func.setTelefone(tel);
    }
    
    public void Exibir(){
        JOptionPane.showMessageDialog(null, "Nome: "+func.getNome()+
        "\nEndereço: "+func.getEndereco()+
        "\nRG: "+func.getRg()+
        "\nTelefone: "+func.getTelefone());
    }
}
