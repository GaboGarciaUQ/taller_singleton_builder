package com.uniquindio.co;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Compra comprapeq = new Compra.Builder()
            .conCliente("Juan")
            .conFuncion("Spider-Man")
            .conAsientos(new ArrayList<>(Arrays.asList("F4","F9","C1")))
            .conFecha(LocalDate.now())
            .build();

        Compra compracomp = new Compra.Builder()
            .conCliente("Mateo")
            .conFuncion("La Odisea")
            .conAsientos(new ArrayList<>(Arrays.asList("D1","D2")))
            .conFecha(LocalDate.now())
            .conCombo("Combo Perro Crispetas")
            .conPromocion("Promocion Familiar")
            .conPuntosRedimidos(120)
            .conEsCortesia(false)
            .build();

        //VERIFICACIONES 

        // Compra compra1 = new Compra(); // No permite pasar "The constructor Compra() is undefined"

        // Compra compra2 = new Compra.Builder().build(); // No crea el objeto y lanza NullPointerException "Cannot invoke "String.equals(Object)" because "this.cliente" is null"

        //VALIDACIONES (Para correr Main bien hay que quitar estas pues tiran IllegalStateException)

        Compra compraval1 = new Compra.Builder()
            .conCliente("Jose")
            .conFuncion("La Odisea")
            .conAsientos(new ArrayList<>(Arrays.asList("K4","K9","I5","I6","I7","B6")))
            .conFecha(LocalDate.now())
            .build();

        Compra compraval2 = new Compra.Builder()
            .conCliente("Oscar")
            .conFuncion("Avengers: Doomsday")
            .conAsientos(new ArrayList<>(Arrays.asList("H1")))
            .conFecha(LocalDate.now())
            .conCombo("Combo Nachos")
            .conPuntosRedimidos(80)
            .build();
        
    }
}
