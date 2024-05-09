package structural.decorator.B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStopwords extends TokenDecorator{
    ArrayList stopwords;
    public RemoveStopwords(Tokenize token) {
        super(token);
        stopwords = new ArrayList(Arrays.asList("và", "thì", "mà", "là", "nhưng", "được"));
    }

    @Override
    public List<String> tokenize() {
        List<String> list = token.tokenize();
        list.removeAll(stopwords);
        return list;
    }
}
