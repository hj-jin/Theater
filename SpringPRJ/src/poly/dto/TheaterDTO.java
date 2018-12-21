package poly.dto;

public class TheaterDTO {

	//공연장 목록
	private String fcltynm; //공연시성명
	private String mt10id; //공연시설 id
	private String mt13cnt; // 공연장 수 
	private String fcltychartr; // 시설 특성
	private String sidonm; //지역(시도)
	private String gugunnm; //지역(구군)
	private String opende; //개관연도 
	
	//공연장 상세
	private String seatscale ;//객석 수
	private String telno ;//번호
	private String relateurl; //홈페이지
	private String adres; //주소
	private String la ;//위도
	private String lo; //경도
	
	
	
	
	public String getSeatscale() {
		return seatscale;
	}
	public void setSeatscale(String seatscale) {
		this.seatscale = seatscale;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getRelateurl() {
		return relateurl;
	}
	public void setRelateurl(String relateurl) {
		this.relateurl = relateurl;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getLa() {
		return la;
	}
	public void setLa(String la) {
		this.la = la;
	}
	public String getLo() {
		return lo;
	}
	public void setLo(String lo) {
		this.lo = lo;
	}
	public String getFcltynm() {
		return fcltynm;
	}
	public void setFcltynm(String fcltynm) {
		this.fcltynm = fcltynm;
	}
	public String getMt10id() {
		return mt10id;
	}
	public void setMt10id(String mt10id) {
		this.mt10id = mt10id;
	}
	public String getMt13cnt() {
		return mt13cnt;
	}
	public void setMt13cnt(String mt13cnt) {
		this.mt13cnt = mt13cnt;
	}
	public String getFcltychartr() {
		return fcltychartr;
	}
	public void setFcltychartr(String fcltychartr) {
		this.fcltychartr = fcltychartr;
	}
	public String getSidonm() {
		return sidonm;
	}
	public void setSidonm(String sidonm) {
		this.sidonm = sidonm;
	}
	public String getGugunnm() {
		return gugunnm;
	}
	public void setGugunnm(String gugunnm) {
		this.gugunnm = gugunnm;
	}
	public String getOpende() {
		return opende;
	}
	public void setOpende(String opende) {
		this.opende = opende;
	}
	
	
	
	
	
}
