package faustop.core.vars;

public class Integer_ extends Variable {

	private int value;

    public Integer_(String pName, String pValue) {
        super(pName, "INTEGER");
		this.setValue(pValue);
    }

    public int getValue() {
        return this.value;
    }

	public void setValue(String pValue) {
		this.value = Integer.parseInt(pValue);
	}

    public String greaterThan(int pValue) {
		String ans = Boolean.toString(this.getValue() > pValue);
        return ans;
    }

    public String lessThan(int pValue) {
		String ans = Boolean.toString(this.getValue() < pValue);
        return ans;
    }

    public String greaterThanOrEqualTo(int pValue) {
		String ans = Boolean.toString(this.getValue() >= pValue);
        return ans;
    }

    public String lessThanOrEqualTo(int pValue) {
		String ans = Boolean.toString(this.getValue() <= pValue);
        return ans;
    }

    public String equal(int pValue) {
		String ans  = Boolean.toString(this.getValue() == pValue);
        return ans;
    }

    public String differs(int pValue) {
		String ans = Boolean.toString(this.getValue() != pValue);
        return ans;
    }

    /*
     * ?? Return a Integer type or a void ??
     * */

    public String plus(int pValue) {
		String ans = Integer.toString(this.getValue() + pValue);
        this.setValue(ans);
		return ans;
    }

    public String minus(Integer_ pObj) {
		String ans = Integer.toString(this.getValue() - pObj.getValue());
        this.setValue(ans);
		return ans;
    }

    public String minus(int pValue) {
		String ans = Integer.toString(this.getValue() - pValue);
        this.setValue(ans);
		return ans;
    }

    public String times(Integer_ pObj) {
		String ans = Integer.toString(this.getValue() * pObj.getValue());
        this.setValue(ans);
		return ans;
    }

    public String times(int pValue) {
		String ans = Integer.toString(this.getValue() * pValue);
        this.setValue(ans);
		return ans;
    }

    public String division(Integer_ pObj) {
		String ans = Integer.toString(this.getValue() / pObj.getValue());
        this.setValue(ans);
		return ans;
    }

    public String division(int pValue) {
		String ans = Integer.toString(this.getValue() / pValue);
        this.setValue(ans);
		return ans;
    }

    //(int)->casting because pow() returns a Long
    public String pow(int pValue) {
		String ans = Integer.toString((int) Math.pow(this.getValue(), pValue));
        this.setValue(ans);
		return ans;
    }

    public String mod(Integer_ pObj) {
		String ans = Integer.toString(this.getValue() % pObj.getValue());
        this.setValue(ans);
		return ans;
    }

    public String mod(int pValue) {
		String ans = Integer.toString(this.getValue() % pValue);
        this.setValue(ans);
		return ans;
    }

}