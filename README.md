# Software patterns - or, how to obfuscate the fact that Java sucks
## CTS course preparation

### Creational Patterns:
 - [x] Simple Factory
 - [x] Factory Method
 - [x] Builder
 - [x] Singleton
 - [x] Prototype

### Structural:
 - [x] Adapter
 - [x] Composite
 - [x] Decorator
 - [x] Façade
 - [x] Flyweight
 - [x] Proxy

### Behavioural ("Comportamental" for people not familiar with the English language):
 - [x] Strategy
 - [x] Observer
 - [ ] ~~Chain of Responsibility~~ no longer required
 - [x] Command
 - [ ] ~~Memento~~ no longer required
 - [x] State
 - [x] Template
 
 ### Testing (JUnit 4)
 #### Define a Suite and a Category:
 ```java
 package ro.ekovacs.cts.junit.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@IncludeCategory(Include.class)
@RunWith(Categories.class)
@SuiteClasses({ TestCalculateTotal.class, TestCalculateTotalWithDiscount.class })
public class SomeTests {}
 ```
 
 #### Then in tests include them like this:
 ```java
@Category(Include.class)
@Test
public void testCrossCheck() throws MissingProductsException {
    // Test...
}
 ```
