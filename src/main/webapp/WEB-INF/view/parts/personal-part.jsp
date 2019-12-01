<section class="content-header">
  <h1><spring:message code="header.personal"/></h1>
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
		<form:form method="POST" action="/cv/personal/add" modelAttribute="personal">
		  <div class="box-body">
		  
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.username" /></label>
			  <div class="col-sm-4">
			  	<form:input path="name" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.fathername" /></label>
			  <div class="col-sm-4">
			  	<form:input path="fatherName" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.gender" /></label>
			  <div class="col-sm-4">
				<form:select cssClass="form-control input-sm" path="gender">
			  		<form:option value="Male">Male</form:option>
			  		<form:option value="Female">Female</form:option>
			  	</form:select>
			  </div>
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.dob" /></label>
			  <div class="col-sm-4">
			  	<form:input path="dob" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.age" /></label>
			  <div class="col-sm-4">
			  	<form:input path="age" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.mothername" /></label>
			  <div class="col-sm-4">
			  	<form:input path="motherName" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.email" /></label>
			  <div class="col-sm-4">
			  	<form:input path="emailId" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.phone" /></label>
			  <div class="col-sm-4">
			  	<form:input path="mobileNo" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.maritalstatus" /></label>
			  <div class="col-sm-4">
			  	<form:select cssClass="form-control input-sm" path="maritalStatus">
			  		<form:option value="Married">Married</form:option>
			  		<form:option value="Unmarried">Unmarried</form:option>
			  	</form:select>
			  </div>
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.nationality" /></label>
			  <div class="col-sm-4">
			  	<form:input path="nationality" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.address" /></label>
			  <div class="col-sm-10">
			  	<form:input path="address" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<hr/>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.language" /></label>
			  <div class="col-sm-4">
			  	<form:input path="langaugeProf" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.strength" /></label>
			  <div class="col-sm-4">
			  	<form:input path="strength" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.career" /></label>
			  <div class="col-sm-10">
			  	<form:input path="careerObjectives" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label"><spring:message code="form.personal.hobbies" /></label>
			  <div class="col-sm-6">
			  	<form:input path="hobbies" cssClass="form-control input-sm" />
			  </div>
			</div>
			
		  </div>
		  <div class="box-footer">
			<button type="submit" class="btn btn-info pull-right"><spring:message code="btn.personal"/></button>
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
