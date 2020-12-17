/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1467;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Uri1467 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        while (input.hasNext()) {
        int a = input.nextInt();
        int b = input.nextInt(); 
        int c = input.nextInt(); 
        
        if (a==0 && b==0 && c==1 || a==1 && b==1 && c==0) System.out.println("C");
        if (a==0 && b==1 && c==0 || a==1 && b==0 && c==1) System.out.println("B");
        if (a==1 && b==0 && c==0 || a==0 && b==1 && c==1) System.out.println("A");
        if (a==0 && b==0 && c==0 || a==1 && b==1 && c==1) System.out.println("*");
        }
        input.close();
    }
    
}
