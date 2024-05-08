//Bibliotecas
import java.util.*;
/**
 * Classe abstrata que representa um livro.
 */
public abstract class Livro {
    //Atributos
    private int anoLancamento;
    private int qtdEstoque;
    private int isbn;
    private int numPaginas;
    private String edicao;
    private String titulo;
    private String autor; //mudar
    private String idioma;
    private String sinopse;
    private Editora editora;
    private Categoria categoria;
    private Genero genero;

    /**
     * Construtor para criar um objeto Livro com os atributos especificados.
     *
     * @param anoLancamento Ano de lançamento do livro.
     * @param qtdEstoque Quantidade disponível em estoque do livro.
     * @param isbn Identificador único do livro.
     * @param numPaginas Número de páginas do livro.
     * @param edicao Edição do livro.
     * @param titulo Título do livro.
     * @param autor Autor do livro.
     * @param idioma Idioma do livro.
     * @param sinopse Sinopse do livro.
     * @param categoria Categoria do livro.
     * @param genero Gênero do livro.
     */
    public Livro(int anoLancamento, int qtdEstoque, int isbn, int numPaginas, String edicao, String titulo, String autor, String idioma, String sinopse,Editora editora, Categoria categoria, Genero genero) 
    {
        this.anoLancamento = anoLancamento;
        this.qtdEstoque = qtdEstoque;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.edicao = edicao;
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.sinopse = sinopse;
        this.editora = editora;
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

    public void setIsbn(int isbn) 
    {
        this.isbn = isbn;
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

    public void setIdioma(String idioma)
    {
        this.idioma = idioma;
    }

    public void setSinopse(String sinopse) 
    {
        this.sinopse = sinopse;
    }

    public void setEditora(Editora editora) 
    {
        this.editora = editora;
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

    public int getIsbn() 
    {
        return isbn;
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

    public String getIdioma()
    {
        return idioma;
    }

    public String getSinopse() 
    {
        return sinopse;
    }

    public Editora getEditora() 
    {
        return editora;
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

