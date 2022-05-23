
/**
 *Clase para solicitar los datos del solicitante del credito y verificar si es o no acreedor
 *a un credito
 * @author Erna Tercero
 * @version 22 de Mayo del 2022
 */
import java.util.Date;
// Librerias para realizar el calculo de edad  tomado de https://sites.google.com/a/upao.edu.pe/hwongu/mundo-java/tips-de-codificacion/calculo-de-la-edad 
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
//Libreria para el manejo de errores
import java.text.ParseException;

public class Acreedor
{
    // instance variables - replace the example below with your own
    String fechaSolicitud;
    String nombre;
    String fechaNacimiento;
    String sexo;
    String calle;
    String numExterior;
    String numInterior;
    String municipio;
    String estado;
    String pais;
    boolean idOficial;
    boolean curp;
    boolean comprobanteDomicilio;
    Integer edad;
    

    /**
     * Constructor for objects of class Acreedor
     */
    public Acreedor()
    {
        // initialise instance variables
        fechaSolicitud = "";
        nombre = "";
        fechaNacimiento = "";
        sexo = "";
        calle = "";
        numExterior = "";
        numInterior = "";
        municipio = "";
        estado = "";
        pais = "";
        idOficial = true;
        curp = true;
        comprobanteDomicilio = true;
        edad = 0;
        
    }

    /**
     * Calcula la edad la cual se calculara contra la fecha en que se realiza la solicitud y la fecha de nacimiento
     *
     * @params  FechaSolicitud y FechaNacimiento
     * @return   edad
     */
    public int calculaEdad(String fechaSolicitud, String fechaNacimiento)
    {
        String fs = fechaSolicitud;
        String fn = fechaNacimiento;
        try {
            Calendar nacimiento = new GregorianCalendar();
            Calendar solicitud = new GregorianCalendar();
            int edad = 0;
            int factor = 0;
            Date fecha_nacimiento = new SimpleDateFormat("dd-MM-yyyy").parse(fn);
            Date fecha_solicitud = new SimpleDateFormat("dd-MM-yyyy").parse(fs);
            nacimiento.setTime(fecha_nacimiento);
            solicitud.setTime(fecha_solicitud);
            
            if (solicitud.get(Calendar.MONTH) <= nacimiento.get(Calendar.MONTH)) {
                if (solicitud.get(Calendar.MONTH) == nacimiento.get(Calendar.MONTH)) {
                    if (solicitud.get(Calendar.DATE) > nacimiento.get(Calendar.DATE)) {
                        factor = -1; //Aun no celebra su cumpleaÃ±os
                    }
                } else {
                    factor = -1; //Aun no celebra su cumpleaÃ±os
                }
            }
            edad = (solicitud.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR)) + factor;
            return edad;
                
        }catch (ParseException e){
            return 0;
        
        }
    }

    /**
     * Verifica que se hayan entregado todos los documentos
     *
     * @params  id oficial, curp y comprobante de domicilio
     * @return   regresa True si todos los documentos fueron entregados y false si no se entregaron completos
     */
    public boolean documentos(boolean idOficial, boolean curp, boolean comprobanteDomicilio) {
        boolean id = idOficial;
        boolean numero = curp;
        boolean comp = comprobanteDomicilio;
        
        if (id && numero && comp) {
            return true;
        }else{
            return false;
        }
        
    }
}
