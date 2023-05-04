public class Circulo implements FiguraGeometrica2D {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(getRaio(), 2);
    }

    @Override
    public double getPerimetro(){
        return 2 * Math.PI;
    }

    @Override
    public String getNomedaFigura(){
        return "Quadrado";
    }

    @Override
    public int compareTo(FiguraGeometrica2D o) {
        return Double.compare(getArea(), o.getArea());
    }
}

