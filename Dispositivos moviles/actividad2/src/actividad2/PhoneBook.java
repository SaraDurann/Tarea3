package actividad2;

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
