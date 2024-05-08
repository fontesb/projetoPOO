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
    private List<Livro> listaLivros; //não sei se usa list ou arraylist ou outro tipo
    /**
     * Construtor que cria um objeto da classe Genero.
     * 
     * @param id Id da categoria.
     * @param nome Nome da categoria.
     * @param listaLivros Lista de livros pertencentes ao genero.
     * 
     */
    public Genero(int id, String nome) {
        this.id = id;
        this.nome = nome;
        listaGeneros = new List<Livro>();
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //add.livro

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    
}