package string_builder;

public class PasswordTester {

	public static boolean isGoodPassword(String password){
		
		//überprüft ob Passwort länger als 8 Zeichen ist
		if(password.length() < 8) {
			System.out.println("Das Passwort muss mindestens 8 Zeichen lang sein");
			return false;
		}
		
		//überprüft ob ein Sonderzeichen im Passwort vorhanden ist
		if(!password.matches(".*[!@+%^&*()].*")) {
			System.out.println("Passwort muss ein Sonderzeichen enthalten");
			return false;
		}
		
		//überprüft ob eine Zahl im Passwort vorhanden ist
		if(!password.matches(".*\\d.*")) {
			System.out.println("Passwort muss mindestens eine Zahl enthalten");
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String test = "AndiArbeit1234!";
		if(isGoodPassword(test)) {
			System.out.println("Passwort ist stark");
		} else {
			System.out.println("Passwort zu schwach");
		}

	}

}
