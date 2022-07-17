// aqui?

public class App {
    
    public static void main(String[] args) {

        // ejercicio de suma

        int resultado; 
        resultado = suma (23,44,22);

        System.out.println(resultado);

        //  ejercicio de poner puerta coche
        Coche miCoche = new Coche();

        miCoche.PonerPuerta();
        miCoche.PonerPuerta();
        miCoche.PonerPuerta();
        System.out.println(miCoche.puertas);





    }

    public static int suma(int a, int b, int c) {
        return a + b + c;

    }

}
class Coche {
    public int puertas = 0;
    public void PonerPuerta() {
        this.puertas++;

    }
}