package com.trybe.acc.java;

/**
 * Método principal.
 */

public class Moto extends VeiculoBase {

  private final String passengers;

  public Moto(String marca, String modelo, int ano, String tipoCombustivel,
      int capacidadeTanque,
      String passengers) {
    super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);
    this.passengers = passengers;
  }

  public String getPassengers() {
    return passengers;
  }

  @Override
  public double calcularConsumoCombustivel(double distancia) {
    return distancia / 18;
  }

  @Override
  public void exibirInformacoes() {
    System.out.printf(
        "%s %s %i - Combustível: %s; Capacidade do Tanque: %i; Capacidade de passageiros: %s%n",
        getMarca(), getModelo(), getAno(), getTipoCombustivel(), getCapacidadeTanque(),
        getPassengers());
  }

}
