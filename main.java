import java.util.Scanner;

public class main{

    public static void main(String[] args){

        short ano = 2003;

        LivroDeBiblioteca L1 = new LivroDeBiblioteca("Introdução a POO usando JAVA", "Prof. Rafael Santos", "Campus/SBC", ano, "g11p17");

        if(!L1.emprestado){
            L1.Empresta();
            System.out.println("O livro " + L1.getTitulo() + " foi emprestado com sucesso!\nDevera ser devolvido em " + L1.diasEmprestimo + " dias.");
        }else {
            System.out.println("O livro nao podera ser emprestado");
        }

    }
}