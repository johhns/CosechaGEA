package com.developer.johhns.cosechagea.modelos;

public class HH_Usuarios {

    private String USUARIO ;
    private String NOMBRES ;
    private String ACTIVO  ;
    private String CLAVE   ;
    private String IPO     ;
    private String MODIFICADO_POR ;
    private String MODIFICADO_EL  ;

    public HH_Usuarios() {
    }

    public HH_Usuarios(String USUARIO, String NOMBRES, String ACTIVO, String CLAVE, String IPO, String MODIFICADO_POR, String MODIFICADO_EL) {
        this.USUARIO = USUARIO;
        this.NOMBRES = NOMBRES;
        this.ACTIVO = ACTIVO;
        this.CLAVE = CLAVE;
        this.IPO = IPO;
        this.MODIFICADO_POR = MODIFICADO_POR;
        this.MODIFICADO_EL = MODIFICADO_EL;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String NOMBRES) {
        this.NOMBRES = NOMBRES;
    }

    public String getACTIVO() {
        return ACTIVO;
    }

    public void setACTIVO(String ACTIVO) {
        this.ACTIVO = ACTIVO;
    }

    public String getCLAVE() {
        return CLAVE;
    }

    public void setCLAVE(String CLAVE) {
        this.CLAVE = CLAVE;
    }

    public String getIPO() {
        return IPO;
    }

    public void setIPO(String IPO) {
        this.IPO = IPO;
    }

    public String getMODIFICADO_POR() {
        return MODIFICADO_POR;
    }

    public void setMODIFICADO_POR(String MODIFICADO_POR) {
        this.MODIFICADO_POR = MODIFICADO_POR;
    }

    public String getMODIFICADO_EL() {
        return MODIFICADO_EL;
    }

    public void setMODIFICADO_EL(String MODIFICADO_EL) {
        this.MODIFICADO_EL = MODIFICADO_EL;
    }
}
