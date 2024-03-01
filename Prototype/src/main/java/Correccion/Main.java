/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Correccion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edgar
 */
public class Main {
    public static void main(String[] args) {
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Juan Pérez", "Delantero"));
        jugadores.add(new Jugador("Carlos López", "Mediocampista"));
        // ... agregar más jugadores

        Entrenador entrenador = new Entrenador("José Martínez");
        Estadio estadio = new Estadio("Camp Nou", 99354);

        EquipoDeFutbol equipo = new EquipoDeFutbol("FC Barcelona", jugadores, entrenador, estadio);
        EquipoDeFutbol equipoClonado = equipo.clonar();

        System.out.println(equipo);
        System.out.println(equipoClonado);
    }
}
