package com.informaticonfi.spring.app1.springboot_applications.dto;

public class EmpleadoDTO {

    private String nombre;
    private String apellido;
    private String puesto;
    private int edad;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(String nombre, String apellido, String puesto, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}