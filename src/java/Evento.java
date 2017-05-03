/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author pepe
 */
public class Evento {
    private String nombre;
    private String fecha;
    private String hora;
    private String tipo;
    private String provincia;
    private int idfoto; //un id para buscar la foto
    
    public Evento(String n, String f, String h, String t, String p, int id){
        nombre = n;
        fecha = f;
        hora = h;
        tipo = t;
        provincia = p;
        idfoto = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public int getIdfoto() {
        return idfoto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
    
    
}
