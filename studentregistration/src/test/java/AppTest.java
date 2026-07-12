import com.example.App; 
import org.junit.jupiter.api.Test; 
import org.junit.jupiter.api.BeforeEach; 
import static org.junit.jupiter.api.Assertions.assertEquals; 

public class AppTest { 
    App appForTest; 

    @BeforeEach
    public void initializeObject(){ 
        appForTest = new App(); 
    } 

    @Test 
    public void testAddTwoNumbers(){ 
        int result = appForTest.addTwoNumbers(2,4); 
        assertEquals(6, result); 
    } 
    @Test
    public void testAgeCheckerForFemaleBelow8(){
        assertEquals("Hello baby girl", appForTest.ageChecker("female",7));
    }
    @Test
    public void testAgeCheckerForMaleBelow18(){
        assertEquals("Hello young boy", appForTest.ageChecker("male",11));
    }
    @Test
    public void testAgeCheckerForFemaleBelow35(){
        assertEquals("Hello my lady", appForTest.ageChecker("female", 25));
    }
    @Test
    public void testAgeCheckerForSir(){
        String result = appForTest.ageChecker("female",50);
        assertEquals("Hello maam", result);
    }
    @Test
    public void testGradingMarksOfGradeA(){
        int [] marks = {20,50,80};
        String result = appForTest.gradingMarks(marks);
        assertEquals("E", result);
    }
    @Test
    public void testGradingMarksOfEmptyArray(){
        int [] marks  = {};
        String result = appForTest.gradingMarks(marks);
        assertEquals("Empty array", result);
    }
    @Test
    public void testCheckEvenArray(){
        int [] myArray = {30,28,20,80};
        String result = appForTest.checkEvenArray(myArray);
        assertEquals("Even", result);
    }
    @Test
    public void testCheckOddArray(){
        int [] myArray = {20,39,02};
        String result =appForTest.checkEvenArray(myArray);
        assertEquals("Odd", result);
    }
}
