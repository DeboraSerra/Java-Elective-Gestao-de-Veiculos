package com.trybe.acc.java;

/**
 * Método principal.
 */

public class Carro extends VeiculoBase {

  private final int passengers;

  public Carro(String marca, String modelo, int ano, String tipoCombustivel, int capacidadeTanque,
      int passengers) {
    super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);
    this.passengers = passengers;
  }

  public int getPassengers() {
    return passengers;
  }

  @Override
  public double calcularConsumoCombustivel(double distancia) {
    return distancia / 10;
  }

  @Override
  public void exibirInformacoes() {
    System.out.printf(
        "%s %s %i - Combustível: %s; Capacidade do Tanque: %i; Capacidade de passageiros: %i%n",
        getMarca(), getModelo(), getAno(), getTipoCombustivel(), getCapacidadeTanque(),
        getPassengers());
  }
}
