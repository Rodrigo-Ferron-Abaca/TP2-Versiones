
package integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author GRUPO 2
 */
public class MainClass {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {

        //parte 1 Samira
        
        
        
        
        System.out.println("Ingrese longitud de cola");
        double longitudIngresada = sc.nextDouble();
        
        System.out.println("Ingrese velocidad del 1 al 8");
        int velocidadIngresada = sc.nextInt();
        
        System.out.println("Ingrese velocidad de propulsión de 5 a 10km/s para blue");
        int propulsionIngresadaBlue = sc.nextInt();
        
        System.out.println("Ingrese velocidad de propulsión de 5 a 10km/s para blui");
        int propulsionIngresadaBlui = sc.nextInt();
        
        sc.nextLine();
        
        



       
        OrniVerde orniVerde1 = new OrniVerde("Juanjo", 
                longitudIngresada, velocidadIngresada);
        
        orniVerde1.nadar();
        orniVerde1.tocarGuitarra();
        orniVerde1.tocarGuitorgan(sc);
        orniVerde1.tocarOrgano(sc);
        
        OrniAzul orniAzul1 = new OrniAzul("blue", 
                longitudIngresada, velocidadIngresada, propulsionIngresadaBlue);
        OrniAzul orniAzul2 = new OrniAzul("blui", 
                longitudIngresada, velocidadIngresada, propulsionIngresadaBlui);
        
        orniAzul1.nadar();
        orniAzul1.tocarGuitarra();
        
        orniAzul2.nadar();
        orniAzul2.tocarGuitarra();
        
        //System.out.println("El nombre del orniazul1 es " + orniAzul1.getNombre());
        
       
        
        

        //Parte 3 Tomas
        
        
        /*  :3
        
        Castor[] hermanos = new Castor[3];
        
        try{
            hermanos[0] = orniVerde1;
            hermanos[1] = orniAzul1;
            hermanos[2] = orniAzul2;
            
            
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Índice fuera de rango.");
            e.getMessage();
        } finally {
            System.out.println("Los ornitohermanos están juntos al fin.");
        }
        
        ArrayList<OrniAzul> nadadores = new ArrayList();
        
        for (int i = 0; i < hermanos.length; i++) {
            if(hermanos[i] instanceof OrniAzul){
                nadadores.add((OrniAzul) hermanos[i]);
            }
            
        }
        
        Comparator <OrniAzul> ordenaPorPropulsion = new Comparator<OrniAzul>(){
            @Override
            public int compare(OrniAzul t1, OrniAzul t2) {
                return t1.getPropulsion().compareTo(t2.getPropulsion());
            }
            
        };
        
        Collections.sort(nadadores, ordenaPorPropulsion);
        
        Iterator<OrniAzul> it= nadadores.iterator();
            while(it.hasNext()){
                OrniAzul h = it.next();
                System.out.println("Propulsión de " + h.getNombre() + ": " + h.getPropulsion() + "Kms/h");
            }
        
        */
    }
    
}
