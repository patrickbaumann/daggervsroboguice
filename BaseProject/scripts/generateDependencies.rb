PACKAGE_NAME = "BaseProject"

def generate(name)

    class_name = "Implementation"+name.to_s
    interface_name = "Interface"+name.to_s
    dependency_name ="Interface"+(name+1).to_s

    File.open("../src/main/java/BaseProject/" + interface_name + ".java", "w") do |file|
        file.puts "package " + PACKAGE_NAME + ";

public interface " + interface_name + " {
    String getString();
}"
    end

    File.open("../src/main/java/BaseProject/" + class_name + ".java", "w") do |file|
        file.puts "package " + PACKAGE_NAME + ";


import javax.inject.Inject;
public class " + class_name + " implements " + interface_name + " {

    private final "+dependency_name+" dependency;

    @Inject
    public " + class_name + "("+dependency_name+" dependency){
        this.dependency = dependency;
    }

    @Override
    public String getString(){
        return \"" + name.to_s + "...\" + dependency.getString();
    }
}"
    end
end



(0..30).each do |name|
    generate(name)
end
