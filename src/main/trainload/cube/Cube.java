package src.main.trainload.cube;

import src.main.trainload.Position;
import src.main.trainload.abs.LoadItem;

public class Cube implements LoadItem {
    private final int id;
    private Position position;

    public Cube(int id, Position position) {
        this.id = id;
        this.position = position;
    }

    public int getID() {
        return id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Cube cube = (Cube) o;
        return id == cube.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
