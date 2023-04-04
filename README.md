# OIBSIP_3
This is a Java program for an ATM interface that allows users to perform various transactions such as withdrawing money, depositing money, checking account balance, and transferring money.

The program starts by declaring an initial balance of 52000 and prompting the user to enter their profile password. If the entered password matches the predefined password 5004, the program proceeds to the main menu.

The main menu is implemented using a while loop that runs continuously until the user chooses to quit. The user is presented with five options to choose from, each option is implemented using a switch case statement.

The first option is for withdrawing money. If the user selects this option, the program prompts the user to enter the amount of money they want to withdraw. If the balance is sufficient, the requested amount is deducted from the balance, and the user is instructed to collect their money. If the balance is insufficient, an error message is displayed.

The second option is for depositing money. If the user selects this option, the program prompts the user to enter the amount of money they want to deposit. The requested amount is added to the balance, and a success message is displayed.

The third option is for checking the account balance. If the user selects this option, the program displays the current balance.

The fourth option is for transferring money. If the user selects this option, the program prompts the user to enter the recipient's account number and the amount to transfer. If the balance is sufficient, a success message is displayed, and the transfer is completed. Otherwise, an error message is displayed.

The last option is for quitting the program. If the user selects this option, the program exits.

If the user enters an incorrect password, they are notified with a message stating wrong credentials.

Overall, the program allows users to perform basic ATM transactions using a simple menu-driven interface.
