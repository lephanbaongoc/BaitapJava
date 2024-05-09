package structural.decorator.B2;

public abstract class TokenDecorator implements Tokenize{
    Tokenize token;

    public TokenDecorator(Tokenize token) {
        this.token = token;
    }

}
