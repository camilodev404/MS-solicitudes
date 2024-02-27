package com.solicitudes.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamentosformularios")
public class Departamento {

    @Id
    @Column(name = "iddeptoformularios")
    private String idDepto;

    private String nombre;

    public Departamento() {
    }

    public Departamento(String idDepto, String nombre) {
        this.idDepto = idDepto;
        this.nombre = nombre;
    }

    public String getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(String idDepto) {
        this.idDepto = idDepto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
