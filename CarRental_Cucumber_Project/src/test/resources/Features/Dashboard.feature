Feature: Admin Dashboard Functionality for Car Rental Website

  Background: 
    Given admin launch the browser
    When admin opens url "https://carrental.neohire.io/admin/"
    Then admin should able to see the admin signin page
    And admin should enter username as "admin"  and password as "Test@12345"
    And click on login
    Then admin should able to view car rental portal | admin panel

  Scenario: Verify Reg Users Page in Dashboard
    When admin click on Dashboard
    And click on Reg Users Full Detail link
    Then admin should be navigated to Registered Users Page

  Scenario: Verify Listed Vehicles Page in Dashboard
    When admin click on Listed Vehicles Full Detail link
    Then admin should be navigated to Manage Vehicles Page

  Scenario: Verify Total Bookings Page in Dashboard
    When admin click on Total Bookings Full Detail link
    Then admin should be navigated to Manage Bookings Page

  Scenario: Verify Listed Brands Page in Dashboard
    When admin click on Listed Brands Full Detail link
    Then admin should be navigated to Manage Brands Page

  Scenario: Verify Subscibers Page in Dashboard
    When admin click on Subscibers Full Detail link
    Then admin should be navigated to Manage Subscribers Page

  Scenario: Verify Queries Page in Dashboard
    When admin click on Queries Full Detail link
    Then admin should be navigated to Manage Contact Us Queries Page

  Scenario: Verify Testimonials Page in Dashboard
    When admin click on Testimonials Full Detail link
    Then admin should be navigated to Manage Testimonials Page

  Scenario: Verify Logout Functionality in Dashboard
    When admin click on Account option
    And clicks on Logout
    Then admin navigates to Admin|SignIn page

  Scenario: Verify Change Password Functionality in Dashboard
    When admin click on Account option
    And clicks on Change Password
    Then change password page will be displayed
    When admin click on save changes button
    Then popup message will be displayed

  Scenario: Verify Change Password Functionality in Dashboard
    When admin click on Account option
    And clicks on Change Password
    Then change password page will be displayed
    When admin fills the form
    And admin click on save changes button
    Then password changed success message will be displayed
