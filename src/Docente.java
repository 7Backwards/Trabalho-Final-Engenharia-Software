public abstract class Docente {
    private int nDocente;
    private String nome;

    public Docente(int nDocente, String nome) {
        this.nDocente = nDocente;
        this.nome = nome;
    }

    public int getnDocente() {
        return nDocente;
    }

    public void setnDocente(int nDocente) {
        this.nDocente = nDocente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
