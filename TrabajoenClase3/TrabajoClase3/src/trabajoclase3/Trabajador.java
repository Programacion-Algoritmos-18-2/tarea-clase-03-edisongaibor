
package trabajoclase3;

public class Trabajador {
    private String nombres;
    private double sueldo_mensual;
    private String apellidos;
    
    public void agregar_nombres(String n){
        nombres = n;
    }
    
    public void agregar_nombres(String n1, String n2){
        nombres = String.format("%s-%s", n1, n2);
    }
    
    
    public void agregar_sueldo(double sueldo){
        sueldo_mensual = sueldo;
    }
     
    public void agregar_sueldo(double s1,double s2,double s3,double s4){
        sueldo_mensual = s1+s2+s3+s4;
    }
    
    
    
        
    public void agregar_apellidos(String n){
        apellidos = n;
    }
    
    public String obtener_nombres(){
        return nombres;
    }
    
    public String obtener_apellidos(){
        return apellidos;
    }
    
    public double obtener_sueldo_mensual(){
        return sueldo_mensual;
    }
    //LLAMO AL METODO PARA PRESENTAR DATOS
//    public String presentar_datos(){
//        return String.format("\n\tNombres: %s \n\tApellidos: %s\n\t"
//                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
//                obtener_sueldo_mensual());
//    }
    
//ESTO IMPRIME TODO SI LLAMAR AL METODO (SE COLOCA LA T)
    
    @Override
    public String toString(){
        return String.format("\n\tNombres: %s \n\tApellidos: %s\n\t"
                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
                obtener_sueldo_mensual());
    
}
}