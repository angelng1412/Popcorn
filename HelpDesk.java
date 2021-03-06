import java.util.ArrayList;

public class HelpDesk{

    private ArrayPriorityQueue<Ticket> q;
    private ArrayList<Ticket> dataBase;
    private int counter;

    public HelpDesk(){
	q = new ArrayPriorityQueue<Ticket>();
	dataBase = new ArrayList<Ticket>();
	counter = 0;	
    }
    
    public String next(){
	return q.peekMin().getName() + ": " + q.peekMin().getID();
    }
    
    public void addP(int level, String problem, String name){
	Ticket tic = new Ticket(counter, level, problem, name);
	q.add(tic);
	counter ++;
    }

    public void solve(){
	Ticket sol = q.removeMin();
	sol.setSoln("Unplug your machine, and then plug it back in");
	sol.done();
	dataBase.add(sol);
	System.out.println(sol);
    }

    public int size(){
	return q.size();
    }

    public int sizeData(){
	return dataBase.size();
    }
    
}
