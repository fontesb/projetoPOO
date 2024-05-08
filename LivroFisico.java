//Bibliotecas
import java.util.*;
/**
 * Classe concreta que representa um livro físico.
 */
public class LivroFisico extends Livro
{
    //Atributos
    private String dimensoes;
    private String capa;

    /**
     * Construtor para criar um objeto Livro Físico utilizando o construtor da superclasse Livro.
     */
    public LivroFisico(int anoLancamento, int qtdEstoque, int id, int numPaginas, String edicao, String titulo, String autor, String sinopse, Categoria categoria, Genero genero, String dimensoes, String capa)
    {
        super(anoLancamento, qtdEstoque, id, numPaginas, edicao, titulo, autor, sinopse, categoria, genero);
        this.dimensoes = dimensoes;
        this.capa = capa;
    }
}