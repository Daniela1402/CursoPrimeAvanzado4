package com.huvert.controller;

import com.huvert.ejb.UsuarioFacadeLocal;
import com.huvert.model.Rol;
import com.huvert.model.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("usuarioController")
@ManagedBean(name = "usuario")
@ViewScoped
public class UsuarioController implements Serializable {

    @EJB
    private UsuarioFacadeLocal usuarioEJB;
    private Usuario usuario;
    private Rol rol;

    @PostConstruct
    public void init() {
        this.rol = new Rol();
        this.usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
     public void registrar() {
        try {
            usuarioEJB.create(this.usuario);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}