package Ejercicio2;

import java.util.HashMap;
import java.util.Map;

class AlmacenamientoLocal implements Almacenamiento {

    private Map<String, String> archivos = new HashMap<>();

    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        archivos.put(nombreArchivo, contenido);
        System.out.println("Archivo guardado localmente: " + nombreArchivo);
    }


    @Override
    public String recuperarArchivo(String nombreArchivo) {
        return archivos.getOrDefault(nombreArchivo, "Archivo no encontrado en almacenamiento local.");
    }
}
