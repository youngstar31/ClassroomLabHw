import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void constructorTest(){
        Person person = new Person(3472, "Khari");

        String expected = person.getName();
        String actual = "Khari";

        long expectedId = person.getId();
        long actualId = 3472;

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedId,actualId);

    }

    @Test
    public void setNameTest(){

        Person person = new Person(4960, "");
        person.setName("Zaire");

        String expected = person.getName();
        String actual = "Zaire";

    }
}
