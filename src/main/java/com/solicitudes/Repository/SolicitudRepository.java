package com.solicitudes.Repository;

import com.solicitudes.Model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, String> {

    @Query("SELECT m FROM Solicitud m WHERE m.idFuncionario = :idFuncionario")
    List<Solicitud> findByFunc(@Param("idFuncionario") String idFuncionario);

}
