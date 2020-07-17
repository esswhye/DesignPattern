package Combinator.Example;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegistrationValidator extends Function<Customer, String> {

    static CustomerRegistrationValidator isNumberValid() {
        return customer -> {
            System.out.println("isNumberValid");
            return customer.getPhoneNumber().startsWith("+0") ? "SUCCESS" : "PHONE NUMBER INVALID";
        };
    }

    static CustomerRegistrationValidator isAnAdult() {
        return customer -> {
            System.out.println("isAnAdult");
            return Period.between(customer.getAge(), LocalDate.now()).getYears() > 16 ? "SUCCESS" : "UNDERAGE";
        };
    }

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> {
            System.out.println("number");
            return customer.getEmail().contains("@") ? "SUCCESS" : "INVALID EMAIL";
        };
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer -> {

            System.out.println(this.toString());
            String result = this.apply(customer);
            return result.equals("SUCCESS") ? other.apply(customer) : result;
        };

    }

}
