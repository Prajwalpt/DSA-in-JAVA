import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ProjectReport {
    //creating Event class to get values of Event like date, type, machine, user
    public static class Event{
        private LocalDateTime date;
        private String type;
        private String machine;
        private String user;
        
        //Constructor to set values of attributes
        public Event(LocalDateTime eventDate, String eventType, String machineName, String user){
            this.date = eventDate;
            this.type = eventType;
            this.machine = machineName;
            this.user = user;
        }
        
        public LocalDateTime getDate(){
            return date;
        }

        public String getType(){
            return type;
        }

        public String getMachine(){
            return machine;
        }

        public String getUser(){
            return user;
        }
    }
    //**********************************************************************************************************//
    
    //method and class to sort events by date
    public static class EventSorter{
        public static void sortEventsByDate(List<Event> events){
            Collections.sort(events, Comparator.comparing(Event::getDate));
        }
    }

    //**********************************************************************************************************//
    public static class MachineTracker{
        public static Map<String,Set<String>> currentUser(List<Event> events){
            //sort events by dates
            EventSorter.sortEventsByDate(events);

            //Map to store machine name and users logged in
            Map<String,Set<String>> machines = new HashMap<>();

            //process each event
            for(Event event : events){
                String machine = event.getMachine();
                String user = event.getUser();
                String type = event.getType();
                
                //initialize set for a machine if it doesn't exist
                machines.putIfAbsent(machine, new HashSet<>());

                if (type.equals("login")) {
                    machines.get(machine).add(user);
                }
                else if (type.equals("logout")) {
                    machines.get(machine).remove(user);
                }
            }
            return machines;
        }
    }
    //**************************************************************************************************************//
    public static class ReportGenerator{
        public static void generateReport(Map<String,Set<String>> machines){
            for(Map.Entry<String,Set<String>> entry: machines.entrySet()){
                String machine = entry.getKey();
                Set<String> users = entry.getValue();
                if (!users.isEmpty()) {
                    String userList = String.join(",", users);// Join users into a comma-separated string
                    System.out.println("The machine and users are:");
                    System.out.println(machine + ": "+ userList);
                }
            }
        }
    }
    //*****************************************************************************************************************//

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //create a List of events
        List<Event> events = new ArrayList<>();

        events.add(new Event(LocalDateTime.parse("2024-01-21 12:45:56", formatter), "login", "myworkstation.local", "jordan"));
        events.add(new Event(LocalDateTime.parse("2024-01-22 15:53:42", formatter), "logout", "webserver.local", "jordan"));
        events.add(new Event(LocalDateTime.parse("2024-01-21 18:53:21", formatter), "login", "webserver.local", "lane"));
        events.add(new Event(LocalDateTime.parse("2024-01-22 10:25:34", formatter), "logout", "myworkstation.local", "jordan"));
        events.add(new Event(LocalDateTime.parse("2024-01-21 08:20:01", formatter), "login", "webserver.local", "Prajwal"));
        events.add(new Event(LocalDateTime.parse("2024-01-23 11:24:35", formatter), "logout", "mailserver.local", "chris"));
        
        // Process events to find current users
        Map<String,Set<String>> users = MachineTracker.currentUser(events);
        
        //Generate Report
        ReportGenerator.generateReport(users);
    }
}
