package hackerarnk;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by oracle on 17/10/16.
 */
public class Brackets {
    static boolean isBalanced(String expression) {
        char[] arr=expression.toCharArray();
        Stack<Character> st= new Stack<>();
        for(char k: arr){
            if(k=='(') st.push(')');
            else if(k=='{') st.push('}');
            else if(k=='[') st.push(']');
            else{
                if(st.isEmpty() || k!=st.peek())
                    return false;
                st.pop();
            }

        }
            return st.empty();

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if (answer)
                System.out.println("YES");
            else System.out.println("NO");
        }

    }
}