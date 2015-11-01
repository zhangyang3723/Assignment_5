package assignment_5_YangZhang;

import java.util.Stack;


public class ValidString {
    public boolean isValid(String s) throws InvalidInputException {
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        stack.push(charArray[0]);
        for (int i = 1; i < charArray.length; i++) {
            if (validInput(charArray) == false || s.equals("")) {
                throw new InvalidInputException();
            }
            if (!stack.empty() && ((charArray[i] == ')' && stack.peek() == '(')
                    || (charArray[i] == ']' && stack.peek() == '[')
                    || (charArray[i] == '}' && stack.peek() == '{'))) {
                stack.pop();
            } else {
                stack.push(charArray[i]);
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }

    /*
     * method to check if the input is valid
     */
    public static boolean validInput(char[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] != '(' && array[i] != ')' && array[i] != '[' && array[i] != ']'
                    && array[i] != '{' && array[i] != '}') {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) throws InvalidInputException {
        ValidString test = new ValidString();
        boolean b = test.isValid("[{()}]()[()]");
        System.out.println(b);

    }

}
