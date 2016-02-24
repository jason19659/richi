package pw.jason19659.richi.dto;


/**
 * @author <a href="mailto:ziywang@cisco.com">Jason</a>
 *
 * pw.jason19659.richi.dto
 *
 * 2016年2月24日
 */
/**
 * 
 */


/**
 * @author <a href="mailto:ziywang@cisco.com">Jason</a>
 *
 * pw.jason19659.nmb.model
 *
 * 2016年1月18日
 */
public class Status {
	private String message = "no info";
	public final static Status SUCCESSED = new Status(200, "success");
	public final static Status FAILED = new Status(500, "error");
	public final static int SUCCESSED_CODE = 200;
	public final static int FAILED_CODE = 500;
	
	public int code;
	
	public Status() {
		
	}
	
	public Status(int code) {
		this.code = code;
	}
	
	public Status(int code,String message) {
		this.code = code;
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	
}
