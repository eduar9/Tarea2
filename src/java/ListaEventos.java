/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pepe
 */
public class ListaEventos {
    private final static String[] nombres;
    private final static String[] provincia;
    private final static String[] fechas;
    private final static String[] horas;
    private final static String[] tipos;
    private List<Evento> lista;
    
    static {
        nombres = new String[5];
        nombres[0] = "Semana del cine";
        nombres[1] = "Feria";
        nombres[2] = "Museo";
        nombres[3] = "Semana santa";
        nombres[4] = "David Bisbal";
        
        fechas = new String[5];
        fechas[0]= "20/4/2017";
        fechas[1]= "20/8/2017";
        fechas[2]= "4/5/2017";
        fechas[3]= "3/4/2017";
        fechas[4]= "0/0/0";
        
        horas = new String[5];
        horas[0] = "14:00";
        horas[1] = "21:00";
        horas[2] = "15:00";
        horas[3] = "18:00";
        horas[4] = "10:00";
        
        tipos = new String[5];
        tipos[0] = "Cine";
        tipos[1] = "Ocio";
        tipos[2] = "Cultura";
        tipos[3] = "Cultura";
        tipos[4] = "Concierto";
        
        
        provincia = new String[5];
        provincia[0] = "Málaga";
        provincia[1] = "Huelva";
        provincia[2] = "Cádiz";
        provincia[3] = "Málaga";
        provincia[4] = "Almería";
    }
    
    
    public ListaEventos(int size){
        lista = new ArrayList<Evento>();
        for(int i = 0 ; i < size ; i++) {
            lista.add(new Evento(nombres[i], fechas[i], horas[i], tipos[i], provincia[i], i));
        }
    }

    public List<Evento> getLista() {
        return lista;
    }

    public void setLista(List<Evento> lista) {
        this.lista = lista;
    }
    
}
