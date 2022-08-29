import java.util.*;

public interface ItemDeBiblioteca{

    public int diasEmprestimo = 7;

    public boolean getEmprestado();

    public String getLocalizacao();

    public void Empresta();

    public void Devolve();
    
}