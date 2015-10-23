/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int intentos= 0;
        String categoria= JOptionPane.showInputDialog("Elija la categoria: 1.Animales 2.Plantas");
        char letra= JOptionPane.showInputDialog("Digite una letra").charAt(0);
        String aleatoria="";
        
        
        Palabra p1 = new Palabra(intentos, categoria, aleatoria);
       
        while (intentos < 11) {
			intentos = intentos + 1;	
		}
        
        
        
        System.out.println(p1.toString());
        
    }
    
}
