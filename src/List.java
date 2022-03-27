import java.util.ArrayList;
import java.util.Arrays;

public class List <T> {
    int capacity;
    int a = 10;
    static int count = 0;



    T[] list;

    public List() {
        this.list =(T[]) new list[10];
    }

    public List(int capacity) {
        this.capacity = capacity;
        a = capacity;
    }


    public T add(T data){
        if (list.length == a){
            this.a = a*2;
            list.add(data);
            count++;
        }else{
            list.add(data);
            count++;
        }
        return null;
    }



    public void showArray(){
        for (T i:list) {
            System.out.println(i);
        }
    }


    public void size(){
        System.out.println("Eleman Sayısı: "+list.size());

        
    }

    public void arrayCapacity(){
        System.out.println("Listenin Kapasitesi: "+ a);
    }

    public T get(int data){
        return list.get(data);
    }

    public T remove(int data){
        return list.remove(data);
    }

    public T set(int data,T veri){
        return list.set(data,veri);
    }

    public String toString(){
        System.out.print("[");
        for (T i:list) {
            System.out.print(i+",");
        }
        System.out.println("]");
        return "";
    }

    public boolean isEmpty(){
        if (list.size() == 0){
            return true;
        }else{
            return false;
        }
    }

    public int indexOf(int data){
        return list.indexOf(data);
    }

    public int lastIndexOf(int data){
        int k = 0;
        int l = list.size()-1;
        while(l>0){
            if (list.get(l).equals(data)){
                k = l;
                break;
            }
            l--;
        }
        return k;
    }


    public T[] toArray(){
        return Arrays.copyOf(list);
    }




}
