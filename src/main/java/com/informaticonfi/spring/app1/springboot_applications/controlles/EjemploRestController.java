package com.informaticonfi.spring.app1.springboot_applications.controlles;

import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informaticonfi.spring.app1.springboot_applications.models.dto.ClaseDTO;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping(path = "/Detalles_info2")
    public Map<String, Object> Detalles_info2() {

        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Juan");

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", usuario1.getTitulo());
        respuesta.put("Usuario", usuario1.getUsuario());

        return respuesta;
    }
}