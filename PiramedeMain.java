/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroPOO;

import java.util.Scanner;

/**
 *
 * @author julia.rosa
 */
public class PiramedeMain {
    public static void main(String[] args) {
        Piramede pi = new Piramede();
        Scanner read = new Scanner(System.in);
        System.out.println("Informe ab: ");
        pi.setAb(read.nextFloat());
        System.out.println("Informe h: ");
        pi.setH(read.nextFloat());
        pi.setA1();
        pi.setB();
        pi.setAreaTriangulo();
        pi.setAreaBase();
        pi.setAreaTotal();
        int tinta=0;
        do{
        System.out.println("Informe se a tinta é do tipo 1, 2 ou 3: ");
        tinta = read.nextInt();
            if((tinta<=0)||(tinta>3))
            System.out.println("Entrada inválida, tente novamente.");
        }while((tinta<=0)||(tinta>3));
        pi.setTinta(tinta);
        pi.setValor();
        read.close();
        
        
        pi.setLitros();
        pi.setLatas();
        pi.setPreco();
        pi.setVolume();
        System.out.println("ab: "+pi.getAb());
        System.out.println("h: "+pi.getH());
        System.out.println("a1: "+pi.getA1());
        System.out.println("Área Triângulo: "+pi.getAreaTriangulo());
        System.out.println("Area Base: "+pi.getAreaBase());
        System.out.println("Area Total: "+pi.getAreaTotal());
        System.out.println("Tipo de Tinta: "+ pi.getTinta());
        System.out.println("Litros "+pi.getLitros());
        System.out.println("Latas: "+pi.getQuantidadeLatas());
        System.out.println("Preço: "+pi.getPreco());
        System.out.print("Volume: "+pi.getVolume());
    }
}
