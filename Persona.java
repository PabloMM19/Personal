public class Persona {
private String nombre;
private int edad;
private String correo;
public Persona(String nombre, int edad, String correo){
this.nombre = nombre;
this.edad = edad;
this.correo = correo;
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
System.out.println("Edad: " + edad);
System.out.println("Correo: " + correo);
}