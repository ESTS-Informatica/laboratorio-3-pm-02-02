
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int packages;

    /**
     * Construtor para objetos da classe Van
     */
     public Van(String licensePlate, int packages) {
        super(licensePlate);
        this.packages = packages;
    }

     public int getPackages() {
        return packages;
    }

    public void setPackages(int packages) {
        this.packages = packages;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Packages: " + packages;
    }
}
