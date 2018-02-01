/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author User
 */
public class Acciones {
    
    private HashMap<Integer, Datos> mapaCarnet;
    private HashMap<Integer, Datos> mapaPrestamo;


    public Acciones() {
   
        mapaCarnet = new HashMap<Integer, Datos>();
        mapaPrestamo = new HashMap<Integer, Datos>();
        this.leerData();
        this.leerData2();
    }

    public HashMap<Integer, Datos> getMapaCarnet() {
        return mapaCarnet;
    }

    public void setMapaCarnet(HashMap<Integer, Datos> mapaCarnet) {
        this.mapaCarnet = mapaCarnet;
    }

    public HashMap<Integer, Datos> getMapaPrestamo() {
        return mapaPrestamo;
    }

    public void setMapaPrestamo(HashMap<Integer, Datos> mapaPrestamo) {
        this.mapaPrestamo = mapaPrestamo;
    }
    
    public void agregarEstudiante(int Carnet, String Nombre, String Apellido) {
        Datos nodo = new Datos(Carnet, Nombre, Apellido);

        mapaCarnet.put(Carnet, nodo);
        this.escribirData();
    }
    
    public void agregarPrestamo(Integer Carnet, Integer NumeroPrestamo) {
        Datos nodo = new Datos(Carnet, NumeroPrestamo);

        mapaPrestamo.put(NumeroPrestamo, nodo);
        this.escribirData2();

    }
    
     public Datos BuscarPres(Integer clave){

        return mapaPrestamo.get(clave);
        
    }
     
    public Datos Buscar(Integer Carnet){

        return mapaCarnet.get(Carnet);
        
    }
    
     public boolean Comprobar(Integer Clave){

        if(mapaCarnet.containsKey(Clave)){
            return true;
        }
        else 
            return false;
    }
      public boolean ComprobarPres(Integer Clave){

        if(mapaPrestamo.containsKey(Clave)){
            return true;
        }
        else 
            return false;
    }
    
    public boolean Eliminar(Integer Carnet){
         mapaCarnet.remove(Carnet);
        this.escribirData();
        return true;
    }
    public boolean EliminarPres(Integer Clave){
         mapaPrestamo.remove(Clave);
        this.escribirData2();
        return true;
    }
 

    public void leerData() {
        ObjectInputStream ois;
        try {
            ois = new ObjectInputStream(new FileInputStream("archivo.dat"));
            mapaCarnet = (HashMap<Integer, Datos>) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Acciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

 
    public void escribirData() {
        ObjectOutputStream oos = null;
        HashMap<Integer, Datos> ObjGuardado = mapaCarnet;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("archivo.dat"));
            oos.writeObject(ObjGuardado);
        } catch (IOException ex) {
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Acciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void leerData2() {
        ObjectInputStream ois;
        try {
            ois = new ObjectInputStream(new FileInputStream("archivo2.dat"));
            mapaPrestamo = (HashMap<Integer, Datos>) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Acciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

 
    public void escribirData2() {
        ObjectOutputStream oos = null;
        HashMap<Integer, Datos> ObjGuardado = mapaPrestamo;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("archivo2.dat"));
            oos.writeObject(ObjGuardado);
        } catch (IOException ex) {
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Acciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
        
        
    
   
}
