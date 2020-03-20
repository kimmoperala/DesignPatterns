package abstractfactory;

public class TehdasBoss implements Tehdas {

	@Override
	public Vaate makeFarkut() {
		return new BossFarkut();
	}

	@Override
	public Vaate makeTpaita() {
		return new BossTpaita();
	}

	@Override
	public Vaate makeLippis() {
		return new BossLippis();
	}

	@Override
	public Vaate makeKengat() {
		return new BossKengat();
	}

}
