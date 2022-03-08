package aayush.assignment.data;

public class Data {
    int num;
    char character;

    public void printInfo(){
        System.out.println(num);
        System.out.println(character);
    }
    public void printLocal(){
        int n;
        char ch;
        System.out.println(n);
        System.out.println(ch);
        // compilation error because local variable is not initialized
        //  cannot print values of local variables without initialising them.
        // Class member variables and static variables do get a default value but not variables used within your method code.
    }
}
