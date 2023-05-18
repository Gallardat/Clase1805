package com.softtek.comunicacionback.controlador;

import com.softtek.comunicacionback.modelo.Medico;
import com.softtek.comunicacionback.servicio.IMedicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/medicos")
public class MedicoCont {
    @Autowired
    private IMedicoServicio servicio;
    @GetMapping
    public List<Medico> listar() throws Exception {
        return servicio.listar();
    }

    /*@GetMapping("/{id}")
    public Medico listarPorId(@PathVariable("id") int id) throws Exception {
        return servicio.listarPorId(id);
    }*/
}
