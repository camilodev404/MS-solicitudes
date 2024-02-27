package com.solicitudes.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "formularios")
public class Solicitud {

    @Id
    @Column(name = "nroformulario")
    private String nroFormulario;

    private Date fecha;

    @Column(name = "idformularios")
    private String idFuncionario;

    @Column(name = "idmunicipioformilarios")
    private String idMunicipio;

    @Column(name = "tipoentrada")
    private String tipoEntrada;

    @Column(name = "idbarido")
    private String idBarrido;

    @Column(name = "declaroverdad")
    private Boolean declaroVerdad;

    private Boolean autorizacion;

    @Column(name = "autconyuge")
    private Boolean autConyuge;

    @Column(name = "hasidobeneficiario")
    private Boolean haSidoBeneficiario;

    @Column(name = "acreditabeneficio")
    private Boolean acreditaBeneficio;

    @Column(name = "idacreditacion")
    private String idAcreditacion;

    @Column(name = "numresolucion")
    private String numResolucion;

    @Column(name = "fechaacreditacion")
    private Date fechaAcreditacion;

    private Integer patrimonio;

    @Column(name = "espropietario")
    private Boolean esPropietario;

    @Column(name = "areaprediopropiedad")
    private Integer areaPredioPropiedad;

    @Column(name = "tipodestinacion")
    private String tipoDestinación;

    @Column(name = "asociacioncampesina")
    private Boolean asociacionCampesina;

    private String nombre;

    @Column(name = "compuestamujeres")
    private Boolean compuestaMujeres;

    @Column(name = "partedirectiva")
    private Boolean parteDirectiva;

    @Column(name = "encuentrareserva")
    private Boolean encuentraReserva;

    @Column(name = "tieneexperiencia")
    private Boolean tieneExperiencia;

    @Column(name = "cualescuando")
    private String cualesCuanto;

    @Column(name = "haentregadopredios")
    private String haEntregadoPredios;

    @Column(name = "hatomadocursos")
    private String haTomadoCursos;

    @Column(name = "nivelmasalto")
    private String nivelMasAlto;

    @Column(name = "numperiodosaprobados")
    private String numPeriodosAprobados;

    @Column(name = "programareubicacion")
    private Boolean programaReubicacion;

    @Column(name = "ocupacionindebida")
    private Boolean ocupacionIndebida;

    @Column(name = "deptoacceso")
    private String deptoAcceso;

    @Column(name = "municipioacceso")
    private String municipioAcceso;

    @Column(name = "tiemporesidencia")
    private String tiempoResidencia;

    @Column(name = "beneficiariorestitucion")
    private Boolean beneficiarioRestitucion;

    @Column(name = "segundoocupante")
    private Boolean segundoOcupante;

    @Column(name = "beneficiarioderechospro")
    private Boolean beneficiarioDerechosPro;

    @Column(name = "deseaserincluidoprogramas")
    private Boolean deseaSerIncluidoProgramas;

    @Column(name = "beneficiariosentencias")
    private Boolean beneficiarioSentencias;

    @Column(name = "tiposolicitud")
    private String tipoSolicitud;

    private Boolean firmas;

    private String estado;

    private String observaciones;

    @Embedded
    private PredioUsuarioId foranea;

    public Solicitud() {
    }

