package structural.decorator.B2;

import java.util.ArrayList;
import java.util.List;

public class RemovePunctuation extends TokenDecorator{
    public RemovePunctuation(Tokenize token) {
        super(token);
    }

    @Override
    public List<String> tokenize() {
        List<String> list = token.tokenize();
        list.replaceAll(s -> s.replaceAll("\\p{Punct}", ""));
        return list;
    }
}
