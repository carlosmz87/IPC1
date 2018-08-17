/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlosmartinez
 */
import java.util.Scanner;
public class main {
    private static Scanner teclado; 
    private static int opciones,op2,op3,op4,op5;
    
    
    public static void main(String[] args) {
        
        teclado=new Scanner(System.in);
        System.out.print("1. USUARIOS\n" + "2. CONTADOR DIGITOS REPETIDOS\n" + "3. TRES NUMEROS DE MAYOR A MENOR\n" + "4. CALCULAR PROMEDIO\n" + "5. SALIR\n");
        opciones=teclado.nextInt();
            while(opciones!=5){
                if(opciones==1){
                //LLAMAR A LOS METODOS PARA LOS USUARIOS
                    System.out.print("1. INGRESAR USUARIOS\n" + "2. MOSTRAR USUARIOS ASCENDENTE\n" + "3. MOSTRAR USUARIOS DESCENDENTE\n" + "4. MENU PRINCIPAL\n");
                    op2=teclado.nextInt();
                    while(op2!=4){
                        if(op2==1){
                            System.out.print("HA SELECCIONADO INGRESAR UN NUEVO USUARIO\n");
                            System.out.print("1. INGRESAR USUARIOS\n" + "2. MOSTRAR USUARIOS ASCENDENTE\n" + "3. MOSTRAR USUARIOS DESCENDENTE\n" + "4. MENU PRINCIPAL\n");
                            op2=teclado.nextInt();
                        }
                        else if(op2==2){
                            System.out.print("HA SELECCIONADO MOSTRAR USUARIOS ASCENDENTEMENTE\n");
                            System.out.print("1. INGRESAR USUARIOS\n" + "2. MOSTRAR USUARIOS ASCENDENTE\n" + "3. MOSTRAR USUARIOS DESCENDENTE\n" + "4. MENU PRINCIPAL\n");
                            op2=teclado.nextInt();
                        }
                        else if(op2==3){
                            System.out.print("HA SELECCIONADO MOSTRAR USUARIOS DESCENDENTEMENTE\n");
                            System.out.print("1. INGRESAR USUARIOS\n" + "2. MOSTRAR USUARIOS ASCENDENTE\n" + "3. MOSTRAR USUARIOS DESCENDENTE\n" + "4. MENU PRINCIPAL\n");
                            op2=teclado.nextInt();
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
                    
                System.out.print("1. USUARIOS\n" + "2. CONTADOR DIGITOS REPETIDOS\n" + "3. TRES NUMEROS DE MAYOR A MENOR\n" + "4. CALCULAR PROMEDIO\n" + "5. SALIR\n");
                opciones=teclado.nextInt();
                }
                else if(opciones==2){
                    
                //LLAMAR A LOS METODOS PARA CONTAR DIGITOS REPETIDOS
                    System.out.print("1. INGRESAR NUMERO\n" + "2. INGRESAR NUMERO A BUSCAR\n" + "3. MOSTRAR NUMERO DE REPETIDOS\n" + "4. MENU PRINCIPAL\n");
                    op3=teclado.nextInt();
                    while(op3!=4){
                        if(op3==1){
                            System.out.print("HA SELECCIONADO INGRESAR UN NUEVO NUMERO\n");
                            System.out.print("1. INGRESAR NUMERO\n" + "2. INGRESAR NUMERO A BUSCAR\n" + "3. MOSTRAR NUMERO DE REPETIDOS\n" + "4. MENU PRINCIPAL\n");
                            op3=teclado.nextInt();
                        }
                        else if(op3==2){
                            System.out.print("HA SELECCIONADO INGRESAR NUMERO A BUSCAR\n");
                            System.out.print("1. INGRESAR NUMERO\n" + "2. INGRESAR NUMERO A BUSCAR\n" + "3. MOSTRAR NUMERO DE REPETIDOS\n" + "4. MENU PRINCIPAL\n");
                            op3=teclado.nextInt();
                        }
                        else if(op3==3){
                            System.out.print("HA SELECCIONADO MOSTRAR NUMERO DE REPETIDOS\n");
                            System.out.print("1. INGRESAR NUMERO\n" + "2. INGRESAR NUMERO A BUSCAR\n" + "3. MOSTRAR NUMERO DE REPETIDOS\n" + "4. MENU PRINCIPAL\n");
                            op3=teclado.nextInt();
                        }
                        else if(op3==4){
                            break;
                        }
                        else{
                             System.out.print("INGRESE UN NUMERO DE 1 A 4\n");
                             System.out.print("1. INGRESAR NUMERO\n" + "2. INGRESAR NUMERO A BUSCAR\n" + "3. MOSTRAR NUMERO DE REPETIDOS\n" + "4. MENU PRINCIPAL\n");
                             op3=teclado.nextInt();
                   
                            
                        }
                    
                    }
                    
                System.out.print("1. USUARIOS\n" + "2. CONTADOR DIGITOS REPETIDOS\n" + "3. TRES NUMEROS DE MAYOR A MENOR\n" + "4. CALCULAR PROMEDIO\n" + "5. SALIR\n");
                opciones=teclado.nextInt();
                   
                }
                else if(opciones==3){
                //LLAMAR A LOS METODOS PARA TRES NUMEROS DE MAYOR A MENOR
                   System.out.print("1. INGRESAR NUMEROS\n" + "2. MOSTRAR ORDENADOS\n" + "3. MOSTRAR MENU PRINCIPAL\n");
                   op4=teclado.nextInt();
                    while(op4!=4){
                        if(op4==1){
                            System.out.print("HA SELECCIONADO INGRESAR UN NUEVO NUMERO\n");
                            System.out.print("1. INGRESAR NUMEROS\n" + "2. MOSTRAR ORDENADOS\n" + "3. MOSTRAR MENU PRINCIPAL\n");
                            op4=teclado.nextInt();
                        }
                        else if(op4==2){
                            System.out.print("HA SELECCIONADO MOSTRAR ORDENADOS\n");
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
                    
                System.out.print("1. USUARIOS\n" + "2. CONTADOR DIGITOS REPETIDOS\n" + "3. TRES NUMEROS DE MAYOR A MENOR\n" + "4. CALCULAR PROMEDIO\n" + "5. SALIR\n");
                opciones=teclado.nextInt();


                }
                else if(opciones==4){
                //LLAMAR A LOS METODOS PARA CALCULAR EL PROMEDIO
                   System.out.print("1. INGRESAR ID\n" + "2. INGRESO DE NOTAS\n" + "3. MOSTRAR PROMEDIOS\n"+ "4. MOSTRAR MENU PRINCIPAL\n");
                   op5=teclado.nextInt();
                    while(op5!=4){
                        if(op5==1){
                            System.out.print("HA SELECCIONADO INGRESAR UN NUEVO ID\n");
                            System.out.print("1. INGRESAR ID\n" + "2. INGRESO DE NOTAS\n" + "3. MOSTRAR PROMEDIOS\n"+ "4. MOSTRAR MENU PRINCIPAL\n");
                            op5=teclado.nextInt();
                        }
                        else if(op5==2){
                            System.out.print("HA SELECCIONADO INGRESAR NOTAS\n");
                            System.out.print("1. INGRESAR ID\n" + "2. INGRESO DE NOTAS\n" + "3. MOSTRAR PROMEDIOS\n"+ "4. MOSTRAR MENU PRINCIPAL\n");
                            op5=teclado.nextInt();
                        }
                         else if(op5==3){
                            System.out.print("HA SELECCIONADO INGRESAR NOTAS\n");
                            System.out.print("1. INGRESAR ID\n" + "2. INGRESO DE NOTAS\n" + "3. MOSTRAR PROMEDIOS\n"+ "4. MOSTRAR MENU PRINCIPAL\n");
                            op5=teclado.nextInt();
                        }
                       
                        else if(op5==4){
                            break;
                        }
                        else{
                             System.out.print("INGRESE UN NUMERO DE 1 A 4\n");
                             System.out.print("1. INGRESAR ID\n" + "2. INGRESO DE NOTAS\n" + "3. MOSTRAR PROMEDIOS\n"+ "4. MOSTRAR MENU PRINCIPAL\n");
                             op5=teclado.nextInt();
                   
                            
                        }
                    
                    }
                    
                System.out.print("1. USUARIOS\n" + "2. CONTADOR DIGITOS REPETIDOS\n" + "3. TRES NUMEROS DE MAYOR A MENOR\n" + "4. CALCULAR PROMEDIO\n" + "5. SALIR\n");
                opciones=teclado.nextInt();




                }
                else if(opciones==5){
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
