package fes.aragon.inicio;

import fes.aragon.modelo.NumeroGrande;

public class MainNumeroGrande {
    public static void main(String[] args) {
        NumeroGrande numero = new NumeroGrande();
        //System.out.printf("El numero mas grande es: " + numero.max(20, 50, 15));
        System.out.printf("El numero mas grande es: " + numero.maxTernario(10, 1, 15));
    }
}
