//Bibliotecas
import java.util.*;
/**
 * Classe que representa a categoria de um livro.
 */
public class Categoria{
    //Atributos
    private int id;
    private String nome;
    private List<Genero> listaGeneros;
    /**
     * Construtor que cria um objeto da classe Categoria.
     * 
     * @param id Id da categoria.
     * @param nome Nome da categoria.
     * @param listaGeneros Lista de generos pertencentes à categoria.
     * 
     */
    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
        listaGeneros = new List<Genero>();
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //add.genero

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Genero> getListaGeneros() {
        return listaGeneros;
    }
}
    
    
