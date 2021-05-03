public class StudentManager {
    
    public void joinCourses(Student student)
    {
        System.out.println("Kursa kayıt başarılı");
    }

    public void homeworkStatus(Student student)
    {
        System.out.println("Ödev tamamlandı :" + student.getName() + " "+ student.getStudentNumber());
    }
}
