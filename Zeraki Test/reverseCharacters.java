// import sun.security.util.Length;

public class reverseCharacters {

    public static void main(String[] args) {
        
     String s="Good mornin";
String reverse="";

//   String r= s.split('o',4);

 for (int i =  s.length()-1; i>=0 ;i--) {
 reverse=reverse+s.charAt(i);
     
 }

    //   char r=s.charAt(3);

      System.out.println("Reverse is:"+reverse);
    }

    
}
