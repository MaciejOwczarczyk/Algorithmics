package pl.coderslab.pluralSight.structural.flyWeight;

class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
