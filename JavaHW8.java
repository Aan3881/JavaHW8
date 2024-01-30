public class TeacherService {
    private List<Teacher> teachers;

    public TeacherService() {
        teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void editTeacher(Teacher teacher) {
        // Код для редактирования учителя
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}

public class TeacherView {
    private TeacherService teacherService;

    public TeacherView(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public void displayTeachers() {
        List<Teacher> teachers = teacherService.getTeachers();
        // Код для отображения списка учителей
    }
}

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void createTeacher() {
        // Код для создания нового учителя
        teacherService.addTeacher(newTeacher);
    }

    public void editTeacher() {
        // Код для редактирования учителя
        teacherService.editTeacher(selectedTeacher);
    }

    public void displayTeachers() {
        teacherView.displayTeachers();
    }
}

