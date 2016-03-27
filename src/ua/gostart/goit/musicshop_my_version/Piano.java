package ua.gostart.goit.musicshop_my_version;

public class Piano extends MusicalInstrument {


    String name;

    public Piano(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return "piano";
    }

    @Override
    String getName() {
        return name;
    }
}