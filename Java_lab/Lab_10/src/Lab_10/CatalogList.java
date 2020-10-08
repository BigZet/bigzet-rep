package Lab_10;

import java.io.File;

public class CatalogList {
    private String PATH;
    private String[] elements;
    private File dir;
    private String dir_name;

    public CatalogList(String path){
        PATH=path;
        dir = new File(PATH);
        dir_name=dir.getName();
        elements=dir.list();

    }
    private void addElement(String e){

        String[] temp = new String[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            temp[i]=elements[i];
        }
        temp[temp.length-1]=e;
        elements=temp;
    }

    public String to_String(){
        String text="";
        for (int i = 0; i < 5; i++) {
            if (i> elements.length-1)break;
            text+=elements[i]+"\n";
        }
        return text;
    }

    public String get(int index){
        if (index>= elements.length){
            System.err.println("Не существует элемента с таким индексом");
            return null;
        }
        else {
            return elements[index];

        }
    }
}
