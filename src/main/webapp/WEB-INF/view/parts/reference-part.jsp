<section class="content-header">
  <h1><spring:message code="header.reference" /></h1> 
</section>

<section class="content">

  <div class="box">
	<div class="box-header with-border">
	  <h3 class="box-title">References Details</h3>
	  <div class="box-tools pull-right">
		<button class="btn btn-box-tool" data-widget="collapse" data-toggle="tooltip" title="Collapse"><i class="fa fa-minus"></i></button>
		<button class="btn btn-box-tool" data-widget="remove" data-toggle="tooltip" title="Remove"><i class="fa fa-times"></i></button>
	  </div>
	</div>
	
	<div class="box-body">
		<form:form method="POST" action="/cv/reference/add" modelAttribute="reference">
		  <div class="box-body">
		  
			<div class="form-group">
			  <label class="col-sm-2 control-label">Name of Reference</label>
			  <div class="col-sm-4">
			  	<form:input path="name" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label">Designation</label>
			  <div class="col-sm-4">
			  	<form:input path="designation" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label">Affiliation</label>
			  <div class="col-sm-4">
			  	<form:input path="affiliation" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label">Email</label>
			  <div class="col-sm-6">
			  	<form:input path="emailId" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label">Contact No.</label>
			  <div class="col-sm-6">
			  	<form:input path="contactNo" cssClass="form-control input-sm" />
			  </div>
			</div>
		  
		  <div class="box-footer">
			<button type="submit" class="btn btn-info pull-right"><spring:message code="btn.reference"/></button>
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
