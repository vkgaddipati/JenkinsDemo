public class Palindrome{

 public static void main(String[] args){

  String originalString = "civic";
  String reverseString = "";

   for (int i=originalString.length() - 1; i>=0; i--){
	reverseString += originalString.charAt(i);
}
   if(originalString.equals(reverseString)){
	System.out.println("This is palindrome");
} else{
	System.out.println("This is not palindrome");
}


}

}

