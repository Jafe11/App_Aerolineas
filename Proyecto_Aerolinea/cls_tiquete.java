import java.time.LocalDate;

public class cls_tiquete {
    private String idStr;
    private LocalDate fecha;
    private int cantidadInt;
    private String tipo_claseStr;
    private Float subtotalFlt;
    private Float ivaFlt;
    private Float DescuentoFlt;
    private Float totalFlt;
    private cls_pasajero pasajero;

    public cls_tiquete(String id, int cantidad, String tipo, Float descuento, cls_pasajero cliente){
        
        this.idStr = id;
        this.cantidadInt = cantidad;
        this.tipo_claseStr=tipo;
        this.DescuentoFlt=descuento;
        this.ivaFlt = 0.19f;

        pasajero = cliente;

        if (this.tipo_claseStr.equals("1")){
            this.subtotalFlt = 450000f;
        }else if(this.tipo_claseStr.equals("2")){
            this.subtotalFlt = 600000f;
        }else if(this.tipo_claseStr.equals("3")){
            this.subtotalFlt = 900000f;
        }
        this.totalFlt = (this.subtotalFlt + (subtotalFlt*ivaFlt) - (this.DescuentoFlt*subtotalFlt))*this.cantidadInt;
    }

    

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCantidadInt() {
        return cantidadInt;
    }

    public String getTipo_claseStr() {
        return tipo_claseStr;
    }

    public Float getSubtotalFlt() {
        return subtotalFlt;
    }

    public Float getIvaFlt() {
        return ivaFlt;
    }

    public Float getDescuentoFlt() {
        return DescuentoFlt;
    }

    public Float getTotalFlt() {
        return totalFlt;
    }

    public cls_pasajero getPasajero() {
        return pasajero;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setCantidadInt(int cantidadInt) {
        this.cantidadInt = cantidadInt;
    }

    public void setTipo_claseStr(String tipo_claseStr) {
        this.tipo_claseStr = tipo_claseStr;
    }

    public void setSubtotalFlt(Float subtotalFlt) {
        this.subtotalFlt = subtotalFlt;
    }

    public void setIvaFlt(Float ivaFlt) {
        this.ivaFlt = ivaFlt;
    }

    public void setDescuentoFlt(Float descuentoFlt) {
        DescuentoFlt = descuentoFlt;
    }

    public void setTotalFlt(Float totalFlt) {
        this.totalFlt = totalFlt;
    }

    public void setPasajero(cls_pasajero pasajero) {
        this.pasajero = pasajero;
    }



    public String getIdStr() {
        return idStr;
    }

    
}
