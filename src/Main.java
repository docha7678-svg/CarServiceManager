//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"Aura","Laura","+1234567890", "aura@gmail.com");
        Customer customer1 = new Customer(2,"Alice","Nowname","+0987654321","alice@gmail.com");
        Car car = new Car("WBA3B1C50DF123456","bmw","m3", 2019, "AAA231CD", customer);

    }
}