import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Funcionario {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String nome;
    private int nFuncionario;
    private Horario horario;

    public Funcionario(String nome,LocalTime Inicio, LocalTime fim,LocalTime inicioAlmoço,LocalTime fimAlmoço) {
        this.nome = nome;
        this.nFuncionario = count.incrementAndGet();
        Horario horario= new Horario(null,Inicio,fim,inicioAlmoço,fimAlmoço);
        this.horario=horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnFuncionario() {
        return nFuncionario;
    }

    public void CriarHorarioProfessor( Professor professor, LocalTime Inicio, LocalTime fim,LocalTime inicioAlmoço,LocalTime fimAlmoço) {
        if(FuncionarioDentroDoHorario()) {
            Horario novohorario = new Horario(this, Inicio, fim, inicioAlmoço, fimAlmoço);
            professor.setHorario(novohorario);
        }
        else
            System.out.println("Funcionario fora do Horário de trabalho pelo que não poderá realizar esta operação");
    }

    public void CriarHorarioSalaEstudos( SalaEstudo salaestudo, LocalTime Inicio, LocalTime fim) {
        if(FuncionarioDentroDoHorario()) {
        Horario novohorario= new Horario(this,Inicio,fim,null,null);
        salaestudo.setHorarioSalaEstudo(novohorario);
        }
        else
            System.out.println("Funcionario fora do Horário de trabalho pelo que não poderá realizar esta operação");
    }

    public void setnFuncionario(int nFuncionario) {
        this.nFuncionario = nFuncionario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(LocalTime Inicio, LocalTime fim,LocalTime inicioAlmoço,LocalTime fimAlmoço) {
        Horario horario= new Horario(null,Inicio,fim,inicioAlmoço,fimAlmoço);
        this.horario = horario;
    }

    public boolean FuncionarioDentroDoHorario() { //Verifica se o funcionario está dentro do seu horario (caso esteja na hora de almoço dá return falso)
        if(LocalTime.now().compareTo(this.horario.getHora_Inicio()) >=0 &&  LocalTime.now().compareTo(this.horario.getHora_Fim()) <= 0 && !(LocalTime.now().compareTo(this.horario.getHora_inicio_almoço()) >=0 &&  LocalTime.now().compareTo(this.horario.getHora_fim_almoço()) <=0)) {
            return true;
        }
        else
            return false;
        }
    }

