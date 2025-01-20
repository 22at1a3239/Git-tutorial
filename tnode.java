import java.util.*;
public class tnode<t> {
    ArrayList<tnode<t>>children;
    t data;
    tnode(t data){
        this.data=data;
        this.children=new ArrayList<>();
    }
}
