package org.prog.session6.sample;

public class CustomerGenerator {

    public void createCustomer() {
        createCustomer(
                "John",
                "Doe",
                "5555555",
                "john.doe@gmail.com",
                "Some street 1",
                "US",
                "12345"
        );
    }

    public void createCustomer(String firstName, String lastName){
        createCustomer(
                firstName,
                lastName,
                "5555555",
                firstName + "." + lastName +"@gmail.com",
                "Some street 1",
                "US",
                "12345"
        );
    }

    public void createCustomer(
            String firstName,
            String lastName,
            String phoneNumber,
            String email,
            String address,
            String country,
            String postCode
    ) {
        System.out.println("Create customer: ");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Country: " + country);
        System.out.println("Post Code: " + postCode);
    }
}
