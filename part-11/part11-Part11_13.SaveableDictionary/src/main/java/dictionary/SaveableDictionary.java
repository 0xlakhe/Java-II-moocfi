package dictionary;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SaveableDictionary {
    private Map<String,String> dictionary;

    public SaveableDictionary(){
        this.dictionary=new HashMap<>();
    }

    public void add(String words, String translation){
        this.dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word){
        for(Map.Entry<String,String> entry: this.dictionary.entrySet()){
            if(entry.getKey().equals(word)){
                return entry.getValue();
            }else if(entry.getValue().equals(word)){
                return entry.getKey();
            }
        }
        return null;
    }

    public void delete(String word){
        Iterator<Map.Entry<String,String>> entry=this.dictionary.entrySet().iterator();

        while(entry.hasNext()){
            Map.Entry<String,String> words=entry.next();

            if(words.getKey().equals(word)||words.getValue().equals(word)){
                entry.remove();
            }
        }
    }

    private String filename;

    public SaveableDictionary(String file){
        this();
        this.filename=file;
    }

    public boolean load(){
        try{
            Files.lines(Paths.get(this.filename)).map(row->row.split(":")).forEach(row->this.add(row[0], row[1]));
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        
    }

    public boolean save(){
        try {
            PrintWriter writer= new PrintWriter(this.filename);
            for(String word:this.dictionary.keySet()){
                writer.println(word+":"+this.dictionary.get(word));
            }
            writer.close();
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            return false;
        }
    }
}
