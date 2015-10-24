/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        char letra=0;
        int intentos= 0;
        String categoria= JOptionPane.showInputDialog("Elija la categoria: a.Animales b.Plantas");
        String aleatoria="";
        int aciertos=0;
        
        String secreta="";
        int i = 0;
        
        Palabra p1 = new Palabra(intentos, categoria, aleatoria, aciertos, letra);
        JOptionPane.showMessageDialog(null, "el número de caracteres de la palabra es: " + p1.aleatoria.length());
        
        
        
        while(p1.aleatoria.length()>i){
          secreta= secreta + "*";      
          i=i+1;
         }
        
        
         System.out.println("¡Adivina la palabra! \r" + secreta);
        
         while(intentos<11 || p1.aleatoria.length()<= aciertos){
               System.out.print("Ingrese una letra");
                letra =sc.next().charAt(0);
                
                if(p1.aleatoria.indexOf(letra)==-1){
                    JOptionPane.showMessageDialog(null, "Incorrecto");
                    intentos=intentos+1;
                    
                }else if (p1.aleatoria.indexOf(letra)>0){
                    JOptionPane.showMessageDialog(null, "¡Correcto!");
                    aciertos=aciertos + 1;
                }
                    }
       
        
        if (11<=intentos){
                    JOptionPane.showMessageDialog(null, "Perdiste");
                    System.out.print(aleatoria);
                    System.exit(intentos);
        }else if(11<=aciertos){
            JOptionPane.showMessageDialog(null, "¡Felicidades ganaste!");
             System.out.print(aleatoria);
                    System.exit(intentos);
        }
        
        
        
        }
        }
    
     

