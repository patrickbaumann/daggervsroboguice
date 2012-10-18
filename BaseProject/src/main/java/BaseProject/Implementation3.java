package BaseProject;


import javax.inject.Inject;
public class Implementation3 implements Interface3 {

    private final Interface4 dependency;

    @Inject
    public Implementation3(Interface4 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "3..." + dependency.getString();
    }
}
