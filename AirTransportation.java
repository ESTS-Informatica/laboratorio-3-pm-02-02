
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private int numberOfContainers;

    /**
     * Construtor para objetos da classe AirTransportation
     */
    public AirTransportation() {
        super();
        this.name = "";
        this.numberOfContainers = 0;
    }
    
    // Construtor
    public AirTransportation(double weight, double distance, String name, int numberOfContainers) {
        super(weight, distance);
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getNumberOfContainers() {
        return this.numberOfContainers;
    }
    
    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }
    
    
    
    @Override
    public String getTransportType() {
        return "Transporte aéreo";
    }
    
    public double calculateFee() {
        // Taxa de honorários para transporte aéreo é de 4%
        return getPrice() * 0.04;
    }
    
    @Override
    public double getPriceWithFees() {
        // Calcula o preço com a taxa de honorários de 3%
        return getPrice() * (1.0 + (0.03 * getFees()));
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nName: " + name + "\nNumber of Containers: " + numberOfContainers;
    }
    
}
