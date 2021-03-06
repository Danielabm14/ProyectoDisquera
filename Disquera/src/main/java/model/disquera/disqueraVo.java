package model.disquera;

public class disqueraVo {
    
    private int idDisquera;
    private String nitDisquera;
    private String nombreDisquera;
    private String telefonoDisquera;
    private String direccionDisquera;
    private Boolean estadoDisquera;


public disqueraVo(){

}

public disqueraVo(int idDisquera, String nitDisquera, String nombreDisquera, String telefonoDisquera, String direccionDisquera, Boolean estadoDisquera ){

    this.idDisquera = idDisquera;
    this.nitDisquera = nitDisquera;
    this.nombreDisquera = nombreDisquera;
    this.telefonoDisquera = telefonoDisquera;
    this.direccionDisquera = direccionDisquera;
    this.estadoDisquera = estadoDisquera;
}



// GETTERS Y SETTERS
public int getIdDisquera() {
    return idDisquera;
}

public void setIdDisquera(int idDisquera) {
    this.idDisquera = idDisquera;
}

public String getNitDisquera() {
    return nitDisquera;
}

public void setNitDisquera(String nitDisquera) {
    this.nitDisquera = nitDisquera;
}

public String getNombreDisquera() {
    return nombreDisquera;
}

public void setNombreDisquera(String nombreDisquera) {
    this.nombreDisquera = nombreDisquera;
}

public String getTelefonoDisquera() {
    return telefonoDisquera;
}

public void setTelefonoDisquera(String telefonoDisquera) {
    this.telefonoDisquera = telefonoDisquera;
}

public String getDireccionDisquera() {
    return direccionDisquera;
}

public void setDireccionDisquera(String direccionDisquera) {
    this.direccionDisquera = direccionDisquera;
}

public Boolean getEstadoDisquera() {
    return estadoDisquera;
}

public void setEstadoDisquera(Boolean estadoDisquera) {
    this.estadoDisquera = estadoDisquera;
}



}