
package CAPA_LOGICA;
import ACCESO_DATOS.DAOtelefonos;
import CAPA_ENTIDADES.Telefono;
import java.util.ArrayList;



public class ControladorTelefono {
     DAOtelefonos daoTelefono;
    Telefono TelefonoSeleccionado;
    ArrayList<Telefono> ultimaConsulta;

    public ControladorTelefono() {
        daoTelefono = new DAOtelefonos();
    }
    
    
    public String insertarTelefono(String idTelefono, String IMEI, String modelo, String marca, String MAC_Adress){
        if (!idTelefono.equals(" ")  && !IMEI.equals(" ") && !modelo.equals(" ")&& !marca.equals(" ")&& !MAC_Adress.equals(" ")){
            Telefono tel = new Telefono();
            tel.setIdTelefonos(idTelefono);
            tel.setIMEI(IMEI);
            tel.setModelo(modelo);
            tel.setMarca(marca);
            tel.setMAC_Adress(MAC_Adress);
            
            if (daoTelefono.guardarTelefono(tel)== -1) {
                return "No es posible registrar el Telefono:\n"
                        + "(1) Verifique la conexion con la base de datos no tenga problemas.\n"
                        + "(2) O que el Telefono no se encuentre ya registrado";
            }
             System.out.println("Se insertó un nuevo Estudiante");
            return "OK";
        }
        else {
        }
        return "Es necesario ingresar la informacion de todos los campos";
    }
    
    public Object[][] consultarTelefono(String idTelefono, String IMEI, String modelo, String marca,String MAC_ADRESS){
       
        ultimaConsulta = daoTelefono.consultaTelefono(idTelefono, IMEI, modelo, marca, MAC_ADRESS);
        Object resultado[][] = new Object[ultimaConsulta.size()][5];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i][0] = ultimaConsulta.get(i).getIdTelefonos().toString();
            resultado[i][1] = ultimaConsulta.get(i).getIMEI().toString();
            resultado[i][2] = ultimaConsulta.get(i).getModelo().toString();
            resultado[i][3] = ultimaConsulta.get(i).getMarca().toString();
            resultado[i][4] = ultimaConsulta.get(i).getMAC_Adress().toString();
        }
        
        
    return resultado;    
}

  
    public String actualizarPrograma(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminarPrograma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String[] seleccionarPrograma(int seleccionado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String insertarPrograma(String text, String text0, String text1, String text2, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object[][] consultarProgramas(String text, String text0, String text1, String text2, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String actualizarPrograma(String text, String text0, String text1, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}

