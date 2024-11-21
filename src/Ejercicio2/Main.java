package Ejercicio2;


public class Main {
    public static void main(String[] args) {

        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal);


        gestorLocal.guardar("documento.txt", "Este es el contenido del documento local.");
        System.out.println(gestorLocal.recuperar("documento.txt"));


        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube);


        gestorNube.guardar("imagen.jpg", "Contenido de la imagen en la nube.");
        System.out.println(gestorNube.recuperar("imagen.jpg"));
    }
}
