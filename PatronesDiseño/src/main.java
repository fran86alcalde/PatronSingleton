
public class main {

	public static void main(String[] args) {
		
		ClaseSingleton ejemplo=ClaseSingleton.getInstance();
		
		ClaseSingleton ejemplo2=ClaseSingleton.getInstance();
		
		System.out.println(ejemplo);
		
		System.out.println(ejemplo2);
	}

}
