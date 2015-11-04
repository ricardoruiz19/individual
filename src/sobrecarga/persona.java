
package sobrecarga;

public class persona {
    private String nombre;
    private int edad;
 
    public persona (String nombrePersona) {   //CONSTRUCTOR 1
       nombre = nombrePersona;
       edad = 0;     }
   
    public persona () {   //CONSTRUCTOR2
       nombre = "";
       edad = 0;     }
 
    public String getNombre () { return nombre; }  //Cierre del método
} //Cierre de la clase
