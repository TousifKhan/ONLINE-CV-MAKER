<section class="content-header">
  <h1><spring:message code="header.experiance" /></h1> 
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
		<form:form method="POST" action="/cv/experience/add" modelAttribute="experience">
		  <div class="box-body">
		  
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.experiance.employer" /></label>
			  <div class="col-sm-4">
			  	<form:input path="employer" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label"><spring:message code="form.experiance.designation" /></label>
			  <div class="col-sm-4">
			  	<form:input path="designation" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.experiance.joining-date" /></label>
			  <div class="col-sm-4">
			  	<form:input path="joiningDate" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label"><spring:message code="form.experiance.leaving-date" /></label>
			  <div class="col-sm-4">
			  	<form:input path="leavingDate" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.experiance.working" /></label>
			  <div class="col-sm-8">
			  	<form:input path="working" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.experiance.experience" /></label>
			  <div class="col-sm-8">
			  	<form:input path="yearOfExp" cssClass="form-control input-sm" />
			  </div>
			</div>
		  
		  <div class="box-footer">
			<button type="submit" class="btn btn-info pull-right"><spring:message code="btn.experiance"/></button>
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
