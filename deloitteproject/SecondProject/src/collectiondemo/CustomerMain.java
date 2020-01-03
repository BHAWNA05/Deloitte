package collectiondemo;


import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
	List<Customer> allCustomers = new ArrayList<Customer>();
	Customer customer1 = new Customer(101,"Jaya","Pune",98000);
	allCustomers.add(customer1);
	allCustomers.add(new Customer(101, "Tarun", "Mumbai", 65000));
	allCustomers.add(new Customer(101, "Pooja", "Delhi", 48000));
	allCustomers.add(new Customer(101, "Sam", "Banglore", 12000));
	
	System.out.println("Sort on 1)name 2)Address 3)billamount???");
	Scanner scanner = new Scanner(System.in);
	int choice = scanner.nextInt();
	if(choice==3)
	{
		Collections.sort(allCustomers);
		System.out.println("After sorting on billamount");
		System.out.println(allCustomers);
	}
	if(choice==1)
	{
		Collections.sort(allCustomers , new NameComparator());
		System.out.println("After sorting on name");
		System.out.println(allCustomers);
	}
	if(choice==2)
	{
		Collections.sort(allCustomers, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				if(o1.getCustomerAddress().compareTo(o2.getCustomerAddress())>0)
				{
				// TODO Auto-generated method stub
				return 0;
				}
				else
				{
					return -1;
				}
			}
			
		});
		System.out.println("After sorting on Address");
		System.out.println(allCustomers);
	}
	/* Iterator<Customer> customerIterator = allCustomers.iterator(); 
	     
		 while(customerIterator.hasNext())
		 {   
			 Customer customer = customerIterator.next();
		     System.out.println(customer);	 
		 }*/
	

	}

}
