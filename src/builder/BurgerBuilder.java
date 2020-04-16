package builder;

abstract class BurgerBuilder {
	
	public abstract Object getBurger();
	public abstract void createNewBurger();
	
	public abstract void buildBread();
	public abstract void buildSteak();
	public abstract void buildOnion();
	public abstract void buildMayonnese();
}
