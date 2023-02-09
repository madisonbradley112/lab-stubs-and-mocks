package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    public void testCapitalizedName() {
        Address address = new Address("Address 1", "City 1");
        Employee employee = new Employee("Bob", 1234, 50000, address);

        String actualName = employee.getCapitalizedName();

        assertEquals("Bob", actualName);
    }
}