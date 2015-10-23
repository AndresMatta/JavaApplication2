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
        int intentos= 0;
        String categoria= JOptionPane.showInputDialog("Elija la categoria: 1.Animales 2.Plantas");
        char charAt = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        char letra= sc.nextLine().charAt(0);
        String aleatoria="";
        
        
        Palabra p1 = new Palabra(intentos, categoria, aleatoria);
        JOptionPane.showMessageDialog(null, "el número de caracteres de la palabra es: " + p1.aleatoria.length());
       
        if(intentos>=11){
                    JOptionPane.showMessageDialog(null, "Perdiste");
        }
        else{
            switch(intentos){
            case 0:if(p1.aleatoria.indexOf(charAt)>0){
                JOptionPane.showMessageDialog(null, "¡Correcto!");
                break;
                }
                else{
                JOptionPane.showMessageDialog(null, "Incorrecto");
                intentos = intentos + 1;
                 break;
                        }
                                }
        
            
           
    
     

