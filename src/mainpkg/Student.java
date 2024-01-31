package mainpkg;

public class Student {
    int id;
    String name;
    float cgpa;

    public Student() {
        id=0; name="TBA"; cgpa=0.0f;
    }

    
    
    public Student(int id, String name, float cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    
    String getStringEquivalent(){
        return "ID=" + id + ", Name=" + name + ", CGPA=" + cgpa;
    }
}
