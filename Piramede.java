/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroPOO;

/**
 *
 * @author julia.rosa
 */
public class Piramede {
    private float ab;
    private float h;
    private int tinta = 0;
    
     
    public int getTinta() {
        return tinta;
    }

    public void setTinta(int tinta) {
        this.tinta = tinta;
    }

    
    public float getAb() {
        return ab;
    }

    public void setAb(float ab) {
        this.ab = ab;
    }
    
    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }
    
    public double CalculoA1(){
        double a1 = Math.sqrt((Math.pow(h, 2)) + (Math.pow(ab, 2)));
        return a1;
    }
    
    public double B(){
        double b = ab+ab;
        return b;
    }
    
    
    public double AreaTriangulo(){
     double areaTriangulo = (B() * a1) / 2;
        return areaTriangulo;
    }
    
    public double AreaBase(){
        double areaBase = B() * B();
        return areaBase;
    }
    
    public double AreaTotal(){
        double areaTotal =  AreaBase() + (AreaTriangulo() * 4);
        return areaTotal;
    }
    public double MetrosPintados(){
        double metrosPintados = 4.76;
    }
    public double QuantidadeLitros(){
        double litros = (AreaTotal() / MetrosPintados());
        return litros;
    }
    
    public double QuantidadeLatas(){
        double latas = Math.ceil(Litros / 18);
        return latas;
    }
    
    public double Volume(){
        double volume = (areaBase / (float) 3) * h);
        return volume;
    }
   
    public double Preco(){
        double preco = QuantidadeLatas() * Valor();
        return preco;
    }
    
    
    public double Valor() {
            switch (tinta) {
                case 1:
                    valor = (float) 127.90;
                    break;
                case 2:
                    valor = (float) 258.98;
                    break;
                case 3:
                    valor = (float) 344.34;
                    break;
                default:
                    valor = (float) 0.0;
                    break;
            }
        return valor();
    }
    
}
