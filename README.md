# Tutorial on mocking and stubbing

A Java project to show unit test, stub and mocking with mockito

Objectives:

We want to build an HR software.

Our team has been assigned the following tasks:

- [x] **Given an employee's full name, we want to capitalize the name** without depending on any external service.

  
- [] **How many employees are from Edmonton?** There is an online service that
returns a list of all employees' addresses! We need to implement a method that checks for Edmonton, and returns the list. But what
if it takes too much time to return results by the service? Everytime we run our test suite, it will take a lot of time to execute because of the
service round-trip (request/response) bottleneck. In addition, service may have
set a rate limit on its endpoints (e.g., maximum 500 requests a month).


- [x] **How many employees have _salary > 50K_?** Another team is developing a service
that returns list of all the salaries, but they are not done yet. How can
we filter the salary if that service from other team is not completed yet?
More importantly, how would we know if our filtering implementation is
correct?


## Acknowledgements

The [original work](https://github.com/cmput402-w19/Week2LabMocking) has been
done by Shaiful Chowdhury for CMPUT 402 Winter 2019 ed.

