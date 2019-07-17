$(document).ready(function(){

$("#uploaddoc").click(function(){
	var file=$("#fileId").val();
	/* alert("we are here" +file); */
	

	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "${home}uploadFile",
		data : file,
		dataType : 'json',
		timeout : 100000,
		success : function(data) {
			console.log("SUCCESS: ", data);
			display(data);
		},
		error : function(e) {
			console.log("ERROR: ", e);
			display(e);
		},
		done : function(e) {
			console.log("DONE");
		}
	});

  });


  $("#update").click(function(){
   var fname=$("#fname").val();
    var lname=$("#lname").val();
	 var dob=$("#dob").val();
	  var ids=$("#ids").val();
	   var street=$("#street").val();
	    var city=$("#city").val();
		 var zip=$("#zip").val();
		  var acct=$("#acct").val();
      var state=$("#state").val();
	    var lphy=$("#lphy").val();
		 var zcodevisit=$("#zcodevisit").val();
		  var sex=$("#sex").val();
		  var ageyear=$("#ageyear").val();
	    var agemonth=$("#agemonth").val();
		 var phy1=$("#phy1").val();
		  var phy2=$("#phy2").val();
		  var nlp=$("#nlp").val();
	    var nphydate=$("#nphydate").val();
		 var apptsetdate=$("#apptsetdate").val();
		  var apptBy=$("#apptBy").val();
		  var newPh=$("#newPh").val();
	    var newph1=$("#newph1").val();
		 var newph2=$("#newph2").val();
		  var newph3=$("#newph3").val();
		   var pastduedate=$("#pastduedate").val();
	    var upcomingday=$("#upcomingday").val();
		 var comment1=$("#comment1").val();
		  var comment2=$("#comment2").val();
  });
});