package prac_11;

import java.util.ArrayList;

public abstract class AbstractOperation {
    Variable var;

    protected abstract void DO();

    protected void addVar(Variable var){
        this.var = var;
    }
    

}
