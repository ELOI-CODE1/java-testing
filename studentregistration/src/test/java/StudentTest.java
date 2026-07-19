import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.domain.Gender;
import com.example.domain.Student;
import com.example.service.StudentService;

public class StudentTest {
    

    StudentService service = new StudentService();


    @Test
    public void saveStudentTest(){
        Student oneStudent = new Student();
        oneStudent.setId(1);
        oneStudent.setFirstName("Eric");
        oneStudent.setLastName("Mubi");
        oneStudent.setGender(Gender.MALE);
        oneStudent.setDateOfbirth("12/10/2013");

        String result = service.saveStudent(oneStudent);
        assertEquals("Student saved successfuly", result);

    }
}
