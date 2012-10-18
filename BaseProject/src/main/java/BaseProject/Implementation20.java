package BaseProject;


import javax.inject.Inject;
public class Implementation20 implements Interface20 {

    private final Interface21 dependency;

    @Inject
    public Implementation20(Interface21 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "20..." + dependency.getString();
    }
}
