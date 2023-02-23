package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Contract {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Integer number;
	
	Date x1 = new Date();
	Date x2 = new Date(System.currentTimeMillis());
	Date x3 = new Date(0L);
	Date x4 = new Date(1000L * 60L * 60L * 5L);
	public Contract(Date x1, Date x2, Date x3, Date x4) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
	}
	public Contract() {
		// TODO Auto-generated constructor stub
	}
	public SimpleDateFormat getSdf() {
		return sdf;
	}
	public Date getX1() {
		return x1;
	}
	public Date getX2() {
		return x2;
	}
	public Date getX3() {
		return x3;
	}
	public Date getX4() {
		return x4;
	}
	
	

}
