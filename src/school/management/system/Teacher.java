package school.management.system;

// This class is responsible for keeping the
// track of teacher's name, id, salary.

public class Teacher {

    private int id;
    private String name;
    private int salary;

    // Create a new Teacher object.
    // @param id - id for the teacher.
    // @param name - name of the teacher.
    // @param salary - salary of the teacher.

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // @return the id of the teacher.
    public int getId() {
        return id;
    }

    // @return name of the teacher.
    public String getName() {
        return name;
    }

    // @return the salary of the teacher.
    public int getSalary() {
        return salary;
    }

    // Update the salary
    // @param salary
    public  void setSalary(int salary) {
        this.salary = salary;
    }

}
