echo"# reverse-a-string">>README.md git init git add README.md git commit-m"first commit"git branch-M main git remote add origin https://github.com/Molly-12/reverse-a-string.git
git push-u origin main

//recurive solution for reversing a string
import java.util.*;

class Solution {
    public static String rev(String s) {
        if (s.isEmpty()) { // checking the base condition of the string is empty or not
            return s;
        } else {

            return rev(s.substring(1)) + s.charAt(0); // recursive call for reversing a string
        }
    }

    public static void main(String[] args) { // main function
        Scanner sc = new Scanner(System.in);

        String s = sc.next(); // reading input

        System.out.println("The reverse string is: " + rev(s)); // calling the recursive function and printing the
                                                                // output

    }
}
