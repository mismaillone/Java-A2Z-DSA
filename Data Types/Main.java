import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int result = dataTypes(type);
        System.out.println(result);
    }

    public static int dataTypes(String type) {
        if (type.equals("Float")) 
       return 4;
   else if (type.equals("Long")) {
      return 8;
   }
  else if (type.equals("Double")) {
      return 8;
  }
  else if (type.equals("Integer")) {
  return 4;
  }
  else if (type.equals("Character")) {
      return 1;
  }
   return 0;
}
}