package actividad2;

public class MAIN {
    public static void main(String[] args) {
    Contacto [] arreglo = {
            new Contacto("Juan", "juan@gmail.com", "9999112233"),
            new Contacto("Shushu", "shushu@gmail.com", "9981234567"),
            new Contacto("Alambrito", "alambrito@gmail.com", "9989876543"),
            new Contacto("Moni fifi", "mfifi@gmail.com", "99823459687"),
            new Contacto("Mariel", "mariel@gmail.com", "9998765234"),
            new Contacto("Tommy", "tommy@gmail.com", "9980872345"),
            new Contacto("Thali", "thali@gmail.com", "9976786354"),
            new Contacto("Vitro", "vitroamiko@gmail.com", "9988763456"),
            new Contacto("Tammy", "tammy@gmail.com", "9988793425"),
            new Contacto("Rafa", "chikibaby@gmail.com", "9987894567"),
    };
        PhoneBook phonebook = new PhoneBook(arreglo);
        Movil movil = new Movil();
        Celular celular = new Celular();
        Telefono telefono = new Telefono();
        String correo = phonebook.obtenerCorreo("Juan"); //juan@gmail.com
        System.out.println(correo);
        String numerotelefono = phonebook.obtenerTelefono("Juan"); //9999112233
        System.out.println((telefono));
        Contacto contacto = phonebook.obtenerContacto("Alambrito");
        sonar(celular);
        sonar(telefono);
        sonar(movil);
        llamar(movil, contacto);
        llamar(celular, contacto);
        llamar(telefono,contacto);

    }
    public static void sonar (Llamable llamable){
        llamable.sonar();
    }

    public static void llamar (Llamable llamable, Contacto contacto){
        llamable.llamar(contacto);
    }
}
