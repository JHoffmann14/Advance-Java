package version6;

/**
 * This interface exists to define a group of ducks that are also
 * part of the DuckGroup
 * 
 * @author Instlogin
 */
public interface QuackGroup extends DuckGroup {
    public abstract void performQuack();
    public abstract void setQuackBehavior(QuackStrategy qb);
}
