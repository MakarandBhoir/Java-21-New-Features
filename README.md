# 5 New Features of Java-21
### 1. Unnamed Classes and Instance Main Method
    This feature included the Java language so that getting started experience can be easy specially for students, who can write their first programs without having deep understanding language features designed for large programs. 
    
    Far from using a separate dialect of Java, students can write streamlined declarations for single-class programs and then seamlessly expand their programs to use more advanced features as their skills grow. 
    
    This is a preview language feature
    
_Example of unnamed class and Instance main method. [Greeting.java](Greeting.java)_

**Compile and Run:**

	javac --release 21 --enable-preview -Xlint:preview Greeting.java
	java --enable-preview Greeting

When using the source code launcher, run the program with 
	
    java --source 21 --enable-preview Greeting.java

### 2. String Templates
    Enhance the Java programming language with string templates. String templates complement Java's existing string literals and text blocks by coupling literal text with embedded expressions and template processors to produce specialized results. This is a preview language feature and API.

    String interpolation is dangerous
    Unfortunately, the convenience of interpolation has a downside: It is easy to construct strings that will be interpreted by other systems but which are dangerously incorrect in those systems.
    
    Strings that hold SQL statements, HTML/XML documents, JSON snippets, shell scripts, and natural-language text all need to be validated and sanitized according to domain-specific rules. Since the Java programming language cannot possibly enforce all such rules, it is up to developers using interpolation to validate and sanitize. Typically, this means remembering to wrap embedded expressions in calls to escape or validate methods, and relying on IDEs or static analysis tools to help to validate the literal text.
    
    Interpolation is especially dangerous for SQL statements because it can lead to injection attacks. For example, consider this hypothetical Java code with the embedded expression ${name}:
    
    String query = "SELECT * FROM Person p WHERE p.last_name = '${name}'";
    ResultSet rs = connection.createStatement().executeQuery(query);
    If name had the troublesome value
    
    Smith' OR p.last_name <> 'Smith
    then the query string would be
    
    SELECT * FROM Person p WHERE p.last_name = 'Smith' OR p.last_name <> 'Smith'
    and the code would select all rows, potentially exposing confidential information. Composing a query string with simple-minded interpolation is just as unsafe as composing it with traditional concatenation:
    
    String query = "SELECT * FROM Person p WHERE p.last_name = '" + name + "'";

_Example of String Template. [InterpolationDemo.java](InterpolationDemo.java)_

**Compile and Run:**

    javac --release 21 --enable-preview InterpolationDemo.java
    java --enable-preview InterpolationDemo

### 3. Sequenced Collections
    Introduce new interfaces to represent collections with a defined encounter order. Each such collection has a well-defined first element, second element, and so forth, up to the last element. It also provides uniform APIs for accessing its first and last elements, and for processing its elements in reverse order.

    "Life can only be understood backwards; but it must be lived forwards."

_Example of Sequenced Collection [SequencedCollectionExample.java](SequencedCollectionExample.java)_

### 4. Foreign Function & Memory API
    Introduce an API by which Java programs can interoperate with code and data outside of the Java runtime. By efficiently invoking foreign functions (i.e., code outside the JVM), and by safely accessing foreign memory (i.e., memory not managed by the JVM), the API enables Java programs to call native libraries and process native data without the brittleness and danger of JNI. This is a preview API.

### 5. Record Patterns
    Enhance the Java programming language with record patterns to deconstruct record values. Record patterns and type patterns can be nested to enable a powerful, declarative, and composable form of data navigation and processing.

_Example of Record [RecordTest.java](RecordTest.java)_