    public Solicitud(String nroFormulario, Date fecha, String idFuncionario, String idMunicipio, String tipoEntrada, String idBarrido, Boolean declaroVerdad, Boolean autorizacion, Boolean autConyuge, Boolean haSidoBeneficiario, Boolean acreditaBeneficio, String idAcreditacion, String numResolucion, Date fechaAcreditacion, Integer patrimonio, Boolean esPropietario, Integer areaPredioPropiedad, String tipoDestinación, Boolean asociacionCampesina, String nombre, Boolean compuestaMujeres, Boolean parteDirectiva, Boolean encuentraReserva, Boolean tieneExperiencia, String cualesCuanto, String haEntregadoPredios, String haTomadoCursos, String nivelMasAlto, String numPeriodosAprobados, Boolean programaReubicacion, Boolean ocupacionIndebida, String deptoAcceso, String municipioAcceso, String tiempoResidencia, Boolean beneficiarioRestitucion, Boolean segundoOcupante, Boolean beneficiarioDerechosPro, Boolean deseaSerIncluidoProgramas, Boolean beneficiarioSentencias, String tipoSolicitud, Boolean firmas, String estado, String observaciones, PredioUsuarioId foranea) {
        this.nroFormulario = nroFormulario;
        this.fecha = fecha;
        this.idFuncionario = idFuncionario;
        this.idMunicipio = idMunicipio;
        this.tipoEntrada = tipoEntrada;
        this.idBarrido = idBarrido;
        this.declaroVerdad = declaroVerdad;
        this.autorizacion = autorizacion;
        this.autConyuge = autConyuge;
        this.haSidoBeneficiario = haSidoBeneficiario;
        this.acreditaBeneficio = acreditaBeneficio;
        this.idAcreditacion = idAcreditacion;
        this.numResolucion = numResolucion;
        this.fechaAcreditacion = fechaAcreditacion;
        this.patrimonio = patrimonio;
        this.esPropietario = esPropietario;
        this.areaPredioPropiedad = areaPredioPropiedad;
        this.tipoDestinación = tipoDestinación;
        this.asociacionCampesina = asociacionCampesina;
        this.nombre = nombre;
        this.compuestaMujeres = compuestaMujeres;
        this.parteDirectiva = parteDirectiva;
        this.encuentraReserva = encuentraReserva;
        this.tieneExperiencia = tieneExperiencia;
        this.cualesCuanto = cualesCuanto;
        this.haEntregadoPredios = haEntregadoPredios;
        this.haTomadoCursos = haTomadoCursos;
        this.nivelMasAlto = nivelMasAlto;
        this.numPeriodosAprobados = numPeriodosAprobados;
        this.programaReubicacion = programaReubicacion;
        this.ocupacionIndebida = ocupacionIndebida;
        this.deptoAcceso = deptoAcceso;
        this.municipioAcceso = municipioAcceso;
        this.tiempoResidencia = tiempoResidencia;
        this.beneficiarioRestitucion = beneficiarioRestitucion;
        this.segundoOcupante = segundoOcupante;
        this.beneficiarioDerechosPro = beneficiarioDerechosPro;
        this.deseaSerIncluidoProgramas = deseaSerIncluidoProgramas;
        this.beneficiarioSentencias = beneficiarioSentencias;
        this.tipoSolicitud = tipoSolicitud;
        this.firmas = firmas;
        this.estado = estado;
        this.observaciones = observaciones;
        this.foranea = foranea;
    }

    public String getNroFormulario() {
        return nroFormulario;
    }

