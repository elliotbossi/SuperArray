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

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray result = new SuperArray();
    int i = 0;
    while (i<a.size()){
      if ((b.contains(a.get(i))) && (a.contains(a.get(i)))){
        result.add(a.get(i));
      }
      i = i + 1;
    }
    removeDuplicates(result);
    return result;
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    SuperArray a = new SuperArray();
    SuperArray b = new SuperArray();
    a.add("9");
    a.add("1");
    a.add("2");
    a.add("2");
    a.add("3");
    a.add("4");

    b.add("0");
    b.add("4");
    b.add("2");
    b.add("2");
    b.add("9");
    System.out.println(findOverlap(a,b));
    }
}
