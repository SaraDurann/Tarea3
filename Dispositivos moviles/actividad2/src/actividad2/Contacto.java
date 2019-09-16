package actividad2;

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
