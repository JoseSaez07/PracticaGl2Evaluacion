package es.fplumara.dam1.prestamos.service;

import java.time.LocalDate;

public interface PrestamoService {
    public default void crearPrestamo(String idMaterial, String profesor, LocalDate fecha) {
    }
}




