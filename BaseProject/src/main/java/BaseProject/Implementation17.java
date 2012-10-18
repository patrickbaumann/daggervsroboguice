package BaseProject;


import javax.inject.Inject;
public class Implementation17 implements Interface17 {

    private final Interface18 dependency;

    @Inject
    public Implementation17(Interface18 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "17..." + dependency.getString();
    }
}
