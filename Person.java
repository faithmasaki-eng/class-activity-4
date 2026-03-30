import java.io.Serializable;

// Define the Display interface
interface Display {
    void display();
}

// Abstract class Person implementing Display and Serializable
abstract class Person implements Display, Serializable {
    private static final long serialVersionUID = 1L;

    // Abstract method from Display interface
    public abstract void display();

    // You can add other methods and properties specific to Person here
}