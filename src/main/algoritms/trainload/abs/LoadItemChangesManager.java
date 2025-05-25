package src.main.algoritms.trainload.abs;

import src.main.algoritms.trainload.change.Change;
import src.main.algoritms.trainload.change.ChangeType;

import java.util.List;

public interface LoadItemChangesManager {
    void registerChange(Integer cubeId, ChangeType changeType);
    List<Change> getChanges();
    boolean hasChanges();
}
