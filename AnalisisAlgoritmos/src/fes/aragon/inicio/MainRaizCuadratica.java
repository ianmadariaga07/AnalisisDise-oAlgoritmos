package fes.aragon.inicio;

import fes.aragon.modelo.RaizCuadratica;

public class MainRaizCuadratica {
    public static void main(String[] args) {
        RaizCuadratica r = new RaizCuadratica();
        System.out.println("Tus raices son: \n" + r.raicesCuadraticas(1, 6, 1));
    }
}

