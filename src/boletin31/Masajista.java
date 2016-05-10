package boletin31;

public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private int anosExperiencia;
    
    public void darMasaje(){
        
        
        
    }

    public Masajista(int id,String titulacion, int anosExperiencia, int edad, String nombre, String apellido) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista : "+super.toString() + " Titulacion = " + titulacion + ", Anos experiencia = " + anosExperiencia;
    }
    
    
}
