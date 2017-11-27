package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exit=new HashMap<String,Room>();

    public Room(String description) 
    {
        this.description = description;
    }
    public void setExit(String dir,Room room) {
    	exit.put(dir, room);
    }
 
    @Override
    public String toString()
    {
        return description;
    }
    
    public String getExitDesc() {
    	StringBuffer sb =new StringBuffer();
    	for(String dir:exit.keySet()) {
    		sb.append(dir);
    		sb.append(" ");
    	}
    	return sb.toString();
    }
    public Room getExit(String direction) {
    	Room ret=exit.get(direction);
    	 
    	return ret;
    }
}
