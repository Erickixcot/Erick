
package ACCESO_DATOS;

import CAPA_ENTIDADES.Marcas;
import java.util.ArrayList;


public class DAOMarcas {
    String   idMarcas;
    String   nombreMarcas;

    public String getIdMarcas() {
        return idMarcas;
    }

    public void setIdMarcas(String idMarcas) {
        this.idMarcas = idMarcas;
    }

    public String getNombreMarcas() {
        return nombreMarcas;
    }

    public void setNombreMarcas(String nombreMarcas) {
        this.nombreMarcas = nombreMarcas;
    }

    public int guardarMarca(Marcas ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Marcas> consultaMarcas(String idMarca,String NombreMarca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
