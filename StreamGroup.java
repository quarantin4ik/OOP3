import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamGroup implements Iterable<StudentGroup> {
    List<StudentGroup> studentGroups;

    public StreamGroup() {
        this.studentGroups = new ArrayList<>();
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        this.studentGroups.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return this.studentGroups.iterator();
    }
}
