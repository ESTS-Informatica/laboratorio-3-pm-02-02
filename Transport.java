
/**
 * Um meio de transporte genérico
 *
 * @author POO
 */

public class Transport {

    private static int auto = 0; 

    private final String id;
    private String origin;
    private String destination;
    private double price;
    private double fees;
    private boolean available;

     public Transport() {
        this.id = "T-" + String.format("%03d", ++auto);
        this.origin = "";
        this.destination = "";
        this.price = 0.0;
        this.fees = 0.0;
        this.available = true;
    }

    // Construtor com parâmetros weight e distance
    public Transport(double weight, double distance) {
        this(); // Chamada para o construtor padrão para definir os valores iniciais
    }

    // Construtor com parâmetros weight, distance e fees
    public Transport(double weight, double distance, double fees) {
        this(weight, distance);
        setFees(fees); 
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        if (origin != null) {
            this.origin = origin;
        }
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        if (destination != null) {
            this.destination = destination;
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        }
    }

    public double getFees() {
        return this.fees;
    }

    public final void setFees(double fees) {
        if (fees >= 0.0) {
            this.fees = fees;
        }
    }

    public String getId() {
        return this.id;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
 
    // Nível 5
    public void resetValues(){
        setOrigin("");
        setDestination("");
        setAvailable(true);
        setPrice(0.0);
    }
    
    // Nível 5
    public void setValues(String origin, String destination, double price) {
        setOrigin(origin);
        setDestination(destination);
        setAvailable(false);
        setPrice(price);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));  
        sb.append(String.format("%15s: %s\n", "ID", this.id));
        sb.append(String.format("%15s: %s\n", "Origem", this.origin));
        sb.append(String.format("%15s: %s\n", "Destino", this.destination));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", this.price));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", this.fees));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }

    /**
     * Retorna o preço final do produto
     * 
     * @return o preço final com a inclusão dos honorários
     */
    public double getPriceWithFees() {     
        return this.price * (1.0 + (this.fees * 0.01));
    }

    
    public String getTransportType() {
        return "Transporte genérico";
    }
    
     public static void main(String[] args) {
        // Criar uma instância da classe ShippingCompany para a empresa "RELIABLE-MOVING"
        ShippingCompany company = new ShippingCompany("RELIABLE-MOVING");

        // Adicionar um objeto GroundTransportation à coleção
        GroundTransportation groundTransport = new GroundTransportation("ABC123");
        company.add(groundTransport);

        // Adicionar dois objetos AirTransportation à coleção
        AirTransportation airTransport1 = new AirTransportation();
        airTransport1.setName("Flight 1");
        airTransport1.setNumberOfContainers(50);
        airTransport1.setOrigin("Origem"); // Defina a origem
        airTransport1.setDestination("Destino"); // Defina o destino
        airTransport1.setPrice(100.0); // Defina o preço
        airTransport1.setFees(3.0);
        company.add(airTransport1);

        AirTransportation airTransport2 = new AirTransportation();
        airTransport2.setName("Flight 2");
        airTransport2.setNumberOfContainers(75);
        airTransport2.setOrigin("Origem"); // Defina a origem
        airTransport2.setDestination("Destino"); // Defina o destino
        airTransport2.setPrice(100.0); // Defina o preço
        airTransport2.setFees(3.0);
        
        company.add(airTransport2);

        // Adicionar um objeto Lorry à coleção
        Lorry lorry = new Lorry("DEF456", 20, 2);
        company.add(lorry);

        // Adicionar um objeto Van à coleção
        Van van = new Van("GHI789", 100);
        company.add(van);

        // Mostrar os transportes criados
        System.out.println("Transportes criados:");
        for (Transport transport : company.getTransports()) {
            System.out.println(transport.toString());
        }
    }
}



