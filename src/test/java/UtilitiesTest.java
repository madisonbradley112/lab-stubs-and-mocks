import models.Address;
import org.junit.jupiter.api.Test;
import services.AddressService;
import services.SalaryService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UtilitiesTest {

    @Test
    public void testGetAddresses() {

        AddressService addressService = mock(AddressService.class);

        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("Address 1", "City 1"));
        addresses.add(new Address("Address 2", "City 1"));
        addresses.add(new Address("Address 3", "City 2"));
        addresses.add(new Address("Address 4", "City 3"));
        addresses.add(new Address("Address 5", "City 4"));

        when(addressService.getAllAddresses()).thenReturn(addresses);

        Utilities utilities = new Utilities();
        List<Address> expectedAddresses = new ArrayList<>();
        expectedAddresses.add(new Address("Address 1", "City 1"));
        expectedAddresses.add(new Address("Address 2", "City 1"));

        List<Address> actualAddresses = new ArrayList<>();
        actualAddresses = utilities.getAddressByCity(addressService, "City 1");



        assertEquals(expectedAddresses.size(), actualAddresses.size());

        for(int i = 0; i < expectedAddresses.size(); i++) {
            assertEquals(expectedAddresses.get(i).getCity(), actualAddresses.get(i).getCity());
        }
    }

    @Test
    public void testGetSalaries() {
        SalaryService salaryService = mock(SalaryService.class);

        List<Integer> salaries = new ArrayList<>();
        salaries.add(40000);
        salaries.add(45000);
        salaries.add(50000);
        salaries.add(55000);
        salaries.add(60000);
        salaries.add(65000);

        when(salaryService.getSalaries()).thenReturn(salaries);

        Utilities utilities = new Utilities();

        when(salaryService.getSalaries()).thenReturn(salaries);

        List<Integer> expectedSalaries = new ArrayList<>();
        expectedSalaries.add(55000);
        expectedSalaries.add(60000);
        expectedSalaries.add(65000);

        List<Integer> actualSalaries = utilities.getSalariesAbove(salaryService, 50000);

        assertEquals(expectedSalaries.size(), actualSalaries.size());

        for(int i = 0; i < actualSalaries.size(); i++) {
            assertEquals(expectedSalaries.get(i), actualSalaries.get(i));
        }
    }
}
