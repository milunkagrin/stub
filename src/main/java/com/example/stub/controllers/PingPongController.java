package com.example.stub.controllers;

import com.example.stub.entities.Entity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PingPongController {

    @GetMapping("/ping-pong")
    public String pingPong() {

        return "ping";

    }
}
