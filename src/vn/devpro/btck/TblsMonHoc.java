package vn.devpro.btck;

public class TblsMonHoc {
	private int maMH;
	private String tenMonHoc;
	private int heSoMH;
	public TblsMonHoc() {
		super();
	}
	public TblsMonHoc(int maMH, String tenMonHoc, int heSoMH) {
		super();
		this.maMH = maMH;
		this.tenMonHoc = tenMonHoc;
		this.heSoMH = heSoMH;
	}
	public int getMaMH() {
		return maMH;
	}
	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}
	public String getTenMonHoc() {
		return tenMonHoc;
	}
	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}
	public int getHeSoMH() {
		return heSoMH;
	}
	public void setHeSoMH(int heSoMH) {
		this.heSoMH = heSoMH;
	}
	public void HienThi() {
		System.out.printf("%6d",maMH);
		System.out.printf("%15s", tenMonHoc);
		System.out.printf("%-6d",heSoMH);
		System.out.println();
	}
}
