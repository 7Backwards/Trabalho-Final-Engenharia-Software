import java.time.LocalTime;

public class Horario {
    private LocalTime hora_Inicio;
    private LocalTime hora_Fim;


    public Horario(LocalTime hora_Inicio, LocalTime hora_Fim) {
        this.hora_Inicio = hora_Inicio;
        this.hora_Fim = hora_Fim;
    }

    public LocalTime getHora_Inicio() {
        return hora_Inicio;
    }

    public void setHora_Inicio(LocalTime hora_Inicio) {
        this.hora_Inicio = hora_Inicio;
    }

    public LocalTime getHora_Fim() {
        return hora_Fim;
    }

    public void setHora_Fim(LocalTime hora_Fim) {
        this.hora_Fim = hora_Fim;
    }


}
