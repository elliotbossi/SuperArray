public class Demo{
  public static void removeDuplicates(SuperArray s){
    int i = s.size()-1;
    while (i >= 0){
      if (i != s.indexOf(s.get(i))){
        s.remove(i);
      }
      i = i - 1;
    }
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }
}
