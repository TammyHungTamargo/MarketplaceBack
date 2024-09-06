package edu.es.eoi.marketplace.controller;
import edu.es.eoi.marketplace.entity.Articulo;
import edu.es.eoi.marketplace.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/marketplace/articulos")
    public class ArticuloController {

        @Autowired
        private ArticuloService articuloService;

        @GetMapping
        public List<Articulo> getAllArticulos() {
            return articuloService.findAll();
        }

        @GetMapping("/{id}")
        public Articulo getArticuloById(@PathVariable Integer id) {
            return articuloService.findById(id);
        }

        @PostMapping
        public Articulo createArticulo(@RequestBody Articulo articulo) {
            return articuloService.save(articulo);
        }

        @PutMapping("/{id}")
        public Articulo updateArticulo(@PathVariable Integer id, @RequestBody Articulo articulo) {
            Articulo articuloExistente = articuloService.findById(id);
            if (articuloExistente != null) {
                return articuloService.save(articulo);
            }
            return null;
        }

        @DeleteMapping("/{id}")
        public void deleteArticulo(@PathVariable Integer id) {
            articuloService.delete(id);
        }

    }
