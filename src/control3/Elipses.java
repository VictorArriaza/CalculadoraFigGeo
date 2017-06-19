package control3;
/**
 *
 * @author Victor Arriaza
 */
public abstract class Elipses extends FigGeometricas {
    int radio;
    double area;
    double perimetro;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public abstract void CalculaArea();

    @Override
    public abstract void CalculaPerimetro();
}