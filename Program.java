// Создать класс Студент
// � Создать класс УчебнаяГруппа
// � Создать класс УчебнаяГруппаИтератор, заставив его реализовать
// интерфейс Iterator
// � Реализовать его контракты (включая удаление)

import java.util.Iterator;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        StudentGroup studentGroup = new StudentGroup();

        Student ivan = new Student("Ivan");
        Student igor = new Student("Igor");
        Student alex = new Student("Alex");


        studentGroup.addStudent(ivan);
        studentGroup.addStudent(igor);
        studentGroup.addStudent(alex);

        // System.out.println("студенты " + studentGroup.students);
        // Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        for(Student student: studentGroup) {
            System.out.println(student);
        }
    }

}