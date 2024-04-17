package com.solicitudes.Controller;

import com.solicitudes.Model.Departamento;
import com.solicitudes.Service.DepartamentoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitud")
@CrossOrigin("*")
public class DepartamentoController {

    @Autowired
    DepartamentoService departamentoService;

    @GetMapping("/departamentos")
    public ResponseEntity<List<Departamento>> getDepartamentos(){
        return new ResponseEntity<>(departamentoService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idDepto}")
    public ResponseEntity<Departamento> departamentoById(@PathVariable("idDepto") String idDepto){
        return departamentoService.getById(idDepto).map(departamento -> new ResponseEntity<>(departamento, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
