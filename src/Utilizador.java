import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Utilizador {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int nUtilizador;
    private String nome;
    private TipoUtilizador tipoUtilizador;
    private String estado;

    private ArrayList<Fichas> FichasList;
    private ArrayList<FeedbackFichas> FeedbackFichasPeloAluno;

    public Utilizador(int nUtilizador, String nome, TipoUtilizador tipoUtilizador, String estado, ArrayList<Fichas> fichasList, ArrayList<FeedbackFichas> feedbackFichasPeloAluno) {
        this.nUtilizador = nUtilizador;
        this.nome = nome;
        this.tipoUtilizador = tipoUtilizador;
        this.estado = estado;
        FichasList = fichasList;
        FeedbackFichasPeloAluno = feedbackFichasPeloAluno;
    }

    public int getnUtilizador() {
        return nUtilizador;
    }

    public void setnUtilizador(int nUtilizador) {
        this.nUtilizador = nUtilizador;
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
