/**
 * 
 */
package pw.jason19659.richi.dto;

/**
 * @author <a href="mailto:ziywang@cisco.com">Jason</a>
 *
 * pw.jason19659.richi.dto
 *
 * 2016年2月24日
 */
public class UserDto {
	 private String uuid;

	    private String username;

	    private String role;

	    private Integer point;

	    private String levelName;

		public String getUuid() {
			return uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public Integer getPoint() {
			return point;
		}

		public void setPoint(Integer point) {
			this.point = point;
		}

		public String getLevelName() {
			return levelName;
		}

		public void setLevelName(String levelName) {
			this.levelName = levelName;
		}

}
