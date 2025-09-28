package structural.patterns.compositedesignpattern.filesystem;

public class File implements FileSystem {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void ls(String indent) {
        System.out.println(indent + "- File: " + name);
    }
}
