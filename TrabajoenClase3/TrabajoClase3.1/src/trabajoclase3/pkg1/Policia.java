
package trabajoclase3.pkg1;

public class Policia extends Persona {
    private String rango;

    public Policia(String n, String a, int e, String ran) {

        super(n, a, e);
        setRango(ran);
    }

    @Override
    public void setNombre(String n) {
        nombre = n.toUpperCase();
    }

    public void setRango(String ran) {
        rango = ran;
    }

    public String getRango() {
        return rango;
    }
    @Override
    public String toString(){
    
        return String.format("%s - Rango: %s", super.toString(), getRango());
    }
    
}
