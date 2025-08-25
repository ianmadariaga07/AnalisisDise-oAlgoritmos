package fes.aragon.inicio;

import fes.aragon.modelo.SucesionNumeros;

public class MainSucesionNumeros {
    public static void main(String[] args) {
        int[] sucesion = {2,4,6,8,9,1,3,5,7,10};

        SucesionNumeros suc = new SucesionNumeros();
        System.out.println("El valor maximo es: " + suc.max(sucesion));
    }
}

