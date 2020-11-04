import java.util.Arrays;
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

  public String toString(){
    int i = 0;
    int x = 0;
    int index = -1;
    String[] temp = data;
    while (i < data.length){
      if (data[i] == null){
        index = i;
        i = 10000;
      }
      i = i + 1;
    }
    if (index == -1){
      return Arrays.toString(temp);
    }
    else {
      String[] arr = new String[index];
      while (x<index){
        arr[x] = data[x];
        x = x + 1;
      }
      return Arrays.toString(arr);
    }
  }

  public boolean contains(String s){
    int i = 0;
    boolean result = false;
    while (i<data.length){
      if (data[i] == s){
        result = true;
      }
      i = i + 1;
    }
    return result;
  }

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
  }

  public void add(int index, String element){
    String[] arr = new String[data.length+1];
    int x = 0;
    while (x < index){
      arr[x] = data[x];
      x = x + 1;
    }
    int i = index;
    arr[i] = element;
    i = i + 1;
    while (i<data.length+1){
      arr[i] = data[i-1];
      i = i + 1;
    }
    data = arr;
  }

  public String remove(int index){
    String returned = data[index];
    String[] arr = new String[data.length-1];
    int x = 0;
    while (x < index){
      arr[x] = data[x];
      x = x + 1;
    }
    int i = index;
    while (i<data.length-1){
      arr[i] = data[i+1];
      i = i + 1;
    }
    data = arr;
    return returned;
  }



}
