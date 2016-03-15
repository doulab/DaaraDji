<%@ page import="gesdaara.Classe" %>


<div class=" form-horizontal form-label-left">
     <div class="form-group">
    <div class="fieldcontain ${hasErrors(bean: classeInstance, field: 'code', 'error')} required">
<label class="control-label col-md-3 col-sm-3 col-xs-12" for="code">
    <g:message code="classe.code.label" default="Code"/>
    <span class="required-indicator">*</span>
</label>

<div class="col-md-6 col-sm-6 col-xs-12">
    <g:textField  class="form-control col-md-7 col-xs-12"  name="code" required="" value="${classeInstance?.code}"/>
</div>
</div>
</div>
<div class="form-group">
    <div class=" fieldcontain ${hasErrors(bean: classeInstance, field: 'libelle', 'error')} required">

        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="libelle">
            <g:message code="classe.libelle.label" default="Libelle"/>
            <span class="required-indicator">*</span>
        </label>

        <div class="col-md-6 col-sm-6 col-xs-12">
            <g:textField class="form-control col-md-7 col-xs-12" name="libelle" required=""
                         value="${classeInstance?.libelle}"/>
        </div>
    </div>
</div>
</div>
