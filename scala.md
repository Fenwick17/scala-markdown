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


