//Bibliotecas
import java.util.*;
/**
 * Classe abstrata que representa um livro.
 */
public abstract class Livro {
    //Atributos
    private int anoLancamento;
    private int qtdEstoque;
    private int id;
    private int numPaginas;
    private String edicao;
    private String titulo;
    private String autor;
    private String sinopse;
    private Categoria categoria;
    private Genero genero;

    /**
     * Construtor para criar um objeto Livro com os atributos especificados.
     *
     * @param anoLancamento Ano de lançamento do livro.
     * @param qtdEstoque Quantidade disponível em estoque do livro.
     * @param id Identificador único do livro.
     * @param numPaginas Número de páginas do livro.
     * @param edicao Edição do livro.
     * @param titulo Título do livro.
     * @param autor Autor do livro.
     * @param sinopse Sinopse do livro.
     * @param categoria Categoria do livro.
     * @param genero Gênero do livro.
     */
    public Livro(int anoLancamento, int qtdEstoque, int id, int numPaginas, String edicao, String titulo, String autor, String sinopse, Categoria categoria, Genero genero) 
    {
        this.anoLancamento = anoLancamento;
        this.qtdEstoque = qtdEstoque;
        this.id = id;
        this.numPaginas = numPaginas;
        this.edicao = edicao;
        this.titulo = titulo;
        this.autor = autor;
        this.sinopse = sinopse;
        this.categoria = categoria;
        this.genero = genero;
    }

    //Setters
    public void setAnoLancamento(int anoLancamento) 
    {
        this.anoLancamento = anoLancamento;
    }

    public void setQtdEstoque(int qtdEstoque) 
    {
        this.qtdEstoque = qtdEstoque;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public void setNumPaginas(int numPaginas) 
    {
        this.numPaginas = numPaginas;
    }

    public void setEdicao(String edicao) 
    {
        this.edicao = edicao;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public void setAutor(String autor) 
    {
        this.autor = autor;
    }

    public void setSinopse(String sinopse) 
    {
        this.sinopse = sinopse;
    }

    public void setCategoria(Categoria categoria) 
    {
        this.categoria = categoria;
    }

    public void setGenero(Genero genero)
    {
        this.genero = genero;
    }

    //Getters
    public int getAnoLancamento() 
    {
        return anoLancamento;
    }

    public int getQtdEstoque() 
    {
        return qtdEstoque;
    }

    public int getId() 
    {
        return id;
    }

    public int getNumPaginas() 
    {
        return numPaginas;
    }

    public String getEdicao() 
    {
        return edicao;
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public String getAutor() 
    {
        return autor;
    }

    public String getSinopse() 
    {
        return sinopse;
    }

    public Categoria getCategoria() 
    {
        return categoria;
    }

    public Genero getGenero()
    {
        return genero;
    }

    //Métodos
}

