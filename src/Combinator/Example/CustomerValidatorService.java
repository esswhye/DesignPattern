package Combinator.Example;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private Boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private Boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+0");
    }

    private Boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }

    private Boolean isValidate(Customer customer) {
        return isEmailValid(customer.getEmail())
                && isPhoneNumberValid(customer.getPhoneNumber())
                && isAdult(customer.getAge());
    }


}
