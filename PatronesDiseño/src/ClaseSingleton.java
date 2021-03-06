public class ClaseSingleton {
    private static ClaseSingleton instanciaUnica;
 
    private ClaseSingleton() {}

    private static void createInstance() {
        if (instanciaUnica == null) { 
            instanciaUnica = new ClaseSingleton();
        }
    }
 
    public static ClaseSingleton getInstance() {
        createInstance();

        return instanciaUnica;
    }
}  
