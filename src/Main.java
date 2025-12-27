public class Main {
    public static void main(String[] args) {

        Department csDept = new Department("ФКН", "CS");

        Lecturer lecturer = new Lecturer();
        lecturer.setName("проф. Кургалин С.Д.");
        lecturer.setDepartment(csDept);

        DepartmentHead head = new DepartmentHead();
        head.setName("Крыловецкий А.А.");
        head.setHeadsDepartment(csDept);

        System.out.println("--- Университетская система ---");
        System.out.println("Преподаватель: " + lecturer.getName());
        System.out.println("Факультет: " + csDept.getName());
        System.out.println("Декан факультета: " + head.getName());
        
        System.out.println("\n--- Дополнительно ---");

        if (head.getHeadsDepartment() != null) {
            System.out.println(head.getName() + " является деканом факультета: " +
                    head.getHeadsDepartment().getName());
        }
        if (lecturer.getDepartment() != null) {
            System.out.println("Преподаватель "+ lecturer.getName() +" работает на факультете: " +
                    lecturer.getDepartment().getName());
        }
    }
}