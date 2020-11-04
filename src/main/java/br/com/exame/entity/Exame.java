package br.com.exame.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exame {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paciente;

    private String exame;

    private String resultado;

    private String observacao;
    
    private String data;

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

    public Exame id(Long id) {
        this.id = id;
        return this;
    }

    public Exame paciente(String paciente) {
        this.paciente = paciente;
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

    public Exame data(String data) {
        this.data = data;
        return this;
    }



}
