// Создать класс Студент
// � Создать класс УчебнаяГруппа
// � Создать класс УчебнаяГруппаИтератор, заставив его реализовать
// интерфейс Iterator
// � Реализовать его контракты (включая удаление)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        StudentGroup studentGroup = new StudentGroup();
        StudentGroup studentGroup1 = new StudentGroup();
        StudentGroup studentGroup2 = new StudentGroup();
        StudentGroup studentGroup3 = new StudentGroup();
        StudentGroup studentGroup4 = new StudentGroup();
        StudentGroup studentGroup5 = new StudentGroup();


        Student van = new Student("Van", 4);
        Student igor = new Student("Igorechick", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 8);
        Student alexa = new Student("Alexa", 5);
        Student li = new Student("Li", 7);
        Student fedor = new Student("fedor", 9);
        Student katya = new Student("Katya", 3);
        Student rita = new Student("Rita", 10);
        Student mihail = new Student("Mihail", 6);


        studentGroup.addStudent(van);
        studentGroup.addStudent(igor);
        studentGroup.addStudent(alex);
        studentGroup1.addStudent(alexey);
        studentGroup1.addStudent(alexa);
        studentGroup2.addStudent(li);
        studentGroup2.addStudent(fedor);
        studentGroup2.addStudent(katya);
        studentGroup2.addStudent(rita);
        studentGroup2.addStudent(mihail);
        studentGroup3.addStudent(van);
        studentGroup3.addStudent(igor);
        studentGroup3.addStudent(alex);
        studentGroup3.addStudent(alexey);
        studentGroup3.addStudent(alexa);
        studentGroup4.addStudent(li);
        studentGroup4.addStudent(fedor);
        studentGroup4.addStudent(katya);
        studentGroup5.addStudent(rita);
        studentGroup5.addStudent(mihail);

        // System.out.println("студенты " + studentGroup.students);
        // Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        for(Student student: studentGroup) {
            System.out.println(student);
        }

        ArrayList<Student> arrayList = new ArrayList<>(List.of(van, igor, alex, alexey));

        System.out.println(arrayList);

        // public int compare(Student o1, Student o2) {
        //     return o1.id - o2.id;
        // }
        Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id); // лямда выражение

        // Collections.sort(arrayList, new StudentComparator()); // сортировка, второй аргумент обратная сортировка
        System.out.println(arrayList);

        StreamGroup stream1 = new StreamGroup();
        StreamGroup stream2 = new StreamGroup();
        StreamGroup stream3 = new StreamGroup();

        stream1.addStudentGroup(studentGroup);
        stream1.addStudentGroup(studentGroup1);
        stream2.addStudentGroup(studentGroup4);
        stream3.addStudentGroup(studentGroup2);
        stream3.addStudentGroup(studentGroup3);
        stream3.addStudentGroup(studentGroup1);

        List<StreamGroup> streamGroups = new ArrayList<>();
        streamGroups.add(stream1);
        streamGroups.add(stream2);
        streamGroups.add(stream3);

        StreamService streamService = new StreamService();
        List<StreamGroup> sortedStreamGroups = streamService.sortStreamGroups(streamGroups);

        for (StreamGroup streamGroup : sortedStreamGroups) {
            System.out.println("Поток включает " + streamGroup.studentGroups.size() + " группу(ы)");
        }
    }

}