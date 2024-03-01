/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototype;

/**
 *
 * @author edgar
 * https://www.youtube.com/watch?v=PTHNG3eNfHM&t=284s
 */
public class Usuario implements Cloneable { //Debemos usar al interfaz Clonable para el Prototype
    String nombre;
    String apellidos;
    int edad;
    String estadoCivil;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
        result = prime * result + edad;
        result = prime * result + ((estadoCivil == null) ? 0 : estadoCivil.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellidos == null) {
            if (other.apellidos != null)
                return false;
        } else if (!apellidos.equals(other.apellidos))
            return false;
        if (edad != other.edad)
            return false;
        if (estadoCivil == null) {
            if (other.estadoCivil != null)
                return false;
        } else if (!estadoCivil.equals(other.estadoCivil))
            return false;
        return true;
    }
    
    @Override
    protected Usuario clone() {   //Con este metodo nos permite clonar un objecto con sus mismos atributos
        Usuario cloneUsuario = new Usuario();
        cloneUsuario.setNombre(this.getNombre());
        cloneUsuario.setApellidos(this.getApellidos());
        cloneUsuario.setEdad(this.getEdad());
        cloneUsuario.setEstadoCivil(this.getEstadoCivil());

        return cloneUsuario;
    }
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", estadoCivil="
                + estadoCivil + "]";
    }

}
