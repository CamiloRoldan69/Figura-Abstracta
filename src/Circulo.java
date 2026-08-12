public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String tipo) {
        super(tipo);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    
}
