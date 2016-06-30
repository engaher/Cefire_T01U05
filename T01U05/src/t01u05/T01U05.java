

package t01u05;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class T01U05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona [] personas = new Persona[3];
        Persona p;
        String nombre, nif;
        //// Leer Personas
        for(int i = 0; i < personas.length; i++){
            System.out.println("Persona " + (i+1));
            System.out.print("Nif: ");
            nif = sc.nextLine();
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            p = new Persona();
            p.setNif(nif);
            p.setNombre(nombre);
            personas[i]= p;
        }
        
        //// Mostrar personas
         for(int i = 0; i < personas.length; i++){
            System.out.println(personas[i]);
        }
    }
    
}
