package com.solicitudes.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "municipiosformularios")
public class Municipio {

    @Id
    @Column(name = "id")
    private String idMunicipio;

    private String nombre;

    @Column(name = "iddeptoformularios")
    private String idDepto;

    public Municipio() {
    }

    public Municipio(String idMunicipio, String nombre, String idDepto) {
        this.idMunicipio = idMunicipio;
        this.nombre = nombre;
        this.idDepto = idDepto;
    }

    public String getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(String idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(String idDepto) {
        this.idDepto = idDepto;
    }
}
