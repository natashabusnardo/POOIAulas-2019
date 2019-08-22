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
public class ConeMain {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        Cone c = new Cone();
        
        System.out.println("Digite o raio: ");
        c.setR(entrada.nextDouble());
        
        System.out.println("Digite a altura: ");
        c.setC(entrada.nextDouble());
        
        System.out.println("Digite o tipo: ");
        c.setTipo(entrada.nextInt());
        
        System.out.println("-->Cone");
        System.out.println("Raio: "+c.getR());
        System.out.println("Altura: "+c.getC());
        System.out.println("----------------------------");
        System.out.println("Geratriz: "+c.getG());
        System.out.println("----------------------------");
        System.out.println("Área do Fundo: "+c.AreaCirculo());
        System.out.println("Área Lateral Cone: "+c.AreaLateral());
        System.out.println("Área Total: "+c.AreaTotal());
        System.out.println("----------------------------");
        System.out.println("Litros: "+c.QuantidadeLitros());
        System.out.println("Latas: "+c.QuantidadeLatas());
        System.out.println("----------------------------");
        System.out.println("Preço total: "+c.PrecoTotal());
        
    }
}
