import java.util.ArrayList;
import java.util.List;

public class CompanyPrototype implements Cloneable{
    private String compName;
    private List<Client> clients;

    {
        clients = new ArrayList<>();
    }

    public CompanyPrototype(String compName) {
        this.compName = compName;
    }

    public CompanyPrototype() { }

    public void loadClients() {
        for (int i = 1; i <= 10; i++) {
            Client client = new Client(i, "Client #" + i);
            getClients().add(client);
        }
    }

    public String getCompName() {
        return compName;
    }

    public List<Client> getClients() {
        return clients;
    }

    // Deep clone, after cloning, it doesn't follow real object changes
    @Override
    protected CompanyPrototype clone() throws CloneNotSupportedException {
        CompanyPrototype companyPrototype = new CompanyPrototype();

        for(Client client : this.getClients()) {
            companyPrototype.getClients().add(client);
        }

        return companyPrototype;
    }

    // Shallow clone, it follows real object changes
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
