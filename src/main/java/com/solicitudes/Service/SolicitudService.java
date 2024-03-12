package com.solicitudes.Service;

import com.solicitudes.Model.Solicitud;
import com.solicitudes.Repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitudService {

    @Autowired
    SolicitudRepository solicitudRepository;

    public List<Solicitud> getAll(){
        return solicitudRepository.findAll();
    }

    public Optional<Solicitud> getById(String nroFormulario){
        return solicitudRepository.findById(nroFormulario);
    }

    public Solicitud save(Solicitud solicitud){
        return solicitudRepository.save(solicitud);
    }

    public Solicitud update(Solicitud solicitud){
        return solicitudRepository.save(solicitud);
    }

}
