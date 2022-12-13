
@Test
  @FinalTask
  Feature: Testing basic functionality of webpage
  In this test we are trying to follow specific steps in attempt to find product
  by searching in category menu, search bar, testing log in feature and validating
  the correctness of customer and product data.

  @Scenario

  Scenario: Testing web page product search feature by means of  search bar and categories, checking workability on log in and log out feautures, as well as check out.

  Given Open URL address
  And User accepts cookies
  When User clicks on product category button
  And Then user click on subcategory Phones
  And User gives 2 sec sleep for page to load
  And User maximises the screen
  And Gives 2 sec more for page to laod
  And User scroll down and gives 2 sec sleep to load the page
  When User clicks on subsubcategory Phones
  And User gives 3 sec to load the page and scroll down
  When User finds another category Phones and click on it
  And On on this page user sees the list of phones and scroll up and down to see all available products
  Then User searches for a specific product in search bad
  And Clicks on submit button
  When Gives 3 sec for page to load and scroll down
  And Clicks on brand filter
  And Gives 2 sec sleep and scroll down
  When Find the needed device and clicks on it
  Then User appeard on product page, scrolls down
  When Finds cart button
  And  Clicking on submit button
  Then Gives 2 sec for page to load and prints in console the name of the product and validates the correctness on name given and actual name
  And User scrolls down
  And Click on BUY button
  Then Cart page where users starts to fill the email to log in
  And Fill the field with password
  And Clicks on submit button and giving 2 sec sleep for page to load
  When User selects the delivery option
  And Scroll down the page
  When Users inputs name
  And Surname
  And Phone number in the given field
  And Scroll a bit down and gives 2 sec rest for page to load
  When Clicking on final submit button to save changes
  Then User gives 3 sec rest and print in console Name and Surname of customer
  When Gives 1 sec rest and clicks on submit button one more time
  Then Print in console the final price of the product and validates the correctness on price given and actual price of the product

  And Click on 1a logo to open home page
  And Clicks on profile
  And Click on deleta user data for further tests.
  And Closes the window.







