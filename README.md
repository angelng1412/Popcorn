# Team Popcorn
### Tiffany Moi, Caleb Smith-Salzberg, Angel Ng
## Our Design
Out HelpDesk is designed with the Ticket as the fundamental unit. When a help request is submitted, the VIPLevel, problem, and name attributes are taken note of. This information is added on to a ticket. In addition to this, we utilized an ArrayPriorityQueue that contains the generated tickets. We believe this implementation of a help desk makes it easiest to visualize and edit.
## Description of Classes
1. APQInter.java

Generically typed interface that is implemented in ArrayPriorityQueue.

2. ArrayPriorityQueue.java	

Implements APQInter.java, and is a subclass to the Comparable class. Contains an ArrayList as its datatype (in the helpdesk the ArrayList contains tickets). The important methods of this class involve selecting the minimum element, using compareTo(). Any object T used in the ArrayList has a .compareTo() method, as it is inherited from the Comparable class. 

3. Ticket.java	

A Ticket is essential to the helpdesk. An instance of Ticket has an int ID, an int VIPlevel, a string problem, a "solved" boolean, string name, and a string soln. There is an accessor for each attribute, and although many are not used for the helpdesk currently, we anticipate that further implementations could utilize these accessors. The Ticket class also includes the compareTo() method, which compares the int values of VIPlevel.

4. HelpDesk.java	

When a Ticket is added to the HelpDesk, its contents are in turn added to a ArrayPriorityQueue. A problem can also be solved in the HelpDesk. Funnily enough, it seems the solution is always, "Unplug your machine, and then plug it back in".

### Embellishment

5. Driver.java

A user can use the helpdesk using the driver file. We trust the user to be truthful in stating his/her VIPlevel, and the user can either add a problem, or solve a problem. The problems are given by priority of course, and due to the design of an ArrayList, if a VIPlevel of two or more tickets is the same, the ticket added first will be solved first, in a FIFO fashion. One aspect we would like to expand on is an actual database of problems and solutions. At the moment, every time the driver is run, all problems and solutions are wiped, defeating the purpose of a helpdesk.


