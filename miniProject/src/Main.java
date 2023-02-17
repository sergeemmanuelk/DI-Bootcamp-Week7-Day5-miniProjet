import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Question[] questions = {
                new Question("What is hardware? \n (a) virtual machine \n (b) the physical machine \n (c) applications such as browsers \n (d) part of the processor \n", "b"),
                new Question("What does counter++; do? \n (a) Adds 1 to counter \n (b) Adds 2 to counter \n (c) Gets the sum \n (d) Multiplies the numbers \n", "a"),
                new Question("What is a loop that never stops? \n (a) For Loop \n (b) Infinite Loop \n (c) Do-While Loop \n (d) Full Loop \n", "b"),
                new Question("In a while loop, if the boolean expression is true, what will the loop do? \n (a) Break \n (b) Program will exit \n (c) Repeat \n (d) Continue through program \n", "c"),
                new Question("What special value is designated for controlling a loop? \n (a) Control value \n (b) Mutator Method \n (c) Accessor Method \n (d) Sentinel Value \n", "d"),
                new Question("What is a method? \n (a) A collection of statements grouped together to perform an operation \n (b) A value returned from a method using the return statement \n (c) The portion of the program where the variable can be accessed. \n (d) The combination of the name of a method and the list of its parameters \n", "a"),
                new Question("What is an object? \n (a) Representation of an entity in the real world that can be distinctly identified \n (b) A static method can be called without creating an instance of the class \n (c) Instance variable/instance method \n (d) A template, blueprint or contract that defines what an object's data fields and methods will be. \n", "d"),
                new Question("What is an array? \n (a) Numbers of items ArrayList can store without increasing its size \n (b) Number used as an index to pinpoint a specific element within an array \n (c) Object that can store a group of values, all of the same type \n (d) Method of locating a specific item in a larger collection of data \n", "c"),
                new Question("You use this statement to throw an exception manually. \n (a) Throw \n (b) Call stack \n (c) Try block \n (d) Thrown \n", "a"),
                new Question("When an exception is generated, it is said to have been what? \n (a) Created \n (b) Called \n (c) Thrown \n (d) Generated \n", "c")
        };

        int score = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].getPrompt());
            String userAnswer = sc.nextLine();
            if (userAnswer.equals(questions[i].getAnswer())) {
                score++;
            }
        }

        System.out.println("You got " + score + " out of " + questions.length + " correct.");
    }
}