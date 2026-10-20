package exercicios;

public class Biblioteca {
    public static void main(String[] args) {
        String [][] biblioteca = {
                {"Dom Casmurro", "O Cortiço"},
                {"Java para Iniciantes", "Logica de Programação", "Banco de Dados"},
                {"O Hobbit"}
        };

        for (String[] livros : biblioteca){
            System.out.println("Categoria:");
            for (String livro : livros){
                System.out.println("Livro: "+livro);
            }
        }
    }
}
