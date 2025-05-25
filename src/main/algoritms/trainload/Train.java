package src.main.algoritms.trainload;

import src.main.algoritms.trainload.abs.LoadItem;
import src.main.algoritms.trainload.abs.LoadItemChangesManager;
import src.main.algoritms.trainload.change.ChangeType;

import java.util.*;
import java.util.stream.Collectors;

public class Train<T extends LoadItem> {
    private final Map<Integer, T> items;
    private final Map<Integer, Position> itemsOriginalPositions;
    private final LoadItemChangesManager itemChangeManager;

    public Train(Set<T> items, LoadItemChangesManager itemChangeManager) {
        this.items = items.stream().collect(Collectors.toMap(T::getID, item -> item));
        this.itemsOriginalPositions = items.stream().collect(Collectors.toMap(T::getID, T::getPosition));
        this.itemChangeManager = itemChangeManager;
    }

    public T getItemById(int id) {
        T item = this.items.remove(id);
        itemChangeManager.registerChange(item.getID(), ChangeType.TOOK);
        return item;
    }

    public void putItem(T item) {
        if (!itemsOriginalPositions.containsKey(item.getID())) {
            addItem(item);
            return;
        }

        verifyPositionOfItem(item);

        itemChangeManager.registerChange(item.getID(), ChangeType.RETURN);
        items.put(item.getID(), item);
    }

    public boolean childrenPlayedWithTheItems() {
        var itemsPlayed = itemChangeManager.hasChanges();
        var itemsCountWasChanged = items.size() != itemsOriginalPositions.size();

        return itemsPlayed || itemsCountWasChanged;
    }

    private void addItem(T item) {
        items.put(item.getID(), item);
        itemChangeManager.registerChange(item.getID(), ChangeType.ADD);
    }

    private void verifyPositionOfItem(T item) {
        var originalPosition = itemsOriginalPositions.get(item.getID());
        if (!originalPosition.equals(item.getPosition())) {
            itemChangeManager.registerChange(item.getID(), ChangeType.MOVE);
        }
    }
}
