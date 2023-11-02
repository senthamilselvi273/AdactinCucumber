Feature:  Adactin Application Hotel Booking
@browserLaunch
Scenario: User Login In The Web Application
Given user Launch The Url In The Adactin Application
When user Enter The Username In The Username Field
And user Enter The Password In The Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page
@searchHotel
Scenario: User Search The Hotel
When user Select The Location
And user Select The Hotel
And user Select The Room Type
And user Select The Number Of Rooms
And user Select The Check In Date
And user Select The Check Out Date
And user Select The Adults per Room
And user Select The Children per Room
Then user Click The Login Button And It Navigates To Select Hotel Page
@selectHotel
Scenario: User Select The Hotel
When user Select The Hotel Name
Then user Click The Continue Button And It Navigates To Book Hotel Page
@bookHotel
Scenario: User Book A Hotel
When user Enter The First Name
And user Enter The Last Name
And user Enter The Billing Address
And user Enter The Credit Card No
And user Enter The Credit Card Type
And user Enter The Month In Expiry Date
And user Enter The Year In Expiry Date
And user Enter The CVV Number 
Then user Click The Book Now Button And It Navigates To Booking Confirmation Page
@logout
Scenario: User Logout From The Web Application
Then user Click The Logout Button And It Navigates To Home Page

