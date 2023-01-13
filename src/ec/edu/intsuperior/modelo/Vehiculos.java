/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import javax.print.DocFlavor;

/**
 *
 * @author Usuario
 */
public class Vehiculos {
    private String modelo;
    private String marca;
    private String tipo;
    private String color;
    private int Año_fabricacion;
    
    public Vehiculos() {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño_fabricacion() {
        return Año_fabricacion;
    }

    public void setAño_fabricacion(int Año_fabricacion) {
        this.Año_fabricacion = Año_fabricacion;
    }

    @Override
    public String toString() {
        return "Modelo del carro \n"
                + "Marca del carro"+getMarca()+"\n"
                +"Modelo del carro: "+getModelo()+"\n"
                +"Tipo de carro: " +getTipo()+"\n"
                + "Color del carro"+getColor()+"\n"
                + "Año Fabricacion:"+getAño_fabricacion();
        
        
                
    }
    
}

