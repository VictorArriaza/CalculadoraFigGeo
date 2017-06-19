package control3;
/**
 *
 * @author Victor Arriaza
 */
public class Triangulo extends Poligonos{
    int ladoA;
    int ladoB;
    int ladoC;
    String tipoTriangulo;

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public String getTipoTriangulo() {
        return tipoTriangulo;
    }

    public void setTipoTriangulo(String tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }
    
    @Override
    public void CalculaArea() {
        switch (tipoTriangulo){
            case "Equilatero":
                area = ((Math.sqrt(3))/4) * ladoA;
                break;
            case "Isosceles":
                area = (ladoB * (Math.sqrt(Math.pow(ladoA, 2) - (Math.pow(ladoB, 2)/4)))) / 2;
                break;
            case "Escaleno":
                int s = (ladoA + ladoB + ladoC) / 2; 
                double s1 = (s - ladoA) * (s - ladoB) * (s - ladoC);
                area = Math.sqrt(s * s1);
                break;
            case "Rectangulo":
                area = (ladoA * ladoB) / 2;
                break;
            default:
                break;
        }
    }

    @Override
    public void CalculaPerimetro() {
        switch (tipoTriangulo) {
            case "Equilatero":
                perimetro = 3 * ladoA;
                break;
            case "Isosceles":
                perimetro = 2 * ladoA + ladoB;
                break;
            case "Escaleno":
                perimetro = ladoA + ladoB + ladoC;
                break;
            case "Rectangulo":
                perimetro = ladoA + ladoB + ladoC;
                break;
            default:
                break;
        }
    }
}