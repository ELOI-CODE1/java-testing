import com.example.domain.Gender;
import com.example.domain.Student;
import com.example.service.StudentService;

public class StudentTest {
    

    StudentService service = new StudentService();

    public void saveStudentTest(){
        Student oneStudent = new Student();
        oneStudent.setId(1);
        oneStudent.setFirstName("Eric");
        oneStudent.setLastName("Mubi");
        oneStudent.setGender("male");
        oneStudent.setDateOfbirth("12/10/2013");

        String result = service.saveStudent(oneStudent);
        
    }
}
