/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.fciencias.scrumsoftware.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author ximenalezama
 */
@ManagedBean
@SessionScoped
public class AgregaPregunta {
    
    private String respuesta;
    
    public String getRespuesta() {
        return respuesta;
    }
    
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    

    // Metodos de implementacion.
    /**
     * Inicializa la sesion de usuario a partir de la credencial identificada.
     * @return <code>String</code> - La direccion de la interfaz de usuario.
     */
    public String agrega () throws ValidatorException{
        if (respuesta.equals("")){
            return "ErrorAgregarRespIH?faces-redirect=true";
        }else {
            return "RespuestaExitoIH?faces-redirect=true";
        }
    }
    public void inserta(String respuesta) throws ParseException{
       // Crea la fecha
       String fechaTemp = "2018-04-23";
       Date d = new SimpleDateFormat("yyyy-MM-dd").parse(fechaTemp);
       java.sql.Date sqlDate = new java.sql.Date(d.getTime()); 
   }

}