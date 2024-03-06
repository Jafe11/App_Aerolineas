public class cls_pasajero{
    private String idStr;
    private String nombreStr;
    private String contactoStr;
    private String correoStr;
    private String sexoStr;
    private String membresia;
    private Float descuento;

    public cls_pasajero (String id, String nombre, String contacto, String correo, String sexo, String membresia){
        this.idStr = id;
        this.nombreStr = nombre;
        this.contactoStr = contacto;
        this.correoStr = correo;
        this.sexoStr = sexo;
        this.membresia = membresia;

        if (this.membresia.equals("1")){
            this.descuento = 0.10f;
        }else if (this.membresia.equals("2")){
            this.descuento = 0.15f;
        }else if (this.membresia.equals("3")){
            this.descuento = 0.25f;
        }else if (this.membresia.equals("4")){
            this.descuento = 0.35f;
        }
    }

    public String getIdStr() {
        return idStr;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public String getContactoStr() {
        return contactoStr;
    }

    public String getCorreoStr() {
        return correoStr;
    }

    public String getSexoStr() {
        return sexoStr;
    }

    public String getMembresia() {
        return membresia;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public void setContactoStr(String contactoStr) {
        this.contactoStr = contactoStr;
    }

    public void setCorreoStr(String correoStr) {
        this.correoStr = correoStr;
    }

    public void setSexoStr(String sexoStr) {
        this.sexoStr = sexoStr;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    
}