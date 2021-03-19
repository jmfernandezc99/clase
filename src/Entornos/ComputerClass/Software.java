package Entornos.ComputerClass;/*
Hecho dia vie. 04/12/2020
Creado por: Juanma
Paquete: EjercicioOrdenador
Descripcion:
*/

public class Software {
    private String softwareName;
    private String softwareVersion;
    private int softwareSpaceRequirement;
    private int softwareRamMemoryRequirement;

    public Software(){
    }

    public Software(String softwareName, String softwareVersion, int softwareSpaceRequirement, int softwareRamMemoryRequirement){
        this.softwareName = softwareName;
        this.softwareVersion = softwareVersion;
        this.softwareSpaceRequirement = softwareSpaceRequirement;
        this.softwareRamMemoryRequirement = softwareRamMemoryRequirement;
    }

    public void setSoftwareName(String softwareName){
        this.softwareName = softwareName;
    }

    public void setSoftwareVersion(String softwareVersion){
        this.softwareVersion = softwareVersion;
    }

    public void setSoftwareSpaceRequirement(int softwareSpaceRequirement){
        this.softwareSpaceRequirement = softwareSpaceRequirement;
    }

    public void setSoftwareRamMemoryRequirement(int softwareRamMemoryRequirement){
        this.softwareRamMemoryRequirement = softwareRamMemoryRequirement;
    }

    public String getSoftwareName(){
        return this.softwareName;
    }

    public String getSoftwareVersion(){
        return this.softwareVersion;
    }

    public int getSoftwareSpaceRequirement(){
        return this.softwareSpaceRequirement;
    }

    public int getSoftwareRamMemoryRequirement(){
        return this.softwareRamMemoryRequirement;
    }
}
