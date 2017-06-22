package com.ews.demoretrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wallace on 19/06/17.
 */
public class Carro {

    @SerializedName("marca")
    private String marca;

    @SerializedName("modelo")
    private String modelo;

    @SerializedName("ano")
    private int ano;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
