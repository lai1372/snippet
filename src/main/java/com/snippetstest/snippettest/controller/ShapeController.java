package com.snippetstest.snippettest.controller;

import com.snippetstest.snippettest.models.Shape;
import com.snippetstest.snippettest.service.ShapeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shapes")
public class ShapeController {
    private ShapeService shapeService;

    public ShapeController(ShapeService shapeService) {
        this.shapeService = shapeService;
    }
    @GetMapping(path = "/all")
    public ResponseEntity<List<Shape>> getAllShapes(){
        List<Shape> shapes = shapeService.getShapes();
        if(null != shapes){
            return ResponseEntity.ok(shapes);
        }
       return ResponseEntity.badRequest().build();
    }
}
