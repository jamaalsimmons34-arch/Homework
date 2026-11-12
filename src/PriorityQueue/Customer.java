package PriorityQueue;

public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
```[cite: 4]

        ---

        ### `PriorityQueueCustomer.java`
        ```java
package PriorityQueue;//import java.util.Comparator;
//import java.util.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueCustomer {

    //comparator interface implementation
    public static Comparator<Customer> idComparator =
            new Comparator<Customer>(){
                @Override
                public int compare(Customer c1, Customer c2){

                    return c1.getId() -  c2.getId();
                }
            };

    //this method will be utility or helper method to add random data to queue
    private static void addDataToQueue(Queue<Customer> customerQueue){
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            int id = random.nextInt(100);
            customerQueue.add(new Customer(id, "Customer Name: " + id));
        }
    }

    //another utility to poll data from queue
    private static void pollDataFromQueue(Queue<Customer> customerQueue){
        while(true){
            Customer customer = customerQueue.poll();
            if(customer == null) break;
            System.out.println("Customer ID = " + customer.getId());
        }
    }

    public static void main(String[] args) {
        //Declare Queue and declare with PriorityQueue
        Queue<Customer> customer = new PriorityQueue<>(10,idComparator);
        addDataToQueue(customer);
        pollDataFromQueue(customer);
    }
}
}
