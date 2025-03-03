package com.example.EjercicioTemas5y6.repository;

import com.example.EjercicioTemas5y6.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Repositorio para la entidad Item.
 * Proporciona métodos para acceder y manipular datos relacionados con los ítems.
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
    /**
     * Busca ítems por categoría.
     * @param category La categoría del ítem.
     * @return Una lista de ítems que pertenecen a la categoría especificada.
     */
    List<Item> findByCategory(String category);

    /**
     * Busca ítems con una puntuación superior a la especificada.
     * @param minRating La puntuación mínima que deben tener los ítems.
     * @return Una lista de ítems con una puntuación mayor a la especificada.
     */
    List<Item> findByRateGreaterThan(Double minRating);
}
