/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;



/**
 *
 * @author Admin
 */
public class Palabra {
    
    public String categoria;
    String[] animales={"AGUILA", "ABEJA", "ALACRAN", "ALCATRAZ", "ALCE", "ANTILOPE", "AVESTRUZ", "BALLENA", "BISONTE", "BOROCHI", "BUFALO", "CACATUA", "CALAMAR", "CAMELLO", "DROMEDARIO", "DELFIN", "ERIZO", "ESCUERZO", "ELEFANTE", "FLAMENCO", "FOCA", "GACELA", "GAVIOTA", "GAVILAN", "HIENA", "HUEMUL", "IGUANA", "JABIRU", "JAGUARUNDI", "JIRAFA", "KOALA", "KRILL", "LEMUR", "LUBINA", "MAPACHE", "MOFETA", "NUTRIA", "ORNITORRINCO", "OSO", "PANTERA", "PAPAGAYO", "PELICANO", "PIHUEL", "QUOKKA", "QUAGGA", "RINOCERONTE", "SALAMANDRA", "SURICATA", "TOPO", "TORTUGA", "TUCAN", "VACA", "VIBORA", "VINCHUCA", "WALABI", "XOLOESCUINTLE", "YAK", "ZARIGUEYA"};
    public String[] plantas={"ALMENDRO", "AMAPOLA", "AGAVE", "BALSAMO", "BUDELIA", "CARDO", "CARDOSANTO", "DRAGONARIA", "EQUINOCACTUS", "GANDUL", "GRANADO", "HINOJO", "JAZMIN", "LAVANDA", "LINO", "MANZANILLA", "MARGARITA", "OXALIS", "PAPIRO", "PETUNIA", "ROMERO", "TOMILLO", "TULIPERO", "VIBORERA", "ALAMO", "ARCE", "CALANIT"};
    public char[] letra= new char[11];
    private int intentos;
    String aleatoria;
    
    public Palabra(int intentos, String categoria, String aleatoria) {
        
        this.aleatoria= this.PalabraSecreta(aleatoria);
        this.categoria = categoria;
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

    public String getAleatoria() {
        return aleatoria;
    }

    public void setAleatoria(String aleatoria) {
        this.aleatoria = aleatoria;
    }
    
    
    public int PosicionAnimales(){
        
        int posicion = (int)(Math.random() *animales.length);
        return posicion;
        
    }
    
    public int PosicionPlantas(){
        
        int posicion = (int)(Math.random() *plantas.length);
        return posicion;
    }
    
    private String PalabraSecreta(String aleatoria){
        if ("1".equals(categoria)){
        aleatoria = animales[PosicionAnimales()];
    }   else{
        aleatoria= plantas[PosicionPlantas()];
        }
        return aleatoria;
    }   
    
    
    @Override
    public String toString() {
        return "Palabra{" + "categoria=" + categoria + ", animales=" + animales + ", plantas=" + plantas + ", letra=" + letra + ", intentos=" + intentos + ", elegido=" + aleatoria + '}';
    }
    
}


