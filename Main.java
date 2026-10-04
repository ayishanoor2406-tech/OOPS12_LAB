import java.util.*;
class Event {
int id;
String name, date, venue;
int seats;
Event(int id, String name, String date, String venue, int seats) {
this.id = id;
this.name = name;
this.date = date;
this.venue = venue;
this.seats = seats;
}
void display() {
System.out.println(id + " " + name + " " + date +
" " + venue + " Seats: " + seats);
}
}
public class CollegeEventManagement {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<Event> events = new ArrayList<>();
events.add(new Event(1, "Tech Fest", "12-09-2026",
"Auditorium", 100));
events.add(new Event(2, "Cultural Fest", "20-09-2026",
"Open Stage", 150));
events.add(new Event(3, "AI Workshop", "28-09-2026",
"Seminar Hall", 50));
System.out.println("=== COLLEGE EVENT MANAGEMENT SYSTEM ===");
System.out.println("\nAvailable Events:");
System.out.println("ID Event Name Date Venue Seats");
for (Event e : events) {
e.display();
}
System.out.print("\nEnter Event ID to register: ");
int id = sc.nextInt();
sc.nextLine();
System.out.print("Enter Student Name: ");
String student = sc.nextLine();
for (Event e : events) {
if (e.id == id) {
if (e.seats > 0) {
e.seats--;
System.out.println("\nRegistration Successful!");
System.out.println("Student: " + student);
System.out.println("Event: " + e.name);
System.out.println("Date: " + e.date);
System.out.println("Venue: " + e.venue);
System.out.println("Remaining Seats: " + e.seats);
} else {
System.out.println("Sorry! No seats available.");
}
return;
}
}
System.out.println("Invalid Event ID.");
}
}
