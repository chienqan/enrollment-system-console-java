# Main program
The main program placed in side com.company folder with Main.java file

# Design patterns

I have seperated design pattern to each package with the exactly name

+ builder
This builder pattern to create data for student and course

+ factory
This pattern is used to create program helper to get
student enrollment object from user input and get user input

+ singleton
This pattern to make a one object that store student enrollment details

+ template
To control flow of the program with the final method start

+ depencyinjection
Passed student enrollment and put to the enrollment storage class to print
each item in the storage

+ iterator
This pattern let me easily to build menu

+ decorator
This pattern to make a validator layer, each input need to go to this to validate

+ facade
This pattern to make a table to print course and detail for the user

+ visitor
This pattern will print the warm welcome program

+ state
To make program execute start program and stop program


# Features of java version

+ Java 5: Using for in loop
for(Course course: courses) {
    ...
}

+ Java 6: @Override annotation
@Override
public void useCourseSample(Courses courses) {
    this.courses = courses;
}


+ Java 7: Diamon Operator
List<String> menus = new ArrayList<>();

+ Java 8: Lamda expression
ProgramMessage repeatMessage = (message) -> message;
ProgramMessage invalidMessage = (message) -> "Invalid " + message;

+ Java 9: List interfaces have “of()” methods

Because currently, most intellij idea support java 8, so it may be not convenient to switch to java 9,
I will describe what is new feature of java 1.9 that List interfaces have of() method to create empty
or no-empty immutable List object

As java 8:
List<String> menus = new ArrayList<>();
menus.add("To use this system, there is a list option below");
menus.add("1) Create");
menus.add("2) Read");
menus.add("3) Update");
menus.add("4) Delete");

Transform to java 9:
List<String> menus = List.of("To use this system, there is a list option below", "1) Create", "2) Read", "3) Update", "4) Delete");
