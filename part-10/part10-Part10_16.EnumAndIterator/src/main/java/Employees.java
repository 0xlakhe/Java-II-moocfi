import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> persons;

    public Employees(){
        this.persons=new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.persons.add(personToAdd);
    }

    public void add(List<Person> personToAdd){
        Iterator<Person> iterator=personToAdd.iterator();
        while(iterator.hasNext()){
            this.persons.add(iterator.next());
        }
    }

    public void print(){
        this.persons.stream().forEach(p->System.out.println(p));
    }

    public void print(Education education){
        // this.persons.stream().filter(p->p.getEducation()==education).forEach(p->System.out.println(p));
        Iterator<Person> iterator=this.persons.iterator();

        while (iterator.hasNext()) {
            Person person=iterator.next();
            if(person.getEducation()==education){
                System.out.println(person);
            }
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator=this.persons.iterator();
        
        while (iterator.hasNext()) {
            Person person=iterator.next();
            if(person.getEducation()==education){
                iterator.remove();
            }
        }
    }
}
