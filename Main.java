
/**
 *Clase para solicitar los datos del solicitante del credito y verificar si es o no acreedor
 *a un credito
 * @author Erna Tercero
 * @version 22 de Mayo del 2022
 */
import java.util.Scanner;  //Libreria para aceptar valores por pantalla
public class Main extends Acreedor
{
    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] args)
    {
        Scanner lee = new Scanner(System.in);
        Acreedor acreedor;
        acreedor = new Acreedor();
        
        
        //Flujo del programa
        String empleado = "";
        empleado = LeeNombreEmpleado();
        
        boolean datos_correctos = SolicitaDatosAcreedor();
        if (datos_correctos) {
            boolean documentos_correctos = RecibeDocumentosAcreedor();
            if (documentos_correctos) {
                int monto = CalculaMontoCredito(acreedor.calculaEdad(acreedor.fechaSolicitud, acreedor.fechaNacimiento)); 
            }else{
                //Se enviara mensaje a pantalla indicando que no se cumplio con los documentos
            }
        }else{
            //Se enviara mensaje a pantalla indicando que el acreedor no cumple con las condiciones del credito
        }
        
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    static String LeeNombreEmpleado() {
        System.out.print("Ingrese su nombre completo ::: ");
        emplado = lee.next();
        return empleado;
    }
    static boolean SolicitaDatosAcreedor() {
        //Aqui se leen los datos solicitados al acreedor
        //Se hara el calculo de la edad
        //Se validara el pais donde vive el Acreedor
        //Si se cumplen las condiciones se va a regresar true
        return true;
    }
    
    static boolean RecibeDocumentosAcreedor() {
        //Se indicara el tipo de documento, para el id oficial, se mostrara una lista de selección de tipos de documentos
        //Si se reciben todos los documentos se regresara true
        return true;
        
    }
    
    static boolean CalculaMontoCredito(int edad) {
        //De acuerdo al rango de edad al que pertenece el acreedor se hara la rutina para calcular el monto del prestamo
    }
    
    
}
