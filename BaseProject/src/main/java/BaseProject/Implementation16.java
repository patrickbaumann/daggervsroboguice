package BaseProject;


import javax.inject.Inject;
public class Implementation16 implements Interface16 {

    private final Interface17 dependency;

    @Inject
    public Implementation16(Interface17 dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return "16..." + dependency.getString();
    }
}
