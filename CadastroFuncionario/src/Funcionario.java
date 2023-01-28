public class Funcionario {
    private String nome;
    private String endereco;
    private int rg;
    private int telefone;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nm){
        this.nome=nm;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public void setEndereco(String end){
        this.endereco=end;
    }
    
    public int getRg(){
        return this.rg;
    }
    
    public void setRg(int rg){
        this.rg=rg;
    }
    
    public int getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(int tel){
        this.telefone=tel;
    }
}
