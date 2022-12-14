package com.example.microserv.entity;

import javax.persistence.*;;

@Entity
@Table(name = "actor")
public class EntidadActor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id_Actor")
    private Integer aIdActor;
    @Column(name = "nombre")
    private String aNombreactor;

    public Integer getaIdActor() {
        return aIdActor;
    }

    public void setaIdActor(Integer aIdActor) {
        this.aIdActor = aIdActor;
    }

    public String getaNombreactor() {
        return aNombreactor;
    }

    public void setaNombreactor(String aNombreactor) {
        this.aNombreactor = aNombreactor;
    }

    public String getaApellido() {
        return aApellido;
    }

    public void setaApellido(String aApellido) {
        this.aApellido = aApellido;
    }

    @Column(name = "apellido")
    private String aApellido;


}

