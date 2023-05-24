public class Persona {
private String nombre;
private int edad;
public Persona(String nombre, int edad){
this.nombre = nombre;
this.edad = edad;
}
//getters and setters
public String getNombre(){
return this.nombre;
}
public int getEdad(){
return this.edad;
}

public void imprimirDatos() {
System.out.println("Nombre: " + nombre);
System.out.println("Edad: " + nombre);
}