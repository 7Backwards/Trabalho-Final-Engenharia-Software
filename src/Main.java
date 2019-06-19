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



        Disciplina disciplina =new Disciplina("POO");
        Professor prof = new Professor(disciplina,"Jose");

        Disciplina disciplina2 =new Disciplina("Portugues");
        Professor prof2 = new Professor(disciplina2,"Aldina");

        Disciplina disciplina3 =new Disciplina("Matematica");
        Professor prof3 = new Professor(disciplina3,"Filomena");

        rep.adicionaProfessor(prof);rep.adicionaProfessor(prof2);rep.adicionaProfessor(prof3);

        SalaEstudo salaEstudo = new SalaEstudo(1,10,prof,rep.UtilizadorL);

        SalaEstudo salaEstudo2 = new SalaEstudo(2,10,prof2,rep.UtilizadorL);

        SalaEstudo salaEstudo3 = new SalaEstudo(3,10,prof3,rep.UtilizadorL);




        //Testes do 3º sprint       Defenir horarios



        Funcionario funcionario = new Funcionario("Luis",LocalTime.of(8,00,00),LocalTime.of(17,00,00),LocalTime.of(13,00,00),LocalTime.of(14,00,00));

        rep.CriarHorarioProfessor(funcionario,prof,LocalTime.of(8,00,00),LocalTime.of(15,00,00),LocalTime.of(13,00,00),LocalTime.of(14,00,00));

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
        rep.entradaAlunoNaSala(salaEstudo,aluno2);
        rep.entradaAlunoNaSala(salaEstudo,aluno3);
        //rep.saidaAlunoNaSala(salaEstudo,aluno3);
        //rep.FecharSalaDeAula(salaEstudo);


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

        System.out.println(salaEstudo.getAlunosList().size());


    }
}
