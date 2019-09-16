package actividad2;

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
