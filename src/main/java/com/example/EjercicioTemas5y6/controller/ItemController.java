package com.example.EjercicioTemas5y6.controller;

import com.example.EjercicioTemas5y6.model.Item;
import com.example.EjercicioTemas5y6.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador para manejar las solicitudes relacionadas con los ítems.
 * Proporciona endpoints para agregar, eliminar, obtener y listar ítems.
 */
@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemRepository repository;

    /**
     * Agrega un nuevo ítem.
     */
    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return repository.save(item);
    }

    /**
     * Elimina un ítem por su id.
     */
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        repository.deleteById(id);
    }

    /**
     * Obtiene los detalles de un ítem por su id.
     */
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * Lista ítems por categoría.
     */
    @GetMapping("/category/{category}")
    public List<Item> getItemsByCategory(@PathVariable String category) {
        return repository.findByCategory(category);
    }

    /**
     * Obtiene el número total de ítems almacenados.
     */
    @GetMapping("/count")
    public Long getTotalItems() {
        return repository.count();
    }

    /**
     * Lista ítems con una puntuación superior a la especificada por el usuario.
     */
    @GetMapping("/rating/{minRating}")
    public List<Item> getItemsByRatingGreaterThan(@PathVariable Double minRating) {
        return repository.findByRateGreaterThan(minRating);
    }
}
