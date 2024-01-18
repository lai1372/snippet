package com.snippetstest.snippettest.service;

import com.snippetstest.snippettest.models.Rectangle;
import com.snippetstest.snippettest.models.Shape;
import com.snippetstest.snippettest.models.Square;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShapeService {


    public List<Shape> getShapes(){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(5.0));
        shapes.add(new Rectangle(2,4));

        return shapes;
    }
}
