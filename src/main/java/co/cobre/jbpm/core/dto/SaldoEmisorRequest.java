package co.cobre.jbpm.core.dto;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SaldoEmisorRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("workplacebankcode")
	private java.lang.String workplacebankcode;
	@org.kie.api.definition.type.Label("saldo")
	private java.lang.Double saldo;
	@org.kie.api.definition.type.Label("sobregiro")
	private java.lang.Double sobregiro;
	@org.kie.api.definition.type.Label("enabled")
	private java.lang.Boolean enabled;

	@org.kie.api.definition.type.Label("emailTo")
	private java.lang.String emailTo;

	public SaldoEmisorRequest() {
	}

	public java.lang.String getWorkplacebankcode() {
		return this.workplacebankcode;
	}

	public void setWorkplacebankcode(java.lang.String workplacebankcode) {
		this.workplacebankcode = workplacebankcode;
	}

	public java.lang.Double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(java.lang.Double saldo) {
		this.saldo = saldo;
	}

	public java.lang.Double getSobregiro() {
		return this.sobregiro;
	}

	public void setSobregiro(java.lang.Double sobregiro) {
		this.sobregiro = sobregiro;
	}

	public java.lang.Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(java.lang.Boolean enabled) {
		this.enabled = enabled;
	}

	public java.lang.String getEmailTo() {
		return this.emailTo;
	}

	public void setEmailTo(java.lang.String emailTo) {
		this.emailTo = emailTo;
	}

	public SaldoEmisorRequest(java.lang.String workplacebankcode,
			java.lang.Double saldo, java.lang.Double sobregiro,
			java.lang.Boolean enabled, java.lang.String emailTo) {
		this.workplacebankcode = workplacebankcode;
		this.saldo = saldo;
		this.sobregiro = sobregiro;
		this.enabled = enabled;
		this.emailTo = emailTo;
	}

}