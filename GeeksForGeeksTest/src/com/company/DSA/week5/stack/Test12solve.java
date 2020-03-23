package com.company.DSA.week5.stack;


/*
*****************************************************
Evaluation of Postfix Expression
* ***************************************************
 */

/*
Given a postfix expression, the task is to evaluate the expression and print the final value. Operators will only include the basic arithmetic operators like *,/,+ and -.
 */

import java.util.Stack;

public class Test12solve {

    public static int evaluatePostFix(String exp){
        // Your code here


        Stack<Integer> st = new Stack<>();

        for(int i=0;i<exp.length();i++){

            char ch = exp.charAt(i);

            if(Character.isDigit(ch)){
                int temp = ch-'0';

                st.push(temp);
            }else{
                int b = st.peek();
                st.pop();
                int a = st.peek();
                st.pop();

                if(ch=='+'){
                    st.push(a+b);
                }else if(ch=='-'){
                    st.push(a-b);
                }else if(ch=='*'){
                    st.push(a*b);
                }else if(ch=='/'){
                    st.push(a/b);
                }

            }
        }
        return st.pop();

    }

}
