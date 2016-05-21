## Objects and methods
All values in scala are OBJECTS<br />
Object means something that combines data and the functionality on that data.<br />
In scala we refer to the thing that an OBJECT knows how to do as METHODS<br />
Syntax for calling a METHOD on an OBJECT is to follow the OBJECT by a PERIOD or a DOT . and the name of the method.</br>
Some METHODS need extra information which we called ARGUMENTS. If a METHOD needs ARGUMENTS then those are put after the METHOD name in ()</br>
In scala even basic literals (numeric literals) are treated as OBJECTS and can then call METHODS on them.<br />
EXAMPLE<br />
Convert one type to another.<br />
```
5.5.toInt
Int = 5
```
Convert Double value 5.6 to an **INT** by calling **toInt METHOD**.<br />
This does not ROUND. It uses **TRUNCATION** - Any fractional part is cut off.<br />
Scala will infer a semicolon at the end of a line if one makes sense. - *Makes code easier to write*<br />
The **.** between an object and a method is also optional.<br />
```
5.6 toInt
Int = 5
```
Even parenthese on arguments to a method are optional assuming that there is only one argument.<br />
*This flexibility makes Scala more chorent and prived the programmer with significant flexibility.*<br/ >
Math operator are nothing more than methods. 5+6 really means 5 .+ (6)<br/>
```
5 .+ (6)
Int = 11
```
The space between **5** and **.** is required here because Scala will think you want a Double.<br />

## Other Basic Type
Objects of **Boolean** type are either **true** or **false**
```
true
Boolean = true

false
Boolean = false 
```
**Char** is used to represent single characters. *Can make character literals by plaving them inside single quotes*
```
'a'
Char = a
```
All character data is really numbers and different numbers correspond to different characters.<br />
Can use **toInt** to find out which numberic value is associated with a character
```
'a'.toInt
Int = 97
```
Because characters have numberic vlaues we can also do math with the. Scala will convert the character to its numeric value ans and **Int** and do math with the **Int**
```
'a' + 1
Int = 98
```
You can call **toChar** method on an **Int** to get back to a character.
```
('a'+1).toChar
Char = b
```
An object of the **Char** type can only be a single character. Putting more than one character inside single quotes will cause an error.<br />
To represent many characters you will use a **String**. String Literals are form by putting zero or more characters inside double quotes.
```
"Scala is a programming language"
String = Scala is a programming language
```
Certain mathematical operations are supported for Strings. **+** With a String does concatenation. - *Creates a new string with the combination of those that are put together*
```
"abc"+"def"
String = abcdef
```
This works with other types. String with an int *Int is converted to a String using **toString** method*
```
"abc"+123
String = abc123
```
You can also multiple a String by an Int
```
"abc"*6
String = abcabcabcabcabcabc
```
**UNIT** represents a non-value or meaningless value. *void in other languages*<br/>
**TUPLE** is a squence of a specified number of specific types. *Basically a collection of values that is strict about how many and what type of values it has* 
```
(5,6,7)
(Int, Int, Int) = (5,6,7)

("book", 200)
("String, Int) = (book,200)

(5.7,8,'f',"a string")
(Double, Int, Char, String) = (5.7,8,f,a string)
```
Tuples provide a way of dealing with muliple values in a single package. The way we express a tuple type in Scala is to put the type of the values of the tuple in paranthese with commas between them, like we do with the values to make a tuple object.<br />
Tuples with only two elements can have special meanings in some parts of Scala. There is an alternative syntax for these. The token **->** between two values will produce a 2-tuple with those values
```
3 -> "three"
(Int, String) = (3,three)
```
If you try using it with more than two elements you can get intersting results
```
4 -> 5 -> 6
((Int, Int), Int) = ((4,5,),6)
```
So if you want tuples with more than two elements use (,)<br />
There are two way to get things out of tuples. The first is to use methods named `_1, _2, _3, etc` 
```
(5.7,8,'f',"a string")
res21: (Double, Int, Char, java.lang.String) = (5.7,8,f,a string)
res21._1
Double = 5.7
res21._3
Char = f
```
## Naming Values and Variables
There are three keywords in Scala that give names to values. The first to are **val and var**
```
val age:Int=5
age: Int =5

var average:Int=(2+3+4+5)/4
average: Int = 3
```

