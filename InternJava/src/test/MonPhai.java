package test;





public abstract class MonPhai {
	protected String tenMonPhai;

//	public MonPhai(String tenMonPhai) {
//		this.tenMonPhai = tenMonPhai;
//		// TODO Auto-generated constructor stub
//	}
	public abstract void danhNhau(MonPhai otherMonphai);
	public String getTenMonPhai() {
		return tenMonPhai;
	}
	public void setTenMonPhai(String tenMonPhai) {
		this.tenMonPhai = tenMonPhai;
	}
	
	
}

