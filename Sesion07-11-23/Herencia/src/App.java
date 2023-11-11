public class App {
    public static void main(String[] args) throws Exception {
        
        //Vamos a crear objetos de ambas clases
        
        Animal animal = new Animal("Dragon de komodo", 400.00, true, true);
        Perro yupi = new Perro("Yupi", 23.00, true, true, true, true, "Chow chow");
        animal.comer();
        yupi.comer();
    }
}
