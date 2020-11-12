import java.util.Arrays;
public class SuperArrayTester {

  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    System.out.println(words.isEmpty());
    for(int i = 0; i < words.size(); i++){
      System.out.println(words.get(i));
    }
    words.clear();
    System.out.println(words.isEmpty());
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    System.out.println(words.toString());
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("kani");
    System.out.println(words.toString());
    words.add(3,"test");
    System.out.println(words.toString());
    System.out.println(words.indexOf("test"));
    words.remove(3);
    System.out.println(words.toString());
    System.out.println(words.indexOf("test"));
    System.out.println(Arrays.toString(words.toArray()));
        try {
            SuperArray z;
            z = new SuperArray(-1);
        }
        catch (IllegalArgumentException e) {
            System.out.println("cannot be negative");
        }

        try {
            words.get(-1);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("cannot be out of range");
        }

        try {
            words.set(-1,"a");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("cannot be out of range");
        }

        try {
            words.add(-1,"a");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("cannot be out of range");
        }

        try {
            words.remove(-1);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("cannot be out of range");
        }



    }
  }
