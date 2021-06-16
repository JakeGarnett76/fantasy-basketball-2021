package Summer.Test;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Test {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;

    String entry;


    Test() {
    }

    Test(int id, String entry ){
        this.id = id;
        this.entry = entry;
    }


    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setEntry(String entry){
        this.entry = entry;
    }

    public String getEntry(){
        return entry;
    }
}
