<section class="sidebar">
<ul class="sidebar-menu">
	<li class="header" style="color:#FFFFFF;">MAIN NAVIGATION</li>
	
	<li class="treeview active">
		<a href="#">
			<i class="fa fa-link"></i> 
			<span><spring:message code="menu.user-profile" /></span>
			<i class="fa fa-angle-left pull-right"></i>
		</a>
		<ul class="treeview-menu">
			<li><a href="${context}/dispatch?action=personal">
				<span class="fa fa-hospital-o"></span><spring:message code="menu.personal" /></a>
			</li>
			<li><a href="${context}/dispatch?action=education">
				<span class="fa fa-bar-chart"></span><spring:message code="menu.education" /></a>
			</li>
			<li><a href="${context}/dispatch?action=experience">
				<span class="fa fa-bar-chart"></span><spring:message code="menu.experiance" /></a>
			</li>
			<li><a href="${context}/dispatch?action=participation">
				<span class="fa fa-bar-chart"></span><spring:message code="menu.participation" /></a>
			</li>
		</ul>
	</li>
	
	<li class="treeview active">
		<a href="#">
			<i class="fa fa-link"></i> 
			<span><spring:message code="menu.project-profile" /></span>
			<i class="fa fa-angle-left pull-right"></i>
		</a>
		<ul class="treeview-menu">
			<li><a href="${context}/dispatch?action=project">
				<span class="fa fa-bar-chart"></span><spring:message code="menu.project" /></a>
			</li>
			<li><a href="${context}/dispatch?action=reference">
				<span class="fa fa-bar-chart"></span><spring:message code="menu.reference" /></a>
			</li>
			<li><a href="${context}/pdf-generation">
				<span class="fa fa-bar-chart"></span><spring:message code="menu.generate" /></a>
			</li>
		</ul>
	</li>

</ul>
</section>
