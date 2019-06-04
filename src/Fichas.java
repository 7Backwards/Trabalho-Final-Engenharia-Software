import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Fichas {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int nFicha;
    private String titulo;
    private Disciplina disciplina;
    private ArrayList<FeedbackFichas> FeedbackFicha;
    private int DificuldadeAtual;
    private int DificuldadePeloStor; //Nivel de dificuldade dado à ficha pelo docente que a criou

    public Fichas(int nFicha, String titulo, Disciplina disciplina,int dificuldade) {
        this.nFicha = count.incrementAndGet();
        this.titulo = titulo;
        this.disciplina = disciplina;
        this.DificuldadeAtual = dificuldade;
        this.DificuldadePeloStor = dificuldade;
        this.FeedbackFicha = new ArrayList<FeedbackFichas>();
    }

    public int getnFicha() {
        return nFicha;
    }

    public void setnFicha(int nFicha) {
        this.nFicha = nFicha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<FeedbackFichas> getFeedbackFicha() {
        return FeedbackFicha;
    }

    public void AddFeedback(FeedbackFichas novoFeedback) {
        FeedbackFicha.add(novoFeedback);
    }

    public int getDificuldade() {
        return DificuldadeAtual;
    }

    public void setDificuldade(int dificuldade) {
        DificuldadeAtual = dificuldade;
    }

    public void UpdateDificuldade(int AvaliacaoDificuldade) {
        int i;
        int SomaFeedbackAlunos=0;
        for (i=0;i<FeedbackFicha.size();i++) {
            SomaFeedbackAlunos+=FeedbackFicha.get(i).getAvaliacao();
        }

        this.DificuldadeAtual=(int) (1/3)*SomaFeedbackAlunos+(2/3)*DificuldadePeloStor; //Definimos que a avaliação da dificuldade do stor tem um peso de 2/3
                                                                                        //enquanto que a dos alunos tem 1/
    }

    public float MediaFeedbackFicha() {
        int Soma=0;
        int i;
        for (i=0;i< FeedbackFicha.size(); i++) {
            Soma += FeedbackFicha.get(i).getAvaliacao();
        }
        if(FeedbackFicha.size()==0) {
            return 0;
        }
        else {
            return Soma/(i+1);
        }
    }


}
