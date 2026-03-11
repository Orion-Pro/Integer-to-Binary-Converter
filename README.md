# Integer-to-Binary-Converter
A simple conversion program, who's objective was mainly to help me familiarize myself with the very basics of the java programming language.
Using the long division method, this program computes the remainder of an inputted binary number until the remainder == 0, at which point each of these remainders, which are stored in an ArrayList are looped through in reverse order, and appended to a String which contains the binary number.

This was a very short, and quick project, It served its purpose to help me ease in to java programming coming from C++ development, and does have room for improvement.
- It could be redesigned to use a stack rather than an ArrayList, and pop each element to get the final binary number.
- Instead of returning a string, we could easily multiply each remainder by i 2^i to return that same binary number but as an int data type.
- We could expand the conversion class and methods to work for different radiis.
