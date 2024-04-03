
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

    
}
