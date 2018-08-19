/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlosmartinez
 */
public class usuarios {
    private int id;
    private String nombre;
    private int nota1, nota2, nota3, nota4, nota5, suma, promedio;
    
    public void setID(int id){
        this.id=id;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setNotas(int n1, int n2, int n3, int n4, int n5){
        this.nota1=n1;
        this.nota2=n2;
        this.nota3=n3;
        this.nota4=n4;
        this.nota5=n5;
    
    }
    
    
    public int getID(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getNotas(){
        return nota1 + nota2 + nota3 + nota4 + nota5;
    
    }
    
   public int promedio(int n1, int n2, int n3, int n4, int n5){
       suma=n1+n2+n3+n4+n5;
       promedio= suma/5;
       return promedio;
   
   }
    
    public String toString(){
        return "EL USUARIO:  " + id + "NOMBRE: " + nombre + "TIENE NOTAS DE: " + nota1 + nota2 + nota3 + nota4 + nota5 + "CON UN PROMEDIO DE:" + promedio;
    }
}
