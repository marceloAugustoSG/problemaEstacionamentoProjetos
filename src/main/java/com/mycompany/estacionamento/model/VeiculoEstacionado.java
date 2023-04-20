package com.mycompany.estacionamento.model;

public class VeiculoEstacionado {

    private String tipo;
    private int horasEstacionado;
    private Cliente cliente;

    public VeiculoEstacionado(String tipo, int horasEstacionado, Cliente cliente) {
        this.tipo = tipo;
        this.horasEstacionado = horasEstacionado;
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public int getHorasEstacionado() {
        return horasEstacionado;
    }

    public boolean getClientePreferencial() {

        return cliente.isIsPreferencial();
    }

}
