import java.time.LocalTime;
import java.util.ArrayList;

public class RepositorioMem implements Repositorio {

    private ArrayList<Coima> coimaL = new ArrayList<>();
    private ArrayList<Copia> copiaL = new ArrayList<>();
    private ArrayList<Devolucao> devolucaoL = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimoL = new ArrayList<>();
    private ArrayList<Encomenda> encomendaL = new ArrayList<>();
    private ArrayList<EntradaNovoLivro> enNovoLivroL = new ArrayList<>();
    private ArrayList<Livro> livroL = new ArrayList<>();
    private ArrayList<Notificacao> notificacaoL = new ArrayList<>();
    private ArrayList<PropostaAquisicao> propAquisicaoL = new ArrayList<>();
    private ArrayList<Requisicao> requisicaoL = new ArrayList<>();
    private ArrayList<RequisicaoCompra> requisicaoCompraL = new ArrayList<>();
    private ArrayList<Utilizador> UtilizadorL = new ArrayList<>();
    private ArrayList<TipoUtilizador> TipoUtilizadorL = new ArrayList<>();

    //1ºSprint

    private ArrayList<SalaEstudo> salaEstudoL = new ArrayList<>();
    private ArrayList<Professor> professorL = new ArrayList<>();
    private ArrayList<Disciplina> disciplinaL = new ArrayList<>();
    private ArrayList<Fichas> FichasL = new ArrayList<>();

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

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {

        for (Emprestimo i : emprestimoL) {
            if (i.getRequisicao() == r)
                return i;
        }
        return null;
    }


    //1º Sprint

    public void adicionaSalaEstudo(SalaEstudo salaEstudo) {
        salaEstudoL.add(salaEstudo);
    }

    public void adicionaAluno(Utilizador aluno) {
        UtilizadorL.add(aluno);
    }

    public void adicionaProfessor(Professor professor) {
        professorL.add(professor);
    }

    public void adicionaUtilizador(Utilizador utilizador) {
        UtilizadorL.add(utilizador);
    }

    public void adicionaDisciplina(Disciplina disciplina) {
        disciplinaL.add(disciplina);
    }

    public void entradaAlunoNaSala(SalaEstudo salaEstudo, Utilizador aluno) {

        if (salaEstudo == null || aluno == null) return;
        if (aluno.getDentroSaladeEstudo() == 1) {
            System.out.println("Utilizador já se encontra dentro de uma sala de estudo!\n");
        } else {
            if (salaEstudo.SalaEstudoDentroDoHorario()) {

                if (salaEstudo.addAlunoSala(aluno)) {
                    System.out.println("Foi efetuada uma nova entrada de aluno na sala!\n");
                    aluno.setDentroSaladeEstudo(1);
                } else
                    System.out.println("Nao foi efetuada a entrada do aluno na sala\n");
            } else {
                System.out.println("Sala de estudo encontra-se fechada");
            }
        }
    }

    public void saidaAlunoNaSala(SalaEstudo salaEstudo, Utilizador aluno) {
        if (salaEstudo == null || aluno == null) return;

        if (salaEstudo.remAlunoSala(aluno)) {
            System.out.println("Foi efetuada o registo de saida do aluno da sala!\n");
            aluno.setDentroSaladeEstudo(0);
        } else
            System.out.println("Nao foi possivel efetuar o registo de saida do aluno!\n");

    }

    public void FecharSalaDeAula(SalaEstudo salaEstudo) {
        if (salaEstudo == null) return;

        if (salaEstudo.FecharSala(salaEstudo)) {
            System.out.println("Sala de estudo foi fechada");
        }

    }


    //2ºSprint

    public void EntregarFichaAAluno(Fichas ficha, Utilizador aluno) {

        aluno.AddFicha(ficha);
    }

    public void AlunoAvaliaFicha(Utilizador aluno, Fichas ficha, int AvaliacaoDificuldade) {
        FeedbackFichas novoFeedback = new FeedbackFichas(aluno, ficha, AvaliacaoDificuldade);
        aluno.AddFeedback(novoFeedback); //Adicionar novoFeedback ao Aluno
        ficha.AddFeedback(novoFeedback);//Adicionar novoFeedback à Ficha

        ficha.UpdateDificuldade(AvaliacaoDificuldade);

    }

    //4ºSprint

    public void CriarHorarioProfessor(Funcionario funcionario, Professor professor, LocalTime Inicio, LocalTime fim, LocalTime inicioAlmoco, LocalTime fimAlmoco) {
        funcionario.CriarHorarioProfessor(professor, Inicio, fim, inicioAlmoco, fimAlmoco);

    }

    public void CriarHorarioSalaEstudos(Funcionario funcionario, SalaEstudo saladestudo, LocalTime Inicio, LocalTime fim) {
        funcionario.CriarHorarioSalaEstudos(saladestudo, Inicio, fim);

    }


}


