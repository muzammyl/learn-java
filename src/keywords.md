# Java keywords
**Keywords** in Java are reserved words that represent predefined actions,
internal processes.


## **Control Statements**

| Name | Syntax |
| ---- | ------ |
| if | `if(condition) Statement(s);`<br>`else statment(s);` |
| for | `for(initialization; condition; iteration) statement(s);` |
| for-each | `for(type itr-var : collection) statement(s);` |
| switch | `switch(expression) {`<br>`case value1:`<br>`//statement(s)`<br>`break;`<br>`.`<br>`.`<br>`case value(n):`<br>`//statement(s)`<br>`break;`<br>`default:`<br>`//default statement(n)`<br>`}` |
| while | `while(condition) {`<br>`//body of loop`<br>`}` |
| do-while | `do {`<br>`//body of loop`<br>`} while(condition);` |

### Jump statements

| Name | Description |
| ---- | ----------- |
| `break` | Use to terminate loop, switch statement, **goto** statement(`break` *`label`*`;`). |
| `continue` | Useful to force an early iteration of a loop. |
| `return` | Use to explicitly return from the method, control transfer back to the caller of the method. |


##  **Data types**

### Primitive types

| Name | Group/Width | Syntax | Range |
| ---- | ----------- | ------ | ----- |
| byte | integer/8-bit | `byte variable_name = value;` | -128 - 127 |
| short | integer/16-bit | `int variable_name = value;` | -32768 - 32767 |
| int | integer/32-bit | `int variable_name = value;` | -2147483648 - 2147483647 |
| long | integer/64-bit | `long variable_name = value;` | -9223372036854775808 - 9223372036854775807 |
| float | floating point/32-bit | `float variable_name = valuef;` | 1.4e-045 - 3.4e+038 |
| double | floating point/64-bit | `double variable_name = value;` | 4.9e-324 - 1.8e+308 |
| char | characters/16-bit | `char variable_name = 'value';` | 0 - 65536 |
| boolean | boolean | `boolean variable_name = true/false;` | true - false |


## Inheritance

| Syntax | Description |
| ------ | ----------- |
| `extends` | `extends` keyword simply incorporate the definition of one class into another(can't access `private` members). |
| `super` | subclass can call a constructor defined by its superclass by use of `super(arg-list);`, it also acts like `this` keyword like `super.member;` |
| `abstract` | `abstract class` cann't be used to create object, it must be inherited from one class to another. `abstract` method can only be used in abstract class, it is undefined(no body), body is placed in subclass. |


## Other keywords

| Syntax | Description |
| ------ | ----------- |
| `main` | java program begins execution by calling `main()`. |
| `public` | it is used when code line is to be used outside the class. |
| `private` | prevents member to be used outside the class. |
| `static` | a `static` member can be accessed before any objects of its class are created, & without reference to any object. |
| `void` | tells the compiler that `main()` does not return a value. |
| `var` | reserved type-name, auto tells type of variable, also act as identifier, can be used with arrays (brackets[] should only be used by type not with `var` in arrays). |
| `String` | `String` defines an object, used to declare string variables, simply `String var-name = "value";` (example). |
| `new` | it dynamically allocates memory for an object. |
| `this` | it is used inside any method to refer to the current object. |
| `final` | a `final` member can't be modified, making it a constant. `final` member must be initialized when it is declared. Methods declared as `final` also cann't be overriden. `class` declared as `final` cann't be inherited. |
| `Object` | `Object` is a superclass of all other classes, a reference variable of type `Object` can refer to an object of any other class. |
| `package` | `package` *`pkg;`* (syntax) statement defines a name space in which your classes are stored. For multilevel package, we use hierarchy of packages like: `package` *`pkg1.pkg2.pk3;`* |
| `import` | statement use to bring certain classes, or entire packages, into visibility. Generally like: `import` *`pkg1.pkg2.classname`* `\|*`. |
| `interface` | use to fully abstract a class, what a class can do & how it does, they lack instance variables, also their methods are declared without any body. Any number of classes can implement `interface` & vise versa. Variables declared are implicitly `final`, `static` & `public`. |
| `implements` | `interface` can be implemented on more than one `class`. Include `implements` clause in class definition like: `class` *`class-name`* `implements` *`interface-name`*. For more than one `interface` use comma to separate. To implement an interface method, it must be declared as `public`. If a class includes an `interface` but does not fully implement the methods then that class must be declared as `abstract`. |


## Separators

| Symbol | Purpose |
| ------ | ------- |
| () | contain list of parameters. |
| {} | define a block of code. |
| [] | declare array types. |
| ; | terminate a statement. |
| , | separation in variable declaration. |
| . | separate package names. |
| :: | create method or constructor reference. |
| ... | indicates variable-arity parameter. |
| @ | begins an annotation. |


## Escape sequences

| Symbol | Description |
| ------ | ----------- |
| \ddd | octal character |
| \uxxxx | hexadecimal unicode character |
| \\' | single quote |
| \\" | double quote |
| \\\ | backslash |
| \r | carriage return |
| \n | new line |
| \f | form feed |
| \t | tab |
| \b | backspace |

## Arithmetic operators

| Operator | Result |
| -------- | ------ |
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Modulus |
| ++ | Increment |
| += | Addition assignment |
| -= | Subtraction assignment |
| *= | Multiplication assignment |
| /= | Division assignment |
| %= | Modulus assignment |
| -- | Decrement |

## Bitwise operators

| Operator | Result |
| -------- | ------ |
| ~ | NOT |
| & | AND |
| \| | OR |
| ^ | exclusive OR |
| >> | Shift right |
| >>> | Shift right zero fill |
| << | Shift left |
| &= | AND assignment |
| \|= | OR assignment |
| ^= | exclusive OR assignment |
| >>= | Shift right assignment |
| >>>= | Shift right zero fill assignment |
| <<= | Shift left assignment |

## Object class methods

| Method | Purpose |
| ------ | ------- |
| `Object clone()` | creates a new object that is same as the object being cloned. |
| `boolean equal(Object `*`object`*`)` | determine wheather one object is equal to another. |
| `void finalize()` | called before an unused object is recycled. |
| `Class<?>getClass()` | obtains the class of an object at run time. |
| `int hashCode()` | returns the hash code associated with the invoking object. |
| `void notify()` | resumes execution of a thread waiting on the invoking object. |
| `void notifyAll()` | resumes execution of all thread waiting on the invoking object. |
| `String toString()` | returns a string that describes the object. |
| `void wait()`<br>`void wait(long milliseconds)`<br>`void wait(long milliseconds, nanoseconds)` | waits on another thread of execution. |