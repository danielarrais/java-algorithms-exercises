package src.main.algoritms.trainload.change;

public class Change {
    private final int cubeId;
    private final ChangeType changeType;

    private Change(int cubeId, ChangeType changeType) {
        this.cubeId = cubeId;
        this.changeType = changeType;
    }

    public static Change of(int cubeId, ChangeType changeType) {
        return new Change(cubeId, changeType);
    }

    public int getCubeId() {
        return cubeId;
    }

    public ChangeType getChangeType() {
        return changeType;
    }
}
