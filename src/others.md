## **Type Casting**

When we assign a value of one type to a variable of another type, type casting performed.
- Automatic conversions casting
- Incompatible type casting

### Automatic conversions casting

If the two types are compatible and the destination type is larger than the source type, this is automatic casting.

### Incompatible type casting

To create a conversion between two incompatible types, you must use a cast. It is simply an explicit type conversion, general form:

`(target-type) value`


## **Arrays**

An array is a group of like-typed variables, commomly reffered by a common name. It may has one or more dimensions with elements accessed by their index.

- ### One-Dimentional Arrays

An array is specifically a list of like-typed variables. Simply general form:

```
type var-name[];

array-var = new type[size];
```

OR

`type var-name[] = new type[size];`

- ### Multidimensional Arrays

Multidimentional arrays are implemented as arrays of arrays. Like:

```
type name[][] = new type[][]; (2D)
type name[][][] = new type[][][]; (3D)
.
.
.
```

## **Class & object**

`class` basically defines a new data type, a class is the template for an object & object is instance of class.

`class` Syntax:

```
class classname {
    //body
}
```

`object` Syntax:

*`class-name`* *`object-name`* `= new` *`class-name`*`();`

### Methods

Method Syntax:

```
type name(parameter-list) {
    //body of method
}
```

### Constructors

Constructor initializes an object immediately upon creation. It has the same name as the class.

Syntax:

```
class class-name {
    class-name(parameter-list) {
        //body
    }
}
```

### Recursion

Recursion is the process of defining something in terms of itself, it allows a method to call itself. Use `if` statement with recursion otherwise method will never terminate.

## Variable-Length Arguments

Syntax:

`data-type ... variable-name`

Thus, VarArgs are specified by three periods(...). This syntax tells the compiler that variable number of arguments will be used, these args will be stored in an array referred to var-name.


## **Class Member Access**

| Category | Private | No Modifier | Protected | Public |
| -------- | ------- | ----------- | --------- | ------ |
| **Same class** | Yes | Yes | Yes | Yes |
| **Same package subclass** | No | Yes | Yes | Yes |
| **Same package non-subclass** | No | Yes | Yes | Yes |
| **Different package subclass** | No | No | Yes | Yes |
| **Different package non-subclass** | No | No | No | Yes |

## **Exceptions**

**Unchecked Exceptions:** exceptions need not to be included in any method's `throws` list.

**Checked Exceptions:** exceptions that must be included in a method's `throws` list if that method can generate one of these exceptions & does not handle it itself.

### **Unchecked Exceptions**

- ArithmeticException
- ArrayIndexOutOfBoundsException
- ArrayStoreException
- ClassCastException
- EnumConstantNotPresentException
- IllegalArgumentException
- IllegalCallerException
- IllegalMonitorStateException
- IllegalStateException
- IllegalThreadStateException
- IndexOutOfBoundsException
- LayerInstantiationException
- NegativeArraySizeException
- NullPointerException
- NumberFormatException
- SecurityException
- StringIndexOutOfBoundsException
- TypeNotPresentException
- UnsupportedOperationException

### **Checked Exceptions**

- ClassNotFoundException
- CloneNotSupportedException
- IllegalAccessException
- InstantiationException
- InterruptedException
- NoSuchFieldException
- NoSuchMethodException
- ReflectiveOperationException