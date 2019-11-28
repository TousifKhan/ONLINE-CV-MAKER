<section class="content-header">
  <h1>Add Your Personal Details</h1> 
</section>

<section class="content">

  <div class="box">
	<div class="box-header with-border">
	  <h3 class="box-title">Personal Details</h3>
	  <div class="box-tools pull-right">
		<button class="btn btn-box-tool" data-widget="collapse" data-toggle="tooltip" title="Collapse"><i class="fa fa-minus"></i></button>
		<button class="btn btn-box-tool" data-widget="remove" data-toggle="tooltip" title="Remove"><i class="fa fa-times"></i></button>
	  </div>
	</div>
	
	<div class="box-body">
		<form:form method="POST" action="/cv/personal/add" modelAttribute="personal">
		  <div class="box-body">
		  
			<div class="form-group">
			  <label class="col-sm-2 control-label">User name</label>
			  <div class="col-sm-4">
			  	<form:input path="name" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label">Father Name</label>
			  <div class="col-sm-4">
			  	<form:input path="fatherName" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label">Gender</label>
			  <div class="col-sm-4">
				<form:select cssClass="form-control input-sm" path="gender">
			  		<form:option value="Male">Male</form:option>
			  		<form:option value="Female">Female</form:option>
			  	</form:select>
			  </div>
			  <label class="col-sm-2 control-label">Date of Birth</label>
			  <div class="col-sm-4">
			  	<form:input path="dob" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label">Age</label>
			  <div class="col-sm-4">
			  	<form:input path="age" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label">Mother Name</label>
			  <div class="col-sm-4">
			  	<form:input path="motherName" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label">Email Id</label>
			  <div class="col-sm-4">
			  	<form:input path="emailId" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label">Phone No#</label>
			  <div class="col-sm-4">
			  	<form:input path="mobileNo" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label">Marital Status</label>
			  <div class="col-sm-4">
			  	<form:select cssClass="form-control input-sm" path="maritalStatus">
			  		<form:option value="Married">Married</form:option>
			  		<form:option value="Unmarried">Unmarried</form:option>
			  	</form:select>
			  </div>
			  <label class="col-sm-2 control-label">Nationality</label>
			  <div class="col-sm-4">
			  	<form:input path="nationality" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label">Address</label>
			  <div class="col-sm-10">
			  	<form:input path="address" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<hr/>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label">Language Known</label>
			  <div class="col-sm-4">
			  	<form:input path="langaugeProf" cssClass="form-control input-sm" />
			  </div>
			  <label class="col-sm-2 control-label">Strength</label>
			  <div class="col-sm-4">
			  	<form:input path="strength" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label">Career Objectives</label>
			  <div class="col-sm-10">
			  	<form:input path="careerObjectives" cssClass="form-control input-sm" />
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-sm-2 control-label">Hobbies</label>
			  <div class="col-sm-6">
			  	<form:input path="hobbies" cssClass="form-control input-sm" />
			  </div>
			</div>
			
		  </div>
		  <div class="box-footer">
			<button type="submit" class="btn btn-default">Cancel</button>
			<button type="submit" class="btn btn-info pull-right">Add Personal Details</button>
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
