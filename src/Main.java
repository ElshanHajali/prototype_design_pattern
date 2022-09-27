

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CompanyPrototype companyPr = new CompanyPrototype("IT-store");

        // Fetch data
        companyPr.loadClients();

        CompanyPrototype cloned = companyPr.clone();

        // remove data by (index + 1)
        companyPr.getClients().remove(2);

        System.out.println(companyPr.getClients());
        System.out.println(cloned.getClients());
    }
}