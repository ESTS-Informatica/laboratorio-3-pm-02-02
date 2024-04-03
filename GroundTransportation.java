
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
    public GroundTransportation(String licensePlate)
    {
        super();
        this.licensePlate = licensePlate;
    }
    
    public GroundTransportation(double weight, double distance, String licensePlate) {
        super(weight, distance);
        this.licensePlate = licensePlate;
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
    
    @Override
    public double getPriceWithFees() {
        // Calcula o preço com a taxa de honorários de 3%
        return getPrice() * (1.0 + (0.03 * getFees()));
    }

    
    @Override
    public String toString() {
        return super.toString() + "\nLicense Plate: " + getLicensePlate();
    }
}
