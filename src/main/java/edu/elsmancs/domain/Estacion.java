package edu.elsmancs.domain;

import edu.elsmancs.domain.Bicicleta;

public class Estacion {
    private int id = 0;
    private String direccion = null;
    private int numeroAnclajes = 0;
    private Bicicleta[] anclajes = null;

    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this. numeroAnclajes = numeroAnclajes;
        this.anclajes = new Bicicleta[numeroAnclajes];
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroAnclajes() {
        return numeroAnclajes;
    }

    public Object[] getAnclajes() {
        return this.anclajes;
    }

    public void consultarEstacion() {
        System.out.println("id: " + getId());
        System.out.println("direccion: " + getDireccion());
        System.out.println("numero de anclajes: " + getNumeroAnclajes());
    }

    public int anclajesLibres() {

        int anclajesLibres = 0;

        for (Bicicleta anclaje: this.anclajes) {
            if (anclaje == null) {
                anclajesLibres ++;
            }
            else;
        }
        return anclajesLibres;
    }

    public void anclarBicicleta(Bicicleta bicicleta) {
        int posicion = 0;
        int numeroAnclaje = posicion + 1;

        for (Bicicleta anclaje : this.anclajes) {
            if (anclaje == null) {
                this.anclajes[posicion] = bicicleta;
                mostrarAnclaje(bicicleta, numeroAnclaje);
                break;
            } else
                posicion++;
            numeroAnclaje++;
        }
    }

    public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje) {
        System.out.println("id: " + bicicleta.getId() + "anclaje: " + numeroAnclaje);
    }
}


