package com.programacioniv.apiuniversidad.controladores;

import com.programacioniv.apiuniversidad.entidades.estudiante;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
public class estudianteController {

    //http://localhost:8080/inicio
    @GetMapping("/inicio")
    @ResponseBody
    public estudiante home(){
        estudiante e1 = new estudiante();
        e1.setId(1);
        e1.setNombre("Andres");
        return e1;
    }

    @GetMapping("/listado")
    @ResponseBody
    public List<estudiante> listado(){
        List<estudiante> lista = new ArrayList<>();
        estudiante e1 = new estudiante();
        e1.setId(1);
        e1.setNombre("Andres");
        lista.add(e1);

        e1.setId(2);
        e1.setNombre("Eduardo");
        lista.add(e1);

        return lista;
    }

    @PostMapping("/registrar")
    @ResponseBody
    public estudiante nuevo(@RequestBody estudiante student){
        return student;
    }
}
