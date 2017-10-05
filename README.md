# JavaTasks
Книги и материалы для подготовки: 
	Java Complete Reference by Schildt;
Java SE 8 for the Really Impatient by Horstmann;
https://docs.oracle.com/javase/tutorial/java/index.html;

Темы
Синтаксические конструкции 	schildt I:3,4,5
ООП. Наследование 		schildt I:6,7,8
Collections. Array, List, Map 	horst 160-162
Strings				schildt II:16
I/O. Файловая система.		schildt 689-727; horst 163-166, 183-187
Streams API. 			schildt 965-991; horst 2
Lambdas. 				schildt 381-412; horts 1
	

Задания:
Lang.math:		
1.  Euclid’s algorithm (which is over two thousand years old) computes the greatest common divisor of two numbers as gcd(a, b) = a if b is zero, and gcd(b, rem(a, b)) otherwise, where rem is the remainder. Clearly, the gcd should not be negative, even if a or b are (since its negation would then be a greater divisor). Implement the algorithm with %, floorMod, and a rem function that produces the mathematical (non-negative) remainder. Which of the three gives you the least hassle with negative values? [horst p.174 #3]           
Util.collection	  
		2. Implement a bidirectional Rot13 algorithm. Encode/decode a string from the command line argument.  
		3. Write a program to convert an input hexadecimal string into its equivalent decimal number.  		
Java.nio	
4. Write methods that turn a Scanner into a stream of words, lines, integers, or double values. [horst.p 175 #9]  
 	5. Unzip the src.zip file from the JDK. Using Files.walk, find all Java files that contain the keywords transient and volatile; [horst.p 175 #10]  
		6. Write an example that counts the number of times a particular character, such as E, appears in a file. The character can be specified at the command line.
		7. Write a program that reads a text file, specified by the first command line argument, into a List. The program should then print random lines from the file, the number of lines printed to be specified by the second command line argument. Write the program so that a correctly-sized collection is allocated all at once, instead of being gradually expanded as the file is read in. Hint: To determine the number of lines in the file, use java.io.File.length to obtain the size of the file, then divide by an assumed size of an average line.  

Util.stream		
8. Using Stream.iterate, make an infinite stream of random numbers—not by calling Math.random but by directly implementing a linear congruential generator. In such a generator, you start with x0 = seed and then produce xn + 1 = (a xn + c) % m, for appropriate values of a, c, and m. You should implement a method with parameters a, c, m, and seed that yields a Stream. Try out a = 25214903917, c = 11, and m = 2^48. [horst p. 44 #5]  
9. Write a method public static Stream zip(Stream first, Stream second) that alternates elements from the streams first and second, stopping when one of them runs out of elements. [horst p. 44 #8]  

Algo  
		(Optional) 10. Online palindrome detection. Read in characters one at a time. Report at each instant if the current string is a palindrome. Use the Rabin-Karp hashing algorithm. http://www-igm.univ-mlv.fr/~lecroq/string/node5.html#SECTION0050
http://algs4.cs.princeton.edu/53substring/  

Зачет задач howto:  
Создаем git-репозиторий на открытой площадке (GitHub/Bitbucket).  
Делаем задачи, комитим код с комментариями в репозиторий.  
Передаем ссылку на репо мне.  

Почта: yuriitipikin@gmail.com
