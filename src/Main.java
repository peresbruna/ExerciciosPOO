import Exercicio2.Livro;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Nicolas");
        pessoa1.setEmail("nicolas@gmail.com");

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Email: " + pessoa1.getEmail());

        pessoa1.logar();

        Professor prof1 = new Professor("Alberto","alberto@gmail.com" );
        System.out.println("O professor é " + prof1.getNome());


        Turma estruturaDados =
                new Turma("Estrutura de Dados",
                        prof1,
                        30);

        Aluno a1 = new Aluno();
        a1.setNome("Ana");
        Aluno a2 = new Aluno();
        a2.setNome("Patrícia");
        estruturaDados.inserirAluno(a1);
        estruturaDados.inserirAluno(a2);
        estruturaDados.listarAlunos();
        System.out.println("---------------------------");
        Livro livro1 = new Livro("A culpa é das Estrelas", "John Green",250, true);
        Livro livro2 = new Livro("Teorema de Katherine", "John Green",280, true);

        System.out.println("Detalhes do livro 1:");
        livro1.exibirDetalhes();
        System.out.println();

        System.out.println("Detalhes do livro 2:");
        livro2.exibirDetalhes();
        System.out.println();

        System.out.println("Reservando livro 1:");
        livro1.reservar();
        System.out.println();

        System.out.println("Tentando reservar o livro 1 novamente");
        livro1.reservar();
        System.out.println();

        System.out.println("Detalhes do livro 1 após reserva");
        livro1.exibirDetalhes();
        System.out.println();

        System.out.println("Devolvendo livro 1");
        livro1.devolver();
        System.out.println();

        System.out.println("Detalhes do livro 1 após devolução");
        livro1.exibirDetalhes();
        System.out.println();

        System.out.println("Disponibilidade do livro 2");
        System.out.println("Está disponível?" + (livro2.isDisponivel() ? " Sim " : " Não "));







    }
}

