package services.Implement;

import Models.Customer;
import Repository.CustomerRepositoryImp;
import Repository.ICustomerRepository;
import services.CustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceImp implements CustomerService {
    private static ICustomerRepository iCustomerRepository = new CustomerRepositoryImp();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        Customer customer = this.infoCustomer();
        iCustomerRepository.adding(customer);
    }

    @Override
    public void display() {
        for (Customer customer: iCustomerRepository.getAll()){
            System.out.println(customer);
        }
    }

    @Override
    public void editInfo() {
        System.out.print("Enter staffId: ");
        int customerId = Integer.parseInt(scanner.nextLine());
        for (Customer customer : iCustomerRepository.getAll()){
            if (customerId == customer.getCustomerId()){
                System.out.println(customer);
                System.out.println("Edit... ");
                iCustomerRepository.getAll().set(iCustomerRepository.getAll().indexOf(customer), infoCustomer());
            } else {
                System.out.println("Staff doesn't exist.");
            }
        }
    }

    private Customer infoCustomer(){
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter birthday: ");
        String birthday = scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter identifyId: ");
        String identifyId = scanner.nextLine();
        System.out.print("Enter phoneNumber: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter customerId: ");
        int customerId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter levelCustomer: ");
        String levelCustomer = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(name, birthday, gender, identifyId, phoneNumber, email, customerId, levelCustomer, address);
        return customer;
    }

    @Override
    public List<Customer> getAll() {
        return iCustomerRepository.getAll();
    }
}
