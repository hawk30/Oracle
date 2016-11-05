package hackerarnk;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by oracle on 20/10/16.
 */
public class Queue_stack {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

    public static class MyQueue<T> {
        Stack<T> stack1 = new Stack<T>();
        Stack<T> stack2 = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stack1.push(value);

        }

        public T peek() {
          if(stack2.isEmpty()){
              while(!stack1.isEmpty())
                  stack2.push(stack1.pop());
              return stack2.peek();
          }
            return stack2.peek();


        }

        public T dequeue() {
            if(stack2.isEmpty()){
                while(!stack1.isEmpty())
                    stack2.push(stack1.pop());
                return stack2.pop();
            }
            return stack2.pop();



        }
    }
}








