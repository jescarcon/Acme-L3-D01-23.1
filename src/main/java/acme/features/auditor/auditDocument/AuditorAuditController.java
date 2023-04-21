
package acme.features.auditor.auditDocument;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import acme.entities.audits.AuditDocument;
import acme.framework.controllers.AbstractController;
import acme.roles.Auditor;

@Controller
public class AuditorAuditController extends AbstractController<Auditor, AuditDocument> {

	@Autowired
	protected AuditorAuditListService	listService;

	@Autowired
	protected AuditorAuditShowService	showService;

	@Autowired
	protected AuditorAuditCreateService	createService;

	@Autowired
	protected AuditorAuditUpdateService	updateService;

	@Autowired
	protected AuditorAuditDeleteService	deleteService;


	@PostConstruct
	public void initialise() {
		super.addBasicCommand("list", this.listService);
		super.addBasicCommand("show", this.showService);
		super.addBasicCommand("create", this.createService);
		super.addBasicCommand("update", this.updateService);
		super.addBasicCommand("delete", this.deleteService);
	}
}
