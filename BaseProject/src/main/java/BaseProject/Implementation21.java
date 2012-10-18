package BaseProject;


import javax.inject.Inject;
public class Implementation21 implements Interface21 {

    private final Interface22 dependency;

    @Inject
    public Implementation21(Interface22 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "21..." + dependency.getString();
    }
}
