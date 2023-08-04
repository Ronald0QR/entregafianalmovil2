package com.example.pruebapueblofinal.moldes;

public class SitioMolde {
    private int foto;
    private String nombre;
    private String  desc;

    public SitioMolde() {
    }

    public SitioMolde(int foto, String nombre, String desc) {
        this.foto = foto;
        this.nombre = nombre;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {this.desc = desc;
    }

}
