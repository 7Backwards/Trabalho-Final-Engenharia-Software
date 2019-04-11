import java.time.LocalDate;

public class Encomenda {
    private LocalDate data;
    private RequisicaoCompra requisicao;

    public Encomenda(LocalDate data, RequisicaoCompra requisicao) {
        this.data = data;
        this.requisicao = requisicao;
    }

    public LocalDate getData() {
        return data;
    }

    public RequisicaoCompra getRequisicao() {
        return requisicao;
    }
}
