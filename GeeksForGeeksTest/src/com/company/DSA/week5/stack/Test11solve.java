package com.company.DSA.week5.stack;

import java.util.Stack;


/*
******************************************
Infix to Postfix
* ****************************************
 */

/*
Given an infix expression in the form of a string str. Conver this infix expression to postfix expression.

Infix expression: The expression of the form a op b. When an operator is in-between every pair of operands.
Postfix expression: The expression of the form a b op. When an operator is followed for every pair of operands.
 */

public class Test11solve {


    public static String infixToPostfix(String exp) {
        // Your code here

        String ans="";

        Stack<Character> st = new Stack<>();

        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                ans = ans+ch;
            }else if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans = ans + st.pop();
                }
                st.pop();
            }else{
                while(!st.isEmpty() && Prec(ch)<=Prec(st.peek()) ){
                    ans = ans+st.pop();
                }
                st.push(ch);
            }




        }

        while(!st.isEmpty()){
            ans = ans + st.pop();
        }
        return ans;

    }


    static int Prec(Character ch){
        if(ch=='+' || ch == '-'){
            return 1;
        }else if(ch=='/' || ch=='*'){
            return 2;
        }else if(ch=='^'){
            return 3;
        }else{
            return -1;
        }
    }

}
