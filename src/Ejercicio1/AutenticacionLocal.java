package Ejercicio1;

class AutenticacionLocal implements ServicioAutenticacion {

    @Override
    public boolean autenticarUsuario(String usuario, String contrasena) {
        return "usuarioLocal".equals(usuario) && "contrasena123".equals(contrasena);
    }
}
