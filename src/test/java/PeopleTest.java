import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PeopleTest {

    @Test
    public void testAdd(){
        Person person = new Person(345,"Nate");
        List<Person> listOfPeople = new ArrayList<>();
        People people = new People();

        people.add(person);

        Assert.assertTrue(people.contains(person));
    }


    @Test
    public void testRemove(){
        Person person = new Person(345,"Nate");

        List<Person> listOfPeople = new ArrayList<>();

        People people = new People();

        people.add(person);

        listOfPeople.add(person);


        people.remove(345);

        List<Person> expected = listOfPeople;
        List actual = people.personList;

        Assert.assertEquals(expected,actual);


    }

    @Test
    public void testFindById(){
        Person person = new Person(345, "Nate");
        List<Person> listOfPeople = new ArrayList<>();

        listOfPeople.add(person);
        People people = new People();
        people.findById(345);



        Person expected = person;
        Person actual = people.findById(345);

        Assert.assertEquals(expected,actual);

    }



}
