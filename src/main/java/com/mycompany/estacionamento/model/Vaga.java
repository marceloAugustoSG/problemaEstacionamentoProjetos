package com.mycompany.estacionamento.model;

public class Vaga {

    private VeiculoEstacionado veiculo;

    public Vaga(VeiculoEstacionado veiculo) {
        this.veiculo = veiculo;
    }

    public VeiculoEstacionado getVeiculo() {
        return veiculo;
    }

}
