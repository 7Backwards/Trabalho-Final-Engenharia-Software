
public interface Repositorio{

    public void adicionaCoima(Coima coima) ;

    public void adicionaCopia(Copia copia) ;

    public void adicionaDevolucao(Devolucao devolucao) ;

    public void adicionaEmprestimo(Emprestimo emprestimo) ;

    public void adicionaEncomenda(Encomenda encomenda) ;

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) ;

    public void adicionaLivro(Livro livro) ;

    public void adicionaNotificacao(Notificacao notificacao) ;

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta);

    public void adicionaRequisicao(Requisicao requisicao) ;

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra) ;

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);

    //1º Sprint

    //Criaçao de array de Salas , alunos , Docentes ,professores, funcionarios , horarios , Disciplinas

    public void adicionaSalaEstudo(SalaEstudo salaEstudo);

    public void adicionaAluno(Aluno aluno);

    public void adicionaDocente(Docente docente);

    public void adicionaProfessor(Professor professor);

    public void adicionaFuncionario(Funcionario funcionario);

    public void adicionaHorarios(Horario horario);

    public void adicionaDisciplina(Disciplina disciplina);



    //Aluno a frequentar sala de estudo

    public void entradaAlunoNaSala(SalaEstudo salaEstudo, Aluno aluno);







}
