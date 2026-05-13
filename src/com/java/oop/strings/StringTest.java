package com.java.oop.strings;
import com.java.oop.Customer;
import com.java.oop.Product;
public class StringTest{
    StringTest(){
        System.out.println("My String constructor");
    }
    public static void main(String[] args) {
        //com.java.oop.strings.String
        StringTest str = new StringTest();
        Product product = new Product();
        System.out.println(product);
        System.out.println(str);

        String str1 = new String();
        System.out.println("str1: " + str1);
        char[] chars = {'a', 'b', 'c'};
        String str2 = new String(chars);
        System.out.println("str2: " + str2);
        String str3 = new String("abc");
        System.out.println("str3: " + str3);

        String str4 = str2;
        System.out.println("str4: " + str4);
        System.out.println(str2 == str4);
        System.out.println(str2 == str3);

        String str5 = "abc"; //String literal
        String str6 = "abc";
        System.out.println(str5 == str6);

        //String objects are immutable
        System.out.println(chars.length);
        System.out.println(str5.length());
        System.out.println(str5.charAt(1));
        System.out.println(str5.compareToIgnoreCase("aBc"));
        String name = "John";
        //System.out.println((name.concat(", how are you?")));
        name = name.concat(", how are you?");
        System.out.println(name);
        String username = "abc:xyz";
        String pasword = "abcd@123";
        if (username.isEmpty() || pasword.isEmpty()) {
            System.out.println("Enter the details");
        }
        if (username.equalsIgnoreCase("Akhil") && pasword.equals("abcd@123"))
            System.out.println("login successful");
        else
            System.out.println("login failed ! Invalid Credentials");

        String usernamePattern = "^[a-zA-Z0-9_]{4,15}$";
        System.out.println(username.matches(usernamePattern));

        String customerData = "1,JohnDoe,johndoe@gmail.com,123-456-7890";

        String[] data = customerData.split(",");
        Customer customer = new Customer();
        //String -> Primitives
        customer.id = Integer.parseInt(data[0]);
        customer.name = data[1];
        customer.email = data[2];
        System.out.println("Customer Id : " + customer.id);
        System.out.println("Customer Name : " + customer.name);
        System.out.println("Customer Email : " + customer.email);

        String password1 = "           Abcd @123           ";
        System.out.println(password1.length());
        //chained method invocation
        System.out.println(password1.trim().length());
        int phoneNo = 324234;
        System.out.println( String.valueOf(phoneNo));
    }
}
