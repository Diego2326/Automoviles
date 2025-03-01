package com.diego.automoviles.ingreso;

import com.diego.automoviles.vehiculo.auto.Auto;

import java.util.Scanner;

public class InAuto extends Auto{
    public void incamion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la marca del auto: ");
        setMarca(scanner.nextLine());
        System.out.println("Ingrese la modelo del auro: ");
        setModelo(scanner.nextLine());
        System.out.println("Ingrese la velocidad del auto: ");
        setVelocidad(Integer.parseInt(scanner.nextLine()));
        System.out.println("Ingrese la año del auto: ");
        setAnio(Integer.parseInt(scanner.nextLine()));
        System.out.println("Ingrese la cantidad de puertas: ");
        setCantidadPuertas(Integer.parseInt(scanner.nextLine()));
        mostrarInfo();
    }
}
