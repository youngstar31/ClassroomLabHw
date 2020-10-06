import java.util.Iterator;
import java.util.List;

public class People implements Iterable{

    List<Person> personList;




    public People(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }



    public List<Person> add(Person person){
        personList.add(person);
        return personList;

    }
    public Person findById(long id){
        for (Person p : personList){
           if (p.getId() == id){
               return p;

           }
        }
        return null;
    }

    public boolean contains(Person person){
        if (personList.contains(person)){
            return true;
        } else {
            return false;
        }

    }

    public void remove(Person person){
        if (personList.contains(person)){
            personList.remove(person);
        }
    }

    public void remove(long id){
        for (Person person : personList){
            if (person.getId() == id){
                personList.remove(person);
            }
        }
    }

    public void removeAll(){
        personList.removeAll(personList);
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return (Person[]) personList.toArray();
    }

    @Override
    public Iterator iterator() {
        return personList.iterator();
    }
}
