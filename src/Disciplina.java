public class Disciplina {
    private int nDisciplina;
    private String nome;

    public Disciplina(int nDisciplina, String nome) {
        this.nDisciplina = nDisciplina;
        this.nome = nome;
    }

    public int getnDisciplina() {
        return nDisciplina;
    }

    public void setnDisciplina(int nDisciplina) {
        this.nDisciplina = nDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
