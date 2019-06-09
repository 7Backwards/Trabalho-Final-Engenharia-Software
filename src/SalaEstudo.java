import java.util.ArrayList;

public class SalaEstudo {
    private int nSala;
    private int nLugares;
    private int nLugaresDisponiveis;
    private Professor prof;
    private ArrayList<Utilizador> AlunosList;
    private Horario HDSala = new Horario(null,null) ;

    public SalaEstudo(int nSala, int nLugares, Professor prof, ArrayList<Utilizador> alunosList) {
        this.nSala = nSala;
        this.nLugares = nLugares;
        this.prof = prof;
        AlunosList = alunosList;
        this.HDSala = HDSala;
        this.nLugaresDisponiveis=this.nLugares; //Visto que a sala acabou de ser criada
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
        this.prof = prof;
    }

    public ArrayList<Utilizador> getAlunosList() {
        return AlunosList;
    }

    public void setAlunosList(ArrayList<Utilizador> alunosList) {
        AlunosList = alunosList;
    }

    public Horario getHDSala() {
        return HDSala;
    }

    public void setHDSala(Horario HDSala) {
        this.HDSala = HDSala;
    }

    public boolean addAlunoSala(Utilizador aluno){

        for(Utilizador u : AlunosList){
            if(u.equals(aluno)){
                System.out.println("Este aluno ja foi registado na sala");
                return false;
            }
        }

        if(this.nLugares >=1) {
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

        AlunosList.removeAll(AlunosList); //Todos os alunos saiem da sala
        prof = null; //o professor sai da sala
        nLugaresDisponiveis=this.nLugares; //Visto que todos os alunos saiem da sala
        return true;
    }

}
