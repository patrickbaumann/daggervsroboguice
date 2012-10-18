package BaseProject;


import javax.inject.Inject;
public class Implementation24 implements Interface24 {

    private final Interface25 dependency;

    @Inject
    public Implementation24(Interface25 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "24..." + dependency.getString();
    }
}
