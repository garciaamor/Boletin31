package boletin31;

public  class SeleccionFutbol implements IntegranteSeleccionFutbol{

    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "ID = " + id + ", Nombre = " + nombre +" "+ apellido + ", Edad = " + edad;
    }
    
   
    
    @Override
    public void concentrarse() {
        
    }

    @Override
    public void viajar() {
        
    }

    @Override
    public void entrenar() {
        
    }

    @Override
    public void jugarPartido() {
        
    }
    
    
    
}
