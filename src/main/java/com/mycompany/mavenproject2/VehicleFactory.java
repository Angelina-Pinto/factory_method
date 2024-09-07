/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Dell
 */
public class VehicleFactory {
      public static Vehiculo crearVehiculo(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            return null;
        }
        switch (tipo.toLowerCase()) {
            case "coche":
                return new Coche();
            case "motocicleta":
                return new Motocicleta();
            default:
                throw new IllegalArgumentException("Tipo de vehículo no reconocido");
        }
    }   
}
