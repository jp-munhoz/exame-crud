package br.com.exame.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import br.com.exame.entity.Exame;

public class ExameDto {

    private Long idExame;

    private String exame;

    private String resultado;

    private String observacao;

    private String data;

    public ExameDto() {
    }

    public ExameDto(Exame exame) {
        this.idExame = exame.getIdExame();
        this.exame = exame.getExame();
        this.resultado = exame.getResultado();
        this.observacao = exame.getObservacao();
        this.data = exame.getData().toString();
    }

    public Exame toEntity() throws ParseException {
        Exame exame = new Exame();
        exame.setIdExame(this.idExame);
        exame.setExame(this.exame);
        exame.setResultado(this.resultado);
        exame.setObservacao(this.observacao);
        exame.setData(new SimpleDateFormat("dd-MM-yyyy").parse(this.data));

        return exame;
    }

    public Long getIdExame() {
        return this.idExame;
    }

    public void setIdExame(Long idExame) {
        this.idExame = idExame;
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
