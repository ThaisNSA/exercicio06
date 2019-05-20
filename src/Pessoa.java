public class Pessoa {
    private String nome;
    private String endereço;
    private String telefone;
    
    public Pessoa(String Nome,String Endereco,String Telefone){
        setNome(Nome);
        setEndereco(Endereco);
        setTelefone(Telefone);
    }
    
    
    void setNome(String Nome){ 
        this.nome=Nome;
    }
    void setEndereco(String Endereco){ 
        this.endereço=Endereco;
    }
    void setTelefone(String Telefone){ 
        this.telefone=Telefone;
    }
    
    String getNome(){ 
        return this.nome;
    }
    String getEndereco(){ 
        return this.endereço;
    }
    String getTelefone(){ 
        return this.telefone;
    }
}
