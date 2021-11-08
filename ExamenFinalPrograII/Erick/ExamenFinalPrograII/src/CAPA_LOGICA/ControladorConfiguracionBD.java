
package CAPA_LOGICA;

import ACCESO_DATOS.parametrosBD;

public class ControladorConfiguracionBD {

    public ControladorConfiguracionBD() {
    }

    public String setParametros(String host, String port, String database, String user, String password) {
        //<editor-fold defaultstate="collapsed" desc="setParamtros">
        if (!host.isEmpty() && !port.isEmpty() && !database.isEmpty() && !user.isEmpty() && !password.isEmpty()) {
            
            parametrosBD.setHost(host);
            parametrosBD.setPort(port);
            parametrosBD.setDatabase(database);
            parametrosBD.setUsuario(user);
            parametrosBD.setPassword(password);
            parametrosBD.updateUrl();
            
            return "OK";
            
        } else {
            return "Por favor ingrese la informacion de todos los campos";
        }
        //</editor-fold>
    }
}