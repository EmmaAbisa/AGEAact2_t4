package com.informaticonfi.spring.app1.springboot_applications.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.informaticonfi.spring.app1.springboot_applications.models.Empleados;

import java.util.Map;


@Controller
public class EjemploController {    


    @GetMapping("/Detalles_info")

    
    public String info(Model model){
         Empleados empleado1 = new Empleados("Juan", "Rodriguez", "Calle 1 No 2", "Gerente", 35, 954187291, 001);
        
        model.addAttribute("Empleado", empleado1);
        
        return "Detalles_info";
    }

}
