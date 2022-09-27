package model;

public class Mathematics {
	private Integer no1;
	private Integer no2;
	private Double result;
	
	public Mathematics() {}

	public Mathematics(Integer no1, Integer no2, Double result) {
		super();
		this.no1 = no1;
		this.no2 = no2;
		this.result = result;
	}

	public Integer getNo1() {
		return no1;
	}

	public void setNo1(Integer no1) {
		this.no1 = no1;
	}

	public Integer getNo2() {
		return no2;
	}

	public void setNo2(Integer no2) {
		this.no2 = no2;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}
	
	public void add() {
		this.result=(double) (this.no1+this.no2);
	}
	
	public void subtract()
	{
		this.result=(double) (this.no1-this.no2);
	}
	
	public void difference()
	{
		this.result=(double) Math.abs(this.no1-this.no2);
	}
	
	public void product()
	{
		this.result=(double) (this.no1*this.no2);
	}
	
	public void divide()
	{
		this.result= ((double)this.no1/this.no2);
	}
}
