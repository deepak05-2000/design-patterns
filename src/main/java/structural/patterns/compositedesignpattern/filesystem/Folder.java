package structural.patterns.compositedesignpattern.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {

    private String name;
    private List<FileSystem> childrens = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(FileSystem child) {
        childrens.add(child);
    }

    public void remove(FileSystem child) {
        childrens.remove(child);
    }


    @Override
    public void ls(String indent) {
        System.out.println(indent + "+ Folder: " + name);
        for(FileSystem obj : this.childrens) {
            obj.ls(indent + "  ");
        }
    }
}
