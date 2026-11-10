package pooC.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;


    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }


    public void imprime(){
        System.out.println("================");
        System.out.println("Professor: "+ this.nome);
        if (this.seminarios == null)return;
        System.out.println("Seminarios Cadastrados:");
        for (Seminario seminario : this.seminarios){
            System.out.println("Seminario: "+ seminario.getTitulo());
            System.out.println("Local: "+ seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length==0)continue;
            System.out.println("Alunos:");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: "+ aluno.getNome()+ " Idade: "+ aluno.getIdade());
            }

        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }public String getNome(){
        return this.nome;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }public String getEspecialidade(){
        return this.especialidade;
    }

    public void setSeminarios(Seminario[] seminarios){
        this.seminarios = seminarios;
    }public Seminario[] getSeminarios() {
        return seminarios;
    }

}
