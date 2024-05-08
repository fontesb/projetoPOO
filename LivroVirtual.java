//Bibliotecas
import java.util.*;
/**
 * Classe concreta que representa um livro virtual.
 */
public class LivroVirtual extends Livro
{
    //Atributos

    /**
     * Construtor para criar um objeto Livro Virtual utilizando o construtor da superclasse Livro.
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
     * 
     * 
     */
    public LivroVirtual(int anoLancamento, int qtdEstoque, int isbn, int numPaginas, String edicao, String titulo, String autor, String idioma, String sinopse, Categoria categoria, Genero genero, String dimensoes, String capa)
    {
        super(anoLancamento, qtdEstoque, isbn, numPaginas, edicao, titulo, autor, sinopse, categoria, genero);
        //
    }

}