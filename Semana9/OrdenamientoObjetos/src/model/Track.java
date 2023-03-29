package model;

public class Track implements Comparable<Track>{

    private String name;
    private int duration;

    public Track(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int compareTo(Track track) {
        int result = 0;
        result = this.name.compareTo(track.getName());
        if(result == 0){
            result = this.duration - track.getDuration();
        }
        return result;
    }
}
