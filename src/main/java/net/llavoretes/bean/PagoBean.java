/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.llavoretes.bean;

/**
 *
 * @author llavoretes
 */
public class PagoBean {
    
    private Integer id=0;
    private Integer id_curso=0;
    private Integer id_alumno=0;
    private Integer id_mes=0;
    private Integer pagado=0;
    private Integer cantidad=0;
   
     public PagoBean() {
    }

    public PagoBean(Integer id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the id_curso
     */
    public Integer getId_curso() {
        return id_curso;
    }

    /**
     * @param id_curso the id_curso to set
     */
    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }

    /**
     * @return the id_alumno
     */
    public Integer getId_alumno() {
        return id_alumno;
    }

    /**
     * @param id_alumno the id_alumno to set
     */
    public void setId_alumno(Integer id_alumno) {
        this.id_alumno = id_alumno;
    }

    /**
     * @return the id_mes
     */
    public Integer getId_mes() {
        return id_mes;
    }

    /**
     * @param id_mes the id_mes to set
     */
    public void setId_mes(Integer id_mes) {
        this.id_mes = id_mes;
    }

    /**
     * @return the pagado
     */
    public Integer getPagado() {
        return pagado;
    }

    /**
     * @param pagado the pagado to set
     */
    public void setPagado(Integer pagado) {
        this.pagado = pagado;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
