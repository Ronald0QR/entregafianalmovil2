package com.example.pruebapueblofinal.moldes;

public class RestauranteMolde {
    private int foto;
    private String nombre;
    private String precio;

    public RestauranteMolde(int foto, String nombre, String precio) {
        this.foto = foto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}