## Naming Values and a Variables
There are three keywords in Scala that give names to values. Two of them are **val and var**.
```
val age:Int=5
age: Int = 5

var average:int=(2+3+4+5)/4
average: Int = 3
```
The type is optional, scala is able to figure out the type in most situations.
```
val age=5
age: Int = 5

var average=(2+3+4+5)/4
average: Int = 3
```
The reason for using a **val** or a **var** is that they give a name to the value that we can refer back to later.<br />
The difference between val and var is not in the syntax but in the meaning or semantics.<br />
A **val** gives a reference to a vlaue. *That reference can not be changed - It is set forever*<br />
A **var** allows the reference to change.<br />
The act of changing the reference stored is reffered to as an an assignment. *This is done with the same **=** sign that is used to set the initial value*<br/>
In an assignment there are no val or var keywords. If you use one you will be creating a new variable not changing an old one.
```
average=8
average: Int = 8

average=2*average
average: Int = 16
```
*The first assignment sets the average to 3<br/>
The second uses the previously reffered value and multiplies it by 2 then stores it back to the variable*</br>
Technically the assignment is able to do something called **PATTERN MATCHING**. We can put tuples on the left-hand side of an equals sign where we would normally put a variable name. 
```
val t=(100,5.7)
t: (Int, Double) = (100,5.7)
```
**t** refers to the tuple and has a type (Int, Double). If you want to put multiple names inside of a () on the left of the equals much like a tuple, all the name will be bound.
```
val (price, weight)=(100,5.7)
price: Int = 100
weight: Double = 5.7
```
### Exercise
Given total time in seconds
Find what it is in hours, minutes and seconds
Print out in reasonable format "hh:mm:ss"<br />
**Seconds to minutes** Divide by 60<br />
```
val totalSeconds=123456
totalSeconds: Int = 123456
```
```
val totalMinutes=totalSeconds/60
totalMinutes: Int 2057
```
Figure out how many seconds we need to display
```
val displaySeconds=totalSeconds%60
displaySeconds: Int = 36
```
The modulo gives us the remainder after getting all the full groups of 60.<br />
Number of hours and minutes to display.
```
val displayMinutes=totalMinutes%60
displayMinutes: Int = 17

val displayHours=totalMinutes/60
displayHours: Int = 34
```
We see 12345 seconds is 34 hours, 17 minutes and 36 seconds.<br/>
Now we must turn it into "hh:mm:ss"
```
val finalString=displatyHours+":"+displayMinutes+":"+displaySeconds
finalString: String = 34:17:36
```
If the number of minutes or seconds is less than 10, only one digit is displayed when we want two. We need to load zeros on numbers that have 1 digit.<br/>
Step one is to get the number of minutes and seconds as **Strings**
```
val min=displayMinutes.toString
min: String == 17

val sec=displayseconds.toString
sec: String = 36
```
A string has an easy way to tell how many digits/characters are in it. When there is one digit we want to add one, when there is two we want to leave it.<br/>
We can get there by using the * method on the String and a little math. 
```
val finalString=displayHours + ":" + ("0"*(2 - min.length)) + min + ":" + ("0" * (2 - sec.length)) + sec
finalString: String = 34:17:36
``` 
We can force values in to test if it works
```
val min = "5"
min: String = 5

val sec = "2"
sec: String = 2

val finalString = displayHours + ":" + ("0" * (2 - min.length)) + min + ":" + ("0" * (2 - sec.length)) + sec
finalString String = 34:05:02
```
