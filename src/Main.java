import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {


        Utilizador u = new Utilizador("Manuel",new TipoUtilizador("aluno",10),"Ativo");
        PropostaAquisicao propostaAquisicao = new PropostaAquisicao(LocalDate.now(),u,"Alice no Pais das Maravilhas");
        Livro l = new Livro("Programar em Java", "FCA");
        Copia c = new Copia(1, l);
        RequisicaoCompraCopia requisicaoCompraCopia = new RequisicaoCompraCopia("pendente", LocalDate.now(), "Oficio",l,u);
        Encomenda encomenda = new Encomenda(LocalDate.now(),requisicaoCompraCopia);
        EntradaNovoLivro entradaNovoLivro = new EntradaNovoLivro(LocalDate.now(),encomenda,c);
        RepositorioMem rep = new RepositorioMem();
        rep.adicionaEntradaNovoLivro(entradaNovoLivro);



        Disciplina disciplina =new Disciplina("Programação Dispositivos Móveis");
        Professor prof = new Professor(disciplina,"Jose");

        Disciplina disciplina2 =new Disciplina("Portugues");
        Professor prof2 = new Professor(disciplina2,"Aldina");

        Disciplina disciplina3 =new Disciplina("Matematica");
        Professor prof3 = new Professor(disciplina3,"Filomena");

        rep.adicionaProfessor(prof);rep.adicionaProfessor(prof2);rep.adicionaProfessor(prof3);

        SalaEstudo salaEstudo = new SalaEstudo(1,10);

        SalaEstudo salaEstudo2 = new SalaEstudo(2,15);

        SalaEstudo salaEstudo3 = new SalaEstudo(3,12);

        salaEstudo.setProf(prof);

        salaEstudo.setProf(prof2);

        salaEstudo.removeProf();



        //Testes do 3º sprint       Definir horarios



        Funcionario funcionario = new Funcionario("Luis",LocalTime.of(8,00,00),LocalTime.of(17,00,00),LocalTime.of(13,00,00),LocalTime.of(14,00,00));

        if(funcionario.FuncionarioDentroDoHorario()) {
            System.out.println("Funcionario dentro do Horário de trabalho");
        }
        else {
            System.out.println("Funcionario fora do Horário de trabalho");
        }

        rep.CriarHorarioSalaEstudos(funcionario,salaEstudo,LocalTime.of(8,00,00),LocalTime.of(14,00,00));
        rep.CriarHorarioSalaEstudos(funcionario,salaEstudo2,LocalTime.of(12,00,00),LocalTime.of(20,00,00));
        rep.CriarHorarioSalaEstudos(funcionario,salaEstudo3,LocalTime.of(20,00,00),LocalTime.of(23,59,59));

        rep.CriarHorarioProfessor(funcionario,prof,LocalTime.of(8,00,00),LocalTime.of(15,00,00),LocalTime.of(13,00,00),LocalTime.of(14,00,00));
        rep.CriarHorarioProfessor(funcionario,prof2,LocalTime.of(8,00,00),LocalTime.of(20,00,00),LocalTime.of(13,00,00),LocalTime.of(14,00,00));

        System.out.println("Horario do funcionario");
        System.out.println("Inicio: " + funcionario.getHorario().getHora_Inicio());
        System.out.println("Fim: " + funcionario.getHorario().getHora_Fim());

        System.out.println("_______");

        System.out.println("Horario do Prof");
        System.out.println("Inicio: "+ prof.getHorario().getHora_Inicio());
        System.out.println("Fim: " + prof.getHorario().getHora_Fim());

        //Testes ao 1º Sprint       Entrada e saida de alunos

        Utilizador aluno = new Utilizador("Kayle",null,null);
        Utilizador aluno2 = new Utilizador("Lucius",null,null);
        Utilizador aluno3 = new Utilizador("Barney",null,null);
        Utilizador aluno4 = new Utilizador("Ashley",null,null);

        rep.entradaAlunoNaSala(salaEstudo,aluno);

        System.out.println("Numero de alunos na sala: " + salaEstudo.getAlunosList().size());

        rep.entradaAlunoNaSala(salaEstudo2,aluno2);

        System.out.println("Numero de alunos na sala: " + salaEstudo2.getAlunosList().size());

        rep.entradaAlunoNaSala(salaEstudo3,aluno3);

        System.out.println("Numero de alunos na sala: " + salaEstudo3.getAlunosList().size());

        rep.entradaAlunoNaSala(salaEstudo3,aluno4);

        System.out.println("Numero de alunos na sala: " + salaEstudo3.getAlunosList().size());

        rep.saidaAlunoNaSala(salaEstudo3,aluno3);
        rep.saidaAlunoNaSala(salaEstudo2,aluno2);
        rep.saidaAlunoNaSala(salaEstudo,aluno);

        rep.FecharSalaDeAula(salaEstudo3);
        rep.FecharSalaDeAula(salaEstudo2);
        rep.FecharSalaDeAula(salaEstudo);

        //Testes ao 2º Sprint       Entrega e avaliaçao dinamica da ficha
        Fichas ficha = new Fichas("Geometria",disciplina3,12);

        System.out.println("Dificuldade da ficha Inicio: " + ficha.getDificuldade());

        rep.EntregarFichaAAluno(ficha,aluno);
        rep.EntregarFichaAAluno(ficha,aluno2);
        rep.EntregarFichaAAluno(ficha,aluno3);

        rep.AlunoAvaliaFicha(aluno,ficha,14);
        rep.AlunoAvaliaFicha(aluno2,ficha,16);
        rep.AlunoAvaliaFicha(aluno3,ficha,16);

        System.out.println("Dificuldade da ficha depois de avaliada pelos alunos: " + ficha.getDificuldade());

        if(prof.ProfessorDentroDoHorario()) {
            System.out.println("Professor dentro do Horário de trabalho");
        }
        else {
            System.out.println("Professor fora do Horário de trabalho");
        }

        if(prof2.ProfessorDentroDoHorario()) {
            System.out.println("Professor dentro do Horário de trabalho");
        }
        else {
            System.out.println("Professor fora do Horário de trabalho");
        }



    }
}
