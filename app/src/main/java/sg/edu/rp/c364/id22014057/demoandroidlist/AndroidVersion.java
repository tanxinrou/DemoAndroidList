package sg.edu.rp.c364.id22014057.demoandroidlist;

public class AndroidVersion {
    String name;
    String version;

    public AndroidVersion(String name, String version){
        this.name = name;
        this.version = version;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion(){
        return name;
    }

    public void setVersion(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name + ": " + version;
    }

}
