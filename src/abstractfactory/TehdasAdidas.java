package abstractfactory;

public class TehdasAdidas implements Tehdas{

	@Override
	public Vaate makeFarkut() {
		return new AdidasFarkut();
	}

	@Override
	public Vaate makeTpaita() {
		return new AdidasTpaita();
	}

	@Override
	public Vaate makeLippis() {
		return new AdidasLippis();
	}

	@Override
	public Vaate makeKengat() {
		return new AdidasKengat();
	}

}
