import java.time.LocalTime;

public class Horario {
    private LocalTime hora_Inicio;
    private LocalTime hora_Fim;
    private LocalTime hora_inicio_almoço;
    private LocalTime hora_fim_almoço;
    private Funcionario FuncionarioDefiniuHorario;

    public Horario(Funcionario funcionariodefiniuhorario,LocalTime hora_Inicio, LocalTime hora_Fim,LocalTime hora_inicio_almoço,LocalTime hora_fim_almoço ) {
        this.hora_Inicio = hora_Inicio;
        this.hora_Fim = hora_Fim;
        this.FuncionarioDefiniuHorario=funcionariodefiniuhorario;
        this.hora_inicio_almoço=hora_inicio_almoço;
        this.hora_fim_almoço=hora_fim_almoço;
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

    public Funcionario getFuncionarioDefiniuHorario() {
        return FuncionarioDefiniuHorario;
    }

    public void setFuncionarioDefiniuHorario(Funcionario funcionarioDefiniuHorario) {
        FuncionarioDefiniuHorario = funcionarioDefiniuHorario;
    }

    public LocalTime getHora_inicio_almoço() {
        return hora_inicio_almoço;
    }

    public void setHora_inicio_almoço(LocalTime hora_inicio_almoço) {
        this.hora_inicio_almoço = hora_inicio_almoço;
    }

    public LocalTime getHora_fim_almoço() {
        return hora_fim_almoço;
    }

    public void setHora_fim_almoço(LocalTime hora_fim_almoço) {
        this.hora_fim_almoço = hora_fim_almoço;
    }
}
