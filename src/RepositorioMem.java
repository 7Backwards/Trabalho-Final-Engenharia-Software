import java.util.ArrayList;

public abstract class RepositorioMem {

    ArrayList<Coima> coimaL = new ArrayList<>();
    ArrayList<Copia> copiaL = new ArrayList<>();
    ArrayList<Devolucao> devolucaoL = new ArrayList<>();
    ArrayList<Emprestimo> emprestimoL = new ArrayList<>();
    ArrayList<Encomenda> encomendaL = new ArrayList<>();
    ArrayList<EntradaNovoLivro> enNovoLivroL = new ArrayList<>();
    ArrayList<Livro> livroL = new ArrayList<>();
    ArrayList<Notificacao> notificacaoL = new ArrayList<>();
    ArrayList<PropostaAquisicao> propAquisicaoL = new ArrayList<>();
    ArrayList<Requisicao> requisicaoL = new ArrayList<>();
    ArrayList<RequisicaoCompra> requisicaoCompraL = new ArrayList<>();
    ArrayList<TipoUtilizador> tipoUtilizadorL = new ArrayList<>();
    ArrayList<Utilizador> utilizadorL = new ArrayList<>();


    public RepositorioMem() {
    }

    public void adicionaCoima(Coima coima) {
        coimaL.add(coima);
    }

    public void adicionaCopia(Copia copia) {
        copiaL.add(copia);
    }

    public void adicionaDevolucao(Devolucao devolucao) {
        devolucaoL.add(devolucao);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo) {
        emprestimoL.add(emprestimo);
    }

    public void adicionaEncomenda(Encomenda encomenda) {
        encomendaL.add(encomenda);
    }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) {
        enNovoLivroL.add(entradaNovoLivro);
    }

    public void adicionaLivro(Livro livro) {
        livroL.add(livro);
    }

    public void adicionaNotificacao(Notificacao notificacao) {
        notificacaoL.add(notificacao);
    }

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta) {
        propAquisicaoL.add(proposta);
    }

    public void adicionaRequisicao(Requisicao requisicao) {
        requisicaoL.add(requisicao);
    }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra) {
        requisicaoCompraL.add(requisicaoCompra);
    }

    public void adicionaTipoUtilizador(TipoUtilizador tipo) {
        tipoUtilizadorL.add(tipo);
    }

    public void adicionaUtilizador(Utilizador utilizador) {
        utilizadorL.add(utilizador);
    }

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {

        for (Emprestimo i : emprestimoL) {
            if (i.getRequisicao() == r)
                return i;
        }
        return null;
    }

}
