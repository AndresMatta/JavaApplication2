/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author Andrés Matta
 */
public class Palabra {
    //Variable categoria que guardara un valor insetado por el usuario.
    public String categoria="";
    //Arreglo que guarda las palabras de la categoria animales.
    public String[] animales;
    //Arreglo que guarda las palabras de la categoria plantas.
    public String[] plantas;
    //Arreglo que alojara el carácter insertado por el usario.
    public char[] letra; 
    //Variable utilizada como contador
    private int intentos;
    //Variable donde se alojara una palabra random de uno de los arreglos.
    String aleatoria;
    /**
     *Método constructor para los arreglos y variables.
     * @param intentos
     * @param categoria
     * @param aleatoria
     * @param letra
     */
    public Palabra(int intentos, String categoria, String aleatoria, char letra) {
        this.plantas = new String[]{"ALMENDRO", "AMAPOLA", "AGAVE", "BALSAMO", "BUDELIA", "CARDO", "CARDOSANTO", "EQUINOCACTUS", "GANDUL", "GRANADO", "HINOJO", "JAZMIN", "LINO", "OXALIS", "PAPIRO", "PETUNIA", "ROMERO", "TOMILLO", "TULIPERO", "VIBORERA", "ALAMO", "ARCE", "CALANIT"};
        this.animales = new String[]{"AGUILA", "ABEJA", "ALCE", "ANTILOPE", "AVESTRUZ", "BALLENA", "BISONTE", "BOROCHI", "BUFALO", "CAMELLO", "DROMEDARIO", "DELFIN", "ERIZO", "ESCUERZO", "FLAMENCO", "FOCA", "GACELA", "GAVIOTA", "GAVILAN", "HIENA", "HUEMUL", "JABIRU", "JAGUARUNDI", "JIRAFA", "KOALA", "KRILL", "LEMUR", "LUBINA", "MAPACHE", "MOFETA", "NUTRIA", "OSO", "PANTERA", "PELICANO", "PIHUEL", "QUOKKA", "QUAGGA", "RINOCERONTE", "SURICATA", "TOPO", "TORTUGA", "TUCAN", "VACA", "VIBORA", "VINCHUCA", "WALABI", "XOLOESCUINTLE", "YAK", "ZARIGUEYA"};
        this.letra = new char[0];
        this.categoria = categoria;
        this.aleatoria= aleatoria;
    }

    /**
     *Método estándar get para el arreglo letra.
     * @return letra
     */
    public char[] getLetra() {
        return letra;
    }

    /**
     *Método estándar set para el arreglo char letra.
     * @param letra
     */
    public void setLetra(char[] letra) {
        this.letra = letra;
    }

    /**
     *Método estándar get para la variable intentos.
     * @return intentos.
     */
    public int getIntentos() {
        return intentos;
    }

    /**
     *Método estándar set para la variable intentos.
     * @param intentos
     */
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    /**
     *Método estándar get para la variable aleatoria.
     * @return aleatoria
     */
    public String getAleatoria() {
        return aleatoria;
    }

    /**
     *Método estándar se para la variable aleatoria.
     * @param aleatoria
     */
    public void setAleatoria(String aleatoria) {
        this.aleatoria = aleatoria;
    }

    /**
     *Método que obtiene un random apartir del arreglo animales.
     * @return posicion
     */
    public int PosicionAnimales(){
        int posicion = (int)(Math.random() *animales.length);
        return posicion; 
    }
    
    /**
     *Método que obtiene un random apartir del arreglo de plantas.
     * @return posicion 
     */
    public int PosicionPlantas(){
        int posicion = (int)(Math.random() *plantas.length);
        return posicion;
    } 
    }


