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
public class Cone {
    double g, c, r;
    int tipo;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getG() {
        g = Math.sqrt((c*c)+(r*r));
        return g;
    }


    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double AreaTotal(){
        double AreaTotal = ((3.14*r)*(r+g));
        return AreaTotal;
    }
    
    public double AreaCirculo(){
        double AreaCirculo = (3.14*(r*r));
        return AreaCirculo;
    }
    
    public double AreaLateral(){
        double AreaLateral = (3.14*r*g);
        return AreaLateral;
    }
    
    public double QuantidadeLitros(){
        double litros = AreaTotal()*3.45;
        return litros;
    }
    
    public double QuantidadeLatas(){
        double latas = Math.ceil(QuantidadeLitros()/18);
        return latas;
    }
    
    public double PrecoTotal() {
       double precototal = 0;
        switch(tipo){
            case 1 :
                precototal = QuantidadeLatas() * 238.90;
            break;
            case 2 :
                precototal = QuantidadeLatas() * 467.98;
            break;
            case 3 :
                precototal = QuantidadeLatas() * 758.34;
            break;
        }
        return precototal;
    }
}
