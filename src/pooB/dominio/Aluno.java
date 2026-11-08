package pooB.dominio;

public class Aluno {
    private String nomeAluno;
    private Sala sala;

    public void imprimir(){
        System.out.println("Nome do Aluno: "+ nomeAluno);
        if (sala != null){
            System.out.println("Sala: "+ sala.getNumero());
        }
    }

    public Aluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }

    public void setNomeAluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }

    public String getNomeAluno(){
        return this.nomeAluno;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
