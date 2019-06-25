import java.time.LocalTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Professor  {
    private static final AtomicInteger count = new AtomicInteger(0);
    private Disciplina disciplina;
    private String nome;
    private int nProfessor;
    private Horario horario;



    public Professor(Disciplina disciplina , String nome) {
        this.disciplina = disciplina;
        this.nome = nome;
        this.nProfessor = count.incrementAndGet();
        horario=null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnProfessor() {
        return nProfessor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Horario getHorario() {

        return horario;
    }

    public void setHorario(Horario horario) {


            this.horario = horario;


    }

    public boolean ProfessorDentroDoHorario() { //Verifica se o Professor está dentro do seu horario (caso esteja na hora de almoço dá return falso)
        if(LocalTime.now().compareTo(this.horario.getHora_Inicio()) >=0 &&  LocalTime.now().compareTo(this.horario.getHora_Fim()) <= 0 && !(LocalTime.now().compareTo(this.horario.getHora_inicio_almoço()) >=0 &&  LocalTime.now().compareTo(this.horario.getHora_fim_almoço()) <=0)) {
            return true;
        }
        else
            return false;
    }
}



