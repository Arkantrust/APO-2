package model;

public class Artist implements Comparable<Artist>{

    private Track track;
    private String name;

    public Artist(Track track, String name) {
        this.track = track;
        this.name = name;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Artist artist) {
        return this.track.compareTo(artist.getTrack());
    }
}
