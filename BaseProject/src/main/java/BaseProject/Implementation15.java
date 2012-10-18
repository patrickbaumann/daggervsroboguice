package BaseProject;


import javax.inject.Inject;
public class Implementation15 implements Interface15 {

    private final Interface16 dependency;

    @Inject
    public Implementation15(Interface16 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "15..." + dependency.getString();
    }
}
