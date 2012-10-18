package BaseProject;


import javax.inject.Inject;
public class Implementation12 implements Interface12 {

    private final Interface13 dependency;

    @Inject
    public Implementation12(Interface13 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "12..." + dependency.getString();
    }
}
