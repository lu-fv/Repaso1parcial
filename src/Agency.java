import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agency {
    private List<PackageClient> packageClientList = new ArrayList<PackageClient>();
    private List<Client> clientList = new ArrayList<Client>();
    private List<TuristPackage> turistPackageList = new ArrayList<TuristPackage>();

    public Agency() {
    }

    /// validacion de clientes sino agrega a list
    public void AddClients(Client client) {
        if (this.clientList.isEmpty()) {
            this.clientList.add(client);
        } else {
            for (Client c : this.clientList) {
                if (c.getPassport().equals(client.getPassport())) {
                    System.out.println(" Cliente existente ");
                    return;
                }
            }
            this.clientList.add(client);
        }
    }

    /// validacion de paquetes sino agrega a list
    public void AddPackage(TuristPackage turistPackage) {
        if (this.turistPackageList.isEmpty()) {
            this.turistPackageList.add(turistPackage);
        } else {
            for (TuristPackage t : this.turistPackageList) {
                if (t.equals(turistPackage)) {
                    System.out.println(" Paquete agregado ");
                    return;
                }
            }
            this.turistPackageList.add(turistPackage);
        }
    }

    public void showClients() {
        this.clientList.forEach(System.out::println);
    }

    public void showPackage() {
        this.turistPackageList.forEach(System.out::println);
    }

    public void showPackageClient() {
        this.packageClientList.forEach(System.out::println);
    }

    public void ClientAndPackage(String passport, List<Integer> ids) {
        Client client = SearchClient(passport);
        List<TuristPackage> turistPackagesBill = new ArrayList<TuristPackage>();
        for (Integer id : ids) {
            TuristPackage turistPackage = SearchturistPackage(id);
            if (turistPackage != null) {
                turistPackagesBill.add(turistPackage);
            }

        }
        if (client != null && !turistPackagesBill.isEmpty()) {
            PackageClient packageClient = new PackageClient(client, turistPackagesBill, LocalDateTime.now());
            this.packageClientList.add(packageClient);
        }

    }

    public Client SearchClient(String passport) {
        for (Client c : clientList) {
            if (c.getPassport().equals(passport)) {
                return c;
            }
        }
        return null;
    }

    public TuristPackage SearchturistPackage(Integer id) {
        for (TuristPackage t : turistPackageList) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }

    public void deletePackage() {
        System.out.println(" put id to delete: ");
        Scanner sc = new Scanner(System.in);
        Integer id = sc.nextInt();
        this.turistPackageList.remove(SearchturistPackage(id));
    }

    public PackageClient PopularPackage(List<PackageClient> mostPackSell) {
        PackageClient bestSeller = null;
        Integer mostP = -1;
        for (PackageClient pc : mostPackSell) {
            if ((pc != null && pc.getCont()));
        }
    }


}
