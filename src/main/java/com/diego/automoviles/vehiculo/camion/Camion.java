package com.diego.automoviles.vehiculo.camion;

import com.diego.automoviles.vehiculo.Vehiculo;

public class Camion extends Vehiculo{
    private int capacidadCarga;

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    public void MostrarInfo(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Velocidad " + getVelocidad());
        System.out.println("Capacidad de carga: " + getCapacidadCarga());
    }
}
