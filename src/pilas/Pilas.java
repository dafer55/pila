/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.Scanner;

public class Pilas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rand = 0, opt = 0;
        char[] pila = new char[26];
        do {
            System.out.println("1 - llenar\n"
                    + "2 - eliminar\n"
                    + "3 - mostrar\n"
                    + "4 - salir\n");
            switch (opt = sc.nextInt()){
                case 1:
                    char  letra = 'A';
                    for (int i = 0; i < 26; i++) {
                        if (rand < 26) {
                            pila[rand] = letra;//abc[rand];
                            letra++;
                            rand++;
                        } else {
                            System.out.println("pila llena....");
                            break;
                        }
                    }
                    break;
                case 2:
                    if (rand > 0) {
                        System.out.println("dato eliminado..." + rand);
                        //restar unidad a tope, para poder reutilizar la posicion 
                        rand--;
                    } else {
                        System.out.println("no hay elementos para eliminar....");
                    }
                    
                    
                    break;
                case 3:
                    if (rand > 0) {
                        for (int i = rand - 1; i >= 0; i--) {
                            System.out.println(" " + pila[i]);
                        }
                    } else {
                        System.out.println("pila vacia....");
                    }
                    break;
                case 4:
                    if (rand > 0) {
                            System.out.println ("la pila se repitio,  veces"  );
                        }
                        break;
                    }
            } while (opt != 4);
        
        } 
    }
