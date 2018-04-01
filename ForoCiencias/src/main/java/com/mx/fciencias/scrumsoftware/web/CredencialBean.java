package com.mx.fciencias.scrumsoftware.web;

import com.mx.fciencias.scrumsoftware.model.SesionConexionBD;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import static javax.faces.context.FacesContext.getCurrentInstance;

/**
 *  La clase <code>UserBean</code> define objetos que permiten manejar la sesion de un
 * usuario a partir de la interfaz de usuario.
 *
 * Modificado: martes 27 de marzo de 2018.
 *
 * @author <a href="mailto:luis_lazaro@ciencias.unam.mx">Jose Luis Vazquez Lazaro</a>
 * @version 1.0
 */
@ManagedBean
@SessionScoped
public class CredencialBean {

	// Metodos constructores.
    /**
     * Constructor sin parametros.
     */
    public CredencialBean() {
    }

    // Metodos de implementacion.
    /**
     * Determina si el usuario actual esta registrado en la base de datos del sistema.
     * @return <code>boolean</code> - true si el usuario esta registrado, false en otro caso.
     */
    public boolean estaRegistrado() {
        FacesContext context = getCurrentInstance();
        SesionConexionBD l = ( SesionConexionBD ) context.getExternalContext().getSessionMap().get( "usuario" );
        return l != null;
    }

    /**
     * Devuelve la informacion basica del usuario actual: id de usuario, nombre de usuario y contraseña.
     * @return <code>SesionConexionBD</code> - La informacon basica del usuario.
     */
    public SesionConexionBD getUsuario() {
        FacesContext context = getCurrentInstance();
        return ( SesionConexionBD ) context.getExternalContext().getSessionMap().get( "usuario" );
    }

}
