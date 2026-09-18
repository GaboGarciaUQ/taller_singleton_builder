package com.uniquindio.co;

import java.time.LocalDate;
import java.util.List;

public class Compra {

    private final String cliente;
    private final String funcion;
    private final List<String> asientos;
    private final LocalDate fecha;
    private final String combo;
    private final String promocion;
    private final int puntosredimidos;
    private final  boolean esCortesia;

    private Compra(Builder b){

        this.cliente = b.cliente;
        this.funcion = b.funcion;
        this.asientos = b.asientos;
        this.fecha = b.fecha;
        this.combo = b.combo;
        this.promocion = b.promocion;
        this.puntosredimidos =b.puntosredimidos;
        this.esCortesia = b.esCortesia;
    }

    public static class Builder{

        private String cliente;
        private String funcion;
        private List<String> asientos;
        private LocalDate fecha;
        private String combo;
        private String promocion;
        private int puntosredimidos;
        private boolean esCortesia;

        public Builder conCliente(String c){
            this.cliente = c;
            return this; //al final de cada metodo builder se retorna el objeto/clase que estamos creando para que se guarden los datos dentro de la clase compra.
        }

        public Builder conFuncion(String f){
            this.funcion = f;
            return this;
        }
        
        public Builder conAsientos(List<String> as){
            this.asientos = as;
            return this;
        }

        public Builder conFecha(LocalDate fe){
            this.fecha= fe;
            return this;
        }

        public Builder conCombo(String c){
            this.combo = c;
            return this;
        }

        public Builder conPromocion(String p){
            this.promocion = p;
            return this;
        }

        public Builder conPuntosRedimidos(int p){
            this.puntosredimidos = p;
            return this;
        }

        public Builder conEsCortesia(boolean c){
            this.esCortesia = c;
            return this;
        }

        public Compra build(){

            if(cliente.equals(null)){
                throw new IllegalStateException("Dato Obligatorio no encontrado. Porfavor inserte un Cliente");
            }
            if(funcion.equals(null)){
                throw new IllegalStateException("Dato Obligatorio no encontrado. Porfavor inserte una funcion");
            }
            if(asientos.equals(null)){
                throw new IllegalStateException("Dato Obligatorio no encontrado. Porfavor inserte uno o mas asientos");
            }
            if(asientos.size()>5){
                throw new IllegalStateException("Ha excedido la maxima cantidad de asientos reservables por Usuario. Por favor reserve menos de 5 asientos.");
            }
            if(puntosredimidos!=0 && puntosredimidos<100){
                throw new IllegalStateException("La cantidad de puntos redimidos es muy pequeña. Para obtener beneficios tiene que redimir mas de 100 puntos");
            }
            return new Compra(this);
        }




    }

}
