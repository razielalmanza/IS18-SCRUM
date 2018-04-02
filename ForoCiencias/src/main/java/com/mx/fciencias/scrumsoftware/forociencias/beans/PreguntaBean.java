package com.mx.fciencias.scrumsoftware.forociencias.beans;

import com.mx.fciencias.scrumsoftware.forociencias.entities.ForoCienciasEntityManager;
import com.mx.fciencias.scrumsoftware.forociencias.entities.Pregunta;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Clase que controla las preguntas en la base de datos usando el manejador de 
 * entidades.
 * @author Marco Olea
 */
@ManagedBean(name = "preguntaBean")
@SessionScoped
public class PreguntaBean {
    
    /**
     * Busca todas las preguntas en la base de datos.
     * @return una lista de todas las preguntas guardadas.
     */
    public List<Pregunta> getPreguntaList() {
        return (new ForoCienciasEntityManager()).findAllPregunta();
    }
    
}
