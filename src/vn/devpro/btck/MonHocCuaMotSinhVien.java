package vn.devpro.btck;

public class MonHocCuaMotSinhVien {
	private int maMH;
	private float diemSo;
	private int maSV;
	public int getMaMH() {
		return maMH;
	}
	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}
	public float getDiemSo() {
		return diemSo;
	}
	public void setDiemSo(float diemSo) {
		this.diemSo = diemSo;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public MonHocCuaMotSinhVien() {
		super();
	}
	public MonHocCuaMotSinhVien(int maMH, float diemSo, int maSV) {
		super();
		this.maMH = maMH;
		this.diemSo = diemSo;
		this.maSV = maSV;
	}
	public void HienThi() {
		System.out.printf("%-6d",maMH);
		System.out.printf("%2.2f",diemSo);
	}
}
