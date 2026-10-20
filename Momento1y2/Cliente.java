package Momento1y2;

public class Cliente {

private String nombre;
private String cedula;

public Cliente(String nombre, String cedula) {
    this.nombre = nombre;
    this.cedula = cedula;
}

public String getnombre(){ return nombre;}
public String getCedula(){ return cedula;}

public void setnombre(String nombre){ 
    if (nombre==("")) {
        System.out.println("El nombre no puede estar vacio.");
    } else {
        this.nombre = nombre;
    }
}

public void setCedula(String cedula){ 
    if (cedula==("")) {
        System.out.println("La cédula no puede estar vacia.");
    } else {
        this.cedula = cedula;
    }
}

@Override
public String toString() {
    return "Cliente [nombre=" + nombre + ", cedula=" + cedula + "]";
}

}