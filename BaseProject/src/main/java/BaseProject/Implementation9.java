package BaseProject;


import javax.inject.Inject;
public class Implementation9 implements Interface9 {

    private final Interface10 dependency;

    @Inject
    public Implementation9(Interface10 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "9..." + dependency.getString();
    }
}
