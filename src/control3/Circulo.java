package control3;
/**
 *
 * @author Victor Arriaza
 */
public class Circulo extends Elipses {

    public Circulo(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    Circulo() {
    }
    
    @Override
    public void setRadio(int radio) {
        super.setRadio(radio);
    }

    @Override
    public int getRadio() {
        return super.getRadio();
    }

    @Override
    public void CalculaArea() {
        area = Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void CalculaPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }
}