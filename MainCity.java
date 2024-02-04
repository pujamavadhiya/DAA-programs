//class City { private String name;
//    private int x;
//    private int y;
//    public City(String name, int x, int y) {
//        this.name = name; this.x = x; this.y = y;
//    }
//    public String getName() {
//        return name;
//    }
//    public int getX() {
//        return x;
//    }
//    public int getY() {
//        return y;
//    }
//    public String toString() {
//        return getName()+""+getX()+""+getY();
//    } }
//class CityNode {
//    private City city;
//    private CityNode next;
//    public CityNode(City city, CityNode next) {
//        this.city = city; this.next = next;
//    }
//
//    public City getCity() {
//    return city;
//}
//public CityNode getNext() {
//    return next;
//} public void setNext(CityNode next) {
//    this.next = next;
//} }
//class CityDatabase {
//    private CityNode head;
//    public CityDatabase() {
//        head = null;
//    } public void addCity(City city) {
//        CityNode newNode = new CityNode(city, null);
//        if (head == null) {
//            head = newNode;
//        }
//        else {
//            CityNode curr = head;
//            while (curr.getNext() != null) {
//                curr = curr.getNext();
//            } curr.setNext(newNode);
//        } }
//    public void removeCity(String name) {
//        if (head == null) {
//            return;
//        }
//        if (head.getCity().getName().equals(name)) {
//            head = head.getNext();
//            return;
//        }
//        CityNode prev = head;
//        CityNode curr = head.getNext();
//        while (curr != null) {
//            if (curr.getCity().getName().equals(name)) {
//                prev.setNext(curr.getNext());
//            }
//            return;
//        }
//        prev = curr;
//        curr = curr.getNext();
//    }
//    public City findCity(String name) {
//    CityNode curr = head;
//    while (curr != null) {
//        if (curr.getCity().getName().equals(name)) {
//            return curr.getCity();
//        }
//        curr = curr.getNext();
//    } return null;
//}
//public void printCity() {
//    CityNode curr=head;
//    while(curr!=null) {
//        System.out.println(curr.getCity());
//        curr=curr.getNext();
//    } } }
//public class MainCity{ public static void main(String argps[]) {
//    CityDatabase database=new CityDatabase();
//    database.addCity(new City("Ahmedabad",20,20));
//    database.addCity(new City("Baroda",30,03));
//    database.addCity(new City("Surat",40,40));
//    database.printCity(); database.removeCity("Surat");
//    System.out.println("after removing the city");
//    database.printCity();
//} }
