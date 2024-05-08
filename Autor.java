//Bibliotecas
import java.util.*;
/**
 * Classe que representa o gênero de um livro.
 */
public class Autor
{
    //Atributos
    private String nome;
    //dataNasc
    private String pais;
    /**
     * Construtor que cria um objeto da classe Genero.
     * 
     * @param nome Nome do autor.
     * data
     * @param pais País de origem do autor.
     * 
     */
    public Autor(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    // Setters
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setPais(String pais) 
    {
        this.pais = pais;
    }

    //Getters
    public String getNome() 
    {
        return nome;
    }

    public String getPais() 
    {
        return pais;
    }
}