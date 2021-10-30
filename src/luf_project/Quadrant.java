package luf_project;

public class Quadrant {
    Placeable[][] sector;
    int sectorX, sectorY;
    int kingons, starbases, stars;

    public Quadrant (int sectorX, int sectorY) {
        sector = new Placeable[8][8];


    }

    public String getKBS() {
        return "";
    }

    public boolean hasEnterprise() {
        return false;
    }

    public void putEnterprise(int sx, int sy) {

    }

    public void putKlingon(int sx, int sy) {

    }

    public void putStarbase(int sx, int sy) {

    }

    public void removeEnterprise() {

    }

    public void removeKlingon(int sx, int sy) {

    }
}
