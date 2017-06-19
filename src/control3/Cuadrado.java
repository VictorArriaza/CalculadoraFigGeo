package control3;
/**
 *
 * @author Victor Arriaza
 */
public class Cuadrado extends Poligonos{
    int lado;
    
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    Cuadrado() {
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    @Override
    public void CalculaArea() {
        area = Math.pow(lado, 2);
    }

    @Override
    public void CalculaPerimetro() {
        perimetro = 4 * lado;
    }
}