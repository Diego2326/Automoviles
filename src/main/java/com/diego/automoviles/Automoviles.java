package com.diego.automoviles;

import com.diego.automoviles.ingreso.InAuto;
import com.diego.automoviles.ingreso.incamion;
import com.diego.automoviles.ingreso.InMoto;


public class Automoviles {

    public static void main(String[] args){
        incamion inCamion = new incamion();
        InAuto inAuto = new InAuto();
        InMoto inMoto = new InMoto();

        inCamion.incamion();
    }
}