    public void setNroFormulario(String nroFormulario) {
        this.nroFormulario = nroFormulario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(String idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getIdBarrido() {
        return idBarrido;
    }

    public void setIdBarrido(String idBarrido) {
        this.idBarrido = idBarrido;
    }

    public Boolean getDeclaroVerdad() {
        return declaroVerdad;
    }

    public void setDeclaroVerdad(Boolean declaroVerdad) {
        this.declaroVerdad = declaroVerdad;
    }

    public Boolean getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(Boolean autorizacion) {
        this.autorizacion = autorizacion;
    }

    public Boolean getAutConyuge() {
        return autConyuge;
    }

    public void setAutConyuge(Boolean autConyuge) {
        this.autConyuge = autConyuge;
    }

    public Boolean getHaSidoBeneficiario() {
        return haSidoBeneficiario;
    }

    public void setHaSidoBeneficiario(Boolean haSidoBeneficiario) {
        this.haSidoBeneficiario = haSidoBeneficiario;
    }

    public Boolean getAcreditaBeneficio() {
        return acreditaBeneficio;
    }

    public void setAcreditaBeneficio(Boolean acreditaBeneficio) {
        this.acreditaBeneficio = acreditaBeneficio;
    }

    public String getIdAcreditacion() {
        return idAcreditacion;
    }

    public void setIdAcreditacion(String idAcreditacion) {
        this.idAcreditacion = idAcreditacion;
    }

    public String getNumResolucion() {
        return numResolucion;
    }

    public void setNumResolucion(String numResolucion) {
        this.numResolucion = numResolucion;
    }

    public Date getFechaAcreditacion() {
        return fechaAcreditacion;
    }

    public void setFechaAcreditacion(Date fechaAcreditacion) {
        this.fechaAcreditacion = fechaAcreditacion;
    }

    public Integer getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Integer patrimonio) {
        this.patrimonio = patrimonio;
    }

    public Boolean getEsPropietario() {
        return esPropietario;
    }

    public void setEsPropietario(Boolean esPropietario) {
        this.esPropietario = esPropietario;
    }

    public Integer getAreaPredioPropiedad() {
        return areaPredioPropiedad;
    }

    public void setAreaPredioPropiedad(Integer areaPredioPropiedad) {
        this.areaPredioPropiedad = areaPredioPropiedad;
    }

    public String getTipoDestinación() {
        return tipoDestinación;
    }

    public void setTipoDestinación(String tipoDestinación) {
        this.tipoDestinación = tipoDestinación;
    }

    public Boolean getAsociacionCampesina() {
        return asociacionCampesina;
    }

    public void setAsociacionCampesina(Boolean asociacionCampesina) {
        this.asociacionCampesina = asociacionCampesina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getCompuestaMujeres() {
        return compuestaMujeres;
    }

    public void setCompuestaMujeres(Boolean compuestaMujeres) {
        this.compuestaMujeres = compuestaMujeres;
    }

    public Boolean getParteDirectiva() {
        return parteDirectiva;
    }

    public void setParteDirectiva(Boolean parteDirectiva) {
        this.parteDirectiva = parteDirectiva;
    }

    public Boolean getEncuentraReserva() {
        return encuentraReserva;
    }

    public void setEncuentraReserva(Boolean encuentraReserva) {
        this.encuentraReserva = encuentraReserva;
    }

    public Boolean getTieneExperiencia() {
        return tieneExperiencia;
    }

    public void setTieneExperiencia(Boolean tieneExperiencia) {
        this.tieneExperiencia = tieneExperiencia;
    }

    public String getCualesCuanto() {
        return cualesCuanto;
    }

    public void setCualesCuanto(String cualesCuanto) {
        this.cualesCuanto = cualesCuanto;
    }

    public String getHaEntregadoPredios() {
        return haEntregadoPredios;
    }

    public void setHaEntregadoPredios(String haEntregadoPredios) {
        this.haEntregadoPredios = haEntregadoPredios;
    }

    public String getHaTomadoCursos() {
        return haTomadoCursos;
    }

    public void setHaTomadoCursos(String haTomadoCursos) {
        this.haTomadoCursos = haTomadoCursos;
    }

    public String getNivelMasAlto() {
        return nivelMasAlto;
    }

    public void setNivelMasAlto(String nivelMasAlto) {
        this.nivelMasAlto = nivelMasAlto;
    }

    public String getNumPeriodosAprobados() {
        return numPeriodosAprobados;
    }

    public void setNumPeriodosAprobados(String numPeriodosAprobados) {
        this.numPeriodosAprobados = numPeriodosAprobados;
    }

    public Boolean getProgramaReubicacion() {
        return programaReubicacion;
    }

    public void setProgramaReubicacion(Boolean programaReubicacion) {
        this.programaReubicacion = programaReubicacion;
    }

    public Boolean getOcupacionIndebida() {
        return ocupacionIndebida;
    }

    public void setOcupacionIndebida(Boolean ocupacionIndebida) {
        this.ocupacionIndebida = ocupacionIndebida;
    }

    public String getDeptoAcceso() {
        return deptoAcceso;
    }

    public void setDeptoAcceso(String deptoAcceso) {
        this.deptoAcceso = deptoAcceso;
    }

    public String getMunicipioAcceso() {
        return municipioAcceso;
    }

    public void setMunicipioAcceso(String municipioAcceso) {
        this.municipioAcceso = municipioAcceso;
    }

    public String getTiempoResidencia() {
        return tiempoResidencia;
    }

    public void setTiempoResidencia(String tiempoResidencia) {
        this.tiempoResidencia = tiempoResidencia;
    }

    public Boolean getBeneficiarioRestitucion() {
        return beneficiarioRestitucion;
    }

    public void setBeneficiarioRestitucion(Boolean beneficiarioRestitucion) {
        this.beneficiarioRestitucion = beneficiarioRestitucion;
    }

    public Boolean getSegundoOcupante() {
        return segundoOcupante;
    }

    public void setSegundoOcupante(Boolean segundoOcupante) {
        this.segundoOcupante = segundoOcupante;
    }

    public Boolean getBeneficiarioDerechosPro() {
        return beneficiarioDerechosPro;
    }

    public void setBeneficiarioDerechosPro(Boolean beneficiarioDerechosPro) {
        this.beneficiarioDerechosPro = beneficiarioDerechosPro;
    }

    public Boolean getDeseaSerIncluidoProgramas() {
        return deseaSerIncluidoProgramas;
    }

    public void setDeseaSerIncluidoProgramas(Boolean deseaSerIncluidoProgramas) {
        this.deseaSerIncluidoProgramas = deseaSerIncluidoProgramas;
    }

    public Boolean getBeneficiarioSentencias() {
        return beneficiarioSentencias;
    }

    public void setBeneficiarioSentencias(Boolean beneficiarioSentencias) {
        this.beneficiarioSentencias = beneficiarioSentencias;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public Boolean getFirmas() {
        return firmas;
    }

    public void setFirmas(Boolean firmas) {
        this.firmas = firmas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public PredioUsuarioId getForanea() {
        return foranea;
    }

    public void setForanea(PredioUsuarioId foranea) {
        this.foranea = foranea;
    }
}
