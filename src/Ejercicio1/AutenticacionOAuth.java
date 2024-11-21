package Ejercicio1;

// Clase AutenticacionOAuth que implementa ServicioAutenticacion
class AutenticacionOAuth implements ServicioAutenticacion {

    @Override
    public boolean autenticarUsuario(String usuario, String contrasena) {
        // Simulamos una autenticación con OAuth
        return "usuarioOAuth".equals(usuario) && "oauthToken123".equals(contrasena);
    }
}

