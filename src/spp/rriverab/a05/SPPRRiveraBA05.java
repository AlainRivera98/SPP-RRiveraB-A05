//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11
package spp.rriverab.a05;
import java.util.Scanner;

public class SPPRRiveraBA05 {

    
    public static void main(String[] args) {
        
        pedirEntero("una edad");
        pedirCadena("un nombre");
        pedirDouble("una calificación");
        pedirLong("una matrícula(sólo números)");        
    }
    
    
    static int pedirEntero(String mensaje){
        Scanner teclado = new Scanner (System.in);
        int x=0;
        boolean flag;

        do{      
            try{
                System.out.println("\nIntroduce "+mensaje);
                x = teclado.nextInt(); 
                flag = true;
            }catch (Exception ex) {
                flag = false;
                System.out.println("\nEl valor insertado no es válido (entero normal)\n" +ex+ "\n");
                teclado.nextLine();   
            } 
            
        }while(flag==false);

        return x;
    }
    
    
    static String pedirCadena(String mensaje){
        Scanner teclado = new Scanner (System.in);
        String x= "";
        boolean flag;

        do{      
            try{
                System.out.println("\nIntroduce "+mensaje);
                x = teclado.nextLine(); 
                flag = true;
            }catch (Exception ex) {
                flag = false;
                System.out.println("\nEl valor insertado no es válido\n" +ex+ "\n");
                teclado.nextLine();   
            } 
            
        }while(flag==false);
        
        return x;
    }
    
    
    static double pedirDouble(String mensaje){
        Scanner teclado = new Scanner (System.in);
        double x = 0;
        boolean flag;

        do{      
            try{
                System.out.println("\nIntroduce "+mensaje);
                x = teclado.nextDouble(); 
                flag = true;
            }catch (Exception ex) {
                flag = false;
                System.out.println("\nEl valor insertado no es un valor válido (valor numérico con o sin decimal)\n" +ex+ "\n");
                teclado.nextLine();   
            } 
            
        }while(flag==false);
        
        
        return x;
    }
    
    
    static long pedirLong(String mensaje){
        Scanner teclado = new Scanner (System.in);
        long x = 0;
        boolean flag;

        do{      
            try{
                System.out.println("\nIntroduce "+mensaje);
                x = teclado.nextLong(); 
                flag = true;
            }catch (Exception ex) {
                flag = false;
                System.out.println("\nEl valor insertado no es válido (entero largo)\n" +ex+ "\n");
                teclado.nextLine();   
            } 
            
        }while(flag==false);
        
        
        return x;
    }

    
}
