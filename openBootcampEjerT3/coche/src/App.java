public class App {
    public static void main(String[] args) throws Exception {
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        
        System.out.println(miCoche.puerta);
    }
}

class Coche {
    public int puerta = 3;

    public void agregarPuerta(){
        this.puerta++;
    }
}
