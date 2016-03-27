package ua.gostart.goit.musicshop_my_version;

public abstract class MusicalInstrument {
    String typeName;
    public abstract String getType();
    abstract String  getName();

    @Override
    public String toString() {
        return "MusicalInstrument{"+getType()+"}";
    }
}