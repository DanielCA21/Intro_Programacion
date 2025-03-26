/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicionales_danielca;

/**
 *
 * @author Estudiantes
 */
public class Condicionales_DanielCA {

    public static void main(String[] args) {
      String orden = "agua";
      
      if (orden == "te"){
          System.out.println("1. calentar el agua");
          System.out.println("2. servir agua caliente en taza");
          System.out.println("3. poner bolsa de té en agua");
          System.out.println("4. sumergir y sacar bolsa de té dentro del agua 3 veces");
          System.out.println("5. servir taza de té");
                    
      } else if (orden == "cafe"){
          System.out.println("1. calentar el agua");
          System.out.println("2. poner café molido en colador");
          System.out.println("3. vertir agua caliente en colador");
          System.out.println("4. agregar leche a taza de café");
          System.out.println("5. servir taza de café");
      
      } else {
          System.out.println("Orden inválida");
      }     
    }
}
