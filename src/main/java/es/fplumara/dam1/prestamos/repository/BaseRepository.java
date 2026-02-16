package es.fplumara.dam1.prestamos.repository;

import es.fplumara.dam1.prestamos.model.Identificable;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BaseRepository <T extends Identificable> implements Repository<T> {
    Map<String,T> valores;
    @Override
    public void save(T elemento) {

    }

    @Override
    public Optional<T> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<T> listAll(String lista) {
        return List.of();
    }

    @Override
    public void delete(String id) {

    }
}
