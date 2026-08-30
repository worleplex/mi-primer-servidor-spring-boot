package com.example.MiprimerServer;
// le puse * porque en progra 3 lo hacia para los graficos de la GUI
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/hello")
    public String hola(){
        return "Bienvenido a mi primer server";
    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre) {
        return "Hola "+nombre+" Bienvenido a mi server";
    }

    @PostMapping("/mensaje")
    public String mensaje(@RequestBody String texto) {
        return "mensaje: "+texto;
    }

}
