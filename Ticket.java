public class Ticket implements Comparable<Ticket>{
    private int id; 
    private int VIPLevel; 
    private String problem; 
    private boolean b; 
    private String name; 
    private String soln; 

    public Ticket(int num, int level, String prob, String client){
	id = num; 
	VIPLevel = level; 
	problem = prob; 
	b = false; 
	name = client; 
	soln = null; 
    }

    public int getID(){
	return id; 
    }

    public int getVIP(){
	return VIPLevel; 
    }

    public String getProblem(){
	return problem; 
    }
    
    public String getName(){
	return name; 
    }

    public boolean isSolved(){
	return b;
    }
    
    public void done(){
	b = true; 
    }

    public void setSoln(String solution){
	soln = solution; 
    }

    public int compareTo(Ticket other){
	if ( this.getVIP() < other.getVIP() ){
	    return -1; 
	}
	else if ( this.getVIP() > other.getVIP() ){
	    return 1; 
	}
	else{
	    return 0; 
	}
    }

    public String toString(){
	String ret = "\n\n";
	ret += "ID: " + id + "\n";
	ret += "Name: " + name + "\n";
	ret += "Problem: " + problem + "\n";
	ret += "Solution: " + soln;
	return ret;
    }
}
