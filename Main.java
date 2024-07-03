public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World Fuck you America!");
    //Operations 
    boolean x = true;
    System.out.println(((Object)x).getClass().getSimpleName());
    //Finding Area a rectangle
    int length = 4;
    int width = 10;
    int area = length * width;
    System.out.println("Area :" +area);
    System.out.println("//Type Casting"); // Type Casting 
    System.out.println("//byte -> short -> char -> int -> long -> float -> double");//byte -> short -> char -> int -> long -> float -> double
    int type_1 = 10;
    byte type_2 = (byte) type_1;
    System.out.println(((Object)type_1).getClass().getSimpleName());
    System.out.println(((Object)type_2).getClass().getSimpleName());

    //string handling using java
    String str1 = "Hello";
    System.out.println("The str1 has a string length of " +str1.length());//strlen

    System.out.println("ToUpperCase :" +str1.toUpperCase());//toUpperCase()
    System.out.println("ToLowerCase :" +str1.toLowerCase());//toLowerCase()
    
    //finding character in a string --------> use indexOf()
    System.out.println("Locate \"O\" in Hello :" +str1.indexOf('o'));

    //concatenation of string 
    System.out.println(x + str1);

    //math operations
    System.out.println(Math.max(length, width)); //Math.max()
    System.out.println(Math.min(length, width)); //Math.min()
    System.out.println(Math.sqrt(length)); //Math.sqrt()
    //math abs 
    System.out.println(Math.abs(-101.47)); //Math.abs()
    System.out.println((int) (Math.random() * 101)); //Math.random()

    //SHORT HAND IF ELSE
    String result = (length > width) ? "Greater" : "Smaller";
    System.out.println(result);
    int i = 0;
    //DO WHILE 
    do {
      System.out.println("Hi");
      i++;
    }while(i<10);

    //for LOOPING

    for(int j = 0 ; j<=5 ;j++){
      System.out.println("Round :" +j);
    }

    //for each LOOPING
  String cars[] = {"VOLVO", "BMW", "BENZ", "FROZA"};
  for( String k : cars){
    System.out.println(k);
  }
  }
}
