package fes.aragon.modelo;
/*
EL NUMERO MAS GRANDE ENTRE LOS NUMEROS REALES A,B,C
ENTRADA: A,B,C
SALIDA:GRANDE(EL MAYOR DE A,B,C)
*/
public class NumeroGrande {
    private int grande, resultado;

    public int max(int a, int b, int c) {
        grande = a;
        if (b>grande){
            grande = b;
        } else if(c>grande){
            grande = c;
        }
        return grande;
        //return Math.max(a, Math.max(b, c));
    }

    public int maxTernario(int a, int b, int c) {
        grande = a;
        resultado = ( b > grande ) ? grande=b : ( c > grande ) ? grande=c : grande;
        return resultado;
    }
}

//String resultado = (numeroRandom % 2 == 0) ? "Par" : (numeroRandom % 3 == 0 || numeroRandom == 1) ? "impar" : "no valido " ;
//        System.out.println(resultado);