package com.diego.automoviles.vehiculo.moto;
import com.diego.automoviles.vehiculo.Vehiculo;

public class Moto extends Vehiculo {
    private String tipoManubrio;

    public String getTipoManubrio() {
        return tipoManubrio;
    }

    public void setTipoManubrio(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }
    
    public void MostrarInfo(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Velocidad " + getVelocidad());
        System.out.println("Tipo de manubrio: " + getTipoManubrio());
    }
}
