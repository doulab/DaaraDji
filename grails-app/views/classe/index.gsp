
<%@ page import="gesdaara.Classe" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'classe.label', default: 'Classe')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-classe" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-classe" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="code" title="${message(code: 'classe.code.label', default: 'Code')}" />
					
						<g:sortableColumn property="libelle" title="${message(code: 'classe.libelle.label', default: 'Libelle')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${classeInstanceList}" status="i" var="classeInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${classeInstance.id}">${fieldValue(bean: classeInstance, field: "code")}</g:link></td>
					
						<td>${fieldValue(bean: classeInstance, field: "libelle")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${classeInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
