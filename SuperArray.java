public class SuperArray{

  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
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
    if (data[data.length-1] != null){
      resize();
    }
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

  public String set(int index, String element){
    String temp = data[index];
    data[index] = element;
    return temp;
  }

  private void resize(){
    String[] arr = new String[data.length+10];
    int i = 0;
    while (i < data.length){
      arr[i] = data[i];
      i = i + 1;
    }
    data = arr;
  }

  public boolean isEmpty(){
    int i = 0;
    boolean result = true;
    while (i<data.length){
      if (data[i] != null){
        result = false;
        i = 10000;
      }
      i = i + 1;
    }
    return result;
  }

  public void clear(){
    data = new String[10];
  }

  

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
  }
}
