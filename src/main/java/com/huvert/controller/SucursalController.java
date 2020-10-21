
package com.huvert.controller;

import com.huvert.ejb.SucursalFacadeLocal;
import com.huvert.model.Sucursal;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("sucursalCntroller")
@ManagedBean(name="sucursal")
@ViewScoped

public class SucursalController implements Serializable{
    @EJB
    SucursalFacadeLocal usuarioEJB;
    private Sucursal sucursal;
    
    @PostConstruct
    public void init (){
        sucursal=new Sucursal();
        
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
}
