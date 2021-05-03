public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Merve", "AYAZ", "133", "1521");
        Instructor instructor1 = new Instructor(1, "Engin","DEMİROĞ","124", "C#");

        StudentManager sManager = new StudentManager();
        InstructorManager iManager = new InstructorManager();
        UserManager userManager = new UserManager();


        sManager.joinCourses(student1);
        sManager.homeworkStatus(student1);

        iManager.createCourse(instructor1);
        iManager.deleteCourse(instructor1);

        userManager.add(student1);
        userManager.delete(instructor1);
        
    }
}
