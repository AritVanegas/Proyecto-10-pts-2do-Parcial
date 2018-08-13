
package supermercado;

import java.io.*;


public class Enlatados extends Producto {
    
        String marca;
    
    
        Enlatados () throws IOException {     // Constructor que inicializa todos los datos de cada objeto Enlatados del vector polimorfico
            
            tipo_prod="Enlatado";
            
            codigo="E0012";
            
            this.Set_Precio();           
            
        }
        
        
        void Set_Precio()  throws IOException {
            
            BufferedReader entrada1= new BufferedReader( new InputStreamReader(System.in));            
                
                                        
            
            System.out.print("\n El codigo de los enlatados es E0012 ");
                        
            System.out.print("\n Ingrese el precio de compra por unidad del enlatado: ");            
            precio_compra=( Double.parseDouble(entrada1.readLine()) );               
                            
            
            System.out.print("\n Ingrese el precio de venta por unidad del enlatado: ");            
            precio_compra=( Double.parseDouble(entrada1.readLine()) );
            
            System.out.print("\n Ingrese la marca del enlatado: ");            
            marca=entrada1.readLine();
            
            System.out.print("\n");
        
        }  
    
    
    
}
