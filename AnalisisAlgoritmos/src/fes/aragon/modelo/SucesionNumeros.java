package fes.aragon.modelo;
/*
ENCUENTRA EL VALOR MAXIMO EN UNA SUCESION DE NUMEROS
SUCESION DE NUMEROS SON S=S1,S2,...,SN
ENTRADA: S,N
SALIDA: GRANDE(EL MAYOR DE S)
*/
public class SucesionNumeros {
    private int grande;
    private int[] sucesion;

    public SucesionNumeros() {}

    public int max(int[] sucesion) {
        grande = sucesion[0];
        for (int i = 0; i < sucesion.length; i++) {
            if (sucesion[i] > grande) {
                grande = sucesion[i];
            }
        }
        return grande;
    }
}

/*
max(s,n)
    grande=s1
    for i = 2 to n
        if(si > grande)
            grande = si
    return grande
*/
