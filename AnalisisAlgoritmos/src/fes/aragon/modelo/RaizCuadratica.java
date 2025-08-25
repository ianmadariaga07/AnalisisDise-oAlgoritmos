package fes.aragon.modelo;

//CALCULAR RAICES CUADRATICAS
public class RaizCuadratica {
    private double x1, x2, radicando;
    private String cadenax1, cadenax2, resultado;

    public  RaizCuadratica() {}

    public String raicesCuadraticas(double a, double b, double c) {
        radicando = radicandoCuadraticas(a,b,c);
        if (radicando >= 0.0){
            x1 = (-b + Math.sqrt(radicando)) / (2 * a);
            x2 = (-b - Math.sqrt(radicando)) / (2 * a);
            cadenax1 = String.valueOf(x1);
            cadenax2 = String.valueOf(x2);
            resultado = "x1: " + cadenax1 + "\nx2: " + cadenax2;
            return resultado;
        }
        return "Son raices complejas";
    }

    public double radicandoCuadraticas(double a, double b, double c) {
        return (b*b)-4*a*c;
    }
}

