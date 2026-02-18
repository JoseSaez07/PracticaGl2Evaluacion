package es.fplumara.dam1.prestamos.model;

import java.time.LocalDate;

public class Prestamo implements Identificable {
    private String id;
    private String idMaterial;
    private String profesor;
    private LocalDate fecha;

    public void getId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return "";
    }

    public Prestamo(String id, LocalDate fecha, String profesor, String idMaterial) {
        this.id = id;
        this.fecha = fecha;
        this.profesor = profesor;
        this.idMaterial = idMaterial;
    }
}
