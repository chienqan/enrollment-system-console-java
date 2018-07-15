##############################################################
# Course Name:  Software Architecture: Design & Implementation
# Project name: Enrollment System Console Java
# Student Name: Nguyen Quang Chien
# Student ID: s3520920
##############################################################


# Main program
The main program placed in side com.company folder with Main.java file

# Design patterns

I have seperated design pattern to each package with the exactly name

+ builder
I have to used this builder pattern to create data for student and course

+ factory
This pattern is used to create program helper to get
student enrollment object from user input and get user input

+ singleton
I use this pattern to make a one object that store student enrollment details

+ template
To control flow of the program with the final method start

+ depencyinjection
I have passed student enrollment and put to the enrollment storage class to print
each item in the storage

+ iterator
This pattern let me easily to build menu

+ decorator
I use this pattern to make a validator layer, each input need to go to this to validate

+ facade
I use this pattern to make a table to print course and detail for the user

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