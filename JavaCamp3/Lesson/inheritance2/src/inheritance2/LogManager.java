package inheritance2;

public class LogManager {

	// !!! Birbirinin alternatifi olan kod bloklar�nda if kullan�lmaz.
	
	public void log(int logType) {
		if (logType == 1) {
			System.out.println("Veritaban�na logland�!");
		}
		if (logType == 2) {
			System.out.println("Dosyaya logland�!");
		}
		else {
			System.out.println("Email G�nderildi!");
		}
	}
}
