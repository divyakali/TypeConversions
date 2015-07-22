# TypeConversions
Demonstrate type conversions without built in functionality

Special cases handled:
1. If the input has any non numeric characters (with the exception of starting with a - for negative numbers) throw a NumberFormatException.
<br/>
2. Whenever the string has more than 19 digits in it, it cannot be saved to long type in java. The code throws an exception in this case.
<br/>
3. In addition to the number of digits, we should also ensure that the number we are trying to generate does not lead to underflow/overflow issues.
We loop to add digits one at a time. A simple check to see that result before adding is within the range of min ,max bounds of long.
<br/>
4. Testing always helps. Do not forget to add edge cases in order to test functionality in a better way.
<br/>
<br/>
Improvements/Limitations:
The documentation does not mention if the Strings passed are in decimal format. For future implementations, we can test the format of the number(in string) and convert it to decimal before parsing to long. I used integers since the problem statements refers only to integers.
