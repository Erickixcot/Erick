
package ACCESO_DATOS;

import CAPA_ENTIDADES.Telefono;
import java.util.ArrayList;


public class DAOtelefonos {
    String   idTelefonos;
    String   IMEI;
    String   modelo;
    String   marca;
    String   MAC_Adress;

    public DAOtelefonos () {}

    public String getIdTelefonos() {
        return idTelefonos;
    }

    public void setIdTelefonos(String idTelefonos) {
        this.idTelefonos = idTelefonos;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMAC_Adress() {
        return MAC_Adress;
    }

    public void setMAC_Adress(String MAC_Adress) {
        this.MAC_Adress = MAC_Adress;
    }

    public int guardarTelefono(Telefono telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public ArrayList<Telefono> consultaTelefono(String idTelefono, String IMEI, String modelo, String marca,String MAC_ADRESS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
