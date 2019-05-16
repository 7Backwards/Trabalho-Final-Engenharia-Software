import java.util.ArrayList;

public class SalaEstudo {
    private int nSala;
    private int nLugares;
    private Professor prof;
    private ArrayList<Aluno> AlunosList;
    private Horario HDSala;

    public SalaEstudo(int nSala, int nLugares, Professor prof, ArrayList<Aluno> alunosList, Horario HDSala) {
        this.nSala = nSala;
        this.nLugares = nLugares;
        this.prof = prof;
        AlunosList = alunosList;
        this.HDSala = HDSala;
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

    public ArrayList<Aluno> getAlunosList() {
        return AlunosList;
    }

    public void setAlunosList(ArrayList<Aluno> alunosList) {
        AlunosList = alunosList;
    }

    public Horario getHDSala() {
        return HDSala;
    }

    public void setHDSala(Horario HDSala) {
        this.HDSala = HDSala;
    }

    public boolean addAlunoSala(Aluno aluno){

        if(this.nLugares >=1) {
            this.AlunosList.add(aluno);
            this.nLugares--;
            return true;
        }else
            return false;

    }

}
