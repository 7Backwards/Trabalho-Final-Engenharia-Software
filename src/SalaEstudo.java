import java.time.LocalTime;
import java.util.ArrayList;

public class SalaEstudo {
    private int nSala;
    private int nLugares;
    private int nLugaresDisponiveis;
    private Professor prof;
    private ArrayList<Utilizador> AlunosList;
    private Horario HorarioSalaEstudo;

    public SalaEstudo(int nSala, int nLugares) {
        this.nSala = nSala;
        this.nLugares = nLugares;
        this.nLugaresDisponiveis=this.nLugares; //Visto que a sala acabou de ser criada
        this.AlunosList = new ArrayList<>();
    }

    public int getnSala() {
        return nSala;
    }

    public void setnSala(int nSala) {
        this.nSala = nSala;
    }

    public int getnLugares() {
        return nLugares;
    }

    public void setnLugares(int nLugares) {
        this.nLugares = nLugares;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        if(this.prof != null)
            this.prof = prof;
        else
            System.out.println("Já se encontra um professor nesta sala de estudo");
    }

    public void removeProf() {this.prof = null;}

    public ArrayList<Utilizador> getAlunosList() {
        return AlunosList;
    }

    public void setAlunosList(ArrayList<Utilizador> alunosList) {
        AlunosList = alunosList;
    }

    public int getnLugaresDisponiveis() {
        return nLugaresDisponiveis;
    }

    public void setnLugaresDisponiveis(int nLugaresDisponiveis) {
        this.nLugaresDisponiveis = nLugaresDisponiveis;
    }

    public Horario getHorarioSalaEstudo() {
        return HorarioSalaEstudo;
    }

    public void setHorarioSalaEstudo(Horario horarioSalaEstudo) {
        HorarioSalaEstudo = horarioSalaEstudo;
    }

    public boolean addAlunoSala(Utilizador aluno){

        if(AlunosList != null) {
            for (Utilizador u : AlunosList) {
                if (u.equals(aluno)) {
                    System.out.println("Este aluno ja foi registado na sala");
                    return false;
                }
            }
        }

        if(this.nLugares >=1) {
            assert this.AlunosList != null;
            this.AlunosList.add(aluno);
            this.nLugares--;
            return true;
        }else
            return false;

    }

    public boolean remAlunoSala(Utilizador aluno) {

        if(this.AlunosList.contains(aluno)){
            this.AlunosList.remove(aluno);
            this.nLugares--;
            return true;
        }
        else {
            System.out.println("Este aluno nao esta presente nesta sala");
            return false;
        }
    }

    public boolean FecharSala(SalaEstudo salaEstudo) {

        if (salaEstudo == null) return false;

        for (Utilizador u : AlunosList) {
            u.setDentroSaladeEstudo(0);
        }
        AlunosList.removeAll(AlunosList); //Todos os alunos saiem da sala
        prof = null; //o professor sai da sala
        nLugaresDisponiveis=this.nLugares; //Visto que todos os alunos saiem da sala
        return true;
    }

    public boolean SalaEstudoDentroDoHorario() { //Verifica se a sala de estudo está aberta
        if(LocalTime.now().compareTo(this.HorarioSalaEstudo.getHora_Inicio()) >=0 &&  LocalTime.now().compareTo(this.HorarioSalaEstudo.getHora_Fim()) <= 0 ) {
            return true;
        }
        else
            return false;
    }
}




