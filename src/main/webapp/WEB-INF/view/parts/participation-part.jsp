<section class="content-header">
  <h1><spring:message code="header.participation" /></h1> 
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
		<form:form method="POST" action="/cv/participation/add" modelAttribute="participation">
		  <div class="box-body">
		  
			<div class="form-group">
			  <label class="col-sm-3 control-label"><spring:message code="form.participation.name" /></label>
			  <div class="col-sm-6">
			  <form:select cssClass="form-control input-sm" path="partName">
			  		<form:option value="TRAINING">TRAINING</form:option>
			  		<form:option value="WORKSHOPS">WORKSHOPS</form:option>
			  		<form:option value="FDP">FDP</form:option>
			  		<form:option value="STTP">STTP</form:option>
			  		<form:option value="OTHERS">OTHERS</form:option>
			  	</form:select>
			  	</div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.participation.duration" /></label>
			  <div class="col-sm-4">
			  	<form:input path="startDate" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-1 control-label"><spring:message code="form.participation.to" /></label>
			  <div class="col-sm-4">
			  	<form:input path="endDate" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.participation.sponsored-by" /></label>
			  <div class="col-sm-8">
			  	<form:input path="sponsores" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.participation.note" /></label>
			  <div class="col-sm-8">
			  	<form:input path="note" cssClass="form-control input-sm" />
			  </div>
			</div>
		  
		  	<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.participation.topic" /></label>
			  <div class="col-sm-8">
			  	<form:input path="topic" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.participation.place" /></label>
			  <div class="col-sm-8">
			  	<form:input path="place" cssClass="form-control input-sm" />
			  </div>
			</div>
			
		  <div class="box-footer">
			<button type="submit" class="btn btn-info pull-right"><spring:message code="btn.participation"/></button>
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
