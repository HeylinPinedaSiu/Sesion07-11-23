public class Animal {
  
    private String nombre;
    private double peso;
    private boolean tienePiernas;
    private boolean tieneOjos;
  
    //Metodo constructor
    public Animal(String nombre, double peso, boolean tienePiernas, boolean tieneOjos) {
        this.nombre = nombre;
        this.peso = peso;
        this.tienePiernas = tienePiernas;
        this.tieneOjos = tieneOjos;
    }
  
    //Metodos getter y setter
    public String mostrarNombre() {
        return nombre;
    }
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }
  
    //Metodo funcional
    public void comer(){
        System.out.println("El animal esta comiendo!");
    }
  
    public void moverse(){
        System.out.println("El animal se esta moviendo!");
    }

}
