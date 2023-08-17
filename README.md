

## Attributes vs. Fields:

In object-oriented programming (OOP) terminology, the terms "attribute" and "field" are often used interchangeably.
However, to be precise:
* Field: Refers to a variable that is defined directly in a class (not inside a method).
It represents the data the object can hold and can be either instance or static.
* Attribute: In a broader sense, an attribute can refer to any property or characteristic of an object.
In the context of Java and many other OOP languages, an attribute typically refers to a field of an object.

### Fields
In Java, a field is a variable that is declared inside a class but outside any method, constructor, or block.
There are two main types of fields:
1. **Instance Fields:** These are **non-static fields** and are unique for each instance (or object) of the class.
	Here, **dog1** and **dog2** are two instances (or objects) of the **Dog** class. Each of them has its own **name** field.
	Changing the **name** of **dog1** won't affect the **name** of **dog2**.
	
2. **Static Fields:** These are declared with the **static** keyword and are common for all instances.
	They belong to the class rather than any specific instance.
	Here, **dogCount** is a static field of the **Dog** class. Whether we create one dog or a thousand dogs,
	there is only one **dogCount** field that keeps track of the total number of **Dog** objects created.