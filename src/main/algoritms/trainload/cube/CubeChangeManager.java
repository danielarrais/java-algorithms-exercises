package src.main.algoritms.trainload.cube;

import src.main.algoritms.trainload.abs.LoadItemChangesManager;
import src.main.algoritms.trainload.change.Change;
import src.main.algoritms.trainload.change.ChangeType;

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
