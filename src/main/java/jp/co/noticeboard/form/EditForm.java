package jp.co.noticeboard.form;

import javax.validation.constraints.Pattern;

import jp.co.noticeboard.form.validator.BranchPositionCombination;
import jp.co.noticeboard.form.validator.ConfirmPassword;

@ConfirmPassword(password = "password", confirmPassword = "confirmPassword")
@BranchPositionCombination(branchId = "branchId", positionId = "positionId")
public class EditForm {
	private Integer id;
	@Pattern(regexp = "[a-zA-Z0-9]{6,20}")
	private String loginId;
	@Pattern(regexp = ".{6,20}")
	private String password;
	private String confirmPassword;
	@Pattern(regexp = ".{1,10}")
	private String accountName;
	private Integer branchId;
	private Integer positionId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
}
