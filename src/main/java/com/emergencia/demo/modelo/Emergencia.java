package com.emergencia.demo.modelo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Emergencia")
@Data
public class Emergencia {
    @Id
    private String idEmergencia;
    private String fecha;
    private String codigo;
    private String tituloEmergencia;
    private String descripcion;
    private String latitud;
    private String longitud;
    private String temperatura;

    public String getIdEmergencia() {
        return idEmergencia;
    }

    public void setIdEmergencia(String idEmergencia) {
        this.idEmergencia = idEmergencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTituloEmergencia() {
        return tituloEmergencia;
    }

    public void setTituloEmergencia(String tituloEmergencia) {
        this.tituloEmergencia = tituloEmergencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
}
