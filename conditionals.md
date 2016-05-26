### The if expression
Been asked to write a program that will calculate chargers for people visiting an amusement park.<br/>
1. Different charges for adults and children
2. Whether they are bringing a cooler
3. Whether they want to also go to the water park
</ol>
``` 
val cost = if(age<13) 20 else 35
```
This assumes that age is an **int** variable that has been defined prior to this point. The first is a basic variable declaration. The new part is the if expression, which checks the age and gives back one of the two values depending on where **age<13** is true or false.<br />
This uses the **if** as an expression. So we care about the vlaue it gives us. In this caase we always want to include an **else** because there has to be a value that is used if the expression is false. the same type of behaviour could be accomplised with a **var** using the if as a statement.<br />
```
var cost = 20
if(age>=13) cost = 35
```
This code creates a **var** and gives it the value of 20. It then checks if the age is great than or equal to 13, if so the value is changed to 35. With this usage the **else** clause is not required. We only want to do something if the condition is **true**.<br/>
*In scala approach 1 is preffered as it is shorter, cleaner and leaves you with a val which you can be certain will not be changed after it is created.*<br />
*The first is a functional approach whereas the second is an imperative approach.*<br />
```
// In general the format of the if is as follows:
if(condition) expr1 [else expr2]
```
The square brackets denote that the **else** and the second expression are option. they are not part of the syntax. The condition can be replaced by any expression of type **Boolean** while **expr1** and **expr2** can be any expression you want.<br />
In the sutation where the expression is complex, you can use curly braces to create a block of code. You can put any code inside of curly braces. This block is an expression and the value of the expression is the value of the last statement in the curly braces.<br />
<br />
What about other parts of our entrance costs? Also wanted to check if they had a cooler and wanted to get into the water park. These should be variables of the type **Boolean**. We might call them ***cooler*** and ***waterPark***. Let us say it costs an addtional $5 to bring a cooler and $10 to go to the water park. Using the if as an expression: 
```
val cost = (if(age<13) 20 else 35) + (if(cooler) 5 else 0) + (if(waterpark) 10 else 20)
```
We are adding together the results of three different *if* expressions. This format is somewhat specific to functional languages. IT would be more common in most languages to see:
```
var cost = 20
if(age >= 13) cost = 35
if(cooler) cost = cost + 5
if(waterPark) cost = cost + 10
```
Here we use *if* as a statement instead of an expression and have the body of the if chagne or mutate the value of the variable cost.<br />
In the second and third *if* statements the name **cost** is repeated. This type of repetition is often avoided in programming. It is possible to use an abbreviated syntax where the operator is placed in front of the equals sign like this:
```
var cost = 20
if(age>=13) cost = 35
if(cooler) cost += 5
if(waterPark) cost += 10
```

### Comparisons
The if statement in the previous section uses **>=** to do a comparison between two values.<br />
The simplest comparison you can do is to check if two things are the same or different. You read this as saying that two things are equal or not equal to one another. In scala we represent this with **==** and **!=** respectively.<br />
```
2==3
res1: Boolean = false

7==7 
res2: Boolean = true

'a' == 'a'
res3: Boolean == true
```

The **!=** operator is basically the opposite of **==**. It tells us if two things are different and should be read as not equal.<br />

### Boolean Logic
Imagine the theme park had a polciy where anyone over 65 is the same price as anyone under 13.
```
val cost = if(age<13) 20 else if(age>65) 20 else 35

// OR

var cost = 20
if(age >= 13) cost = 35
if(age > 65) cost = 20
```
Both of these are verbose, potentially inefficient and prone to errors. The errors occur because in both we had to enter the number 20 in two places. We want to say that we use a lower rate if the person is under 13 or over 65 and use the higher rate otherwise.<br />
There are 4 different **BOOLEAN OPERATORS** we can use to build complex Boolean expressions.
```
and | a && b | True if both a and b are true
or | a || b | True if a or b is true. Allows both being true
exclusive or (xor) | a ^ b | True if either a or b is true, but not both
not | !a | True if a is false and false if a is true.
```

We can use the || operator just we used or in our English description of what we wanted. 
```
val cost = if(age<13 || age > 16) 20 else 35

// We can use && to say and
if(age>=13 && age <= 65) cost = 35
```

The first one reproduces the English description and uses an **or** to give a single Boolean expression for when the lower rate is charged.<br />
The second one is the converse and uses an **and** to determine when the higher rate should be charged. The second expression could be written instead with an || and a ! to make it mor explicit so that it is the converse of the first one. 
```
var cost = 20
if(!(age<13 || age > 65)) cost = 35
```
The extra set of a parentheses is required here so that the not is done for the whole expression.<br />
It is worth noting that || is not the "or" of normal English. ***When you say "or" you mean the logical exclusive or, ^.***<br />
An example would be that tells us if two squares intersect. Each square is defined by its top-left corner as x and y coordinates along with the edge lengths of the two squares. We want a result that is a Boolean telling us whether or not the squares intersect.<br />
#### Refer to page 78
```
val overlapyX = x1 < x2 + size2 && x1 + size1 > x2
val overlapyY = y1 < y2 + size2 && y1 + size1 > y2
val squareOverlap = overlapX && overlapY
```
The Boolean value, **squareOverlap**, tells us the answer to the question.

### Bigger Expressions
All expressions so far have bene small. Other factors can come into play when they get large. One factor is precedence. 
```
First
(other special characters)
* / %
+ -
:
= !
< >
&
^
|
(all letters)
(all assignment operators)
```
**&&** and **||** are defined on the Boolean type. The comparison operators are defined on numeric types etc. When you use operator otation with a method, the presedence is determined by the first character in the operator.
