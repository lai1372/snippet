package com.snippetstest.snippettest;
import org.springframework.web.bind.annotation.*;
import java.util.Objects;

import java.io.*;
import java.net.URL;

@RestController
@RequestMapping("/snippets")
public class Controller {

    @GetMapping
    public String getAllSnippets() {
        String data = null;
        try {
            data = new String(this.getClass().getClassLoader().getResourceAsStream("SeedData.yaml").readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }



    @GetMapping("/{id}")
    public String getSnippetById(@PathVariable("id") String id){
        //search file to find snippet with matching id, save in singleSnippet variable
        String singleSnippet = null;
        try {
            singleSnippet = new String(this.getClass().getClassLoader().getResourceAsStream("SeedData.yaml").readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return singleSnippet;
    }

//    @PostMapping
//    public void addSnippet(@RequestBody Snippet snippet){
//        //take the body (snippet) and add to the end of the file
//    }

}