(0..30).each do |val|

    puts "@Provides Interface"+val.to_s+" getInterface"+val.to_s+"(Interface"+(val+1).to_s+" dep){
        return new Implementation"+val.to_s+"(dep);
    }"

end
