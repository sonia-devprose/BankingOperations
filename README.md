# BankingOperations

The `Banking` class simulates basic banking operations, such as deposit, withdrawal, transfer, and account status checks using arithmetic, logical, bitwise, and ternary operators.

1. **Arithmetic Operations**:
   - **Initial Account Balances**: The class starts by defining two accounts, `accountA` and `accountB`, with initial balances of `$500` and `$200` respectively.
   - **Deposit Operation**: An amount of `$200` is deposited into `accountA`, and the balance is updated accordingly.
   - **Withdrawal Operation**: It attempts to withdraw `$300` from `accountB`. If there are sufficient funds, the withdrawal is successful; otherwise, an "Insufficient funds" message is shown.
   - **Transfer Operation**: `$400` is transferred from `accountA` to `accountB` if `accountA` has enough funds. The balances of both accounts are updated after the transfer.

2. **Logical Operators**:
   - A check is performed to ensure that both `accountA` and `accountB` have a minimum balance of `$200`. The logical operators `&&` (AND) and `||` (OR) are used to print appropriate messages based on whether both, one, or neither of the accounts meet the required minimum balance.

3. **Bitwise Operators**:
   - **Account Flags**: The account flags are represented using bits. Bit 0 indicates that the account is active. Bit 1 enables overdraft protection, Bit 2 marks the account as overdrawn, and Bit 3 enables direct deposit.
   - **Bitwise Operations**:
     - The initial account flag is set to `0001` (account active).
     - Overdraft protection is enabled by setting bit 1 using the bitwise OR (`|`) operator.
     - The class checks if overdraft protection and overdrawn status are enabled using bitwise AND (`&`) and updates the flags accordingly.
     - Direct deposit is also enabled using the same bitwise method, and the status of the account is printed.
   
4. **Ternary Operators**:
   - The class uses the ternary operator (`? :`) to determine whether `accountA` and `accountB` are active or inactive based on their balance.
   - The result is printed as either "active" or "inactive" depending on whether the account balance is greater than `0`.

Overall, the class demonstrates various operators used to manage banking operations and account statuses. Each operation is printed with appropriate feedback for clarity.

![Screenshot 2024-11-23 173305](https://github.com/user-attachments/assets/657ac565-f666-456f-a70d-870ef726c127)
