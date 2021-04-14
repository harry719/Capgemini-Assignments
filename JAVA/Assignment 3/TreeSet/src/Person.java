import java.util.Set;
import java.util.TreeSet;


public class Person implements Comparable<Person>{
    private int height;
    private int weight;
    private String name;

    public Person(int height, int weight, String name) {
        super();
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person p) {

        if(this.weight==p.getWeight()) {
        	
            return 1;
        }
        else if (this.weight>p.getWeight()){
            return -1;

        }
        else {   
        	if(this.height==p.getHeight()) {
        		return 1;
        	}
        	else if(this.height==p.getHeight()) {
        		return -1;
        	}
        	else {

        return 0;}
        	}
    }
    public static void main(String[] args) {
        Set<Person> s=new TreeSet<Person>();
        Person p1=new Person(80, 65, "gaurav jain");

        Person p2=new Person(82, 72, "hari kripal");

        Person p3=new Person(70, 98, "ekta malani");

        Person p4=new Person(85, 65, "kartik");
        s.add(p1);
        s.add(p2);
        s.add(p3);
        s.add(p4);

        for(Person p:s){
            System.out.println("Result:->"+p.weight+p.name);

        }
    }
}
