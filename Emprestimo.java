//Bibliotecas
import java.util.*;
/**
 * Classe concreta que representa uma Reserva.
 */
public class Emprestimo
{
    //Atributos
    private int id;
    //dataEmprestimo
    //dataDevolucao
    private List<Livro> listaLivros;

    /**
     * Construtor
     */
    public Emprestimo(int id /* datas */)
    {
        this.id = id;
        listaLivros = new List<Livro>();
    }

    //Setters
    public void setId(int id)
    {
        this.id = id;
    }

     //add.livro

    //Getters 
    public int getId()
    {
        return id;
    }

    public List<Livro> getListaLivros()
    {
        return listaLivros;
    }

    //Métodos
    public void emprestar()
    {
        //
    }

    public void renovar()
    {
        //
    }

}