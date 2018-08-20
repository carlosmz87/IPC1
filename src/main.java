/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlosmartinez
 * UNIVERSIDAD DE SAN CARLOS FACULTAD DE INGENIERIA
 * IPC1 
 * CARLOS JAVIER MARTINEZ POLANCO 201709282
 */
//IMPORTAMOS LOS PAQUETES QUE UTILIZAREMOS
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class main {
    
   //DEFINIMOS LAS VARIABLES 
    private static Scanner teclado; 
    private static int opciones,op2,op3,op4,op5,nuevousuario, id, numbus, notas, prom;
    private static String nombre;
    
    
    public static void main(String[] args) {
        
        //CREAMOS LOS ARRAYLIST QUE UTILIZAMOS PARA ALMACENAR LOS DATOS
        ArrayList<Integer> usu = new ArrayList<Integer>(6);
        ArrayList<Integer> usu2 = new ArrayList<Integer>();
        ArrayList<Integer> usu3 = new ArrayList<Integer>();
        ArrayList<usuarios> usu4 = new ArrayList<usuarios>(6);
        
        //CREAMOS UN OBJETO DE TIPO COMPARADOR PARA CAMBIAR EL ORDEN DE LOS DATOS EN UN ARRAYLIST
        Comparator<Integer> comparador = Collections.reverseOrder();
        //CREAMOS UN OBJETO DE TIPO HASHSET PARA ALMACENAR DATOS 
        HashSet hs = new HashSet();
        teclado=new Scanner(System.in);
        //PEDIMOS AL USUARIO INGRESE UNA OPCION DEL MENU PRINCIPAL
        System.out.print("1. USUARIOS\n" + "2. CONTADOR DIGITOS REPETIDOS\n" + "3. TRES NUMEROS DE MAYOR A MENOR\n" + "4. CALCULAR PROMEDIO\n" + "5. LIMPIAR VECTORES\n"+ "6. SALIR\n");
        opciones=teclado.nextInt();
        //INICIAMOS UN CICLO WHILE PARA EL MENU
            while(opciones!=6){
                if(opciones==1){
                //LLAMAR AL SUBMENU DE USUARIOS
                    System.out.print("1. INGRESAR USUARIOS\n" + "2. MOSTRAR USUARIOS ASCENDENTE\n" + "3. MOSTRAR USUARIOS DESCENDENTE\n" + "4. MENU PRINCIPAL\n");
                    op2=teclado.nextInt();
                //INICIA EL SUBMENU DE USUARIOS 
                    while(op2!=4){
                        //PARA INGRESAR USUARIOS
                        if(op2==1){
                            try{
                                //VERIFICAMOS QUE EL ARRAYLIST ESTA VACIO
                                if(usu.isEmpty()==true){
                                    System.out.println("EL LISTADO ESTA VACIO");
                                    System.out.print("HA SELECCIONADO INGRESAR UN NUEVO USUARIO\n");

                                }
                                //VERIFICAMOS QUE EL ARRAYLIST ESTA LLENO
                                if(usu.size()==6){
                                    System.out.println("EL LISTADO DE USUARIOS ESTA LLENO");
                                    System.out.println(usu);
                                    break;

                                }
                                //SI NO ESTA VACIO Y NO ESTA LLENO
                                else{
                                    //SE INGRESAN LOS USUARIOS Y SE CREAN OBJETOS DE TIPO USUARIO PARA LLENAR EL ARRAYLIST
                                    //SE UTILIZA EL HASHSET PARA VERIFICAR QUE NO SE REPITAN LOS USUARIOS
                                    //SE UTILIZA EL CICLO FOR PARA QUE REALICE 6 VECES LA ACCION HASTA QUE NO SE REPITA NINGUN DATO
                                    for(int x=0; x<6; x++){
                                        System.out.println("\nINGRESA UN NUEVO USUARIO\n");
                                        nuevousuario=teclado.nextInt();
                                        usuarios u=new usuarios();
                                        u.setID(nuevousuario);
                                        id=u.getID();
                                        usu.add(id);  
                                        System.out.println("EL ID ES:" + id);
                                        hs.addAll(usu);
                                        usu.clear();
                                        usu.addAll(hs);
                                        break;
                                    }
                                }
                            }
                            //PROGRAMACION DEFENSIVA
                            catch(Exception e){
                                System.out.println("EL VECTOR DE USUARIOS ESTA LLENO O INGRESO MAL UN DATO");
                                break;
                            }
                                
                        }
                        //MOSTRAR USUARIOS ASCENDENTEMENTE
                        else if(op2==2){
                            //VERIFICA QUE EL ARRAYLIST TENGA DATOS
                            if(usu.isEmpty()==false){
                                //UTILIZAMOS LA FUNCION SORT QUE ORDENA LOS DATOS DE FORMA ASCENDENTE
                                System.out.print("HA SELECCIONADO MOSTRAR USUARIOS ASCENDENTEMENTE\n");
                                Collections.sort(usu);
                                System.out.println(usu);
                                System.out.println("1. INGRESAR USUARIOS\n" + "2. MOSTRAR USUARIOS ASCENDENTE\n" + "3. MOSTRAR USUARIOS DESCENDENTE\n" + "4. MENU PRINCIPAL\n");
                                op2=teclado.nextInt();
                            }
                            else{
                                System.out.println("LA LISTA DE USUARIOS ESTA VACIA");
                                System.out.println("1. INGRESAR USUARIOS\n" + "2. MOSTRAR USUARIOS ASCENDENTE\n" + "3. MOSTRAR USUARIOS DESCENDENTE\n" + "4. MENU PRINCIPAL\n");
                                op2=teclado.nextInt();
                            }
                        }
                        else if(op2==3){
                            //VERIFICA QUE EL ARRAYLIST TENGA DATOS
                            if(usu.isEmpty()==false){
                                //UTILIZAMOS LA FUNCION SORT CON PARAMETROS EL ARRAYLIST Y UN COMPARADOR DE LA CLASE COLLECTION
                                //ESTE COMPARADOR VERIFICA LA MAGNITUD DE CADA VALOR Y EL SORT LOS ORDENA DESCENDENTEMENTE
                                System.out.print("HA SELECCIONADO MOSTRAR USUARIOS DESCENDENTEMENTE\n");
                                Collections.sort(usu, comparador);
                                System.out.println(usu);
                                System.out.println("1. INGRESAR USUARIOS\n" + "2. MOSTRAR USUARIOS ASCENDENTE\n" + "3. MOSTRAR USUARIOS DESCENDENTE\n" + "4. MENU PRINCIPAL\n");
                                op2=teclado.nextInt();
                            }
                            else{
                                System.out.println("LA LISTA DE USUARIOS ESTA VACIA");
                                System.out.println("1. INGRESAR USUARIOS\n" + "2. MOSTRAR USUARIOS ASCENDENTE\n" + "3. MOSTRAR USUARIOS DESCENDENTE\n" + "4. MENU PRINCIPAL\n");
                                op2=teclado.nextInt();
                            }
                        }
                        else if(op2==4){
                            break;
                        }
                        else{
                             System.out.print("INGRESE UN NUMERO DE 1 A 4\n");
                             System.out.print("1. INGRESAR USUARIOS\n" + "2. MOSTRAR USUARIOS ASCENDENTE\n" + "3. MOSTRAR USUARIOS DESCENDENTE\n" + "4. MENU PRINCIPAL\n");
                             op2=teclado.nextInt();
                   
                            
                        }
                    
                    }
                    
                System.out.print("1. USUARIOS\n" + "2. CONTADOR DIGITOS REPETIDOS\n" + "3. TRES NUMEROS DE MAYOR A MENOR\n" + "4. CALCULAR PROMEDIO\n" + "5. LIMPIAR VECTORES\n"+ "6. SALIR\n");
                opciones=teclado.nextInt();
                }
                else if(opciones==2){
                    
                //SUBMENU CONTAR DIGITOS REPETIDOS
                    System.out.print("1. INGRESAR NUMERO\n" + "2. INGRESAR NUMERO A BUSCAR\n" + "3. MOSTRAR NUMERO DE REPETIDOS\n" + "4. MENU PRINCIPAL\n");
                    op3=teclado.nextInt();
                    while(op3!=4){
                        if(op3==1){
                            try{
                                //VERIFICA QUE EL ARRAYLIST ESTE VACIO
                                if(usu2.isEmpty()==true){
                                    System.out.println("LA LISTA DE NUMEROS ESTA VACIA");
                                }
                                //SI ESTA LLENO
                                if(usu2.isEmpty()==false){
                                    System.out.println("EL NUMERO INGRESADO ES: " + usu2);
                                    System.out.print("1. INGRESAR NUMERO\n" + "2. INGRESAR NUMERO A BUSCAR\n" + "3. MOSTRAR NUMERO DE REPETIDOS\n" + "4. MENU PRINCIPAL\n");
                                    op3=teclado.nextInt();
                                }
                                else{
                                    //SI NO ESTA NI VACIO NI LLENO, NOS PIDE QUE INGRESEMOS UN NUMERO 
                                    System.out.print("HA SELECCIONADO INGRESAR UN NUEVO NUMERO\n");
                                    System.out.println("INGRESE UN NUMERO ");
                                    int num=teclado.nextInt();
                                    System.out.println("EL NUMERO INGRESADO ES: " + num);
                                    //SEPARA LOS NUMERO EN DIGITOS Y LOS ALMACENA EN EL ARRAY LIST CON UNA DIVISION
                                    while(num>0){
                                        usu2.add(num%10);
                                        num=num/10;
                                    }
                                    System.out.println(usu2);
                                    System.out.print("1. INGRESAR NUMERO\n" + "2. INGRESAR NUMERO A BUSCAR\n" + "3. MOSTRAR NUMERO DE REPETIDOS\n" + "4. MENU PRINCIPAL\n");
                                    op3=teclado.nextInt();
                                }
                            }
                            //PROGRAMACION DEFENSIVA
                            catch(Exception e){
                                System.out.println("HA INGRESADO MAL UN DATO");
                                break;
                            }
                        }
                        //INGRESAR EL NUMERO A BUSCAR COINCIDENCIAS
                        else if(op3==2){
                            System.out.print("HA SELECCIONADO INGRESAR NUMERO A BUSCAR\n");
                            System.out.println("INGRESE EL NUMERO QUE DESEA BUSCAR");
                            numbus=teclado.nextInt();
                            System.out.println("EL NUMERO A BUSCAR SU FRECUENCIA ES: " + numbus);
                            System.out.print("1. INGRESAR NUMERO\n" + "2. INGRESAR NUMERO A BUSCAR\n" + "3. MOSTRAR NUMERO DE REPETIDOS\n" + "4. MENU PRINCIPAL\n");
                            op3=teclado.nextInt();
                        }
                        //MOSTRAR LA CANTIDAD DE VECES QUE SE REPITE EL NUMERO
                        else if(op3==3){
                            System.out.print("HA SELECCIONADO MOSTRAR NUMERO DE REPETIDOS\n");
                            //UTILIZAMOS LA FUNCION FREQUENCY LA CUAL BUSCA COINCIDENCIAS EN UN ARRAYLIST
                            int comparador2 = Collections.frequency(usu2, numbus);
                            System.out.println("EL NUMERO: "+ numbus + " APARECE: " + comparador2 + " VECES EN: " + usu2);
                            System.out.print("1. INGRESAR NUMERO\n" + "2. INGRESAR NUMERO A BUSCAR\n" + "3. MOSTRAR NUMERO DE REPETIDOS\n" + "4. MENU PRINCIPAL\n");
                            op3=teclado.nextInt();
                        }
                        
                        else if(op3==4){
                            break;
                        }
                        
                        else{
                             System.out.print("INGRESE UN NUMERO DE 1 A 4\n");
                             
                        }
                        
                    
                    }
                    
                System.out.print("1. USUARIOS\n" + "2. CONTADOR DIGITOS REPETIDOS\n" + "3. TRES NUMEROS DE MAYOR A MENOR\n" + "4. CALCULAR PROMEDIO\n" + "5. LIMPIAR VECTORES\n"+ "6. SALIR\n");
                opciones=teclado.nextInt();
                }
                else if(opciones==3){
                //SUBMENU DE TRES NUMEROS DE MAYOR A MENOR
                   System.out.print("1. INGRESAR NUMEROS\n" + "2. MOSTRAR ORDENADOS\n" + "3. MOSTRAR MENU PRINCIPAL\n");
                   op4=teclado.nextInt();
                   
                    while(op4!=4){
                        if(op4==1){
                            System.out.println("HA SELECCIONADO INGRESAR UN NUEVO NUMERO\n");
                            try{
                                //VERIFICA QUE EL ARRAYLIST TENGA DATOS
                                if(usu3.isEmpty()==true){
                                    System.out.println("LA LISTA DE NUMEROS ESTA VACIA");
                                }
                                //VERIFICA QUE YA ESTE LLENO CON 3 NUMERO
                                if(usu3.size()==3){
                                    System.out.println("LA LISTA DE NUMEROS YA FUE INGRESADO ");
                                    System.out.print("1. INGRESAR NUMEROS\n" + "2. MOSTRAR ORDENADOS\n" + "3. MOSTRAR MENU PRINCIPAL\n");
                                    op4=teclado.nextInt();
                                }
                                else{
                                    //INGRESA LOS TRES NUMEROS EN UN ARRAYLIST
                                    System.out.println("INGRESAR EL PRIMER NUMERO");
                                    int numero1=teclado.nextInt();
                                    usu3.add(numero1);
                                    System.out.println("INGRESAR EL SEGUNDO NUMERO");
                                    int numero2=teclado.nextInt();
                                    usu3.add(numero2);
                                    System.out.println("INGRESAR EL TERCER NUMERO");
                                    int numero3=teclado.nextInt();
                                    usu3.add(numero3);
                                    System.out.print("1. INGRESAR NUMEROS\n" + "2. MOSTRAR ORDENADOS\n" + "3. MOSTRAR MENU PRINCIPAL\n");
                                    op4=teclado.nextInt();
                                }
                            }
                            //PROGRAMACION DEFENSIVA
                            catch(Exception e){
                                System.out.println("HA INGRESADO MAL UN NUMERO");
                                break;
                            }
                        }
                        //MUESTRA LOS DATOS ORDENADOS DE MAYOR A MENOR CON LA FUNCION SORT Y EL COMPARADOR
                        else if(op4==2){
                            System.out.print("HA SELECCIONADO MOSTRAR ORDENADOS\n");
                            Collections.sort(usu3, comparador);
                            System.out.println("LOS NUMEROS MAYOR A MENOR SON: " + usu3);
                            System.out.print("1. INGRESAR NUMEROS\n" + "2. MOSTRAR ORDENADOS\n" + "3. MOSTRAR MENU PRINCIPAL\n");
                            op4=teclado.nextInt();
                        }
                       
                        else if(op4==3){
                            break;
                        }
                        else{
                             System.out.print("INGRESE UN NUMERO DE 1 A 3\n");
                             System.out.print("1. INGRESAR NUMEROS\n" + "2. MOSTRAR ORDENADOS\n" + "3. MOSTRAR MENU PRINCIPAL\n");
                             op4=teclado.nextInt();
                        }
                    }
                System.out.print("1. USUARIOS\n" + "2. CONTADOR DIGITOS REPETIDOS\n" + "3. TRES NUMEROS DE MAYOR A MENOR\n" + "4. CALCULAR PROMEDIO\n" + "5. LIMPIAR VECTORES\n"+ "6. SALIR\n");
                opciones=teclado.nextInt();
                }
                else if(opciones==4){
                //SUBMENU DE CALCULAR EL PROMEDIO
                   System.out.print("1. INGRESO DE NOTAS\n" + "2. MOSTRAR PROMEDIOS\n"+ "3. MOSTRAR MENU PRINCIPAL\n");
                   op5=teclado.nextInt();
                    while(op5!=3){
                        
                        if(op5==1){
                            try{
                                System.out.print("HA SELECCIONADO INGRESAR NOTAS\n");
                                //VERIFICA QUE ESTE VACIO EL ARRAYLIST
                                if(usu4.isEmpty()==true){
                                    //EL CICLO FOR PIDE 6 VECES LOS DATOS Y LOS ALMACENA EN OBJETOS DE TIPO USUARIO
                                    //LUEGO SE ALMACENAN EN EL ARRAYLIST DE TIPO USUARIO COMO OBJETOS DE TIPO USUARIO
                                    for(int x=0; x<6; x++){
                                        System.out.println("INGRESE EL USUARIO");
                                        int us4=teclado.nextInt();
                                        System.out.println("INGRESE EL NOMBRE DEL ESTUDIANTE: ");
                                        String nom=teclado.next();
                                        System.out.println("INGRESE LA NOTA DE LA PRIMERA ASIGNATURA");
                                        int n1=teclado.nextInt();
                                        System.out.println("INGRESE LA NOTA DE LA SEGUNDA ASIGNATURA");
                                        int n2=teclado.nextInt();
                                        System.out.println("INGRESE LA NOTA DE LA TERCERA ASIGNATURA");
                                        int n3=teclado.nextInt();
                                        System.out.println("INGRESE LA NOTA DE LA CUARTA ASIGNATURA");
                                        int n4=teclado.nextInt();
                                        System.out.println("INGRESE LA NOTA DE LA QUINTA ASIGNATURA");
                                        int n5=teclado.nextInt();
                                        usuarios u=new usuarios();
                                        u.setID(us4);
                                        u.setNotas(n1,n2,n3,n4,n5);
                                        prom=u.promedio(n1, n2, n3, n4, n5);
                                        u.setNombre(nom);
                                        System.out.println(u);
                                        usu4.add(u);
                                    }
                                }
                                else{
                                    //VERIFICA QUE YA ESTE LLENO EL ARRAYLIST
                                    System.out.println("EL LISTADO DE ALUMNOS YA ESTA LLENO");
                                   
                                }
                               
                            }
                            //PROGRAMACION DEFENSIVA
                            catch(Exception e){
                                System.out.println("HA INGRESADO MAL UN DATO");
                                
                                
                            }
                            System.out.print("1. INGRESO DE NOTAS\n" + "2. MOSTRAR PROMEDIOS\n"+ "3. MOSTRAR MENU PRINCIPAL\n");
                            op5=teclado.nextInt();
                        }
                        else if(op5==2){
                           
                             //MOSTRAMOS LOS PROMEDIOS CON LA IMPRESION DEL ARRAYLIST Y LA FUNCION GET DENTRO DE UN BUCLE FOR
                            //PARA IMPRIMIR UNO POR UNO CUANDO EL ARRAYLIST ESTA LLENO CON 6 DATOS
                            System.out.print("HA SELECCIONADO MOSTRAR PROMEDIOS\n");
                            if(usu4.isEmpty()==true){
                                System.out.println("EL VECTOR DE NOTAS ESTA VACIO");
                                System.out.print("1. INGRESO DE NOTAS\n" + "2. MOSTRAR PROMEDIOS\n"+ "3. MOSTRAR MENU PRINCIPAL\n");
                                op5=teclado.nextInt();
                            }
                            if(usu4.size()==6){
                                for(int x=0; x<6; x++){
                                    System.out.println(usu4.get(x));   
                                }
                                break;
                            }
                            
                        }
                        else if(op5==3){
                            break;
                        }
                        else{
                            System.out.print("INGRESE UN NUMERO DE 1 A 3\n");
                            System.out.print("1. INGRESO DE NOTAS\n" + "2. MOSTRAR PROMEDIOS\n"+ "3. MOSTRAR MENU PRINCIPAL\n");
                            op5=teclado.nextInt();
                        }
                    }
                System.out.print("1. USUARIOS\n" + "2. CONTADOR DIGITOS REPETIDOS\n" + "3. TRES NUMEROS DE MAYOR A MENOR\n" + "4. CALCULAR PROMEDIO\n" + "5. LIMPIAR VECTORES\n"+ "6. SALIR\n");
                opciones=teclado.nextInt();
                }
                //LIMPIAMOS LOS ARRAYLIST PARA PODER UTILIZAR EL PROGRAMA NUEVAMENTE SIN SALIR
                else if(opciones==5){
                    usu.clear();
                    usu2.clear();
                    usu3.clear();
                    usu4.clear();
                    System.out.println("LOS VECTORES FUERON VACIADOS");
                    System.out.print("1. USUARIOS\n" + "2. CONTADOR DIGITOS REPETIDOS\n" + "3. TRES NUMEROS DE MAYOR A MENOR\n" + "4. CALCULAR PROMEDIO\n" + "5. SALIR\n");
                    opciones=teclado.nextInt();
                    
                }
                //SALIMOS DEL PROGRAMA
                else if(opciones==6){
                //LLAMAR A LA FUNCION EXIT PARA SALIR DEL SISTEMA
                    System.out.print("opcion "+opciones+"\n");
                    System.exit(0);
                }
                else{
                //SI EL USUARIO NO INGRESA UN NUMERO ENTRE UNO Y 5 VUELVE A PEDIR UN NUMERO
                    System.out.print("INGRESE UN NUMERO DE 1 A 5\n");
                    System.out.print("1. USUARIOS\n" + "2. CONTADOR DIGITOS REPETIDOS\n" + "3. TRES NUMEROS DE MAYOR A MENOR\n" + "4. CALCULAR PROMEDIO\n" + "5. SALIR\n");
                    opciones=teclado.nextInt();
                }
            }
    }
}
