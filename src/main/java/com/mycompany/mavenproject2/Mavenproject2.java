/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Dell
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
             Vehiculo vehiculo1 = VehicleFactory.crearVehiculo("coche");
        vehiculo1.conducir(); // Imprime: Conduciendo un coche.

        // Crear un vehículo tipo motocicleta
        Vehiculo vehiculo2 = VehicleFactory.crearVehiculo("motocicleta");
        vehiculo2.conducir(); // Imprime: Co
    }
}
