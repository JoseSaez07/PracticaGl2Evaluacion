package es.fplumara.dam1.prestamos.service;

import es.fplumara.dam1.prestamos.model.Material;

import java.util.List;

public interface MaterialService {

    public abstract void registrarMaterial(Material m);

    public abstract void darDeBaja(String idMaterial);

    public abstract List<Material> listar();
}
