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
     */
    public LivroVirtual(int anoLancamento, int qtdEstoque, int id, int numPaginas, String edicao, String titulo, String autor, String sinopse, Categoria categoria, Genero genero, String dimensoes, String capa)
    {
        super(anoLancamento, qtdEstoque, id, numPaginas, edicao, titulo, autor, sinopse, categoria, genero);
        //
    }

}