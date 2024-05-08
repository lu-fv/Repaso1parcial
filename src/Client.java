public class Client {
    private String nameAndSurname;
    private String passport;

    public Client(String nameAndSurname, String passport) {
        this.nameAndSurname = nameAndSurname;
        this.passport = passport;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nameAndSurname='" + nameAndSurname + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }
}
