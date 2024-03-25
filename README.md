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

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters: 
    •  The “Buy Now” button must be next to the buttons that update and delete products.
    •  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
    •  Display a message that indicates the success or failure of a purchase.

G.  Modify the parts to track maximum and minimum inventory by doing the following:
    •  Add additional fields to the part entity for maximum and minimum inventory.
    •  Modify the sample inventory to include the maximum and minimum fields.
    •  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
    •  Rename the file the persistent storage is saved to.
    •  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
    •  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
    •  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
    •  Display error messages when adding and updating parts if the inventory is greater than the maximum.

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

J.  Remove the class files for any unused validators in order to clean your code.

