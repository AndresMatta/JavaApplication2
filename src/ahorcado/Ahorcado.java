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
        char letra;
        int intentos= 0;
        String categoria= JOptionPane.showInputDialog("Elija la categoria: a.Animales b.Plantas");
        String aleatoria="";
        int aciertos=0;
        
        Palabra p1 = new Palabra(intentos, categoria, aleatoria, aciertos);
        JOptionPane.showMessageDialog(null, "el número de caracteres de la palabra es: " + p1.aleatoria.length());
        JOptionPane.showMessageDialog(null, "palabra=" + p1.aleatoria);
        
        while(intentos<11 || p1.aleatoria.length()== p1.aciertos){
                System.out.print("Ingrese una letra");
                letra =sc.next().charAt(0);
                
                if(p1.aleatoria.indexOf(letra)==-1){
                    JOptionPane.showMessageDialog(null, "Incorrecto");
                    intentos=intentos+1;
                    
                }else{
                    JOptionPane.showMessageDialog(null, "¡Correcto!");
                    aciertos=aciertos + 1;
                }
                    }
        if (11<=intentos){
                    JOptionPane.showMessageDialog(null, "Perdiste");
                    System.exit(intentos);
        }else if(11<=aciertos){
            JOptionPane.showMessageDialog(null, "¡Felicidades ganaste!");
        }
        
        
        
        }
        }
    
     

