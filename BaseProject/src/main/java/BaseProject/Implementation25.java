package BaseProject;


import javax.inject.Inject;
public class Implementation25 implements Interface25 {

    private final Interface26 dependency;

    @Inject
    public Implementation25(Interface26 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "25..." + dependency.getString();
    }
}
