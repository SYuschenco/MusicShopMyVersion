package ua.gostart.goit.musicshop_my_version;

class Trumpet extends MusicalInstrument {

    String name;

    public Trumpet(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return "trumpet";
    }

    @Override
    String getName() {
        return name;
    }

}
