
@Test
  @FinalTask
  Feature: Testing basic functionality of webpage
  In this test we are trying to follow specific steps in attempt to find product
  by searching in category menu, search bar, testing log in feature and validating
  the correctness of customer and product data.

  @Scenario

  Scenario: Testing web page product search feature by means of  search bar and categories, checking workability on log in and log out feautures, as well as check out.

  Given Open URL address
  When User clicks on product category button
  And Then user click on subcategory Phones
  When User clicks on subsubcategory Phones
  When User finds another category Phones and click on it
  And On on this page user sees the list of phones and scroll up and down to see all available products
  Then User searches for a specific product in search bad
  And Clicks on submit button
  And Clicks on brand filter
  When Find the needed device and clicks on it
  When Finds cart button
  And  Clicking on submit button
  Then prints in console the name of the product and validates the correctness on name given and actual name
  And Click on BUY button
  Then Cart page where users starts to fill the email to log in
  And Fill the field with password
  And Clicks on submit button
  When User selects the delivery option
  When Users inputs name and surname and  Phone number in the given field
  When Clicking on final submit button to save changes
  Then Print in console Name and Surname of customer
  When clicks on submit button one more time
  Then Print in console the final price of the product and validates the correctness on price given and actual price of the product
  And User deletes in profile menu client data for further tests

  And Closes the window.







