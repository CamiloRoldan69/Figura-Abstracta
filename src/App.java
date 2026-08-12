public class App {
    public static void main(String[] args) throws Exception {
        Figura figura1 = new Triangulo(8, 7, "Triangulo");
        Figura figura2 = new Cuadrado(6, "Cuadrado");
        Figura figura3 = new Hectagono(9, "Hectagono");
        Figura figura4 = new Circulo(6, "Circulo");
        
        System.out.println("Tipo: " + figura1.getTipo() + ", Area: " + figura1.area());
        System.out.println("Tipo: " + figura2.getTipo() + ", Area: " + figura2.area());
        System.out.println("Tipo: " + figura3.getTipo() + ", Area: " + figura3.area());
        System.out.println("Tipo: " + figura4.getTipo() + ", Area: " + figura4.area());
    }
}
