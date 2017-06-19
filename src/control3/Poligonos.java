package control3;
/**
 *
 * @author Victor Arriaza
 */
public abstract class Poligonos extends FigGeometricas{
    double area;
    double perimetro;
    String tipo;
    
    @Override
    public abstract void CalculaArea();

    @Override
    public abstract void CalculaPerimetro();
}