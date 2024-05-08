//Bibliotecas
import java.util.*;
/**
 * Classe que representa o gênero de um livro.
 */
public class Genero
{
    //Atributos
    private int id;
    private String nome;
    private String pais;
    private String endereco;
    private String cnpj;
    private String email;
    private String telefone;
    
    /**
     * Construtor que cria um objeto da classe Genero.
     * 
     * @param id Id da editora.
     * @param nome Nome da editora.
     * @param pais País no qual reside a editora.
     * @param endereco Endereço da editora.
     * @param cnpj CNPJ da editora.
     * @param email E-mail da editora.
     * @param telefone Telefone da editora. 
     */
    public Genero(int id, String nome, String pais, String endereco, String cnpj, String email, String telefone) 
    {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
    }

    // Setters
    public void setId(int id) 
    {
        this.id = id;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setPais(String pais) 
    {
        this.pais = pais;
    }

    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }

    public void setCnpj(String cnpj) 
    {
        this.cnpj = cnpj;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
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

    public String getPais() 
    {
        return pais;
    }

    public String getEndereco() 
    {
        return endereco;
    }

    public String getCnpj() 
    {
        return cnpj;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getTelefone()
    {
        return telefone;
    }


}
