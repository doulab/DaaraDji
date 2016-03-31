<%@ page import="gesdaara.Classe" %>



<div class="form-horizontal form-label-left fieldcontain ${hasErrors(bean: classeInstance, field: 'code', 'error')} required">
<div class="form-group">
	<label class="control-label col-md-3 col-sm-3 col-xs-12" for="code">
		<g:message code="classe.code.label" default="Code" />
		<span class="required-indicator">*</span>
	</label>
	<div class="col-md-6 col-sm-6 col-xs-12">
	<g:textField name="code" required="" value="${classeInstance?.code}" class="form-control col-md-7 col-xs-12" />

		</div>
	</div>
</div>

<div class="form-horizontal form-label-left fieldcontain ${hasErrors(bean: classeInstance, field: 'libelle', 'error')} required">
<div class="form-group">
	<label class="control-label col-md-3 col-sm-3 col-xs-12" for="libelle">
		<g:message code="classe.libelle.label" default="Libelle" />
		<span class="required-indicator">*</span>
	</label>
	<div class="col-md-6 col-sm-6 col-xs-12">
	<g:textField name="libelle" required="" value="${classeInstance?.libelle}" class="form-control col-md-7 col-xs-12" />

		</div>
	</div>
</div>

