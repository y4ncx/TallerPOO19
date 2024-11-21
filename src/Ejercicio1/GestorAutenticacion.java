package Ejercicio1;

class GestorAutenticacion {

    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }


    public boolean autenticar(String usuario, String contrasena) {
        return servicioAutenticacion.autenticarUsuario(usuario, contrasena);
    }
}
