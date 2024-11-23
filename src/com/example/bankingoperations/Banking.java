package com.example.bankingoperations;

public class Banking {

    public static void main (String [] args) {
        // Arithmetic operations
        // Define initial balances for two accounts
        int accountA = 500; // Balance for account A
        int accountB = 200; // Balance for account B

        // Complete the operations below:
        System.out.println("Initial balances:");
        System.out.println("Balance in account A: $" + accountA);
        System.out.println("Balance in account B: $" + accountB);

        // Deposit operation
        int depositA = 200;
        accountA += depositA;
        System.out.println("Depositing $" + depositA + " into account A...");
        System.out.println("Updated account A balance: $" + accountA);

        // Withdrawal operation
        int depositB = 300;
        System.out.println("Attempting to withdraw $" + depositB + " from account B");
        if (accountB >= depositB) {
            accountB -= depositB;
            System.out.println("Withdrawal successful. Updated account B balance: $" + accountB);
        } else {
            System.out.println("Insufficient funds in account for this withdrawal");
        }

        // Transfer operation
        int transferAB = 400;
        if (accountA >= 400) {
            System.out.println("Transferring $" + transferAB + " from account A to account B");
            accountA -= transferAB;
            accountB += transferAB;
            System.out.println("Transfer successful");
            System.out.println("Current balance in A: $" + accountA + " and " + "current balance in B: $" + accountB);
        } else {
            System.out.println("No sufficient funds in account A to transfer");
        }

        // Logical operators
        // Define minimum balance
        int minBalance = 200;
        boolean isAccountABalanced = accountA >= minBalance;
        boolean isAccountBBalanced = accountB >= minBalance;
        if (isAccountABalanced && isAccountBBalanced) {
            System.out.println("Account A and B have the required minimum balances.");
        }
        else if (isAccountABalanced || isAccountBBalanced)
        {
            System.out.println("Less than minimum balance in either of the accounts A/B");
        }
        else
        {
            System.out.println("Neither of the accounts A/B have minimum balances");
        }

        // Bitwise operators
        // Initialize accoulnt flag for the first time
        // Bit 0 is set, as in is set to 1
        int accountFlags = 0b0001;
        System.out.println("Initial account flags" + Integer.toBinaryString(accountFlags));

        // Enable overdraft protection, bit 1 is set to 1
        accountFlags |= 0b0010;
        System.out.println("After enabling overdraft protection");
        System.out.println("Account flags" + Integer.toBinaryString(accountFlags));

        // Check if overdraft protection is enabled
        boolean hasOverDraftProtection;
        if (hasOverDraftProtection = ((accountFlags & 0b0010) !=0))
        {
            System.out.println("Overdraft protection is enabled");
        }
        else
        {
            System.out.println("Overdraft protection is disabled");
        }

        // Mark account as overdrawn
        accountFlags |= 0b0100;
        boolean hasOverDrawn;
        if (hasOverDrawn = ((accountFlags & 0b0100) != 0))
        {
            System.out.println("Account is overdrawn");
        }
        else
        {
            System.out.print("Account is not overdrawn");
        }

        // Enable direct deposit
        accountFlags = 0b1000;
        boolean directDeposit;
        if (directDeposit = ((accountFlags & 0b1000) != 0))
        {
            System.out.println("Account is active");
        }
        else
        {
            System.out.println("Account is inactive");
        }

        // Ternary operators - to determine whether account A and B is active or inactive based on its balance

        // Using ternary operator
       // int max = (a > b) ? a : b;
        String accountStatusA = (accountA>0)? "Account A is active" : "Account A is inactive";
        System.out.println(accountStatusA);
        String accountStatusB = (accountB>0)? "Account B is active" : "Account B is inactive";
        System.out.println(accountStatusB);




    }
}
