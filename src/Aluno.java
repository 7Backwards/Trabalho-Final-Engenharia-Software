import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Aluno {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String nome;
    private int nAluno;
    private ArrayList<Fichas> FichasList;
    private ArrayList<FeedbackFichas> FeedbackFichasPeloAluno;

    public Aluno(String nome, ArrayList<Fichas> fichasList) {
        this.nome = nome;
        this.nAluno = count.incrementAndGet();
        FichasList = fichasList;
        this.FeedbackFichasPeloAluno = new ArrayList<FeedbackFichas>();
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

    public void AddFicha(Fichas ficha) {
        this.FichasList.add(ficha);
    }

    public ArrayList<FeedbackFichas> getFeedbackFichasPeloAluno() {
        return FeedbackFichasPeloAluno;
    }

    public void AddFeedback(FeedbackFichas novoFeedback) {
        FeedbackFichasPeloAluno.add(novoFeedback);
    }
}
