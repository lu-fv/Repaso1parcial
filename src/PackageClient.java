import java.time.LocalDateTime;
import java.util.List;

public class PackageClient {
    private  Client client;
    private List<TuristPackage> turistPackages;
    private LocalDateTime dateTime;
    private Integer cont =0;

    public PackageClient(Client client, List<TuristPackage> turistPackages, LocalDateTime dateTime) {
        this.client = client;
        this.turistPackages = turistPackages;
        this.dateTime = dateTime;
    }

    public Integer getCont() {
        return cont;
    }

    public void setCont(Integer cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "PackageClient: \n" +
                " dateTime=" + dateTime +
                " client=" + client + '\n'+
                " turistPackages=" + turistPackages ;
    }
}
