package br.com.exame.dto;

import br.com.exame.entity.Exame;

public class ExameDto {
    
    private Long id;

    private String paciente;

    private String exame;

    private String resultado;

    private String observacao;
    
    private String data;


    public ExameDto() {
    }

    public ExameDto(Exame exame){
        this.id = exame.getId();
        this.paciente = exame.getPaciente();
        this.exame = exame.getExame();
        this.resultado = exame.getResultado();
        this.observacao = exame.getObservacao();
        this.data = exame.getData();
    }

    public Exame toEntity(){
        Exame exame = new Exame();
        exame.setId(this.id);
        exame.setExame(this.exame);
        exame.setPaciente(this.paciente);
        exame.setResultado(this.resultado);
        exame.setObservacao(this.observacao);
        exame.setData(this.data);

        return exame;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaciente() {
        return this.paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getExame() {
        return this.exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public String getResultado() {
        return this.resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getObservacao() {
        return this.observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
    

    
}
