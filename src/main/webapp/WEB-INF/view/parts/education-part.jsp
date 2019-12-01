<section class="content-header">
  <h1><spring:message code="header.education" /></h1> 
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
		<form:form method="POST" action="/cv/education/add" modelAttribute="education">
		  <div class="box-body">
		  
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.education.college" /></label>
			  <div class="col-sm-4">
			  	<form:input path="collegeName" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label"><spring:message code="form.education.degree" /></label>
			  <div class="col-sm-4">
			  	<form:input path="degree" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.education.subject" /></label>
			  <div class="col-sm-4">
			  	<form:input path="subject" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label"><spring:message code="form.education.year" /></label>
			  <div class="col-sm-4">
			  	<form:input path="year" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.education.board" /></label>
			  <div class="col-sm-8">
			  	<form:input path="board" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.education.marks" /></label>
			  <div class="col-sm-4">
			  	<form:input path="obtainedMarks" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label"><spring:message code="form.education.totalmarks" /></label>
			  <div class="col-sm-4">
			  	<form:input path="totalMarks" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.education.percentage" /></label>
			  <div class="col-sm-6">
			  	<form:input path="percentage" cssClass="form-control input-sm" />
			  </div>
			</div>
		  
		  <div class="box-footer">
			<button type="submit" class="btn btn-info pull-right"><spring:message code="btn.education"/></button>
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
