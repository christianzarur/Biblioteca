/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.io.Serializable;




/**
 *
 * @author User
 */
public class Datos implements Serializable {
    private Integer Carnet;
    private String Nombre;
    private String Apellido;
    private Integer NumPrestamo;
    private String FechaPrestamo;
    private String FechaDevolucion;
    private String FechaRealDevolucion;
    private String TituloLibro;
    private String CotaLibro;
 
    public Datos(Integer Carnet, String Nombre, String Apellido) {
        this.Carnet = Carnet;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.NumPrestamo = 0;
        this.FechaPrestamo = null;
        this.FechaDevolucion = null;
        this.FechaRealDevolucion = null;
        this.TituloLibro = null;
        this.CotaLibro = null;  
    }

    public Datos(Integer Carnet, Integer NumPrestamo) {
        this.Carnet = Carnet;
        this.NumPrestamo = NumPrestamo;
        this.FechaPrestamo = null;
        this.FechaDevolucion = null;
        this.FechaRealDevolucion = null;
        this.TituloLibro = null;
        this.CotaLibro = null; 
        this.Nombre = null;
        this.Apellido = null;
    }
    
    
    
    public Integer getCarnet() {
        return Carnet;
    }

    public void setCarnet(Integer Carnet) {
        this.Carnet = Carnet;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTituloLibro() {
        return TituloLibro;
    }

    public void setTituloLibro(String TituloLibro) {
        this.TituloLibro = TituloLibro;
    }

    public String getCotaLibro() {
        return CotaLibro;
    }

    public void setCotaLibro(String CotaLibro) {
        this.CotaLibro = CotaLibro;
    }

    public Integer getNumPrestamo() {
        return NumPrestamo;
    }

    public void setNumPrestamo(Integer NumPrestamo) {
        this.NumPrestamo = NumPrestamo;
    }

    public String getFechaPrestamo() {
        return FechaPrestamo;
    }

    public void setFechaPrestamo(String FechaPrestamo) {
        this.FechaPrestamo = FechaPrestamo;
    }

    public String getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(String FechaDevolucion) {
        this.FechaDevolucion = FechaDevolucion;
    }

    public String getFechaRealDevolucion() {
        return FechaRealDevolucion;
    }

    public void setFechaRealDevolucion(String FechaRealDevolucion) {
        this.FechaRealDevolucion = FechaRealDevolucion;
    }
    

    
}
