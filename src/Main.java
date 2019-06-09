import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        RepositorioMem rep = new RepositorioMem();

        Disciplina disciplina =new Disciplina("POO");
        Professor prof = new Professor(disciplina,"Jose");

        Disciplina disciplina2 =new Disciplina("Portugues");
        Professor prof2 = new Professor(disciplina2,"Aldina");

        Disciplina disciplina3 =new Disciplina("Matematica");
        Professor prof3 = new Professor(disciplina3,"Filomena");

        rep.adicionaProfessor(prof);rep.adicionaProfessor(prof2);rep.adicionaProfessor(prof3);

        Funcionario funcionario = new Funcionario("Peter");

        SalaEstudo salaEstudo = new SalaEstudo(1,10,prof,rep.UtilizadorL);

        SalaEstudo salaEstudo2 = new SalaEstudo(2,10,prof2,rep.UtilizadorL);

        SalaEstudo salaEstudo3 = new SalaEstudo(3,10,prof3,rep.UtilizadorL);




        //Testes do 3º sprint
        rep.publicarHorarios(funcionario,salaEstudo);

        System.out.println("___________________");

        /*rep.publicarHorarios(funcionario,salaEstudo2);

        System.out.println("____________________");

        rep.publicarHorarios(funcionario,salaEstudo3);*/

        //Testes ao 1º Sprint

        Utilizador aluno = new Utilizador("Kayle",null,null);
        Utilizador aluno2 = new Utilizador("Lucius",null,null);
        Utilizador aluno3 = new Utilizador("Barney",null,null);
        Utilizador aluno4 = new Utilizador("Ashley",null,null);

        rep.entradaAlunoNaSala(salaEstudo,aluno);
        rep.entradaAlunoNaSala(salaEstudo,aluno2);
        rep.entradaAlunoNaSala(salaEstudo,aluno3);
        //rep.saidaAlunoNaSala(salaEstudo,aluno3);
        rep.FecharSalaDeAula(salaEstudo);


        System.out.println(salaEstudo.getAlunosList().size());


    }
}
