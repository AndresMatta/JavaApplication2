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
 * @author Andrés Matta
 */
public class Ahorcado {
    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        //Para la lectura de datos.
        Scanner sc = new Scanner(System.in);
        //Variables traidas de la clase Palabra.
        char letra=0;
        int intentos= 0;
        String categoria="";
        String aleatoria="";
       //Variables propias de la clase main.
        String secreta="";
        int i = 0;
        int posicion1;
        int posicion2;
        //Variables utilizadas en los menus.
        String menu;
        int r=0;
        String reintentar;
        //Instancia de la clase Palabra.
        Palabra p1 = new Palabra(intentos, categoria, aleatoria, letra);
        //Ciclo que permite volver a reiniciar el juego.
        while(r==0){
       //If que genera el menu para jugar o salir.
        menu=JOptionPane.showInputDialog("A.Jugar B.Salir");
         if(menu.equalsIgnoreCase("B")){
            System.exit(intentos);
        }
        //igenera la cadena random para la variable aleatoria, por medio de los métodos de la clase Palabra.
        p1.categoria= JOptionPane.showInputDialog("Elija la categoria: A.Animales B.Plantas");
        if(p1.categoria.equalsIgnoreCase("A")){
            p1.aleatoria=p1.animales[p1.PosicionAnimales()];
        }else{
            p1.aleatoria=p1.plantas[p1.PosicionPlantas()];
        }
         //genera una cadena llena de "*" de la misma longitud que la variable aleatoria.
       while(p1.aleatoria.length()>i){
          secreta= secreta + "*";  
          i=i+1;}
        //Revela la cantidad de digitos de la palabra.
        JOptionPane.showMessageDialog(null, "el número de caracteres de la palabra es: " + p1.aleatoria.length());
        JOptionPane.showMessageDialog(null, p1.aleatoria);
        System.out.println("¡Adivina la palabra! \r" +  secreta);
        //Permite modificar una cadena de caracteres.
        StringBuffer secretaBd = new StringBuffer(secreta);
        //Ciclo del juego, con el contador de intentos.
                while(p1.aleatoria.equals(secretaBd.toString())==false && intentos<11){
                System.out.print("Ingrese una letra");
                    letra =sc.next().charAt(0);
                   //Permite ingresar minúsculas.
                    if(Character.isLowerCase(letra))
                       letra=Character.toUpperCase(letra);
                   //Busca el caracter en la palabra, si no esta devuelvo un int -1.
                    if(p1.aleatoria.indexOf(letra)==-1){
                    JOptionPane.showMessageDialog(null, "Incorrecto");
                    intentos=intentos+1;
                   }//Si lo encuentra, retorna un valor entero >=0.
                    else if (p1.aleatoria.indexOf(letra)>=0){
                    posicion1= p1.aleatoria.indexOf(letra);
                    posicion2=p1.aleatoria.lastIndexOf(letra);
                    //Modifica la cadena del StringBuffer.
                    secretaBd.setCharAt(posicion1, letra);
                    secretaBd.setCharAt(posicion2, letra);
                    //Revela letras acertadas.
                    JOptionPane.showMessageDialog(null, "¡Correcto!" );
                    JOptionPane.showMessageDialog(null, secretaBd);
                    }
                    }
        //Informa al usuario que perdió si el contador llego 11, revela la palabra oculta.
        if (intentos>=11){
                    System.out.print(p1.aleatoria);
                    JOptionPane.showMessageDialog(null, "Perdiste, la palabra era: " + p1.aleatoria);
        //Mensaje de felicitacion.            
        }else if(p1.aleatoria.equals(secretaBd.toString())){
            JOptionPane.showMessageDialog(null, "¡Felicidades ganaste!");  
        }
        //Opcion de reintentar.
        reintentar=JOptionPane.showInputDialog("¿Desea volver a jugar? A.Sí B.No");
        if(reintentar.equalsIgnoreCase("B"))
            //Fin del programa.
            System.exit(r);
        }
        }
        }

