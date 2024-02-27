package com.solicitudes.Repository;

import com.solicitudes.Model.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, String> {

    @Query("SELECT m FROM Municipio m WHERE m.idDepto = :idDepto")
    List<Municipio> findByDepto(@Param("idDepto") String idDepto);

}
