import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int nAluno;
    private ArrayList<Fichas> FichasList;

    public Aluno(String nome, int nAluno, ArrayList<Fichas> fichasList) {
        this.nome = nome;
        this.nAluno = nAluno;
        FichasList = fichasList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnAluno() {
        return nAluno;
    }

    public void setnAluno(int nAluno) {
        this.nAluno = nAluno;
    }

    public ArrayList<Fichas> getFichasList() {
        return FichasList;
    }

    public void setFichasList(ArrayList<Fichas> fichasList) {
        FichasList = fichasList;
    }
}
