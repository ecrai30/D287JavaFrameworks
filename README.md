<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
B.  Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
    mainscreen.html, Line 14: Added ZikaTronics as the title of the page
    mainscreen.html, Line 19: Changed the name of the shop to ZikaTronics
    mainscreen.html, Line 43,52,61,70,79: Added part names
    mainscreen.html, Line 116, 125,134,143,152: Added product names

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
    Created about.html    
    about.html, Lines 18 - 33: Added mission, team, and contact information. 
    about.html, Lines 10 - 13: Added button that links to mainscreen.html and about.html.
    mainscreen.html, lines 18 - 21: Added buttons that links to maincreen.html and about.html.
    AboutPageController.java, Lines 9- 15 :Added AboutPageController

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
    BootStrapData.java, Lines: 47 - 125: Added 5 parts.
    BootStrapData.java, Lines: 129 - 136: Added 5 products.

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters: 
    •  The “Buy Now” button must be next to the buttons that update and delete products.
        mainscreen.html, Line 130: Added Buy Now button
    •  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
        BuyProductController.java, Lines 15 - 50: configured BuyProductController to decrease inventory of product
    •  Display a message that indicates the success or failure of a purchase.
        confirmationBuyNow.html, Lines 1 -15: Added purchase successful message.
        confirmationBuyNowError.html, Lines 1 - 15:Added purchase failed message.
        confirmationBuyNowError.html, Line 4: Added redirect delay for confirmation messages.
        confirmationBuyNow.html, Line 4: Added redirect delay for confirmation messages.


G.  Modify the parts to track maximum and minimum inventory by doing the following:
    •  Add additional fields to the part entity for maximum and minimum inventory.
        Part.java, Lines 31-32, 46-47, 55-56: Declared minInv and maxInv and added to constructor.
        Part.java, Lines 92 - 104: Added getter and setter methods for minInv and maxInv.
    •  Modify the sample inventory to include the maximum and minimum fields.
        BootStrapData.java, Lines 47 - 135: Added minInv and maxInv fields to sample inventory.
    •  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
        InhousePartForm.html, Lines 26 - 28: Added Max and Min inventory input fields.
        OutsourcePartForm.html, Lines 24 - 26: Added Max and Min inventory input fields. 
    •  Rename the file the persistent storage is saved to.
        application.properties, Line 6: Renamed and Updated Database filename. 
    •  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
        Part.java, Lines 106 - 114: Created isInvValid method to make sure inventory is between min and max values.

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
    •  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
    •  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
    •  Display error messages when adding and updating parts if the inventory is greater than the maximum.
        AddOutsourcedPartController.java, Lines 43 - 51: Added validation for min and max inventory value fields
        AddInhousePartController.java, Lines 42 - 50: Added validation for min and max inventory value fields
        EnufPartsValidator.java, Lines 37 - 39: Added if/else statement to check if inventory is less thea minimum inventory

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
    PartTest.java, Lines 167 - 174: Added testMinimumInventory unit test.
    PartTest.java, Lines 176 - 184: Added testMaximumInventory unit test.

J.  Remove the class files for any unused validators in order to clean your code.
    Deleted DeletePartValidator.java
