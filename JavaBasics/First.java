package JavaBasics;

public class First {
    public static void main(String[] args)
    {
        System.out.println("Hello World");
    }
}

// public static void main(String[] args)
//  -> main method is the entry point of any Java application
//  -> public: access modifier (the method is accessible from anywhere)
//  -> static: keyword (method belongs to the class, not an instance)
//  -> void: return type (the method does not return anything)
//  -> main: name of the method
//  -> String[] args: parameter (array of strings passed to the method)

// Note: The name of the class should match the name of the file
// Note: The .class file is bytecode that can be executed by the JVM
// Note: The JVM (Java Virtual Machine) is responsible for executing the bytecode
// Note: The JVM is platform independent, so the same bytecode can run on any platform

// System.out.println("Hello World")
// System: class in java.lang package
// out: static member of System class (PrintStream object)
// println: method of PrintStream class (prints the argument and moves the cursor to the next line)
// Note: The main method signature is fixed and cannot be changed
// Note: The main method is declared as public static void because:
//  -> It should be accessible from outside the class (public)
//  -> It should belong to the class, not an instance (static)
//  -> It should not return anything (void)

// Note: Java is case sensitive
// Note: Every complete Java program must have at least one class
// Note: The source code file name should match the public class name
// Note: The main method should be declared as public static void
// Note: The extension of the source code file should be .java
// Note: The class name should start with a capital letter
// Note: The main method is the entry point of any Java application
// Note: The main method signature should be exactly as above
// Note: The main method is the only method that is required to run a Java program

// Compilation and Execution of Java Program
// 1. Save the code in a file named First.java
// 2. Open a terminal and navigate to the directory where the file is saved
// 3. Compile the program using the command: javac First.java
// 4. If there are no errors, a file named First.class will be generated
// 5. Run the program using the command: java First
// 6. You should see the output: Hello World