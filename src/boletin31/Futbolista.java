package boletin31;

public class Futbolista extends SeleccionFutbol{
    
    private int dorsal;
    private String demarcacion;
    
    
    
    
         public Futbolista(int id,int dorsal, String demarcacion, int edad, String nombre, String apellido) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
         
    public void entrevista(){
       } 

    @Override
    public String toString() {
        return "Futbolista : " +super.toString() + " Dorsal = " + dorsal + ", Demarcacion = " + demarcacion ;
    }
    
    
    
}
