package com.mycompany.estacionamento.businnes;

public class TarifaMoto implements ICalculoTarifa {

    @Override
    public double calcular(boolean isPreferencial, int horas) {
        double tarifa = 0;
        double desconto = 0;
        double valor = 0;
        if (isPreferencial == true) {

            if (horas <= 4) {
                valor = 2.50;
                desconto = valor * 0.30;
                tarifa = valor - desconto;

            } else if (horas >= 5 && horas <= 12) {
                valor = 10;
                desconto = valor * 0.30;
                tarifa = valor - desconto;

            } else if (horas >= 13 && horas <= 24) {
                valor = 20;
                desconto = valor * 0.30;
                tarifa = valor - desconto;
            } else {
                System.out.println("Limite de horas excedido");

            }
        } else if (isPreferencial == false) {

            if (horas <= 4) {

                tarifa = 2.5;

            } else if (horas >= 5 && horas <= 12) {
                tarifa = 10;

            } else if (horas >= 13 && horas <= 24) {
                tarifa = 20;
            } else {
                System.out.println("Limite de horas excedido");

            }

           
        }
        return tarifa;

    }
}
