package br.edu.unisep.despesas.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Lancamento {
    private int id;
    private String observacao;
    private Calendar data;
    private Double valor;
    private Tipo tipo;
    private Categoria categoria;
    private Empresa empresa;

    public Lancamento() {
    }

    public Lancamento(int id, String observacao, Calendar data, Double valor, Tipo tipo, Categoria categoria, Empresa empresa) {
        this.id = id;
        this.observacao = observacao;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.categoria = categoria;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        return "Lançamento\n" +
                "ID: " + this.id + "\n" +
                "Observação: " + this.observacao + "\n" +
                "Data: " + sdf.format(this.data.getTime()) + "\n" +
                "Valor: " + this.valor + "\n" +
                "Tipo: " + this.tipo + "\n" +
                "Categoria: " + this.categoria + "\n" +
                "Empresa: " + this.empresa;
    }

}
