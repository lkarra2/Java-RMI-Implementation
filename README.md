## Java RMI Implementation

### Ensuring that Java RMI upholds Referential Integrity

```Referential Integrity:

If two references to an object are passed from one JVM to another JVM in parameters 
(or in the return value) in a single remote method call and those references refer 
to the same object in the sending JVM, those references will refer to a single copy 
of the object in the receiving JVM.```