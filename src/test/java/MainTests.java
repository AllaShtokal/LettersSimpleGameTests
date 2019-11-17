import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * Project name: LettersTests
 * User: Alla
 * Date: 17.11.2019
 * Time: 10:25
 */
public class MainTests {

    @Test
    public void isLatinLetterTest() {

        assertTrue("K is latin letter, must be true", Main.isLatinLetter('K'));
        assertTrue("A is latin letter, must be true", Main.isLatinLetter('A'));
        assertTrue("Z is latin letter, must be true", Main.isLatinLetter('Z'));

    }

    @Test
    public void generateBetweenTest() {
        int num = Main.generateBetween(Constants.FIRST, Constants.LAST);
        //System.out.println(num);
        assertTrue("Generated number is out of the range", num >= Constants.FIRST && num <= Constants.LAST);


    }

    @Test
    public void isUppercaseTest() {
        assertTrue("Symbol is not casted to Uppercase", Character.isUpperCase(Main.toUppercase('r')));
    }


}
