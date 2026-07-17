package com.informaticonfi.spring.app1.springboot_applications.controlles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.informaticonfi.spring.app1.springboot_applications.dto.EmpleadoDTO;
import com.informaticonfi.spring.app1.springboot_applications.models.Empleados;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmpleadoViewController {

    @Value("${proyecto.nombre}")
    private String nombreProyecto;

    private List<Empleados> listaEmpleados = new ArrayList<>();

    public EmpleadoViewController() {
        listaEmpleados.add(new Empleados("Juan", "Rodriguez", "Calle 1 No 2", "Gerente", 35, 954187291, 1));
        listaEmpleados.add(new Empleados("Ana", "Lopez", "Calle 5 No 10", "Analista", 28, 954187292, 2));
        listaEmpleados.add(new Empleados("Carlos", "Perez", "Calle 8 No 3", "Gerente", 41, 954187293, 3));
    }

    @GetMapping("/empleados")
    public String lista(Model model) {
        model.addAttribute("empleados", listaEmpleados);
        model.addAttribute("nombreProyecto", nombreProyecto);
        return "empleados_lista";
    }

    @GetMapping("/empleados/nuevo")
    public String formularioNuevo(Model model) {
        model.addAttribute("empleadoDTO", new EmpleadoDTO());
        return "empleados_form";
    }

    @PostMapping("/empleados/nuevo")
    public String procesarFormulario(@ModelAttribute EmpleadoDTO empleadoDTO, Model model) {
        model.addAttribute("empleadoDTO", empleadoDTO);
        return "empleados_form_resultado";
    }

    
    @GetMapping("/empleados/buscar")
    public String buscarPorPuesto(@RequestParam String puesto, Model model) {
        List<Empleados> filtrados = new ArrayList<>();
        for (Empleados e : listaEmpleados) {
            if (e.getPuesto().equalsIgnoreCase(puesto)) {
                filtrados.add(e);
            }
        }
        model.addAttribute("empleados", filtrados);
        model.addAttribute("nombreProyecto", nombreProyecto);
        return "empleados_lista";
    }

      // @PathVariable: ver detalle por id -> /empleados/2
    @GetMapping("/empleados/{id}")
    public String verDetalle(@PathVariable int id, Model model) {
        Empleados encontrado = null;
        for (Empleados e : listaEmpleados) {
            if (e.getId() == id) {
                encontrado = e;
            }
        }
        model.addAttribute("empleado", encontrado);
        return "empleado_detalle";
    }
}