

package supermercado;


import java.io.*;


public class Viveres extends Producto{
    
    String marca;
    
    
        Viveres () throws IOException {     // Constructor que inicializa todos los datos de cada objeto Enlatados del vector polimorfico
            
            tipo_prod="Viveres";
            
            codigo="V0012";
            
            this.Set_Precio();           
            
        }
        
        
        void Set_Precio()  throws IOException {
            
            BufferedReader entrada1= new BufferedReader( new InputStreamReader(System.in));            
                
                                        
            
            System.out.print("\n El codigo de los viveres es V0012 ");
                        
            System.out.print("\n Ingrese el precio de compra por unidad de viveres: ");            
            precio_compra=( Double.parseDouble(entrada1.readLine()) );               
                            
            
            System.out.print("\n Ingrese el precio de venta por unidad de viveres: ");            
            precio_compra=( Double.parseDouble(entrada1.readLine()) );
            
            System.out.print("\n Ingrese la marca de los viveres: ");            
            marca=entrada1.readLine();
            
            System.out.print("\n");
            
        
        }  
    
}
