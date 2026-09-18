package com.uniquindio.co;

import java.time.LocalDate;
import java.util.List;

public class Compra {

    private String cliente;
    private String funcion;
    private List<String> asientos;
    private String combo;
    private String promocion;
    private int puntosredimidos;
    private LocalDate fecha;
    private boolean esCortesia;

    public Compra(String cliente, String funcion, List<String> asientos, String combo, String promocion, int puntosredimidos, LocalDate fecha, boolean esCortesia) {

        this.cliente = cliente; //Necesario
        this.funcion = funcion; //Necesario
        this.asientos = asientos; //Necesario
        this.combo = combo;
        this.promocion = promocion;
        this.puntosredimidos = puntosredimidos;
        this.fecha = fecha;
        this.esCortesia = esCortesia;
    }

    public Compra(){

    }

}
