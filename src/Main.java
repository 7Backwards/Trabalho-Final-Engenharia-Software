import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        RepositorioMem rep = new RepositorioMem();

        Horario horario = new Horario(null,null);
        Horario horario2 = new Horario(null,null);
        Horario horario3 = new Horario(null,null);

        Disciplina disciplina =new Disciplina("POO");
        Professor prof = new Professor(disciplina,"Jose",1);

        Disciplina disciplina2 =new Disciplina("Portugues");
        Professor prof2 = new Professor(disciplina2,"Aldina",2);

        Disciplina disciplina3 =new Disciplina("Matematica");
        Professor prof3 = new Professor(disciplina3,"Filomena",3);

        rep.adicionaProfessor(prof);rep.adicionaProfessor(prof2);rep.adicionaProfessor(prof3);

        Funcionario funcionario = new Funcionario("Peter",1);

        SalaEstudo salaEstudo = new SalaEstudo(1,10,prof,rep.UtilizadorL,horario);

        SalaEstudo salaEstudo2 = new SalaEstudo(2,10,prof2,rep.UtilizadorL,horario2);

        SalaEstudo salaEstudo3 = new SalaEstudo(3,10,prof3,rep.UtilizadorL,horario3);



        rep.publicarHorarios(funcionario,salaEstudo);

        System.out.println("___________________");

        rep.publicarHorarios(funcionario,salaEstudo2);

        System.out.println("____________________");

        rep.publicarHorarios(funcionario,salaEstudo3);

    }
}
