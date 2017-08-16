
package ab_hostel;

class Room{
    int id,price;
    String name,type,availability;
    Room(int i,int p, String n, String t, String a){
        name = n;
        id = i;
        price = p;
        type = t;
        availability = a;
    }
}
class Service{
    String name,type;
    int price;
    Service(int p, String n,String t){
        name = n;
        type = t;
        price = p;
    }
}
class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    void order(manager m, Room r, Service s2){
        m.total_bill(r, s2);
    }
}
class manager{
    int id;
    String name;
    manager(int id, String name){
        this.id =id;
        this.name = name;
    }
    void total_bill(Room r, Service s2){
        if(r.type.equals("Big") && s2.type.equals(null)){
            System.out.println("Total Bill is : "+ r.price);
        }
        else if(r.type.equals("Big") && s2.type.equals("Food-Full")){
            System.out.println("Total Bill is : "+ (r.price+s2.price));
        }  
        else if(r.type.equals("Big") && s2.type.equals("Food-Half")){
            System.out.println("Total Bill is : "+ (r.price+s2.price));
        }
        else if(r.type.equals("Small") && s2.type.equals("Food-Full")){
            System.out.println("Total Bill is : "+ (r.price+s2.price));
        } 
        else{
            System.out.println("Total Bill is : "+ (r.price+s2.price));
        } 
    }
}
public class AB_Hostel {

    public static void main(String[] args) {
        // TODO code application logic here
        Room r = new Room(1, 700,"AB-Room", "Small", "Yes");
        Service s1 = new Service(1000, "Food", "Food-Full");
        Student st = new Student(1, "Abir");
        manager m = new manager(1, "Mubin");
        st.order(m, r, s1);
    }
    
}
