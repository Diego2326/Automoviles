package com.diego.automoviles.vehiculo.auto;


import com.diego.automoviles.vehiculo.Vehiculo;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    
    public void MostrarInfo(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Velocidad " + getVelocidad());
        System.out.println("Cantidad de puertas: " + getCantidadPuertas());

    }
}
