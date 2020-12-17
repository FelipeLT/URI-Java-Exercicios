/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uriexercicio2763;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class UriExercicio2763 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
		String cpf = input.next();
		String A = cpf.substring(0, 3);
		String B = cpf.substring(4, 7);
		String C = cpf.substring(8, 11);
		String D = cpf.substring(12, 14);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
	}   
    }
