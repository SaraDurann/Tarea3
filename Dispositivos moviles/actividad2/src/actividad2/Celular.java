package actividad2;

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
