package BaseProject;


import javax.inject.Inject;
public class Implementation11 implements Interface11 {

    private final Interface12 dependency;

    @Inject
    public Implementation11(Interface12 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "11..." + dependency.getString();
    }
}
