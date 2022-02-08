
public class ClaseSingleton {
	
    private static ClaseSingleton instancia = new ClaseSingleton();
 
    private ClaseSingleton() {}
 
    public static ClaseSingleton getInstance() {
        return instancia;
    }
} 
