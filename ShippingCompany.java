import java.util.HashSet;
import java.util.ArrayList;
/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

public class ShippingCompany extends HashSet<Transport> {
    private String name;
    private ArrayList<Transport> inService;

    public ShippingCompany(String name) {
        this.name = name;
        this.inService = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    
    public HashSet<Transport> getTransports() {
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transport> getInService() {
        return inService;
    }

    public void setInService(ArrayList<Transport> inService) {
        this.inService = inService;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transportes da empresa " + name + ":\n");
        for (Transport transport : this) {
            sb.append(transport.toString() + "\n");
        }
        return sb.toString();
    }
    
}

