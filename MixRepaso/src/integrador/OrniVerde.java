
package integrador;

import java.util.Scanner;

/**
 *
 * @author Grupo 2
 */

    
public class OrniVerde extends Castor implements MamaPata{

    public OrniVerde(String nombre, double longitudCola, int velocidad) {
        super(nombre, longitudCola, velocidad);
    }

    public void tocarGuitorgan(Scanner sc){
        super.tocarGuitarra();
        tocarOrgano(sc);
        System.out.println("cuac cuaac...!");
        
    }   

    @Override
    public void tocarOrgano(Scanner sc) {
        System.out.println("Do-Re-Mi");
        System.out.println("Presiona la tecla 'Enter' para continuar...");
        sc.nextLine();
        System.out.println("Fa-Sol-La-Si");
    }
    
}
