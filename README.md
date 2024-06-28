# credit-validity

In this project, I decided to venture into the finance world with Credit Cards and whatnot.
Wondering how companies verify their cards, I did a deep dive and found that there is a verification
through the Luhn Algorithm. 

![image](https://github.com/gl0rpse/credit-validity/assets/123853802/ab891b51-de07-4338-9993-9a5ef11388e5)

The Luhn Algorithm takes all the numbers of a credit card and then doubles every other number.
Once this is done, the sum of all those digits are added up. If the final number is a multiple of 10,
then the credit card is valid.
______________________________________________________________________________________________________

The program consists of three methods in the class.
  1) luhnsAlgo()
  2) cardVendor()
  3) main()

The luhnsAlgo() method takes a long number (I decided to use the *long* data type instead of the *int* type because credit cards 
have varying extensive lengths) and takes it through the Luhn Algorithm. It returns true or false based on the result of "% 10".

cardVendor() will return the name of the card company based on the first digit(s) as Visa, Mastercard, Discover, or American Express. I felt very limited on
this method of the program because there ARE other companies. I just decided to keep it simple and use the popular ones in the United States.

In the main method, cardVendor() and luhnsAlgo() are utilized to print out if the credit card numbers the user entered are valid by the algorithm implemented.
They are *only* checked for validity by use of the algorithm. Things like expiration dates and CVV codes are not applicable here.
_____________________________________________________________________________________________________________________________________________________________________
Websites used for testing card numbers with the program:
  1) https://support.bluesnap.com/docs/test-credit-card-numbers
  2) https://www.paypalobjects.com/en_AU/vhelp/paypalmanager_help/credit_card_numbers.htm



Maybe in the future, I will come back and expand on this project to create a simulated environment to actually check for different factors in verifying credit cards and deploy it elsewhere.
