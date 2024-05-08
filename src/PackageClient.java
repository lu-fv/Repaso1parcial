import java.time.LocalDateTime;
import java.util.List;

public class PackageClient {
    private  Client client;
    private List<TuristPackage> turistPackages;
    private LocalDateTime dateTime;

    public PackageClient(Client client, List<TuristPackage> turistPackages, LocalDateTime dateTime) {
        this.client = client;
        this.turistPackages = turistPackages;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "ListPackageClient{" +
                "client=" + client +
                ", turistPackages=" + turistPackages +
                '}';
    }
}
