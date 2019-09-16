package actividad2;

public class OBJETOS {
    public class Celular implements Llamable{
        @Override
        public void sonar() {
            System.out.println("Celular sonando");

        }

        @Override
        public void llamar(Contacto contacto) {
            System.out.println(
                    "Llamando por celular a " + contacto.getNombre() + "al número " + contacto.getTelefono()
            );
        }
    }

    public class PhoneBook {
        private Contacto[] listaDeContactos;



        //Constructor  que pide la lista de contactos
        PhoneBook (Contacto [] listaDeContactos){
            this.listaDeContactos = listaDeContactos;
        }



        //métodos
        //devuélve el teléfono de un contacto si es que existe
        public String obtenerTelefono(String nombre) {
            //sabemos que tenemos que buscalo en la lista de contactos
            //loop for
            //vamos a realiza una comparación del nombre que introduce el usuario con la lista
            for (int posicion = 0; posicion < listaDeContactos.length; posicion = posicion+1){
                Contacto contacto = listaDeContactos [posicion];
                if (contacto.getNombre().equals(nombre)){
                    return contacto.getTelefono();
                }
            }

            return "No existe";
        }
        //devuélve el correo de un contacto si es que existe
        public String obtenerCorreo(String nombre) {
            for (int posicion = 0; posicion < listaDeContactos.length; posicion = posicion+1){
                Contacto contacto = listaDeContactos [posicion];
                if (contacto.getNombre().equals(nombre)){
                    return contacto.getCorreo();
                }
            }

            return "No existe";
        }
        //devuélve el contacto de un contacto si es que existe
        public Contacto obtenerContacto(String nombre) {
            for (int posicion = 0; posicion < listaDeContactos.length; posicion = posicion+1){
                Contacto contacto = listaDeContactos [posicion];
                if (contacto.getNombre().equals(nombre)){
                    return contacto;
                }
            }
            return null;
        }
    }
    public class Telefono implements Llamable {

        @Override
        public void sonar() {
            System.out.println("Telefono sonando");
        }

        @Override
        public void llamar(Contacto contacto) {
            System.out.println(
                    "Llamando por celular a " + contacto.getNombre() +
                            " al numero " + contacto.getTelefono()
            );

        }
    }
    public class Movil implements Llamable {

        @Override
        public void sonar() {

        }

        @Override
        public void llamar(Contacto contacto) {

        }
    }
    public interface Llamable {

        void sonar();
        void llamar (Contacto contacto);

    }
    public class Contacto {
        //Construcor que pide el nombre, telefono y correo

        //Atributos nombre, correo teléfono
        private String nombre;
        private String correo;
        private String telefono;

        public Contacto(String nombre, String correo, String telefono) {
            this.nombre = nombre;
            this.correo = correo;
            this.telefono = telefono;

        }

        public String getNombre() {
            return nombre;
        }

        public String getCorreo() {
            return correo;
        }

        public String getTelefono() {
            return telefono;
        }
    }
}
