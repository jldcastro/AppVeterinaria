package cl.surdev.clinica;

import android.app.Application;

/**
 * Created by Familia on 12-07-2016.
 */
public class Aplicacion extends Application {

    private String usuario;

    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
