import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Funcionario {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String nome;
    private int nFuncionario;

    public Funcionario(String nome, int nFuncionario) {
        this.nome = nome;
        this.nFuncionario = nFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnFuncionario() {
        return nFuncionario;
    }

    public void setnFuncionario(int nFuncionario) {
        this.nFuncionario = nFuncionario;
    }

    public Horario setHorarios(ArrayList<Professor> professorL){

        //verifica se existem professores
        if(professorL.isEmpty()){
            return null;
        }

        Horario horario = new Horario(null,null);

        LocalTime tempoinicio = LocalTime.of(8,00,00);
        LocalTime tempofim =null;

        horario.setHora_Inicio(tempoinicio);

        //percorre a lista de professores e dalhes uma carga de 2 horas de trabalho
        for (Professor p : professorL){
           // System.out.println("Professor :" + p.getNome());
            if(p.getHorario().getHora_Inicio() == null) {        //Caso que nenhum professor tenha horarios defenidos , vamos defenir 2 horas de horario para cada um
                p.getHorario().setHora_Inicio(tempoinicio);
                System.out.println("Hora entrada Professor : " + p.getNome() + " as :" + p.getHorario().getHora_Inicio());
                tempofim = tempoinicio.plusHours(2);
                p.getHorario().setHora_Fim(tempofim);
                tempoinicio = tempofim;
            }
            else{    //Caso que o professor tenha horario defenido damos lhe 1 hora de intervalo e defenimos mais 2 horas

                //significa que nao foi atribuido nenhum professor para esta sala na hora inicio geral logo temos que adiar a abertura
                if(tempoinicio == LocalTime.of(8,00,00)){
                    tempoinicio=p.getHorario().getHora_Fim().plusHours(1);
                    horario.setHora_Inicio(tempoinicio);
                }

                tempoinicio=p.getHorario().getHora_Fim().plusHours(1);
                p.getHorario().setHora_Inicio(tempoinicio);
                System.out.println("Hora entrada Professor : " + p.getNome() + " as :" + p.getHorario().getHora_Inicio());
                tempofim = tempoinicio.plusHours(2);
                p.getHorario().setHora_Fim(tempofim);
            }
        }

        horario.setHora_Fim(tempofim);

        return horario;

    }

}
