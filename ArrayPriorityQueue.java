
import java.util.ArrayList;
import java.lang.RuntimeException;

public class ArrayPriorityQueue<T extends Comparable<T>> implements APQInter<T>{
    
    private ArrayList<T> _data;
    
    public ArrayPriorityQueue(){
	_data = new ArrayList<T>();
    }
    
    public void add(T x){
	_data.add(x);
    }//O(1)
    
    public boolean isEmpty(){
	return _data.size() == 0;
    }//O(1)
    
    public T peekMin(){
	if (isEmpty()){
	    throw new RuntimeException();
	}
	T x = _data.get(0);
	for (int i = 1; i < _data.size(); i ++){
	    if (_data.get(i).compareTo(x) < 0){
		x = _data.get(i);
	    }
	}
	return x;
    }//O(n)
    
    public T removeMin(){
	if (isEmpty()){
	    throw new RuntimeException();
	}
	T x = _data.get(0);
	int index = 0;
	for (int i = 1; i < _data.size(); i ++){
	    if (_data.get(i).compareTo(x) < 0){
		x = _data.get(i);
		index = i;
	    }
	}
	_data.remove(index);
	return x;
    }//O(n)
    
    public String toString(){
	return _data.toString();
    }
    
    public static void main(String[] args){
	ArrayPriorityQueue<Integer> bob = new ArrayPriorityQueue();
	bob.add(9);
	bob.add(18);
	bob.add(7);
	bob.add(1);
	System.out.println(bob);
	System.out.println(bob.peekMin());//1
	System.out.println(bob.removeMin());
	System.out.println(bob);
	System.out.println(bob.peekMin());//7
	System.out.println(bob.removeMin());
	System.out.println(bob);
	System.out.println(bob.peekMin());//9
	System.out.println(bob.removeMin());
	System.out.println(bob);
	System.out.println(bob.peekMin());//18
	System.out.println(bob.removeMin());
	System.out.println(bob);
	System.out.println(bob.peekMin()); //should throw exception
    }

}
