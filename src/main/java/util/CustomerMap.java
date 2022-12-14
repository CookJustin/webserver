package util;


import java.util.HashMap;

public class CustomerMap {
    public HashMap<Integer,Customer> customerHashMap = new HashMap<>();
    public CustomerMap(){
        customerHashMap.put(1,new Customer("Joseph",21, "This is Joseph"));
        customerHashMap.put(2,new Customer("Justin",21, "This is Justin"));
        customerHashMap.put(3,new Customer("Jacob",21, "This is Jacob"));
    }
    public Customer getCustomer(int id){
        return customerHashMap.get(id);
    }
}
