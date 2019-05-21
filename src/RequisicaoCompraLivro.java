import java.time.LocalDate;

public class RequisicaoCompraLivro extends RequisicaoCompra {
    private PropostaAquisicao propostaAquisicao;

    public RequisicaoCompraLivro(java.lang.String estado, java.time.LocalDate data, java.lang.String oficio, PropostaAquisicao propostaAquisicao, Livro livro, Funcionario funcionario) {
        super(estado, data, oficio, livro, funcionario);
        this.propostaAquisicao = propostaAquisicao;
    }

    public PropostaAquisicao getPropostaAquisicao() {
        return propostaAquisicao;
    }
}
