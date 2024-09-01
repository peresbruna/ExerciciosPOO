package Exercicio2;
public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int numeroPaginas, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponibilidade = disponibilidade;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Disponibilidade: " + (disponibilidade ? "Disponível" : "Indisponível"));
    }

    public void reservar() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("O livro '" + titulo + "' foi reservado");
        } else {
            System.out.println("O livro '" + titulo + "' já está reservado");
        }
    }

    public void devolver() {
        if (!disponibilidade) {
            disponibilidade = true;
            System.out.println("O livro '" + titulo + "' foi devolvido com sucesso");
        } else {
            System.out.println("O livro '" + titulo + "' já está disponível");
        }
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
