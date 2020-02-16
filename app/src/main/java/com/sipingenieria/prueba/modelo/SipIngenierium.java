package com.sipingenieria.prueba.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SipIngenierium {

    @SerializedName("capacidad")
    @Expose
    private String capacidad;
    @SerializedName("fecha")
    @Expose
    private String fecha;
    @SerializedName("maquina")
    @Expose
    private String maquina;
    @SerializedName("rendimiento")
    @Expose
    private String rendimiento;
    @SerializedName("calidad")
    @Expose
    private String calidad;
    @SerializedName("oee")
    @Expose
    private String oee;

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public String getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(String rendimiento) {
        this.rendimiento = rendimiento;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getOee() {
        return oee;
    }

    public void setOee(String oee) {
        this.oee = oee;
    }

}
