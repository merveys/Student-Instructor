public class InstructorManager {
    
    public void createCourse(Instructor instructor)
    {
        System.out.println("Kurs oluşturuldu :"+  instructor.getCourses());
    }

    public void deleteCourse(Instructor instructor)
    {
        System.out.println("Kurs başarıyla sinlindi :" +  instructor.getCourses());
    }

}
