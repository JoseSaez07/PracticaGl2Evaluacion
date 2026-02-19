package es.fplumara.dam1.prestamos.service;
import es.fplumara.dam1.prestamos.model.EstadoMaterial;
import es.fplumara.dam1.prestamos.model.Prestamo;
import java.time.LocalDate;
import java.util.UUID;

import static es.fplumara.dam1.prestamos.model.EstadoMaterial.*;

public class PrestamoServiceImpl implements  PrestamoService {
    @Override
    public void crearPrestamo(String idMaterial, String profesor, LocalDate fecha) {

        if (idMaterial == null || idMaterial.isEmpty()) {
            throw new IllegalArgumentException("El idMaterial no puede ser null o vacío");
        }

        if (profesor == null || profesor.isEmpty())
            throw new IllegalArgumentException("Rellena el parametro");

        if (fecha == null) {
            throw new IllegalArgumentException("La fecha no puede ser vacia");
        }
    }

    String prestamoId = UUID.randomUUID().toString();
    Prestamo prestamo = new Prestamo();
        this. prestamoRepository.save(Prestamo);
        material.setEstado(EstadoMaterial.PRESTADO);
        this.materialRepository.save(material);
        return prestamo;

}





