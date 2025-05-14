package src.main.trainload.abs;

import src.main.trainload.change.Change;
import src.main.trainload.change.ChangeType;

import java.util.List;

public interface LoadItemChangesManager {
    void registerChange(Integer cubeId, ChangeType changeType);
    List<Change> getChanges();
    boolean hasChanges();
}
