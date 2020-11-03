public class SuperArray{

  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[2];
  }

  public int size(){
    int i = 0;
    size = 0;
    while (i<data.length){
      if (data[i] != null){
        size = size + 1;
      }
      i = i + 1;
    }
    return size;
  }

  public boolean add(String element){
    int i = 0;
    while (i<data.length){
      if (data[i] == null){
        data[i] = element;
        i = 10000;
      }
      i = i + 1;
    }
    return true;
  }

  public String get(int index){
    return data[index];
    }
  



}
