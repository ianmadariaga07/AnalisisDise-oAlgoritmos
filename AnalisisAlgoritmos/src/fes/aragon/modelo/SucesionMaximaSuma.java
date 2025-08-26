package fes.aragon.modelo;

import java.util.ArrayList;
import java.util.List;

/*
Desarrolle y analice un algoritmo que regrese la suma maxima de valores consecutivos
en una sucesion numerica x1,x2,...,xn Ejemplo: 27,6,-50,21,-3,14,16,-8,42,33,-21,9
el resultado seria de la siguiente forma 21,-3,14,16,-8,42,33 = 115
Primera propuesta es enontrar todos los valores de las sumas consecutivas
y escoger el mas grande
*/
public class SucesionMaximaSuma {
    private int max = 0;
    private int suma = 0;
    //private String resultado;
    private ArrayList<Integer> valoresConsecutivos = new ArrayList<>();

    public int maxSuma(int[] sucesion ){
        for (int i = 0; i < sucesion.length-1; i++) {
            if(suma + sucesion[i] > 0){
                suma += sucesion[i];
                valoresConsecutivos.add(sucesion[i]);
            } else {
                suma = 0;
                valoresConsecutivos.clear();
            }
            if(max < suma){
                max = suma;
            }
        }
        valoresConsecutivos.forEach(n -> System.out.print(n + ", "));
        return max;
    }
}

/*
public int maxSuma(int[] sucesion ){
        for (int i = 0; i < sucesion.length-1; i++) {
            if(suma + sucesion[i] > 0){
                suma = suma + sucesion[i];
            } else {
                suma = 0;
            }
            if(max < suma) max = suma;
        }
        return max;
    }
*/

/*
maxSuma(s,n){
    max=0
    suma=0
    for i=0 to n-1 do
        if(suma+s1 > 0)
            suma=suma+s1
        else
            suma=0
        if(suma>max)
            max=suma
    return max;
}
*/
