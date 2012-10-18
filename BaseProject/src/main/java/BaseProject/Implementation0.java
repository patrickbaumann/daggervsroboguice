package BaseProject;


import javax.inject.Inject;
public class Implementation0 implements Interface0 {

    private final Interface1 dependency;

    @Inject
    public Implementation0(Interface1 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "0..." + dependency.getString();
    }
}
