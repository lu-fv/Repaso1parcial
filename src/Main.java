import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Agency agency = new Agency();
        createTuristPackages(agency);
        createClientList(agency);

     //   agency.showClients();
      //  agency.showPackage();

        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        agency.ClientAndPackage("AAS206",ids);
        List<Integer> ids1 = new ArrayList<Integer>();
        ids1.add(3);
        ids1.add(2);
        agency.ClientAndPackage("AAS203",ids1);

        agency.ClientAndPackage("Matias Cabeza", ids);

        agency.showPackageClient();

       /* int opc;
        Scanner sc = new Scanner( System.in);
        agency.deletePackage();
        sc.next();
        agency.showPackage();*/
    }

    private static void createTuristPackages(Agency agency) {

        Adventure adventure1 = new Adventure(1, 5, 10, Destiny.BEACH, Activities.KAYAK);
        Relax relax1 = new Relax(2, 5, 7, Destiny.BEACH, Spa.HIDRO);
        Culture culture1 = new Culture(3, 4, 5, Destiny.MONTAIN, 3);
        adventure1.insurance();

        culture1.insurance();
        adventure1.increacePriceAdventure();

        agency.AddPackage(adventure1);
        agency.AddPackage(culture1);
        agency.AddPackage(relax1);

    }
    private static void createClientList(Agency agency) {

        Client client1 = new Client("Matias Cabeza", "AAS203");
        Client client4 = new Client("Matias Cabeza", "AAS203");
        Client client2 = new Client("Lucia Franco", "AAS206");
        Client client3 = new Client("Manuel Zucchi", "AAS209");

        agency.AddClients(client1);
        agency.AddClients(client2);
        agency.AddClients(client3);
        agency.AddClients(client4);


    }
    /*
    private static List<Client> createClientList() {
        List<Client> createClientList = new ArrayList<Client>();
        Client client1 = new Client("Matias Cabeza", "AAS203");
        Client client2 = new Client("Lucia Franco", "AAS206");
        Client client3 = new Client("Manuel Zucchi", "AAS209");

        createClientList.add(client1);
        createClientList.add(client2);
        createClientList.add(client3);

        return createClientList;
    }*/
}
