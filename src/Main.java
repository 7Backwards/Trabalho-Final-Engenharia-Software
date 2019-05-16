import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Utilizador u = new Utilizador("Manuel","Ativo", new TipoUtilizador("aluno",10));
        PropostaAquisicao propostaAquisicao = new PropostaAquisicao(LocalDate.now(),u,"Alice no Pais das Maravilhas");
        Livro l = new Livro("Programar em Java", "FCA");
        Copia c = new Copia(1, l);
        RequisicaoCompraCopia requisicaoCompraCopia = new RequisicaoCompraCopia("pendente", LocalDate.now(), "Oficio",l,u);
        Encomenda encomenda = new Encomenda(LocalDate.now(),requisicaoCompraCopia);
        EntradaNovoLivro entradaNovoLivro = new EntradaNovoLivro(LocalDate.now(),encomenda,c);

        Repositorio repo = new RepositorioMem();

        repo.adicionaEntradaNovoLivro(entradaNovoLivro);
    }
}
