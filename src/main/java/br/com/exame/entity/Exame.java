package br.com.exame.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Exame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExame;

    private String exame;

    private String resultado;

    private String observacao;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data;

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

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {

        if (data.after(new Date())) {
            this.data = data;
        }
    }

    public Exame id(Long idExame) {
        this.idExame = idExame;
        return this;
    }

    public Exame exame(String exame) {
        this.exame = exame;
        return this;
    }

    public Exame resultado(String resultado) {
        this.resultado = resultado;
        return this;
    }

    public Exame observacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    public Exame data(Date data) {
        this.data = data;
        return this;
    }

}
