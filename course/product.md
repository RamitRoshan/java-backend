You are designing a product catalog system to demonstrate object-oriented programming concepts such as inheritance, method overriding, and instance methods. The system manages different types of products like Books and Accessories, which share common characteristics but also have specialized behavior.

 

**Requirements**

**1. Base Class – Product**

Create a class Product that represents common features of all products.

<br>
Properties:

	  •	name
	  •	price

<br>
Instance Methods:

	  •	applyDiscount(double percentage)
            - Reduces the product price by the given discount percentage.


<br>


**2. Derived Class – Book**

Create a class Book that extends Product.

<br>
Properties:

	  •	bookId
	  •	author
	  •	genre
      •	pages

<br>
Instance Methods:

	  •	getReadingTime()
            - Returns the estimated reading time based on the number of pages.
	  •	toString()
            - Overrides the parent method to include book-specific details along with common product details.

 <br>


**3. Derived Class – Accessories**

Create a class Accessories that extends Product.

<br>
Properties: 

	  •	accessoryId
	  •	type
	  •	brand
      •	isWarraty - boolean

<br>
Instance Methods:

	  •	isWarrantyAvailable()
           - Returns true if the accessory brand provides a warranty, otherwise false.
	  •	toString()
           - Overrides the parent method to include accessories-specific details along with common product details.
	  •	At least one child class–specific instance methods