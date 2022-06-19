class ReverseString {

    //most effiecent version using StringBuilder object - copied from community
    String reverse(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }
  
}
