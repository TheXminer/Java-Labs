class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
        simplify();
    }

    public Fraction add(Fraction other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction subtract(Fraction other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return new Fraction(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}

class MixedNumber extends Fraction {
    private int wholePart;

    public MixedNumber(int wholePart, int numerator, int denominator) {
        super(numerator, denominator);
        this.wholePart = wholePart;
        normalize();
    }

    public int getWholePart() {
        return wholePart;
    }

    public void setWholePart(int wholePart) {
        this.wholePart = wholePart;
    }

    private void normalize() {
        if (Math.abs(getNumerator()) >= getDenominator()) {
            wholePart += getNumerator() / getDenominator();
            setNumerator(getNumerator() % getDenominator());
        }
    }

    @Override
    public String toString() {
        if (getNumerator() == 0) {
            return String.valueOf(wholePart);
        } else if (wholePart == 0) {
            return super.toString();
        } else {
            return wholePart + " " + Math.abs(getNumerator()) + "/" + getDenominator();
        }
    }
}
