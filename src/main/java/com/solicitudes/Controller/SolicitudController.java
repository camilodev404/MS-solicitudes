package com.solicitudes.Controller;

import com.solicitudes.Model.Solicitud;
import com.solicitudes.Service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitud")
@CrossOrigin("*")
public class SolicitudController {

    @Autowired
    SolicitudService solicitudService;

    @GetMapping("/solicitudes")
    public ResponseEntity<List<Solicitud>> getSolicitudesAll(){
        return new ResponseEntity<>(solicitudService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{nroFormulario}")
    public ResponseEntity<Solicitud> solicitudById(@PathVariable("nroFormulario") String nroFormulario){
        return solicitudService.getById(nroFormulario).map(solicitud -> new ResponseEntity<>(solicitud, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save/solicitud")
    public ResponseEntity<Solicitud> saveSolicitud(@RequestBody Solicitud solicitud){
        return new ResponseEntity<>(solicitudService.save(solicitud), HttpStatus.CREATED);
    }

    @PutMapping("/update/solicitud")
    public ResponseEntity<Solicitud> updateSolicitud(@RequestBody Solicitud solicitud){
        return new ResponseEntity<>(solicitudService.update(solicitud), HttpStatus.OK);
    }

}
