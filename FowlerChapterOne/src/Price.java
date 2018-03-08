
abstract class Price {
	public abstract int getPriceCode();
	public abstract double getCharge(int daysRented);
	public int getFrequenterRenterPoints(int daysRented) {
		return 1;
	}
}

class ChildrensPrice extends Price {
	@Override
	public int getPriceCode() {
		return Movie.CHILDRENS;
	};
	
	@Override
	public double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;
	}

	@Override
	public int getFrequenterRenterPoints(int daysRented) {
		return 1;
	}
}

class NewReleasePrice extends Price {
	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	};
	
	@Override
	public double getCharge(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int getFrequenterRenterPoints(int daysRented) {
		if (daysRented > 1)
			return 2;
		return 1;
	}
}

class RegularPrice extends Price {
	@Override
	public int getPriceCode() {
		return Movie.REGULAR;
	};
	
	@Override
	public double getCharge(int daysRented) {
		double result = 2;
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
		return result;
	}

	@Override
	public int getFrequenterRenterPoints(int daysRented) {
		return 1;
	}
}
