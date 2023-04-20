package com.mycompany.estacionamento.services;

import com.mycompany.estacionamento.businnes.ICalculoTarifa;
import com.mycompany.estacionamento.businnes.TarifaCarro;
import com.mycompany.estacionamento.businnes.TarifaMoto;
import com.mycompany.estacionamento.model.Vaga;
import java.util.ArrayList;

public class Estacionamento {

    private int numeroVagas;

    private ArrayList<Vaga> vagas;

    public Estacionamento(int numeroVagas) {

        this.numeroVagas = numeroVagas;
        this.vagas = new ArrayList<>();

    }

    public void addVaga(Vaga vaga) {

        vagas.add(vaga);

    }

    public void calcular() {
        boolean cliente;
        double tarifa = 0;

        if (this.vagas.size() > this.numeroVagas) {
            System.out.println("Todas as vagas que tinhamos disponiveis foram ocupadas");
        } else {
            for (Vaga vaga : vagas) {
                if (vaga.getVeiculo().getTipo() == "Moto") {
                    cliente = vaga.getVeiculo().getClientePreferencial();
                    ICalculoTarifa tMoto = new TarifaMoto();
                    tarifa = tMoto.calcular(cliente, vaga.getVeiculo().getHorasEstacionado());
                    System.out.println("Tarifa Moto:" + tarifa);
                } else if (vaga.getVeiculo().getTipo() == "Carro") {
                    cliente = vaga.getVeiculo().getClientePreferencial();
                    ICalculoTarifa tCarro = new TarifaCarro();
                    tarifa = tCarro.calcular(cliente, vaga.getVeiculo().getHorasEstacionado());
                    System.out.println("Tarifa Carro:" + tarifa);
                }
            }
        }
    }

}
