import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Utilizador {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int nUtilizador;
    private String nome;
    private TipoUtilizador tipoUtilizador;
    private String estado;

    private ArrayList<Fichas> FichasList = new ArrayList<Fichas>();
    private ArrayList<FeedbackFichas> FeedbackFichasPeloAluno = new ArrayList<FeedbackFichas>();

    public Utilizador(String nome, TipoUtilizador tipoUtilizador, String estado) {
        this.nUtilizador = count.incrementAndGet();
        this.nome = nome;
        this.tipoUtilizador = tipoUtilizador;
        this.estado = estado;
    }

    public int getnUtilizador() {
        return nUtilizador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoUtilizador getTipoUtilizador() {
        return tipoUtilizador;
    }

    public void setTipoUtilizador(TipoUtilizador tipoUtilizador) {
        this.tipoUtilizador = tipoUtilizador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Fichas> getFichasList() {
        return FichasList;
    }

    public void setFichasList(ArrayList<Fichas> fichasList) {
        FichasList = fichasList;
    }

    public ArrayList<FeedbackFichas> getFeedbackFichasPeloAluno() {
        return FeedbackFichasPeloAluno;
    }

    public void setFeedbackFichasPeloAluno(ArrayList<FeedbackFichas> feedbackFichasPeloAluno) {
        FeedbackFichasPeloAluno = feedbackFichasPeloAluno;
    }

    public void AddFicha(Fichas ficha) {
        this.FichasList.add(ficha);
    }

    public void AddFeedback(FeedbackFichas novoFeedback) {
        FeedbackFichasPeloAluno.add(novoFeedback);
    }

}
