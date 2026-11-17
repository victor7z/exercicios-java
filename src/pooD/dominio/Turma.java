package pooD.dominio;

public class Turma {
    private String nome;
    private Aluno[] alunos;

    public void exibirDados(){
        System.out.println("Nome da Turma: "+ this.nome);
        if (alunos != null){
            for (Aluno aluno : alunos){
                System.out.println("Aluno: "+ aluno.getNome());
            }
        } else {
            System.out.println("Nenhum Aluno Cadastrado!");
        }
    }

    public Turma(String nome){
        this.nome = nome;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
