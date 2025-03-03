package com.example.EjercicioTemas5y6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * La clase Item representa un ítem en la API.
 * Esta clase es una entidad JPA que se mapea a una tabla en la base de datos.
 */
@Entity
public class Item {
    /**
     * Identificador único generado automáticamente
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nombre del artículo
     */
    private String title;

    /**
     * Precio
     */
    private Double price;

    /**
     * Categoría
     */
    private String category;

    /**
     * Descripción en detalle del producto
     */
    private String description;

    /**
     * Valoración media
     */
    private Double rate;

    /**
     * Cantidad de veces que se ha vendido el producto
     */
    private Integer count;

    /**
     * url con la imagen del producto
     */
    private String image;

    /**
     * Obtiene el identificador único del ítem.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el identificador único del ítem.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el título del ítem.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Establece el título del ítem.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Obtiene el precio del ítem.
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Establece el precio del ítem.
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Obtiene la categoría del ítem.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Establece la categoría del ítem.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Obtiene la descripción del ítem.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Establece la descripción del ítem.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtiene la valoración media del ítem.
     */
    public Double getRate() {
        return rate;
    }

    /**
     * Establece la valoración media del ítem.
     */
    public void setRate(Double rate) {
        this.rate = rate;
    }

    /**
     * Obtiene la cantidad de veces que se ha vendido el ítem.
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Establece la cantidad de veces que se ha vendido el ítem.
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Obtiene la URL de la imagen del ítem.
     */
    public String getImage() {
        return image;
    }

    /**
     * Establece la URL de la imagen del ítem.
     */
    public void setImage(String image) {
        this.image = image;
    }
}
