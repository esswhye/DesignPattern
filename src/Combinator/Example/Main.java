package Combinator.Example;

import java.time.LocalDate;

import static Combinator.Example.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice",
                LocalDate.of(2000, 1, 1),
                "alice@gmail.com",
                "+0898787879878"
        );

        Customer customer2 = new Customer(
                "Daddy",
                LocalDate.of(2000, 1, 1),
                "Daddy@gmail.com",
                "+0898787879878"
        );

        //        System.out.println(new CustomerValidatorService().isValid(customer));

        // Using combinator pattern
        String result = isEmailValid()
                .and(isNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != "SUCCESS") {
            throw new IllegalStateException(result);
        }

        CustomerRegistrationValidator test = new CustomerRegistrationValidator() {
            @Override
            public String apply(Customer customer) {
                return customer.getPhoneNumber();
            }
        };


        System.out.println(test.apply(customer2));

    }
}
