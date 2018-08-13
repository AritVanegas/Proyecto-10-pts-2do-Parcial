

package supermercado;

import java.io.*;

public class Carnes extends Producto{
    
        int unidades;
    
    
        Carnes () throws IOException {     // Constructor que inicializa todos los datos de cada objeto Enlatados del vector polimorfico
            
            tipo_prod="Carne";
            
            codigo="C0012";
            
            this.Set_Precio();           
            
        }
        
        
        void Set_Precio()  throws IOException {
            
            BufferedReader entrada1= new BufferedReader( new InputStreamReader(System.in));            
                
                                        
            
            System.out.print("\n El codigo de las Carnes es C0012 ");
                        
            System.out.print("\n Ingrese el precio de compra por kg de carne: ");            
            precio_compra=( Double.parseDouble(entrada1.readLine()) );               
                            
            
            System.out.print("\n Ingrese el precio de venta por kg de carne: ");            
            precio_compra=( Double.parseDouble(entrada1.readLine()) );
            
            System.out.print("\n");
            
        
        }  
    
}
