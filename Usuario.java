//Bibliotecas
import java.util.*;
/**
 * Classe concreta que representa um Usuario.
 */
public class Usuario
{
    //Atributos 
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;
    //dataNascimento
    private Emprestimo emprestimos;

    /**
     * Construtor
     */
    public Usuario(int id, String nome, String cpf, String telefone, String email, String endereco, /* data */ Emprestimo emprestimos)
    {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        //data
        this.emprestimos = emprestimos;
    }
    
    //Setters
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }
    
    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    public void setemprestimos(Emprestimo emprestimos) 
    {
        this.emprestimos = emprestimos;
    }

    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }

    public void setTelefone(String tel) 
    {
        this.telefone = tel;
    }
    
    //Getters
    public int getId() 
    {
        return id;
    }
    
    public String getNome() 
    {
        return nome;
    }
    
    public String getCpf() 
    {
        return cpf;
    }
    
    public String getEmail() 
    {
        return email;
    }

    public Emprestimo getEmprestimos()
    {
        return emprestimos;
    }

    public String getEndereco() 
    {
        return endereco;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    //Métodos
}