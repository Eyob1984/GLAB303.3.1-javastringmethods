package concat;

public class concatDemo {
  public static void main(String[] args) {
    //--- By using concat method --
    String str1 = "Learn ";
    String str2 = "Java";

    //--- concatenate str1 and str2
    System.out.println(str1.concat(str2));

    // --- concatenate str2 and str1
    System.out.println(str2.concat(str1));

    //--- By using + operator
    String s3 = "hello";
    String s4 = "Learners";
    // String s5 = s3.concat(s4); or 
    String s5 = s3 + s4;
    System.out.println(s5);
    //both of the above statement will give you the same result

    //Three Strings are concatenated
    String message = "Welcome " + "to " + "Java";
    System.out.println(message);
    //String Supplement is concatenated with character B
    String s1 = "Supplement" + 'B'; //s1 becomes SupplementB
    System.out.println(s1);
  }
}
