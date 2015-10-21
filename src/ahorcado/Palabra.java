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
public class Palabra {
    
    public String[] categoria;
    String[] animales={"AGUILA", "ABEJA", "ALACRAN", "ALCATRAZ", "ALCE", "ANTILOPE", "AVESTRUZ", "BALLENA", "BISONTE", "BOROCHI", "BUFALO", "CACATUA", "CALAMAR", "CAMELLO", "DROMEDARIO", "DELFIN", "ERIZO", "ESCUERZO", "ELEFANTE", "FLAMENCO", "FOCA", "GACELA", "GAVIOTA", "GAVILAN", "HIENA", "HUEMUL", "IGUANA", "JABIRU", "JAGUARUNDI", "JIRAFA", "KOALA", "KRILL", "LEMUR", "LUBINA", "MAPACHE", "MOFETA", "NUTRIA", "ORNITORRINCO", "OSO", "PANTERA", "PAPAGAYO", "PELICANO", "PIHUEL", "QUOKKA", "QUAGGA", "RINOCERONTE", "SALAMANDRA", "SURICATA", "TOPO", "TORTUGA", "TUCAN", "VACA", "VIBORA", "VINCHUCA", "WALABI", "XOLOESCUINTLE", "YAK", "ZARIGUEYA"};
    public String[] plantas;
    public char[] letra= new char[11];
    private int intentos;
    String elegido;
    
    public Palabra(int intentos) {
        this.categoria = new String[]{"ANIMALES", "PLANTAS"};
        this.plantas = new String[]{"ALMENDRO", "AMAPOLA", "AGAVE", "BALSAMO", "BUDELIA", "CARDO", "CARDOSANTO", "DRAGONARIA", "EQUINOCACTUS", "GANDUL", "GRANADO", "HINOJO", "JAZMIN", "LAVANDA", "LINO", "MANZANILLA", "MARGARITA", "OXALIS", "PAPIRO", "PETUNIA", "ROMERO", "TOMILLO", "TULIPERO", "VIBORERA", "ALAMO", "ARCE", "CALANIT"};
        this.animales = new String[]{"AGUILA", "ABEJA", "ALACRAN", "ALCATRAZ", "ALCE", "ANTILOPE", "AVESTRUZ", "BALLENA", "BISONTE", "BOROCHI", "BUFALO", "CACATUA", "CALAMAR", "CAMELLO", "DROMEDARIO", "DELFIN", "ERIZO", "ESCUERZO", "ELEFANTE", "FLAMENCO", "FOCA", "GACELA", "GAVIOTA", "GAVILAN", "HIENA", "HUEMUL", "IGUANA", "JABIRU", "JAGUARUNDI", "JIRAFA", "KOALA", "KRILL", "LEMUR", "LUBINA", "MAPACHE", "MOFETA", "NUTRIA", "ORNITORRINCO", "OSO", "PANTERA", "PAPAGAYO", "PELICANO", "PIHUEL", "QUOKKA", "QUAGGA", "RINOCERONTE", "SALAMANDRA", "SURICATA", "TOPO", "TORTUGA", "TUCAN", "VACA", "VIBORA", "VINCHUCA", "WALABI", "XOLOESCUINTLE", "YAK", "ZARIGUEYA"};
        this.intentos = intentos;
        
        
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    public String elegirAnimales(){
       int aleatorio=(int)((Math.random()*animales.length)*10)/10;
       elegido=animales[aleatorio];
       return elegido;
       }

    @Override
    public String toString() {
        return "Palabra{" + "categoria=" + categoria + ", animales=" + animales + ", plantas=" + plantas + ", letra=" + letra + ", intentos=" + intentos + ", elegido=" + elegido + '}';
    }
    
}

