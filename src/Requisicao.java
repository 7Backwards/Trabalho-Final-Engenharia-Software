import java.time.LocalDate;

public class Requisicao {

    private LocalDate data;
    private Funcionario funcionario;
    private Copia copia;

    public Requisicao(LocalDate data, Funcionario funcionario, Copia copia) {
        this.data = data;
        this.funcionario = funcionario;
        this.copia = copia;
    }

    public LocalDate getData() {
        return data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Copia getCopia() {
        return copia;
    }


}
