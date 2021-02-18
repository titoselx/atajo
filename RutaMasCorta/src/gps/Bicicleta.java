package gps;

import java.util.Arrays;


/**
 * Aplicación para determinar cuál es el camino más corto de una ruta en bicicleta
 * @author Aaron Titos
 * @version 0.99alpha-1yloquesenosocurra
 */
public class Bicicleta {
	/**
	 * Clase Bicicleta
	 *
	 */
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
    }
    
    
    /**
     * Método para calcular el camino más corto, creamos tres variables a las que iremos
     * sumando todos los valores de los caminos, después, añadiremos esos valores a un 
     * array y ordenaremos ese array de menor a mayor.
     * @param camino1 camino 1
     * @param camino2 camino 2
     * @param camino3 camino 3
     * @return devuelve el camino más corto
     */
    public static String rutaCorta(int [] camino1, int [] camino2, int [] camino3)
    {
    	/**
    	 * Después de hacer las comprobaciones necesarias, se determinará el camino más corto.
    	 * @param op1 suma del camino 1
    	 * @param op2 suma del camino 2
    	 * @param op3 suma del camino 3
    	 * @param numeros lista con los caminos para ordenarlos
    	 * @return Retorna el camino más corto
    	 */
       int op1=0, op2=0, op3=0;
        
        for(int i=0; i<camino1.length;i++) {
        	op1= op1 + camino1[i];
        }
        for(int i=0; i<camino2.length;i++) {
        	op2= op2 + camino2[i];
        }
        for(int i=0; i<camino3.length;i++) {
        	op3= op3 + camino3[i];
        }

        int[] numeros = {op1,op2,op3};
        Arrays.sort(numeros);
        
        if(numeros[0]==op1) {
        	return "1";
        } else if (numeros[0] == op2) {
        	return "2";
        }else {
        	return "3";
        }
        
        
    }
    /**
     * Creamos una bicicleta y determinamos los caminos, finalmente,
     * imprimimos cuál es el camino más corto.
     * @param args método main
     */
    
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        int[] camino1 = {12,34,21,46,25};
        int[] camino2 = {24,1,5,64,10,15,21};
        int[] camino3 = {1,5,6,7,8,10,20,46,104};
        System.out.println("El camino más corto es el: "+Bicicleta.rutaCorta(camino1,camino2,camino3)+".");
    }
}

