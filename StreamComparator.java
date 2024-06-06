import java.util.Comparator;

public class StreamComparator implements Comparator<StreamGroup> {
    @Override
    public int compare(StreamGroup o1, StreamGroup o2) {
        return Integer.compare(o1.studentGroups.size(), o2.studentGroups.size());
    }
}
