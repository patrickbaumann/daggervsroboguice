package BaseProject;


import javax.inject.Inject;
public class Implementation1 implements Interface1 {

    private final Interface2 dependency;

    @Inject
    public Implementation1(Interface2 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "1..." + dependency.getString();
    }
}
