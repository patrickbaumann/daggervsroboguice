package BaseProject;


import javax.inject.Inject;
public class Implementation8 implements Interface8 {

    private final Interface9 dependency;

    @Inject
    public Implementation8(Interface9 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "8..." + dependency.getString();
    }
}
