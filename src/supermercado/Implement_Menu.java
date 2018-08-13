

package supermercado;


import java.io.*;


public class Implement_Menu {           // Esta clase despliega e implementa el menu

            int resp_menu;
            int cont_prod=0;
            int cont_fact=0;
            
            final int MAX_PRODUCT=5;   //Tamaño del vector de productos, se puede ingresar aqui cualquier numero maximo de productos a almacenar (10 en este caso) 
            
            Producto vect_obj[] = new Producto[MAX_PRODUCT];            // Vector polimorfico que contiene todos los productos ingresados
            Facturas facturas[] = new Facturas[MAX_PRODUCT];            // EN ESTE PROGRAMA NO SE HACE USO DE ArrayList!!!
            



            void DesplegarMenu () throws IOException {                  // Metodo para desplegar y manejar el menu

                    BufferedReader entrada1= new BufferedReader( new InputStreamReader(System.in));
                    cont_prod=0;
                    cont_fact=0;
                    
                        do{
                            System.out.println("\n\n\n Ingrese la Operacion que desea realizar:  ");

                                    System.out.println("\t1.- Agregar un producto nuevo al almacen");
                                    System.out.println("\t2.- Modificar la existencia de un producto");
                                    System.out.println("\t3.- Facturar Venta");
                                    System.out.println("\t4.- Mostrar Ingresos Brutos");
                                    System.out.println("\t5.- Mostrar el Valor Total de Todos los Productos");
                                    System.out.println("\t6.- Mostrar Productos mas Vendidos");
                                    System.out.println("\t7.- Mostrar Producto con Baja Existencia");
                                    System.out.print("\t8.- Salir: ......... ");


                                    resp_menu = Integer.parseInt(entrada1.readLine());           // Lee la seleccion del usuario

                                    this.Ejecutar_Operacion();                                  // Ejecuta una operacion de acuerdo a la seleccion del usuario
                                                         
                        }                   

                        while(resp_menu!=8);
                        
                        System.out.println("\n\n\n\n\n");           
                        
             }

             
            
            
            
            
             void Ejecutar_Operacion () throws IOException{
             
                    BufferedReader entrada2= new BufferedReader( new InputStreamReader(System.in));
                    String tipo_producto;
                    
                            switch(resp_menu){
                                
                        
                                case 1:     
                                            
                                                    if(cont_prod==MAX_PRODUCT){     // Por si se alcanza el numero maximo de objetos para almacenar
                                                        System.out.println("Numero maximo de productos alcanzado, no se puede almacenar mas");
                                                        break;
                                                    }

                                            System.out.print("\n\n\n Ingrese el tipo de producto que desea agregar (Enlatados, Viveres, Lacteos, Carnes): ");
                                            tipo_producto=entrada2.readLine();
                                            //cont_prod++;


                                                if(tipo_producto.equalsIgnoreCase("Enlatados")){         // Si se agrega un enlatado

                                                   vect_obj[cont_prod] = new Enlatados();            // Agrega el enlatado al vector polimorfico

                                                    System.out.println(" Enlatado Agregado al vector");
                                                    cont_prod++;
                                                }                                           

                                                if(tipo_producto.equalsIgnoreCase("Lacteos")){         // Si se agrega un lacteo

                                                   vect_obj[cont_prod] = new Lacteos();            // Agrega el lacteo al vector polimorfico

                                                    System.out.println(" Lacteo Agregado al vector");
                                                    cont_prod++;
                                                }

                                                if(tipo_producto.equalsIgnoreCase("Viveres")){         // Si se agrega un viver

                                                   vect_obj[cont_prod] = new Viveres();            // Agrega el enlatado al vector polimorfico

                                                    System.out.println(" Viveres Agregados al vector");
                                                    cont_prod++;
                                                }

                                                if(tipo_producto.equalsIgnoreCase("Carnes")){         // Si se agrega carne

                                                   vect_obj[cont_prod] = new Carnes();            // Agrega el enlatado al vector polimorfico

                                                    System.out.println(" Carne Agregada al vector");
                                                    cont_prod++;
                                                }

                                        break;
                                        
                                        
                                        

                                case 2:
                                            
                                                                                    
                                            String cod_modif;
                                            int num_prod_nuev,i;                                           
                                            
                                        
                                            System.out.print("\n\n Ingrese el codigo del producto que desea agregar ");
                                            System.out.println("(Enlatado=E0012, Viver=V0012, Lacteo=L0012, Carne=C0012):   ");
                                            
                                            cod_modif=entrada2.readLine();
                                            System.out.println("\n\n cod_modif " +cod_modif); // Validar que el codigo sea correcto y preguntar cuantas unidades desea agregar,
                                                                                            // para sumarlas al vector polimorfico, eso es todo lo que hay que hacer
                                            
                                            
                                                if(cod_modif.equalsIgnoreCase("E0012")){    // Agregar enlatado

                                                        System.out.print("Cuantas unidades desea ingresar: ");
                                                         num_prod_nuev=Integer.parseInt(entrada2.readLine());
                                                         
                                                         
                                                             
                                                                if((cont_prod+num_prod_nuev)>MAX_PRODUCT){

                                                                    System.out.println("\n Error, la cantidad de productos nuevos excede el limite ");
                                                                    break;

                                                                }
                                                             
                                                         
                                                            for(i=cont_prod;i<(cont_prod+num_prod_nuev);++i){

                                                                    vect_obj[i]=new Enlatados();

                                                            }                     
                                                            
                                                            cont_prod=cont_prod+num_prod_nuev;
                                                            
                                                      break;
                                                }
                                                
                                                
                                                else if(cod_modif.equalsIgnoreCase("V0012")){        // Agregar Viveres

                                                        System.out.print("Cuantas unidades desea ingresar: ");
                                                         num_prod_nuev=Integer.parseInt(entrada2.readLine());
                                                         
                                                         
                                                             
                                                                if((cont_prod+num_prod_nuev)>MAX_PRODUCT){

                                                                    System.out.println("\n Error, la cantidad de productos nuevos excede el limite ");
                                                                    break;

                                                                }
                                                             
                                                         
                                                            for(i=cont_prod;i<(cont_prod+num_prod_nuev);++i){

                                                                    vect_obj[i]=new Viveres();

                                                            }                     
                                                            
                                                            cont_prod=cont_prod+num_prod_nuev;
                                                            
                                                      break;
                                                }
                                                
                                                
                                                else if(cod_modif.equalsIgnoreCase("L0012")){            // Agregar Lacteos

                                                        System.out.print("Cuantas unidades desea ingresar: ");
                                                         num_prod_nuev=Integer.parseInt(entrada2.readLine());
                                                         
                                                         
                                                             
                                                                if((cont_prod+num_prod_nuev)>MAX_PRODUCT){

                                                                    System.out.println("\n Error, la cantidad de productos nuevos excede el limite ");
                                                                    break;

                                                                }
                                                             
                                                         
                                                            for(i=cont_prod;i<(cont_prod+num_prod_nuev);++i){

                                                                    vect_obj[i]=new Lacteos();

                                                            }                     
                                                            
                                                            cont_prod=cont_prod+num_prod_nuev;
                                                            
                                                      break;
                                                }
                                                
                                                
                                                else if(cod_modif.equalsIgnoreCase("C0012")){            // Agregar Carnes

                                                        System.out.print("Cuantas unidades desea ingresar: ");
                                                         num_prod_nuev=Integer.parseInt(entrada2.readLine());
                                                         
                                                         
                                                             
                                                                if((cont_prod+num_prod_nuev)>MAX_PRODUCT){

                                                                    System.out.println("\n Error, la cantidad de productos nuevos excede el limite ");
                                                                    break;

                                                                }
                                                             
                                                         
                                                            for(i=cont_prod;i<(cont_prod+num_prod_nuev);++i){

                                                                    vect_obj[i]=new Carnes();

                                                            }                     
                                                            
                                                            cont_prod=cont_prod+num_prod_nuev;
                                                            
                                                      break;
                                                }
                                                
                                                else{           // En caso de que el codigo introducido sea incorrecto
                                                    System.out.println("Error, no se encontro el codigo ");
                                                }
                                                
                                        
                                            break;
                                        
                                        
                                   
                                        
                                        
                                        
                                        
                                    case 3:
                                        
                                        int cont_enlat=0,cont_lact=0,cont_viv=0,cont_carn=0;
                                        String tip_prod;
                                        
                                        
                                                    for(i=0;i<cont_prod;i++){           // Ciclo para contar cuantos productos de cada tipo hay

                                                        tip_prod=vect_obj[i].tipo_prod;

                                                        if(tip_prod.equalsIgnoreCase("Enlatado")){

                                                            cont_enlat++;

                                                        }

                                                        if(tip_prod.equalsIgnoreCase("Lacteo")){

                                                            cont_lact++;

                                                        }

                                                        if(tip_prod.equalsIgnoreCase("Viveres")){

                                                            cont_viv++;

                                                        }

                                                        if(tip_prod.equalsIgnoreCase("Carne")){

                                                            cont_carn++;

                                                        }
                                                
                                                    }
                                            
                                             
                                                    
                                                    
                                             /*System.out.println(" Ingrese la cedula del cliente: ");        // Guarda la cedula del cliente
                                             facturas[cont_fact].cedulaCliente=entrada2.readLine();
                                             
                                             System.out.println(" Ingrese el tipo de producto a vender (Enlatado, Lacteo, Viveres, Carne): ");        // Guarda el tipo de producto vendido
                                             facturas[cont_fact].product_vend=entrada2.readLine();
                                             tip_prod=facturas[cont_fact].product_vend;
                                             
                                             System.out.println(" Ingrese el precio del producto a vender: ");        // Guarda el tipo de producto vendido
                                             facturas[cont_fact].precio_venta=Double.parseDouble(entrada2.readLine());
                                             
                                             
                                             System.out.println(" Ingrese la cantidad que desea vender: ");
                                             facturas[cont_fact].cant_vend=Integer.parseInt(entrada2.readLine());
                                             
                                                    
                                                    // Condiciones para validar que no se venda mas de lo que se tiene
                                                    if(tip_prod.equalsIgnoreCase("Enlatado") && facturas[cont_fact].cant_vend>cont_enlat){
                                                        
                                                        System.out.println(" Error, hay menos productos en existencia de los que hay para vender ");
                                                        
                                                        
                                                        break;
                                                    
                                                    }
                                             
                                                    if(tip_prod.equalsIgnoreCase("Lacteo") && facturas[cont_fact].cant_vend>cont_lact){
                                                        
                                                        System.out.println(" Error, hay menos productos en existencia de los que hay para vender ");
                                                        
                                                        
                                                        break;
                                                    
                                                    }
                                                    
                                                    if(tip_prod.equalsIgnoreCase("Viveres") && facturas[cont_fact].cant_vend>cont_viv){
                                                        
                                                        System.out.println(" Error, hay menos productos en existencia de los que hay para vender ");
                                                        
                                                        
                                                        break;
                                                    
                                                    }
                                                    
                                                    if(tip_prod.equalsIgnoreCase("Carne") && facturas[cont_fact].cant_vend>cont_carn){
                                                        
                                                        System.out.println(" Error, hay menos productos en existencia de los que hay para vender ");
                                                        
                                                        
                                                        break;
                                                    
                                                    }
                                                    
                                                 
                                                    
                                                  
                                                  
                                                  
                                                  
                                                    
                                                    
                                                     
                                             cont_fact++;       // Lleva el registro del numero de facturas 
                                               
                                            *//*
                                             
                                             
                                             
                                            System.out.println(" El total de las ventas se despliega al salir del programa ");
                                                 break;
                                        
                                        
                                        
                                            */
                                        
                                        
                                        
                                    case 4:
                                        break;
                                                
                                    case 5:
                                       break;
                                                
                                                
                                    case 6:
                                        break;
                                                
                                    case 7:
                                        break;
                                        
                                    case 8:
                                    
                                       /* String Producto_Vendido;
                                        double cant_vend_sin_IVA=0;
                                        double cant_vend_con_IVA=0,IVA_TOT;
                                        int j;
                                        
                                        
                                            for(i=0;i<MAX_PRODUCT;i++){
                                            
                                                
                                                Producto_Vendido=facturas[i].product_vend;
                                                
                                                if(Producto_Vendido.equalsIgnoreCase("Enlatados") || Producto_Vendido.equalsIgnoreCase("Viveres")){
                                                    
                                                    cant_vend_sin_IVA=cant_vend_sin_IVA+(facturas[i].precio_venta * facturas[i].cant_vend);
                                                
                                                }
                                                
                                                if(Producto_Vendido.equalsIgnoreCase("Carnes") || Producto_Vendido.equalsIgnoreCase("Lacteos")){
                                                    
                                                    cant_vend_sin_IVA=cant_vend_sin_IVA+(facturas[i].precio_venta * facturas[i].cant_vend);
                                                
                                                }
                                                
                                            
                                            }
                                            
                                            IVA_TOT=cant_vend_con_IVA*0.12;
                                            cant_vend_con_IVA=cant_vend_con_IVA-IVA_TOT;
                                    
                                            System.out.println("Total de Ventas sin IVA: "+cant_vend_sin_IVA);
                                    
                                            System.out.println("Total de Ventas con IVA: "+cant_vend_con_IVA);
                                    */
                                    
                                    
                                    
                                    
                                        break;

                            }                 
             }


            

    
}
