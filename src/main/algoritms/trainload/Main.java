package src.main.algoritms.trainload;

import src.main.algoritms.trainload.cube.Cube;
import src.main.algoritms.trainload.cube.CubeChangeManager;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CubeChangeManager cubeChangeManager = new CubeChangeManager();
        Set<Cube> cubes = Set.of(
                new Cube(1, Position.of(10, 15)),
                new Cube(2, Position.of(10, 15)),
                new Cube(3, Position.of(10, 15)),
                new Cube(4, Position.of(10, 15)),
                new Cube(5, Position.of(10, 15)),
                new Cube(6, Position.of(10, 15))
        );

        Train<Cube> train = new Train<>(cubes, cubeChangeManager);

        var cube1 = train.getItemById(1);
        train.putItem(cube1);

        var cube2 = train.getItemById(2);
        cube2.setPosition(Position.of(20, 15));
        train.putItem(cube2);

        if (train.childrenPlayedWithTheItems()) {
            System.out.println("The cubes are played");
        } else {
            System.out.println("The cubes are not played");
        }
    }
}
