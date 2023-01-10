Feature:  Admin login

Scenario: Admin Login with Valid Credentials
 Given User is on Page
 When User cursor Navigate to LogIn Page
 And User entered the Credentials to LogIn
    | user7 | pwd7 |
    | user9 | pwd9 |
    | user3 | pwd3 |
    | user4 | pwd4 |
    | user2 | pwd2 |
    | user1 | pwd1 |
 Then Message displayed Login Successful