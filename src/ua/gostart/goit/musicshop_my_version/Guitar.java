package ua.gostart.goit.musicshop_my_version;

public class Guitar extends MusicalInstrument {

    String name;

    public Guitar(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return "guitar";
    }

    @Override
    String getName() {
        return name;
    }
}