package com.solicitudes.Controller;

import com.solicitudes.Model.Municipio;
import com.solicitudes.Service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/municipio")
@CrossOrigin("*")
public class MunicipioController {

    @Autowired
    MunicipioService municipioService;

    @GetMapping("/municipios")
    public ResponseEntity<List<Municipio>> getMunicipios(){
        return new ResponseEntity<>(municipioService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/depto/{idDepto}")
    public ResponseEntity<List<Municipio>> getByDepto(@PathVariable("idDepto")String idDepto){
        List<Municipio> municipios = municipioService.getByDepto(idDepto);
        return new ResponseEntity<>(municipios, HttpStatus.OK);
    }

    @GetMapping("/{idMunicipio}")
    public ResponseEntity<Municipio> municipioById(@PathVariable("idMunicipio") String idMunicipio){
        return municipioService.getById(idMunicipio).map(municipio -> new ResponseEntity<>(municipio, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
