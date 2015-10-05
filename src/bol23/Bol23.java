
package bol23;

import java.util.Scanner;

/**
 *
 * @author julianlinux
 */
public class Bol23 {

    
    public static void main(String[] args) {
        
        float euro, vdolar=1.1162f;//Metí yo a como esta el cambio 
        Scanner obx=new Scanner (System.in);
        System.out.println("Mete los euros que quieras cambiar:");
        euro=obx.nextFloat();
        System.out.println("En dolares son:"+euro*vdolar);
        
        
    }
    
}
