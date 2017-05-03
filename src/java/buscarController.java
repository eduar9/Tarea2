/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author pepe
 */
@Named(value = "buscarController")
@RequestScoped
public class buscarController {
    private String texto;
    private String tipo;
    private String provincia;
    private String localidad;
   
    
    private ListaEventos lista;
    private List<Evento> copia;
    
    public buscarController() throws CloneNotSupportedException {
        lista = new ListaEventos(5);
        copia = new ArrayList<Evento>();
        copia.addAll(0, lista.getLista());
        
    }
    public String getTexto(){
        return texto;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public List<Evento> getLista() {
        return lista.getLista();
    }

    public void setLista(List<Evento> list) {
        lista.setLista(list);
    }
    
    public void buscar(){
        List<Evento> aux = new ArrayList<Evento>();
        Iterator<Evento> it = lista.getLista().iterator();
        if(texto!=null && texto.length()!=0){ //SI HAY TEXTO HACEMOS...
            if(tipo.equals("nada")&& provincia.equals("nada2")){
                while(it.hasNext()){
                    Evento ev = it.next();
                    if(ev.getNombre().contains(texto)){
                        aux.add(ev);
                    }
                    
                }
            }else if(!tipo.equals("nada")){
                while(it.hasNext()){
                    Evento ev = it.next();
                    if(ev.getTipo().equals(tipo) && ev.getNombre().equals(texto)){
                        aux.add(ev);
                    }
                }
            }else{
                while(it.hasNext()){
                    Evento ev = it.next();
                    if(ev.getProvincia().equals(provincia) && ev.getNombre().equals(texto)){
                        aux.add(ev);
                    }
                }
            }
            setLista(aux);
        }else if(!tipo.equals("nada")){
            while(it.hasNext()){
                Evento ev = it.next();
                if(ev.getTipo().equals(tipo)){
                    aux.add(ev);
                }
        
            }
            setLista(aux);
        }else if(!provincia.equals("nada2")){
            while(it.hasNext()){
                Evento ev = it.next();
                if(ev.getProvincia().equals(provincia)){
                    aux.add(ev);
                }
            }
            setLista(aux);
        }else{
            setLista(copia);
        }
        
    }
}
