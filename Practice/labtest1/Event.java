package Practice.labtest1;

public abstract class Event {

    String eventId;
    String eventName;
    String eventDate;
    
    public Event(String eventId, String eventName, String eventDate){
        this.eventId = eventId;
        this.eventDate = eventDate;
        this.eventName = eventName;
    }

    public String geteventId(){
        return eventId;
    }

    public String geteventName(){
        return eventName;
    }

    public String geteventDate(){
        return eventDate;
    }

    public abstract void displayEventDetails();
}

class Concert extends Event{

    String bandName;

    Concert(String eventId, String eventName, String eventDate, String bandName){
        super(eventId,eventName, eventDate);
        this.bandName = bandName;
    }

    public void displayEventDetails(){
        System.out.println("Concert - ID: " + eventId + ", Name: " + eventName + ", Date: " + eventDate + ", Band: " + bandName);
    }
}

class Workshop extends Event{

    String topic;
    String instructor;

    Workshop(String eventId, String eventName, String eventDate, String topic, String instructor){
        super(eventId,eventName, eventDate);
        this.topic = topic;
        this.instructor = instructor;
    }

    public void displayEventDetails(){
        System.out.println("Concert - ID: " + eventId + ", Name: " + eventName + ", Date: " + eventDate + ", Topic: " + topic + ", Instructor: " + instructor);
    }
}

class SportsGame extends Event{

    String gameType;
    
    SportsGame(String eventId, String eventName, String eventDate, String gameType){
        super(eventId,eventName, eventDate);
        this.gameType = gameType;
    }

    public void displayEventDetails(){
        System.out.println("Concert - ID: " + eventId + ", Name: " + eventName + ", Date: " + eventDate + ", Type: " + gameType);
    }
}


class EventManager<T extends Event>{
    private list<T> events;

    public EventManager(T event){
        
    }
}

class EventManagementSystem{
    public static void main(String[] args) {
        
    }
}

