
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    
    private String licensePlate;
    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation()
    {
        super();
        this.licensePlate = "";
    }
    
    public String getLicensePlate() {
        return this.licensePlate;
    }
    
    @Override
    public String getTransportType() {
        return "Transporte terrestre";
    }
    
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
   
}
