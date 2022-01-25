package test;

public class Main {
	public static void main(String[] args) {
	MonPhai thieuLam = new ThieuLam();
	MonPhai caiBang  = new CaiBang();
	caiBang.setTenMonPhai("an may");
	thieuLam.danhNhau(caiBang);
	}

}
