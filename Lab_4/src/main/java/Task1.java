import java.util.*;

public class Task1 {
    TreeMap<Long, Abonent> phoneBook = new TreeMap<>();
    void task(){
    }

    public void addAbonent(Long number, Abonent abonent){
        phoneBook.put(number, abonent);
    }

    public ArrayList<Abonent> getAbonents(){
        ArrayList<Abonent> abonentList = new ArrayList<>(phoneBook.values());
        abonentList.sort(Comparator.comparing(Abonent::getLastName)
                .thenComparing(Abonent::getFirstName)
                .thenComparing(Abonent::getAddress));
        return  abonentList;
    }
    public ArrayList<Abonent> getAbonents_LastNameSort(){
        ArrayList<Abonent> abonentList = new ArrayList<>(phoneBook.values());
        abonentList.sort(Comparator.comparing(Abonent::getLastName));
        return  abonentList;
    }
    public ArrayList<Abonent> getAbonents_FirstNameSort(){
        ArrayList<Abonent> abonentList = new ArrayList<>(phoneBook.values());
        abonentList.sort(Comparator.comparing(Abonent::getFirstName));
        return  abonentList;
    }
    public ArrayList<Abonent> getAbonents_AddressSort(){
        ArrayList<Abonent> abonentList = new ArrayList<>(phoneBook.values());
        abonentList.sort(Comparator.comparing(Abonent::getAddress));
        return  abonentList;
    }
}
class Abonent {
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;

    public Abonent(String lastName, String firstName, String middleName, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + ", Адреса: " + address;
    }
}