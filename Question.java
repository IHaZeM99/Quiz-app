import java.lang.reflect.Array;

public class Question {
    private int current;
    private String[] questions = {
        "1.Which keyword is used to define a constant in Java?",
        "2.What is the purpose of the main method in a Java class?",
        "3.Which of the following data types is used to store whole numbers in Java?",
        "4.What is the term used to describe the process of creating an object from a class?",
        "5.Which operator is used for string concatenation in Java?"
    };
    private String[][] answers = {
        {"a) static","b) final","c) const","d) immutable"},
        {"a) To initialize instance variables.",
        "b) To define the class constructor.",
        "c) To serve as the entry point for program execution.",
        "d) To declare class methods."},
        {"a) float",
        "b) double",
        "c) boolean",
        "d) int"},
        {"a) Inheritance",
        "b) Polymorphism",
        "c) Instantiation",
        "d) Abstraction"},
        {"a) .",
        "b) +",
        "c) &",
        "d) ||"}
    };
    private int[] correctAnswers = {1,2,3,2,1}; 

    public Question(){
        current = 0;
    }

    public int getcurr(){
        return current;
    }
    public String getCurrQue(){
        return questions[current];
    }
    public String[] getCurrAns(){
        return answers[current];
    }
    public int getCorrectAns(){
        return correctAnswers[current];
    }
    public void increaseCurr(){
        current++;
    }
    public String[] getQueArr(){
        return questions;
    }
    public void setcurr(int n){
        current = n;
    }
}
