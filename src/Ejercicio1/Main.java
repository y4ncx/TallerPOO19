package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal);

        System.out.println("Autenticación Local: " + gestorLocal.autenticar("usuarioLocal", "contrasena123")); // true
        System.out.println("Autenticación Local: " + gestorLocal.autenticar("usuarioLocal", "incorrecta"));   // false

        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(autenticacionOAuth);

        System.out.println("Autenticación OAuth: " + gestorOAuth.autenticar("usuarioOAuth", "oauthToken123")); // true
        System.out.println("Autenticación OAuth: " + gestorOAuth.autenticar("usuarioOAuth", "incorrecta"));   // false
    }
}
