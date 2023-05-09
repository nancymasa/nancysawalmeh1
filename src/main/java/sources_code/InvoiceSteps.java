package sources_code;



public class InvoiceSteps {
	public static  boolean INVOICE = false;
	public static boolean ISDISCOUNT = false;

	Customersteps o=new Customersteps();
	static LoginSteps  log= new LoginSteps();
	ProdectSteps prod=new ProdectSteps();
	
	
	public boolean isgenerate() {
		return INVOICE;
	}
	
	public void setisgenerate(boolean invoice) {
	    throw new UnsupportedOperationException("Cannot modify final field INVOICE.");
	}
	
	public boolean getdiscount() {
		return ISDISCOUNT;
	}
	
	public void setdiscount(boolean isdiscount) {
	    throw new UnsupportedOperationException("Cannot modify final field isdiscount.");
	}
}
