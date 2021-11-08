
package CAPA_LOGICA;

import ACCESO_DATOS.DAOMarcas;
import CAPA_ENTIDADES.Marcas;
import java.util.ArrayList;






public class ControladorMarca {
     DAOMarcas daoMarca;
    Marcas TelefonoSeleccionado;
    ArrayList<Marcas> ultimaConsulta;
    
    
     public ControladorMarca() {
        daoMarca = new DAOMarcas();
    }
     public String insertarMarca(String idMarca, String NomMarca){
        if (!idMarca.equals(" ")  && !NomMarca.equals(" ") ){
            Marcas ma= new Marcas();
            ma.setIdMarca(idMarca);
            ma.setNombreMarcas(NomMarca);
           
            if (daoMarca.guardarMarca(ma)== -1) {
                return "No es posible registrar el Marca:\n"
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
        ultimaConsulta = daoMarca.consultaMarcas(marca, marca);
        Object resultado[][] = new Object[ultimaConsulta.size()][2];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i][0] = ultimaConsulta.get(i).getIdMarca().toString();
            resultado[i][1] = ultimaConsulta.get(i).getNombreMarcas().toString();
            
        }
        
        
    return resultado;    
}
    
    
    
    
    
    
}
