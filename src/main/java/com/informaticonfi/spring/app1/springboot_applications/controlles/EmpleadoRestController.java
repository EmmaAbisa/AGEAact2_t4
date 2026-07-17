package com.informaticonfi.spring.app1.springboot_applications.controlles;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informaticonfi.spring.app1.springboot_applications.dto.EmpleadoDTO;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

    @PostMapping("/empleados")
    public EmpleadoDTO crearEmpleado(@RequestBody EmpleadoDTO empleadoDTO) {
        return empleadoDTO;
    }
}