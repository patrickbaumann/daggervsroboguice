package BaseProject;


import javax.inject.Inject;
public class Implementation22 implements Interface22 {

    private final Interface23 dependency;

    @Inject
    public Implementation22(Interface23 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "22..." + dependency.getString();
    }
}
