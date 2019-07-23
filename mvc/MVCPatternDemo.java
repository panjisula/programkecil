package mvc;

public class MVCPatternDemo{
    public static void main(String[] args){
        //memanggil student record berdasarkan pada roll no dari database
        Student model = retrieveStudentFromDatabase();

        //Membuat view : untuk menampilkan details student ke konsol.
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //meng-update model data
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}