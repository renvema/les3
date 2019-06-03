public final class ComplexNumber {
    private final double re;
    private final double im;

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        boolean objEqualsResult = a.equals(b);
        System.out.println(objEqualsResult);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof ComplexNumber) {
            ComplexNumber numberObj = (ComplexNumber) obj;
            if (this.re != numberObj.re) return false;
            if (this.im != numberObj.im) return false;
            return true;
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Double.hashCode(re) * 19 - Double.hashCode(im) + 17;
    }


}
