package fes.aragon.inicio;

import fes.aragon.modelo.SucesionMaximaSuma;

public class MainSucesionMaximaSuma {
    public static void main(String[] args) {
        int[] sucesion = {27,6,-50,21,-3,14,16,-8,42,33,-21,9};

        SucesionMaximaSuma max = new SucesionMaximaSuma();
        System.out.println("Los valores consecutivos son: ");
        System.out.println("\nLa suma maxima de valores consecutivos es: " + max.maxSuma(sucesion));
    }
}
