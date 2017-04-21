public class HelpDesk{

    private ArrayPriorityQueue<Ticket> q;
    private ArrayList<Ticket> dataBase;
    
    public String solve(){
	q.peekMin().done();
	q.removeMin();
	return "done!";
    }
    public String next(){
	return q.peekMin().getName() + ": " + q.peekMin().getID();
    }
    public void addP(int level, ){
	
    }
    
}
