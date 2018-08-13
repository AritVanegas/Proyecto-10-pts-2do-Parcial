
package supermercado;


import java.io.*;


public class Lacteos extends Producto{
    
            Lacteos () throws IOException {

                    tipo_prod="Lacteo";

                    codigo="L0012";

                    this.Set_Precio();           

            }
        
        
                void Set_Precio()  throws IOException {

                    BufferedReader entrada1= new BufferedReader( new InputStreamReader(System.in));            



                    System.out.print("\n El codigo de los lacteos es L0012 ");

                    System.out.print("\n Ingrese el precio de compra por litro o kg del lacteo: ");            
                    precio_compra=( Double.parseDouble(entrada1.readLine()) );               


                    System.out.print("\n Ingrese el precio de venta por litro o kg del lacteo: ");            
                    precio_compra=( Double.parseDouble(entrada1.readLine()) );
                    
                    System.out.print("\n");

                }     
        
        
        
        
    
    
}
