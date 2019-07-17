<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Hosptial home page</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<%-- <link href="${pageContext.request.contextPath}/resources/css/home.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/resources/js/home.js"></script> --%>

<link type="text/css" href="<c:url value='resources/css/home.css' />" rel="stylesheet" />
        <script src="<c:url value='resources/js/home.js' />" type="text/javascript"></script>


	<style>

</style>
	<script>

	$(document).ready(function(){

		$("#search").click(function(){
			var id=$("#Ids").val();
			//var urls="${contextPath}/getInq/"+id;
				var urls="${contextPath}/inquiry/getDetails/"+id;
			$.ajax({
				type : "GET",
				dataType: 'json',
				url : urls,
				timeout : 1000000,
				success : function(response) {
					console.log("SUCCESS: ", response);
					this.mapData(response);
					
				},
				error : function(e) {
					console.log("ERROR: ", e);
					
				},
				done : function(e) {
					console.log("DONE");
				}
			});

		  });
		});
	
	function mapData(response)
	{
		alert("Response");
	}
	
</script>
</head>
<body>
	<div>
		<ul>
			<li><a class="active" href="${contextPath}/home" >User Home Page</a></li>
			<li><a class="" href="${contextPath}/upload" >Upload</a></li>
		</ul>

	</div>
	<div class="container-fluid" style="background-color: #f0f0f0;">
		<div class="row">
			<div class="col-xs-8">
				<table>
					<tr>
						<td>
							<h4>Enquiry details</h4>
						</td>
					</tr>
				</table>
			</div>
			<div class="col-xs-4">
				<table>
					<tr>
						<td>
							<button type="button" id="upload" data-toggle="modal"
								data-target="#uploadmodel" class="btn btn-info">Upload</button>
							<button type="button" class="btn btn-info">Export report
								to exel</button>
							<td>
					</tr>
				</table>
			</div>
		</div>

		<div class="row">
			<div class="col-xs-9 col-md-12">
				<legend>Search (Section 1)</legend>
				<table>
					<tr>
						<td><label>FirstName *</label><input type="text" id="fname" />
						</td>
						<td><label>LastName*</label><input type="text" id="lname" />
						</td>
						<td><label>DOB*</label><input type="text" id="dob" /></td>
					</tr>
					<tr>
						<td><label>ID</label><input type="text" id="Ids" /></td>
						<td><label>Street</label><input type="text" id="street" /></td>
						<td><label>City</label><input type="text" id="city" /></td>
						<td><label>Zip</label><input type="text" id="zip" /></td>
						<td><label>Acct</label><input type="text" id="acct" /></td>
						<td><label>State</label><input type="text" id="state" /></td>
						<td>
							<button type="button" id="search" class="btn btn-info">Search</button>
						</td>
					</tr>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-6">
				<legend>Section 2</legend>
				<table>
					<tr>
						<td><label>Last PHY</label><input type="text" id="lphy" /></td>
						<td><label>Z-Code visit</label><input type="text"
							id="zcodevisit" /></td>
					</tr>
				</table>
			</div>
			<div class="col-xs-6">
				<legend>Section 3</legend>
				<table>
					<tr>
						<td><label>Sex</label><input type="text" id="sex" />
					</tr>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-6">
				<legend>Section 4</legend>
				<table>
					<tr>
						<td><label>Age </label><input type="text" id="ageyear" /> <label>Years
						</label><input type="text" id="agemonth" /><label>Month</label></td>
					</tr>
				</table>
			</div>
			<div class="col-xs-6">
				<legend>Next PHY sehecdule (Section 5)</legend>
				<table>
					<tr>
						<td><label>PHY1</label><input type="text" id="phy1" /> <label>PHY2</label><input
							type="text" id="phy2" />
					</tr>
				</table>
			</div>
		</div>

		<div class="row">
			<div class="col-xs-9 col-md-12">
				<legend>Section 7</legend>
				<table>
					<tr>
						<td><label>NLP ?</label><input type="text" id="nlp" /></td>
						<td><label>Next PHY Date</label><input type="text"
							id="nphydate" /></td>
						<td><label>Appt Set Date</label><input type="text"
							id="apptsetdate" /></td>
						<td><label>Appt By</label><input type="text" id="apptBy" /></td>
						<td><label>New Ph #</label><input type="text" id="newPh" /></td>
					</tr>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-9 col-md-7">
				<legend>Section 8</legend>
				<table>
					<tr>
						<td><label>New Ph 1</label><input type="text" id="newph1" />
						</td>
						<td><label>New Ph 2</label><input type="text" id="newph2" />
						</td>
						<td><label>New Ph 3</label><input type="text" id="newph3" />
						</td>
					</tr>
				</table>
			</div>
			<div class="col-xs-9 col-md-5">
				<legend>Section 6</legend>
				<table>
					<tr>
						<td><label>Past Due date</label><input type="text"
							id="pastduedate" /></td>
						<td><label>Upcomming in 30 Days</label><input type="text"
							id="upcomingday" /></td>
					</tr>
				</table>
			</div>
		</div>

		<div class="row">
			<div class="col-xs-9 col-md-12">
				<legend>Comment (Section 9)</legend>
				<table>
					<tr>
						<td><label>Comment 1</label></td>
						<td><textarea rows="4" cols="50" id="comment1"></textarea></td>
						<td><label>Comment 1</label></td>
						<td><textarea rows="4" cols="50" id="comment2"></textarea></td>
						<td>
							<button type="button" id="update" class="btn btn-primary">Update</button>
						</td>
					</tr>
				</table>
			</div>
		</div>


	</div>



	<!-- Modal -->
	<div class="modal fade" id="uploadmodel" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Modal Header</h4>
				</div>
				<div class="modal-body">
					<%-- <c:url value="/uploadExcelFile" var="uploadFileUrl" />
					<form method="post" enctype="multipart/form-data"
						action="${uploadFileUrl}">
						<input type="file" name="file" accept=".xls,.xlsx" />
						<input type="submit" value="Upload file" />
					</form> --%>

					<form:form method="POST" action="/InquiryMangment/uploadFile" enctype="multipart/form-data">

						<table>
							<tr>
								<td>Select a file to upload</td>
								<td><input type="file" name="file" id="fileId"/></td>
							</tr>
							<tr>
								<td><input type="submit" value="upload" id="uploaddoc" /></td>
							</tr>
						</table>

					</form:form>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>

		</div>
	</div>


</body>
</html>
