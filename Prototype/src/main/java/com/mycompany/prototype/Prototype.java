/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prototype;

/**
 *
 * @author edgar
 */
public class Prototype {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.setEdad(15);
        usuario1.setApellidos("Gonzalez Hidalgo");
        usuario1.setNombre("Ramon");
        usuario1.setEstadoCivil("Soltero");

        Usuario usuario2 = usuario1.clone(); //Aqui clonamos al usuario2 en base a la informacion del usuario1
        usuario2.setEstadoCivil("Casado"); //Aqui le cambiamos un parametro al usuario2

        System.out.println(usuario1);
        System.out.println(usuario2);
    }
}
