# Java keywords
**Keywords** in Java are reserved words that represent predefined actions,
internal processes.


## Control Statements

| Name | Syntax |
| ---- | ------ |
| if | `if(condition) Statement;` |
| for | `for(initialization; condition; iteration) statement(s);` |


##  Data types

### Primitive types

| Name | Group/Width | Syntax | Rang |
| ---- | ----------- | ------ | ---- |
| byte | integer/8-bit | `byte variable_name = value;` | -128 - 127 |
| short | integer/16-bit | `int variable_name = value;` | -32768 - 32767 |
| int | integer/32-bit | `int variable_name = value;` | -2147483648 - 2147483647 |
| long | integer/64-bit | `long variable_name = value;` | -9223372036854775808 - 9223372036854775807 |
| float | floating point/32-bit | `float variable_name = valuef;` | 1.4e-045 - 3.4e+038 |
| double | floating point/64-bit | `double variable_name = value;` | 4.9e-324 - 1.8e+308 |
| char | characters/16-bit | `char variable_name = 'value';` | 0 - 65536 |
| boolean | boolean | `boolean variable_name = true/false;` | true - false |


## Other keywords

| Syntax | Description |
| ------ | ----------- |
| `main` | java program begins execution by calling `main()`. |
| `public` | it is used when code line is to be used outside the class. |
| `private` | prevents member to be used outside the class. |
| `static` | used to execute the `main()` without particular instance of class. |
| `void` | tells the compiler that `main()` does not return a value. |


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