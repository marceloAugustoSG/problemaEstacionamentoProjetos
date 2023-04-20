package com.mycompany.estacionamento;

import com.mycompany.estacionamento.model.Cliente;
import com.mycompany.estacionamento.services.Estacionamento;
import com.mycompany.estacionamento.model.Vaga;
import com.mycompany.estacionamento.model.VeiculoEstacionado;

public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Marcelo", true);
        Cliente c2 = new Cliente("Cristiano Ronaldo", false);

        VeiculoEstacionado v1 = new VeiculoEstacionado("Moto", 10, c1);
        VeiculoEstacionado v2 = new VeiculoEstacionado("Carro", 3, c2);
        Vaga vaga1 = new Vaga(v1);
        Vaga vaga2 = new Vaga(v2);

        Estacionamento estacionamento = new Estacionamento(10);
        estacionamento.addVaga(vaga1);
        estacionamento.addVaga(vaga2);
        estacionamento.calcular();

    }

}
