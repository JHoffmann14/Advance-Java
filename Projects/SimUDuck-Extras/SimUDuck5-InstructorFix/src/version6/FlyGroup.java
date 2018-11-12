package version6;

/**
 * This interface exists to define a group of ducks that are also
 * part of the DuckGroup
 * 
 * @author Instlogin
 */
public interface FlyGroup extends DuckGroup {
    public abstract void performFly();
    public abstract void setFlyBehavior(FlyStrategy fb);
}
