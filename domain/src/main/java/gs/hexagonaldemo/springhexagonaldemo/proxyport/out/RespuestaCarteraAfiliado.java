package gs.hexagonaldemo.springhexagonaldemo.proxyport.out;

import java.time.LocalDate;

public class RespuestaCarteraAfiliado {

    protected long solicitudId;
    protected Integer nss;
    protected String nombre;
    protected String primerApellido;
    protected String estadoAfiliacion;
    protected Integer motivoEstadoId;
    protected LocalDate fechaEfectividadAfiliacion;

    public RespuestaCarteraAfiliado(long solicitudId, Integer nss, String nombre, String primerApellido, String estadoAfiliacion, Integer motivoEstadoId, LocalDate fechaEfectividadAfiliacion) {
        this.solicitudId = solicitudId;
        this.nss = nss;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.estadoAfiliacion = estadoAfiliacion;
        this.motivoEstadoId = motivoEstadoId;
        this.fechaEfectividadAfiliacion = fechaEfectividadAfiliacion;
    }

    public RespuestaCarteraAfiliado() {
    }

    public long getSolicitudId() {
        return solicitudId;
    }

    public void setSolicitudId(long solicitudId) {
        this.solicitudId = solicitudId;
    }

    public Integer getNss() {
        return nss;
    }

    public void setNss(Integer nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getEstadoAfiliacion() {
        return estadoAfiliacion;
    }

    public void setEstadoAfiliacion(String estadoAfiliacion) {
        this.estadoAfiliacion = estadoAfiliacion;
    }

    public Integer getMotivoEstadoId() {
        return motivoEstadoId;
    }

    public void setMotivoEstadoId(Integer motivoEstadoId) {
        this.motivoEstadoId = motivoEstadoId;
    }

    public LocalDate getFechaEfectividadAfiliacion() {
        return fechaEfectividadAfiliacion;
    }

    public void setFechaEfectividadAfiliacion(LocalDate fechaEfectividadAfiliacion) {
        this.fechaEfectividadAfiliacion = fechaEfectividadAfiliacion;
    }

    @Override
    public String toString() {
        return "RespuestaCarteraAfiliado{" +
                "solicitudId=" + solicitudId +
                ", nss=" + nss +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", estadoAfiliacion='" + estadoAfiliacion + '\'' +
                ", motivoEstadoId=" + motivoEstadoId +
                ", fechaEfectividadAfiliacion=" + fechaEfectividadAfiliacion +
                '}';
    }
}
