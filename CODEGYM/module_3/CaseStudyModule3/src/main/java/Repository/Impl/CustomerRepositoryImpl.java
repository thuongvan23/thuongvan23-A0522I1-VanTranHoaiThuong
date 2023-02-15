package Repository.Impl;

import Model.Customer;
import Model.CustomerType;
import Repository.CustomerRepository;
import Service.CustomerTypeService;
import Service.Impl.CustomerTypeServiceImpl;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private static CustomerTypeService customerTypeService = new CustomerTypeServiceImpl();
    private BaseRepository baseRepository = new BaseRepository();
    private static final String SELECT_FROM_CUSTOMER = "select * from student";
    private static final String INSERT_STUDENT = "insert into customer(customer_id, customer_type_id, " +
            "customer_name, customer_birthday, customer_gender, " +
            "customer_id_card, customer_phone, customer_email, " +
            "customer_address) value (?,?,?,?,?,?,?,?,?) ";
    static List<Customer> customerList = new ArrayList<>();
    static {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            customerList.add(new Customer("DE1", "Van A", df.parse("2003-06-24"), 1, "43847387478", "0987463821", "a@gmail.com","Da Nang", customerTypeService.findById("1")));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    Map<String, Customer> customerMap = new HashMap<>();
    @Override
    public void createOrUpdate(Customer customer) {
//        customerMap.put(customer.getCustomerId(), customer);
        Connection connection = this.baseRepository.getConnectionJavaToDB();
        try {
            PreparedStatement preparedStatement =connection.prepareStatement(INSERT_STUDENT);
            preparedStatement.setString(1, customer.getCustomerId());
            preparedStatement.setString(2, customer.getCustomerType().getId());
            preparedStatement.setString(3, customer.getCustomerName());
            preparedStatement.setDate(4, (Date) customer.getCustomerBirthday());
            preparedStatement.setInt(5, customer.getCustomerGender());
            preparedStatement.setString(6, customer.getCustomerIdCard());
            preparedStatement.setString(7, customer.getCustomerPhone());
            preparedStatement.setString(8, customer.getCustomerEmail());
            preparedStatement.setString(9, customer.getCustomerAddress());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(String id) {
        customerMap.remove(id);
    }

    @Override
    public Customer findById(String id) {
        return customerMap.get(id);
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList1 =new ArrayList<>();
        Connection connection = this.baseRepository.getConnectionJavaToDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer;
            while (resultSet.next()){
                customer = new Customer();
                customer.setCustomerId(resultSet.getString("customer_id"));
                customer.setCustomerType(customerTypeService.findById(resultSet.getString("customer_type_id")));
                customer.setCustomerName(resultSet.getString("customer_name"));
                customer.setCustomerBirthday(resultSet.getDate("customer_birthday"));
                customer.setCustomerGender(resultSet.getInt("customer_gender"));
                customer.setCustomerIdCard(resultSet.getString("customer_id_card"));
                customer.setCustomerPhone(resultSet.getString("customer_phone"));
                customer.setCustomerEmail(resultSet.getString("customer_email"));
                customer.setCustomerAddress(resultSet.getString("customer_address"));
                customerList1.add(customer);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        return new ArrayList<>(customerMap.values());
        return customerList1;
    }
}
