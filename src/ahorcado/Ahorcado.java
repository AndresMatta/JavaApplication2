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
        String categoria= JOptionPane.showInputDialog("Elija la categoria: A.Animales B.Plantas");
        String aleatoria="";
      
        String secreta="";
        int i = 0;
        int posicion1;
        int posicion2;
        String reintentar;
        
        Palabra p1 = new Palabra(intentos, categoria, aleatoria, letra);
        
        while(p1.aleatoria.length()>i){
          secreta= secreta + "*";  
          i=i+1;}
        
        JOptionPane.showMessageDialog(null, "el número de caracteres de la palabra es: " + p1.aleatoria.length());
        JOptionPane.showMessageDialog(null, p1.aleatoria);
        System.out.println("¡Adivina la palabra! \r" +  secreta);
        
        StringBuffer secretaBd = new StringBuffer(secreta);
        
                while(p1.aleatoria.equals(secretaBd.toString())==false && intentos<11){
                
                    System.out.print("Ingrese una letra");
                    letra =sc.next().charAt(0);
                   
                    if(Character.isLowerCase(letra))
                       letra=Character.toUpperCase(letra);
                   
                    if(p1.aleatoria.indexOf(letra)==-1){
                    JOptionPane.showMessageDialog(null, "Incorrecto");
                    intentos=intentos+1;
                   }
                    else if (p1.aleatoria.indexOf(letra)>=0){
                    posicion1= p1.aleatoria.indexOf(letra);
                    posicion2=p1.aleatoria.lastIndexOf(letra);
                    
                    secretaBd.setCharAt(posicion1, letra);
                    secretaBd.setCharAt(posicion2, letra);
                    
                    JOptionPane.showMessageDialog(null, "¡Correcto!" );
                    JOptionPane.showMessageDialog(null, secretaBd);
                    
                    }
                    }
        
        if (intentos>=11){
                    JOptionPane.showMessageDialog(null, "Perdiste, la palabra era: " + p1.aleatoria);
                    System.out.print(aleatoria);
                    System.exit(0);
        }else if(p1.aleatoria.equals(secretaBd.toString())){
            JOptionPane.showMessageDialog(null, "¡Felicidades ganaste!");
             System.out.print(aleatoria);
                    System.exit(0);
        }
        
       
        }
        }
     

