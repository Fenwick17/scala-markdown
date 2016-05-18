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

