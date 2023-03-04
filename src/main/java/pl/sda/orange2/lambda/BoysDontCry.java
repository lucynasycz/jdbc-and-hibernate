package pl.sda.orange2.lambda;

// It's funktional interface because has one abstract method
@FunctionalInterface
public interface BoysDontCry {

    //abstrakcyjne metody (a ta ponizej jest public abstract) nie maja ciala
    void silnoreki();

    // jak jest default to musi miec ciało i nie jest abstrakcyjna
    default void cry() {}

}
