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

  public static SuperArray zip(SuperArray a, SuperArray b){
    int i = 0;
    int l = 0;
    int s = 0;
    SuperArray result = new SuperArray();
    if (a.size() > b.size()){
      i = 0;
      l = a.size();
      s = b.size();
      while (i < s){
        result.add(a.get(i));
        result.add(b.get(i));
        i = i + 1;
      }
      i = s;
      while (i < l){
        result.add(a.get(i));
        i = i + 1;
      }
    }
    else {
      i = 0;
      l = b.size();
      s = a.size();
      while (i < s){
        result.add(a.get(i));
        result.add(b.get(i));
        i = i + 1;
      }
      i = s;
      while (i < l){
        result.add(b.get(i));
        i = i + 1;
      }
    }
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

    SuperArray c = new SuperArray();
    SuperArray d = new SuperArray();
    d.add("a");
    d.add("b");
    d.add("c");
    d.add("d");
    d.add("e");
    d.add("f");

    c.add("0");
    c.add("1");
    c.add("2");
    c.add("3");

    System.out.println(findOverlap(a,b));
    System.out.println(zip(c,d));
    }
}
