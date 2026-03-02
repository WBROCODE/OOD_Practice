public class Duck implements Comparable<Duck>{
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return "Duck: " + name + " " + weight;
    }

    public int compareTo(Duck other) {
        if(this.weight > other.weight) {
            return 1;
        }else if(this.weight < other.weight) {
            return -1;
        }else return 0;
    }
}
