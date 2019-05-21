import java.time.LocalDate;

public class RequisicaoCompraCopia extends  RequisicaoCompra {

    public RequisicaoCompraCopia(String estado, LocalDate data, String oficio, Livro livro, Funcionario funcionario) {
        super(estado, data, oficio, livro, funcionario);
    }
}
