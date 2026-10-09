import model.*;

public class Ex6e7 {
    public static void main(String[] args) {

        testeLivro();
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        testeFuncionario();

    }

    public static void testeLivro() {
        Livro livro1 = new Livro("Penhor dos anéis","Luciano Hulk",1500);

        System.out.println("Livro: " + livro1.titulo + " Autor: " + livro1.autor + " Ano de publicação: " + livro1.anoPublicacao);

        livro1.titulo = "Senhor dos anéis";
        livro1.autor = "J.R.R Tolkien";
        livro1.anoPublicacao = 1000;

        System.out.println("Livro: " + livro1.titulo + " Autor: " + livro1.autor + " Ano de publicação: " + livro1.anoPublicacao);

    }

    public static void testeFuncionario() {
        Funcionario ale = new Funcionario("Alessandro",67,"Atendente");

        System.out.println("Nome: " + ale.getNome() + " Salário: " + ale.getSalario() + " Cargo: " + ale.getCargo());

        ale.setNome("Ale777");
        ale.setSalario(601);
        ale.setCargo("Repositor");

        System.out.println("Nome: " + ale.getNome() + " Salário: " + ale.getSalario() + " Cargo: " + ale.getCargo());
    }

}