public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(int lado, String tipo) {
        super(tipo);
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
    
}
