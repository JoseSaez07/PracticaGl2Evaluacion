package es.fplumara.dam1.prestamos.model;

import java.time.LocalDate;

public class Prestamo {
    private String id;
    private String idMaterial;
    private String profesor;
    private LocalDate fecha;

    public void getId(String id) {
        this.id = id;
    }
}
