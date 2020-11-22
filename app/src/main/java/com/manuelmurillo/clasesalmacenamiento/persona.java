package com.manuelmurillo.clasesalmacenamiento;

public class persona {

    private String nombre;
    private int nacimiento;

    public  persona(){
        nombre=""; nacimiento=1900;
    }

    public  persona(String nombre, int nacimiento){
        this.nombre=nombre; this.nacimiento=nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int calcularedad(int actual){ return actual-nacimiento;}
}
