/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package model;

/**
 *
 * @author gtvargas
 */
public class Ponto {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Ponto() {

    }

    public Ponto(int x, int y) {
        setX(x);
        setY(y);
    }

    public Quadrante identificarQuadrante() {
        if (x > 0 && y > 0) {
            return Quadrante.PRIMEIRO;
        }
        if (x < 0 && y > 0) {
            return Quadrante.SEGUNDO;
        }
        if (x < 0 && y < 0) {
            return Quadrante.TERCEIRO;
        }
        if (x > 0 && y < 0) {
            return Quadrante.QUARTO;
        }
        return Quadrante.NENHUM;

    }

    public boolean estaIncidindoSobreX() {
        return y == 0;
    }

    public boolean estaIncidindoSobreY() {
        return x == 0;
    }
    
    /**
     * o calculo da distancia euclinada entre o objeto atual e ponto
     * @param outroPonto pontoo a ser utilizado para mediar a distancia
     * @return a distancia entre o objeto e o ponto recebido por metodo
     */
    public double calcularDistancia(Ponto outroPonto){
        int distanciaX = outroPonto.getX() - this.getX();
        int distanciaY = outroPonto.getY() - this.getY();
        
        double distancia = Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
        return distancia;
    }
    
    
    /**
     * realiza o calculo da distancia euclidiana entre dois pontos
     * @param p1 primeiro ponto a ser utilizado na distancia
     * @param p2 segundo ponto a ser utilizado na distancia
     * @return a distancia entre os dois pontos
     */
    public static double calcularDistancia(Ponto p1, Ponto p2){
        return p1.calcularDistancia(p2);
    }

}
