package com.diego.automoviles.ingreso;

import com.diego.automoviles.vehiculo.camion.Camion;

import java.util.Scanner;

public class incamion extends Camion {


    public void incamion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la marca del camion: ");
        setMarca(scanner.nextLine());
        System.out.println("Ingrese la modelo del camion: ");
        setModelo(scanner.nextLine());
        System.out.println("Ingrese la velocidad del camion: ");
        setVelocidad(Integer.parseInt(scanner.nextLine()));
        System.out.println("Ingrese la año del camion: ");
        setAnio(Integer.parseInt(scanner.nextLine()));
        System.out.println("Ingrese la capacidad de carga del camion (KG): ");
        setCapacidadCarga(Integer.parseInt(scanner.nextLine()));

        mostrarInfo();
    }
}
