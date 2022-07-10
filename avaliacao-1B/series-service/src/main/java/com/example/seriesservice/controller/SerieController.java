package com.example.seriesservice.controller;

import com.example.seriesservice.model.Serie;
import com.example.seriesservice.repository.SerieReposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class SerieController {

    @Autowired
    private SerieReposytory serieReposytory;

    @PostMapping
    public Serie save(@RequestBody Serie serie) {
        return serieReposytory.save(serie);
    }

    @GetMapping
    public List<Serie> fingAll() {
        return serieReposytory.findAll();
    }
}
