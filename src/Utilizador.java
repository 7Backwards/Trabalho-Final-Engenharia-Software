public class Utilizador {

    private String nome;
    private String estado;
    private TipoUtilizador tipoUti;

    public Utilizador(String nome, String estado, TipoUtilizador tipoUti) {
        this.nome = nome;
        this.estado = estado;
        this.tipoUti = tipoUti;
    }

    public Utilizador(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

   public TipoUtilizador getTipoUti() {
        return tipoUti;
    }
}
