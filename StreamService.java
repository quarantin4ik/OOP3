import java.util.List;
import java.util.stream.Collectors;

public class StreamService {
    public List<StreamGroup> sortStreamGroups(List<StreamGroup> streamGroups) {
        return streamGroups.stream()
                .sorted(new StreamComparator())
                .collect(Collectors.toList());
    }
}