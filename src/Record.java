public abstract class Record {
    private static int counter = 0;
    private int id;

    public Record() {
        counter++;
        id = counter;
    }

    public int getID() {
        return id;
    }

    public abstract void askData();


@Override
public String toString() {
    return String.format("id %d", id);
}
}

