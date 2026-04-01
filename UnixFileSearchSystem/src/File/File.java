package File;

import java.util.HashSet;

public class File {
    String name;
    int size;
    String owner;
    boolean isDirectory;
    HashSet<File> entries = new HashSet<>();

    public File(String name, int size, String owner, boolean isDirectory){
        this.isDirectory = isDirectory;
        this.size = size;
        this.owner = owner;
        this.name = name;
    }

    public Object extract(FileAttribute fa){
        if(fa.equals(FileAttribute.FILE_NAME)){
            return name;
        }else if(fa.equals(FileAttribute.SIZE)){
            return size;
        }else if(fa.equals(FileAttribute.OWNER)){
            return owner;
        }else if(fa.equals(FileAttribute.IS_DIRECTORY)){
            return isDirectory;
        }else{
            throw new IllegalArgumentException("Wrong Type");
        }
    }

    public void addEntry(File entry){
        entries.add(entry);
    }

    public HashSet<File> getEntryFiles(){
        return this.entries;
    }

    public String getName(){
        return this.name;
    }
}
