package src.main.trainload.cube;

import src.main.trainload.abs.LoadItemChangesManager;
import src.main.trainload.change.Change;
import src.main.trainload.change.ChangeType;

import java.util.ArrayList;
import java.util.List;

public class CubeChangeManager implements LoadItemChangesManager {
    private final List<Change> cubesChanges;

    public CubeChangeManager() {
        this.cubesChanges = new ArrayList<>();
    }

    public void registerChange(Integer cubeId, ChangeType changeType) {
        this.cubesChanges.add(Change.of(cubeId, changeType));
    }

    public List<Change> getChanges() {
        return cubesChanges;
    }

    public boolean hasChanges() {
        return !cubesChanges.isEmpty();
    }
}
