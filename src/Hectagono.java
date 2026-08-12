public class Hectagono extends Figura {
    private int lado;

    public Hectagono(int lado, String tipo) {
        super(tipo);
        this.lado = lado;
    }

    @Override
    public double area() {
        return (5 * (3 + Math.sqrt(5)) * lado * lado) / 2.0;
    }  
    
}
