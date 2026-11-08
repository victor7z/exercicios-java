package poo2.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprime(){
        System.out.println("Nome da Escola:"+this.nome);
        if (professores != null){
            for (Professor professor : professores){
                System.out.println("Professores: "+ professor.getNome());
            }
        }

    }

    public Escola(String nome){
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores){
        this.nome = nome;
        this.professores = professores;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setProfessor(Professor[] professor){
        this.professores = professor;
    }

    public Professor[] getProfessor(){
        return this.professores;
    }


}
