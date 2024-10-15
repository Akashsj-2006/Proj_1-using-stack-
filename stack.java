import java.util.Scanner;

class Stack {
    int top = 0;
    int cap;
    char[] arr;

    Stack(int c) {
        cap = c;
        arr = new char[cap]; 
    }

    void push(char x) {
        if (top == cap) {
            System.out.println("The stack is full");
            return;
        }
        arr[top++] = x;  
    }

    char pop() {
        if (top == 0) {
            System.out.println("The stack is empty");
            return '\0';  
        }
        return arr[--top];  
    }

    void display() {
        if (top == 0) {
            System.out.println("The stack is empty");
            return;
        }
        System.out.println("The stack elements:");
        for (int i = 0; i < top; i++) {
            System.out.print(arr[i] + " "); 
        }
        System.out.println();  
    }
}

public class Main {
    public static void main(String[] args) {
        int c, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the stack: ");
        c = sc.nextInt();
        Stack s = new Stack(c);  

        do {
            System.out.print("Enter the element to push into the stack: ");
            char ip = sc.next().charAt(0);  
            s.push(ip);
            System.out.print("Do you want to continue? (0/1): ");
            i = sc.nextInt();
        } while (i != 0);
	

        s.display();
        sc.close(); 
    }
}
