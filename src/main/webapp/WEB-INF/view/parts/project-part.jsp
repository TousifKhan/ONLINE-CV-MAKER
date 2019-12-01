<section class="content-header">
  <h1><spring:message code="header.project" /></h1> 
</section>

<section class="content">

  <div class="box">
	<div class="box-header with-border">
	  <h3 class="box-title">&nbsp;</h3>
	  <div class="box-tools pull-right">
		<button class="btn btn-box-tool" data-widget="collapse" data-toggle="tooltip" title="Collapse"><i class="fa fa-minus"></i></button>
		<button class="btn btn-box-tool" data-widget="remove" data-toggle="tooltip" title="Remove"><i class="fa fa-times"></i></button>
	  </div>
	</div>
	
	<div class="box-body">
		<form:form method="POST" action="/cv/project/add" modelAttribute="project">
		  <div class="box-body">
		  
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.project.title" /></label>
			  <div class="col-sm-4">
			  	<form:input path="title" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label"><spring:message code="form.project.guide" /></label>
			  <div class="col-sm-4">
			  	<form:input path="guide" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.project.frontend" /></label>
			  <div class="col-sm-4">
			  	<form:input path="frontEnd" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label"><spring:message code="form.project.backend" /></label>
			  <div class="col-sm-4">
			  	<form:input path="backEnd" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.project.input" /></label>
			  <div class="col-sm-4">
			  	<form:input path="inputs" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label"><spring:message code="form.project.output" /></label>
			  <div class="col-sm-4">
			  	<form:input path="outputs" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.project.description" /></label>
			  <div class="col-sm-6">
			  	<form:input path="description" cssClass="form-control input-sm" />
			  </div>
			</div>
		  
		  <div class="box-footer">
			<button type="submit" class="btn btn-info pull-right"><spring:message code="btn.project"/></button>
		  </div>
		  
		</form:form>
	
	</div>
	
  </div>

</section>

<style>
div.form-group{
    padding-bottom: 25px !important;
}
</style>
