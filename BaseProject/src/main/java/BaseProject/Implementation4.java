package BaseProject;


import javax.inject.Inject;
public class Implementation4 implements Interface4 {

    private final Interface5 dependency;

    @Inject
    public Implementation4(Interface5 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "4..." + dependency.getString();
    }
}
