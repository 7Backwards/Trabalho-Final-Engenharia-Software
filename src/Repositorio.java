import java.time.LocalTime;

public interface Repositorio{

     void adicionaCoima(Coima coima) ;

     void adicionaCopia(Copia copia) ;

     void adicionaDevolucao(Devolucao devolucao) ;

     void adicionaEmprestimo(Emprestimo emprestimo) ;

     void adicionaEncomenda(Encomenda encomenda) ;

     void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) ;

     void adicionaLivro(Livro livro) ;

     void adicionaNotificacao(Notificacao notificacao) ;

     void adicionaPropostaRequisicao(PropostaAquisicao proposta);

     void adicionaRequisicao(Requisicao requisicao) ;

     void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra) ;

     Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);

    //1º Sprint

     void adicionaSalaEstudo(SalaEstudo salaEstudo);

     void adicionaAluno(Utilizador aluno);

     void adicionaProfessor(Professor professor);

     void adicionaUtilizador(Utilizador utilizador);

     void adicionaDisciplina(Disciplina disciplina);



    //Aluno a frequentar sala de estudo

     void entradaAlunoNaSala(SalaEstudo salaEstudo, Utilizador aluno);

     void saidaAlunoNaSala(SalaEstudo salaEstudo , Utilizador aluno);

    //Aluno recebe Fichas de Trabalho
     void EntregarFichaAAluno(Fichas ficha, Utilizador aluno);


    //2º Sprint


     void AlunoAvaliaFicha(Utilizador aluno,Fichas ficha,int AvaliacaoDificuldade);



    //4º Sprint

     void CriarHorarioProfessor(Funcionario funcionario, Professor professor, LocalTime Inicio, LocalTime fim,LocalTime inicioAlmoco,LocalTime fimAlmoco);
     void CriarHorarioSalaEstudos(Funcionario funcionario, SalaEstudo saladestudo, LocalTime Inicio, LocalTime fim);



}
