
import java.util.Scanner;

public class validaclave {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String username;
		String password;
		String validaclave;
		
		System.out.println("ESTO ES UNA PRUEBA");

		//Pedimos datos por pantalla.
		System.out.println("Introduzca el usuario: ");
		username = sc.nextLine();
		System.out.println("Introduzca la password: ");
		password = sc.nextLine();

		//Con validaclave lo que hacemos es comparar la cadena almacenada en username que nosotros hemos introducido.
		//Si el usuario es admin mostramos mensaje, si no, no mostramos nada.
		validaclave = (username.equals("admin") ? "El usuario "+'"'+"admin"+'"'+" no se puede utilizar\n" : "");
		System.out.println(validaclave);

		//Definimos una nueva variable y guardamos el primer caracter de la cadena almacenada en username en dicha variable.
		String laPrimera = username.substring(0, 1);
		//Usamos validaclave para comparar y verificar que el primer caracter de la cadena no es un numero.
		//En el caso de que sea un numero mostraremos mensaje de error, si no, no mostraremos nada.
		validaclave = (laPrimera.equals("0") | laPrimera.equals("1") | laPrimera.equals("1") | 
					   laPrimera.equals("2") | laPrimera.equals("3") | laPrimera.equals("4") | 
					   laPrimera.equals("5") | laPrimera.equals("6") | laPrimera.equals("7") | 
					   laPrimera.equals("8") | laPrimera.equals("9") ? "El nombre de usuario debe comenzar con una letra.\n" : "");
		System.out.println(validaclave);

		//De nuevo usamos validaclave para verificar que la longitud de la cadena almacenada en password no sea menor a 8 caracteres.
		//Si el password es menor a 8 caracteres muestra mensaje de error, si no, no muestra nada.
		validaclave = (password.length() < 8 ? "La password debe tener un minimo de 8 caracteres.\n" : "");
		System.out.println(validaclave);

		//Ahora verificamos que nuestra password contenga alguna minuscula y mayuscula, en caso de que no contenga ninguna, mostrara un mensaje de error.
		validaclave = (password.contains("a") | password.contains("b") | password.contains("c") | password.contains("d") |
					   password.contains("e") | password.contains("f") | password.contains("g") | password.contains("h") |
					   password.contains("i") | password.contains("j") | password.contains("k") | password.contains("l") |
					   password.contains("m") | password.contains("n") | password.contains("ñ") | password.contains("o") |
					   password.contains("p") | password.contains("q") | password.contains("r") | password.contains("s") |
					   password.contains("t") | password.contains("u") | password.contains("v") | password.contains("w") |
					   password.contains("x") | password.contains("y") | password.contains("z") ? 
					   "" : "La password no contiene minusculas.\n");
		System.out.println(validaclave);

		validaclave = (password.contains("A") | password.contains("B") | password.contains("C") | password.contains("D") |
					   password.contains("E") | password.contains("F") | password.contains("G") | password.contains("H") |
					   password.contains("I") | password.contains("J") | password.contains("K") | password.contains("L") |
					   password.contains("M") | password.contains("N") | password.contains("Ñ") | password.contains("O") |
					   password.contains("P") | password.contains("Q") | password.contains("R") | password.contains("S") |
					   password.contains("T") | password.contains("U") | password.contains("V") | password.contains("W") |
					   password.contains("X") | password.contains("Y") | password.contains("Z") ? 
					   "" : "La password no contiene mayusculas.\n");
		System.out.println(validaclave);

		//Lo mismo que antes pero verificando si contiene algun signo (._@).
		validaclave = (password.contains(".") | password.contains("_") | password.contains("@") ? 
					   "" : "La password no contiene ._@\n");
		System.out.println(validaclave);
	}
}