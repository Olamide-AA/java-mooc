package Archive;

public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }

    public boolean equals(Object compared) {
        if (this == (compared)) {
            return true;
        }
        if (!(compared instanceof Archive)) {
            return false;
        }
        Archive comparedArchive = (Archive) compared;
        return (this.identifier.equals(comparedArchive.identifier));
    }

    @Override
    public String toString() {
        return this.name + " is held at identifier " + this.identifier;
    }
}